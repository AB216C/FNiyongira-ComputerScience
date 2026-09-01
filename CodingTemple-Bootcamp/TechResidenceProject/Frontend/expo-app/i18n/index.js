import i18n from "i18next";
import { initReactI18next } from "react-i18next";
import * as Localization from "expo-localization";
import AsyncStorage from "@react-native-async-storage/async-storage";

import en from "./locales/en.json";
import tr from "./locales/tr.json";

const LANGUAGE_KEY = "app-language";

async function getInitialLanguage() {
    try {
        const saved = await AsyncStorage.getItem(LANGUAGE_KEY);
        if (saved) return saved;
    } catch {}

    const deviceLocales = Localization.getLocales();

    if (deviceLocales && deviceLocales.length > 0) {
    return deviceLocales[0].languageCode || "en";
    }

    return "en";
}

const i18nInit = async () => {
    const lng = await getInitialLanguage();

    await i18n
        .use(initReactI18next)
        .init({
        compatibilityJSON: "v3",
        lng,                  
        fallbackLng: "en",
        resources: {
            en: { translation: en },
            tr: { translation: tr },
        },
        interpolation: {
            escapeValue: false,
        },
        react: {
            useSuspense: false,
        },
    });
};

i18nInit();

export const changeAppLanguage = async (lng) => {
    await AsyncStorage.setItem(LANGUAGE_KEY, lng);
    return i18n.changeLanguage(lng);
};

export default i18n;