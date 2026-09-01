import {createContext, useState, useEffect, useRef} from 'react';
import { makeRedirectUri } from 'expo-auth-session';
import * as SecureStore from 'expo-secure-store';
import * as WebBrowser from 'expo-web-browser';
import { Platform } from 'react-native';
import * as Linking from "expo-linking";

import Constants from 'expo-constants';
import api from '../utils/api';

const EXPO_PUBLIC_API_URL = Constants.expoConfig.extra.apiUrl;

export const UserContext = createContext();

export const UserProvider = ({children}) => {
    const [user, setUser] = useState(null);
    const [authChecked, setAuthChecked] = useState(false);
    const [loading, setLoading] = useState(false);
    const handledCodes = useRef(new Set());

    const isWeb = Platform.OS === 'web';

    const redirectUri = makeRedirectUri({
        scheme: 'com.elre.expoapp',
        path: '/'
    });

    // This useEffect is for magic link login but I had trouble figuring out to test magic link. 

    // useEffect(() => {
    //     const handleRedirect = async ({ url }) => {
    //         const { queryParams } = Linking.parse(url);
    //         const code = queryParams?.code;

    //         if (code) {
    //         await getAccessToken(code);
    //         }
    //     };

    //     const subscription = Linking.addEventListener("url", handleRedirect);

    //     Linking.getInitialURL().then(url => {
    //         if (url) handleRedirect({ url });
    //     });

    //     return () => {
    //         subscription.remove();
    //     };
    // }, []);

    // For getting user data (edit in the future with backend endpoints)
    const parseJwt = (token) => {
        try {
            const base64Url = token.split('.')[1];
            const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
            const jsonPayload = decodeURIComponent(
            atob(base64)
                .split('')
                .map((c) => '%' + ('00' + c.charCodeAt(0).toString(16)).slice(-2))
                .join('')
            );
            return JSON.parse(jsonPayload);
        } catch (error) {
            console.error('Failed to parse ID token', error);
            return null;
        }
    };

    // Check initial login status
    const getInitialUser = async () => {
        try {
            const accessToken = await SecureStore.getItemAsync("accessToken");
            const idToken = await SecureStore.getItemAsync("idToken")

            if (accessToken && idToken) {
                const response = await fetch(`${EXPO_PUBLIC_API_URL}/protected`, {method: 'GET'});
                if (response.ok) setUser(parseJwt(idToken));
                else setUser(null);
            }
        } catch (error) {
            console.error("error: ", error)
            setUser(null);
        } finally {
            setAuthChecked(true);
        }
    }

    useEffect(() => {
        getInitialUser();
    }, [])

    // LOGIN
    const login = async () => {
        try {
            setLoading(true);
            const result = await WebBrowser.openAuthSessionAsync(`${EXPO_PUBLIC_API_URL}/auth/login`, redirectUri);

            if (result.type === "success" && result.url) {
                const { queryParams } = Linking.parse(result.url);
                const code = queryParams?.code;

                if (code && !handledCodes.current.has(code)) {
                    handledCodes.current.add(code);
                    if (Platform.OS === "android") {
                        await new Promise(resolve => setTimeout(resolve, 500));
                    }
                    await getAccessToken(code);
                }
            }
            setLoading(false);
        } catch (error) {
            console.error("Login error: ", error);
        }
    };

    const getAccessToken = async (code) => {
        try {
            const accessTokenRes = await api.get(`/auth/token?code=${code}`); // const accessTokenRes = await api.get(`/auth/token?code=${code}&redirect_uri=${encodeURIComponent(redirectUri)}`);
            const accessTokenJSON = accessTokenRes.data;
            // console.log(accessTokenRes)
            await SecureStore.setItemAsync("accessToken", accessTokenJSON.access_token);
            await SecureStore.setItemAsync("idToken", accessTokenJSON.id_token);

            const parsedUser = parseJwt(accessTokenJSON.id_token);
            setUser(parsedUser);
        } catch (error) {
            console.error("Token exhange failed: ", error);
        }
    }

    const loginMagicLink = async (email) => {
        try {
            const res = await api.post(`/auth/register`, {
                email: email
            })

            return res.data;
        } catch (error) {
            console.error("Error: ", error);
        }
    }

    // LOGOUT
    const logout = async () => {
        setLoading(true);
        try {
            await fetch((`${EXPO_PUBLIC_API_URL}/auth/logout`), {method: 'GET'}); // await fetch((`${EXPO_PUBLIC_API_URL}/auth/logout?redirect_uri=${encodeURIComponent(redirectUri)}`), {method: 'GET'});
            if (!isWeb) {
                await SecureStore.deleteItemAsync("accessToken");
                await SecureStore.deleteItemAsync("idToken");
            }

            setUser(null);
            console.log("Successfully logged out!");
            setLoading(false);
        } catch (error) {
            console.error("Error logging out: ", error)
        }
    }

    // Delete Account
    const deleteUser = async () => {
        try {

            await SecureStore.deleteItemAsync("accessToken");
            await SecureStore.deleteItemAsync("idToken");
            setUser(null);
            setLoading(false);
        } catch (error) {

        }
    }

    return (
        <UserContext.Provider value={{user, authChecked, login, loginMagicLink, logout, deleteUser, loading}}>
            {children}
        </UserContext.Provider>
    )
}