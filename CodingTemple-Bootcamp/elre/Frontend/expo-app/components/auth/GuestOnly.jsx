import { useRouter } from "expo-router";
import { useUser } from "../../hooks/useUser";
import { ActivityIndicator } from "react-native";
import { useEffect } from 'react';

const GuestOnly = ({ children }) => {
    const { user, authChecked } = useUser();
    const router = useRouter();

    useEffect(() => {
        if (authChecked && user !== null) {
            router.replace("/Profile");
        }
    }, [user, authChecked])

    if (!authChecked || user) {
        return <ActivityIndicator size="large" color="black" />;
    }

    return children;
}

export default GuestOnly;
