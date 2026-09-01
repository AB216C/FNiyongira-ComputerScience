import ThemedText from '../../components/ThemedText';
import ThemedView from '../../components/ThemedView';
import { useUser } from '../../hooks/useUser';
import { Image, StyleSheet, Dimensions, Pressable, ActivityIndicator } from 'react-native';
import { useTranslation } from 'react-i18next';

import { useRouter } from 'expo-router';

const { width: screenWidth } = Dimensions.get('window');

// List of admins who can access Manage Users
const adminEmails = [
  "owner@example.com",
  "eliferik72@gmail.com",
  "tamekaroberson1995@gmail.com",
  "bahizieric321@gmail.com",
  "ferdinandniyongira@gmail.com",
  "geeyun.jenny.chau@gmail.com",
  "szirneskie91@gmail.com",
  "rossgilmour1414@gmail.com",
  "eftykhan4630@gmail.com",
  "sarukhadka74@gmail.com"
];

const Profile = () => {
  const { t } = useTranslation();
  const { user, logout, loading, deleteUser } = useUser();
  const router = useRouter();

  const isAdmin = adminEmails.includes(user?.email);

  return (
    <ThemedView safe="true" style={styles.fullScreenContainer}>
      <ThemedText title="true">{t("app.account")}</ThemedText>

      {user?.picture && (
        <Image source={{ uri: user.picture }} style={styles.profileImage} />
      )}

      <ThemedText style={styles.settings}>
        <ThemedText style={styles.bold}>{t("app.name")}: </ThemedText>
        {user.name}
      </ThemedText>
      <ThemedText style={styles.settings}>
        <ThemedText style={styles.bold}>{t("app.nickname")}: </ThemedText>
        {user.nickname}
      </ThemedText>
      <ThemedText style={styles.settings}>
        <ThemedText style={styles.bold}>{t("app.email")}: </ThemedText>
        {user.email}
      </ThemedText>

      {/* Logout Button */}
      <Pressable
        style={({ pressed }) => [
          styles.logoutButton,
          pressed && styles.pressedButton,
        ]}
        onPress={logout}
      >
        <ThemedText style={styles.buttonText}>{t("app.logout")}</ThemedText>
      </Pressable>

      {/* Delete Account Button */}
      <Pressable
        style={({ pressed }) => [
          styles.deleteButton,
          pressed && styles.pressedDelete,
        ]}
        onPress={deleteUser}
      >
        <ThemedText style={styles.deleteAccountButton}>{t("app.deleteAccount")}</ThemedText>
      </Pressable>

      {/* Admin-only Manage Users Button */}
      {isAdmin && (
        <Pressable
          style={({ pressed }) => [
            styles.manageButton,
            pressed && styles.pressedManage,
          ]}
          onPress={() => router.push('/ManageUsers')}
        >
          <ThemedText style={styles.manageText}>{t("app.manageUsers")}</ThemedText>
        </Pressable>
      )}

      {loading ? <ActivityIndicator size="large" /> : null}
    </ThemedView>
  );
};

export default Profile;

const styles = StyleSheet.create({
  fullScreenContainer: {
    flex: 1,
    alignItems: 'center',
  },
  profileImage: {
    width: 120,
    height: 120,
    borderRadius: 60,
    marginTop: 20,
  },
  settings: {
    width: '100%',
    paddingTop: 30,
    paddingHorizontal: screenWidth * 0.1,
    textAlign: 'left',
  },
  bold: {
    fontWeight: 'bold',
  },

  // Logout button
  logoutButton: {
    width: screenWidth * 0.8,
    alignItems: 'center',
    paddingVertical: 15,
    borderRadius: 10,
    backgroundColor: '#d53c3cff',
    marginTop: 30,
  },
  pressedButton: {
    backgroundColor: '#8d2626ff',
    transform: [{ scale: 0.97 }],
  },
  buttonText: {
    fontWeight: 'bold',
    color: 'white',
  },

  // Delete button
  deleteButton: {
    width: screenWidth * 0.8,
    alignItems: 'center',
    paddingVertical: 15,
    borderRadius: 10,
    backgroundColor: '#f3f4f6',
    marginTop: 10,
  },
  pressedDelete: {
    backgroundColor: '#e5e7eb',
    transform: [{ scale: 0.97 }],
  },
  deleteAccountButton: {
    color: 'red',
    fontWeight: 'bold',
  },

  // Manage Users button (Admin only)
  manageButton: {
    width: screenWidth * 0.8,
    alignItems: 'center',
    paddingVertical: 15,
    borderRadius: 10,
    backgroundColor: '#2563eb',
    marginTop: 15,
    shadowColor: '#000',
    shadowOpacity: 0.1,
    shadowRadius: 6,
    shadowOffset: { width: 0, height: 3 },
  },
  pressedManage: {
    backgroundColor: '#1e40af',
    transform: [{ scale: 0.97 }],
  },
  manageText: {
    color: '#fff',
    fontSize: 16,
    fontWeight: '600',
  },
});