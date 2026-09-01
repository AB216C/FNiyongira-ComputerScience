import { Tabs } from "expo-router";
import UserOnly from "../../components/auth/UserOnly";
import { Ionicons } from "@expo/vector-icons";
import { useTranslation } from "react-i18next";

const DashboardLayout = () => {
    const {t} = useTranslation();

    return (
        <UserOnly>            
            <Tabs screenOptions={{
                headerShown: true,
                tabBarStyle: { backgroundColor: "white", paddingTop: 10, height: 90 },
                tabBarActiveTintColor: "black",
                tabBarInactiveTintColor: "grey",
            }}>
                <Tabs.Screen 
                    name='NewEntry'
                    options={{ title: t('app.newEntry'), headerShown: false, tabBarIcon: ({ focused }) => (
                    <Ionicons 
                        size={30} 
                        name={focused ? 'create': 'create-outline'} 
                        color={focused ? "black" : "grey"} 
                        />
                    )}}
                />
                <Tabs.Screen 
                    name='Insights'
                    options={{ title: t('app.insights'), headerShown: false, tabBarIcon: ({ focused }) => (
                    <Ionicons 
                        size={24} 
                        name={focused ? 'bulb': 'bulb-outline'} 
                        color={focused ? "black" : "grey"} 
                        />
                    )}}
                />
                <Tabs.Screen 
                    name='Journal'
                    options={{ title: t('app.journal'), headerShown: false, tabBarIcon: ({ focused }) => (
                    <Ionicons 
                        size={24} 
                        name={focused ? 'book': 'book-outline'} 
                        color={focused ? "black" : "grey"} 
                        />
                    )}}
                />
                <Tabs.Screen 
                    name='Profile'
                    options={{ title: t('app.account'), headerShown: false, tabBarIcon: ({ focused }) => (
                    <Ionicons 
                        size={24} 
                        name={focused ? 'person': 'person-outline'} 
                        color={focused ? "black" : "grey"} 
                        />
                    )}}
                />
                <Tabs.Screen 
                    name='(modal)/TextInput'
                    options={{presentation: "modal", href: null, headerShown: false}}
                />
                <Tabs.Screen 
                    name='(modal)/VoiceInput'
                    options={{presentation: "modal", href: null, headerShown: false}}
                />
            </Tabs>
        </UserOnly>
    )
}

export default DashboardLayout;