import { StatusBar } from "expo-status-bar";
import { UserProvider } from "../contexts/UserContext";
import { Stack } from "expo-router";
import Toast from "react-native-toast-message";
import { useSafeAreaInsets } from "react-native-safe-area-context";
import { View, Text, TouchableOpacity } from "react-native";
import FontAwesome from '@expo/vector-icons/FontAwesome';
import "../i18n";
import LanguageButton from "../components/LanguageButton";
import { useSegments } from 'expo-router';
import { useTranslation } from "react-i18next";

const toastConfig = {
  success: ({ text1, text2, onPress }) => (
    <TouchableOpacity
      activeOpacity={0.7}
      onPress={onPress}
      style={{
      backgroundColor: "#4CAF50",
      padding: 12,
      borderRadius: 10,
      width: "80%",
      flexDirection: 'row',
    }}>
      <FontAwesome name="check-square-o" size={36} color="#ffffffff" style={{alignSelf: 'center', paddingRight: 10}}/>
      <View style={{flexDirection: 'column', flexShrink: 1}}>
        <Text style={{
          color: "#fff",
          fontSize: 20,
          fontWeight: "bold",
          flexWrap: "wrap",
          flexShrink: 1
        }}>
          {text1}
        </Text>

        {text2 && (
          <Text style={{
            color: "#fff",
            fontSize: 16,
            flexWrap: "wrap",
            flexShrink: 1
          }}>
            {text2}
          </Text>
        )}
      </View>
    </TouchableOpacity>
  ),
};

export default function RootLayout() {
  const {t} = useTranslation();
  const inset = useSafeAreaInsets();
  const segments = useSegments(); 

  const isManageUsers = segments[0] === "ManageUsers";
  const isDashboard = segments[0] === "dashboard";
  let languageButtonStyle = {top: inset.top + 16, right: 20};

  if (isManageUsers) languageButtonStyle = {bottom: inset.bottom + 16, right: 20};
  if (isDashboard) languageButtonStyle = {bottom: inset.bottom + 80, right: 20};

  return (
    <>
      <UserProvider>
        <StatusBar style="auto" />
        <Stack>
          {/* Auth screens (login/signup) */}
          <Stack.Screen name="(auth)" options={{ headerShown: false }} />

          {/* Dashboard (tabs layout) */}
          <Stack.Screen name="dashboard" options={{title: t('app.dashboard'), headerShown: false }} />

          {/* Manage Users screens */}
          <Stack.Screen
            name="ManageUsers/index"
            options={{ title: t('app.manageUsers') }}
          />
          <Stack.Screen
            name="ManageUsers/CreateUserPage"
            options={{ title: t('app.createUser') }}
          />
          <Stack.Screen
            name="ManageUsers/EditUserPage"
            options={{ title: t('app.editUser') }}
          />
          <Stack.Screen
            name="ManageUsers/UserDetailsPage"
            options={{ title: t('app.userDetails') }}
          />

          {/* Default landing (root) */}
          <Stack.Screen name="index" options={{ headerShown: false }} />
        </Stack>

        <Toast 
          config={toastConfig}
          topOffset={inset.top * 1.1}
        />
      </UserProvider>
      <LanguageButton style={languageButtonStyle}  />
    </>
  );
}