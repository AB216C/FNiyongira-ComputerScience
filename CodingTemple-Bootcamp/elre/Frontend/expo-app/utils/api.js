import axios from "axios";
import * as SecureStore from "expo-secure-store";
import Constants from 'expo-constants';

const EXPO_PUBLIC_API_URL = Constants.expoConfig.extra.apiUrl;

const api = axios.create({
    baseURL: EXPO_PUBLIC_API_URL,
});

// Attach token to all requests
api.interceptors.request.use(async (config) => {
    const token = await SecureStore.getItemAsync("accessToken");
    if (token) {
        config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
});

export default api;
