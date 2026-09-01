import { useRouter } from "expo-router";
import { TouchableOpacity, TextInput, View, StyleSheet, Text, ActivityIndicator } from "react-native";
import { useState } from "react";
import ThemedView from "../components/ThemedView";
import ThemedText from "../components/ThemedText";
import { useUser } from "../hooks/useUser";
import { useTranslation } from "react-i18next";
import api from "../utils/api";

const CompleteProfile = () => {
    const { t } = useTranslation();

    const {user} = useUser();
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [loading, setLoading] = useState(false);
    const [error, setError] = useState(false);
    const [message, setMessage] = useState("");

    const router = useRouter();

    const submit = async () => {
        if (!firstName || !lastName) {
            setError(true);
            setMessage(t("app.incompleteProfileMessage"));
            return;
        }

        setLoading(true);
        setError(false);
        setMessage("");

        const res = await api.post(`/users`, {
                // external_user_id: user.sub,
                first_name: firstName,
                last_name: lastName,
                email: user.email
        });

        if (!res.ok) {
            setMessage("Error creating your account. Please try again.");
        }

        // const data = await res.json();

        setLoading(false);

        router.replace("/dashboard");
    };

    return (
        <ThemedView style={styles.container} safe={true}>
            <ThemedText style={styles.header}>Complete Your Profile</ThemedText>
        
            <TextInput
                style={error && !firstName ? [styles.input, styles.errorInput] : styles.input}
                placeholder="First Name"
                value={firstName}
                onChangeText={setFirstName}
            />

            <TextInput
                style={error && !lastName ? [styles.input, styles.errorInput] : styles.input}
                placeholder="Last Name"
                value={lastName}
                onChangeText={setLastName}
            />
        
            <TouchableOpacity style={styles.button} onPress={submit}>
                <Text style={styles.buttonText}>Create Account</Text>
            </TouchableOpacity>
        
            {loading && (
                <View style={styles.center}>
                <ActivityIndicator size="large" />
                </View>
            )}
        
            {error && (
                <Text style={styles.errorMessage}>{message}</Text>
            )}
            </ThemedView>
        );
        }
        
    export default CompleteProfile;

    const styles = StyleSheet.create({
        container: {
            padding: 20,
            backgroundColor: "#fff",
            flex: 1,
        },
        
        header: {
            fontSize: 26,
            fontWeight: "700",
            marginVertical: 25,
            alignSelf: 'center'
        },
        
        input: {
            borderWidth: 1,
            borderColor: "#ddd",
            padding: 14,
            borderRadius: 8,
            marginBottom: 15
        },
        errorInput: {
            borderColor: "#ff0000ff"
        },
        button: {
            backgroundColor: "#1e40af",
            paddingVertical: 15,
            borderRadius: 10,
            alignItems: "center"
        },
        
        buttonText: {
            color: "#fff",
            fontSize: 16,
            fontWeight: "600"
        },
        
        errorMessage: {
            marginTop: 20,
            fontSize: 16,
            color: "#ff0000ff",
            alignSelf: 'center'
        },
        
        center: {
            marginTop: 15,
            alignItems: "center"
        }
        });