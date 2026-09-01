import { StyleSheet, ActivityIndicator } from 'react-native';
import * as WebBrowser from 'expo-web-browser';
import { useRouter } from 'expo-router';
import { useEffect } from 'react';
import LoginButton from './(auth)/LoginButton.jsx';
import { useUser } from '../hooks/useUser.js';
import Spacer from '../components/Spacer.jsx';
import ThemedView from '../components/ThemedView.jsx';
import TestBackendAPI from './testBackendAPI.js';

WebBrowser.maybeCompleteAuthSession();

export default function Index () {
    const {user, authChecked, loading} = useUser();
    const router = useRouter();

    useEffect (() => {
        const getUser = async () => {
            // // Redirect to dashboard page or CompleteProfile page depending on whether user is new
            // const res = await api.get(`/users/${user.sub}`);
            // console.log(res)
            // if (res.status === 422) {
            //     router.push({
            //         pathname: "/CompleteProfile",
            //         params: {
            //             sub: user.sub,
            //             email: user.email,
            //             name: user.name ?? "",
            //         },
            //     });
            // } else {
            //     router.push('/dashboard');
            // }

            router.replace('/dashboard/NewEntry');
        }

        if (authChecked && user) {
            getUser();
        }
    }, [authChecked, user]);

    if (!authChecked || loading || (authChecked && user)) {
        return (
            <ThemedView safe='true' style={styles.container}>
                <ActivityIndicator size="large" />
            </ThemedView>
        )
    }

    return (
        <ThemedView safe={true} style={styles.container}>
            {/* Auth0 Login Button */}
            <LoginButton />

            <Spacer />

            <TestBackendAPI/>

        </ThemedView>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#ffffffff',
        alignItems: 'center',
        justifyContent: 'center',
        padding: 30,
    },
    title: {
        fontSize: 26,
        fontWeight: '700',
        color: '#1e293b',
        marginBottom: 20,
    }
});