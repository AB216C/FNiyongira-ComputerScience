import { TouchableOpacity, Text, StyleSheet, Image, Dimensions } from "react-native";
import { useTranslation } from "react-i18next";
import { changeAppLanguage } from "../i18n";
import { BlurView } from "expo-blur";

export default function LanguageButton({ style }) {
    const { i18n } = useTranslation();

    const toggleLanguage = () => {
        const newLng = i18n.language === "en" ? "tr" : "en";
        changeAppLanguage(newLng);
    };

    const flag =
        i18n.language === "en"
        ? require("../assets/flags/tr.png")
        : require("../assets/flags/en.png");

    const label = i18n.language === "en" ? "TR" : "EN";


    return (
        <TouchableOpacity style={[styles.wrapper, style]} onPress={toggleLanguage}>
            <BlurView intensity={50} tint="dark" style={styles.blur}>
                <Image source={flag} style={styles.flag} />
                <Text style={styles.text}>{label}</Text>
            </BlurView>
        </TouchableOpacity>
    );
}

const styles = StyleSheet.create({
    wrapper: {
        position: "absolute",
        zIndex: 999,
        shadowColor: "#000",
        shadowOffset: { width: 0, height: 3 },
        shadowOpacity: 0.3,
        shadowRadius: 3,
        elevation: 5,
    },
    blur: {
        flexDirection: "row",
        alignItems: "center",
        paddingVertical: 8,
        paddingHorizontal: 12,
        borderRadius: 20,
        overflow: "hidden",
        backgroundColor: "rgba(255,255,255,0.1)",
    },
    flag: {
        width: 24,
        height: 18,
        marginRight: 6,
    },
    text: {
        color: "#fff",
        fontWeight: "600",
        fontSize: 18,
    },
});