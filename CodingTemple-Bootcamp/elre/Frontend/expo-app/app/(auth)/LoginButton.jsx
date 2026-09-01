import { Pressable, StyleSheet, Dimensions } from 'react-native';
import { useUser } from '../../hooks/useUser';
import ThemedView from '../../components/ThemedView';
import ThemedText from '../../components/ThemedText';
import Spacer from '../../components/Spacer';
import { useRouter } from 'expo-router';
import { useTranslation } from 'react-i18next';

const LoginButton = () => {
  const { t } = useTranslation();

  const router = useRouter();
  const { user, login, logout } = useUser();

  const handleMagicLinkLogin = () => {
    router.push("/MagicLinkCreateUser")
  }

  return (
      <ThemedView style={styles.fullScreenContainer} safe='true'>
          <ThemedText title='true'>{t('app.title')}</ThemedText>
          <ThemedText style={styles.text}>{t('app.welcome')}</ThemedText>
          <ThemedText style={styles.subtitle}>{t('app.subtitle')}</ThemedText>
          <Spacer />

      {/* Login with Auth0 email and password */}
      <Pressable
        style={({ pressed }) => [
          styles.loginButton,
          pressed && styles.pressedButton,
        ]}
        onPress={user ? logout : login}
      >
        <ThemedText style={styles.buttonText}>
          {user ? t('app.logout') : t('app.login_button')}
        </ThemedText>
      </Pressable>

      {/* Magic Link Button */}
      <Pressable
        style={({ pressed }) => [
          styles.loginMagicLinkButton,
          pressed && {opacity: 0.5},
        ]}
        onPress={user ? logout : handleMagicLinkLogin}
      >
        <ThemedText style={styles.buttonMagicLinkText}>
          {user ? '' : t('app.magicLinkButton')}
        </ThemedText>
      </Pressable>
    </ThemedView>
  );
};

export default LoginButton;

const { width: screenWidth } = Dimensions.get('window');

const styles = StyleSheet.create({
    scrollContent: {
        padding: 20,
        alignItems: 'center',
    },
    text: {
        marginVertical: 10,
        textAlign: "center"
    },
    fullScreenContainer: {
        flex: 1,
        width: '100%',
        alignItems: 'center',
        justifyContent: 'center'
    },
    loginButton: {
        width: screenWidth * 0.6,
        alignItems: "center",
        paddingVertical: 15,
        paddingHorizontal: 15,
        borderRadius: 10,
        shadowColor: "#000",
        shadowOffset: { width: 0, height: 2 },
        shadowOpacity: 0.3,
        shadowRadius: 3,
        elevation: 4,
        backgroundColor: '#53a33aff'
    }, 
    loginMagicLinkButton: {
        alignItems: "center",
        marginVertical: 15,
        marginHorizontal: 15,
        borderRadius: 10,
    },
    pressedButton: {
        backgroundColor: '#458033ff',
        transform: [{scale: 0.97}]
    },
    buttonText: {
        fontWeight: 'bold',
        color: "white",
        fontSize: 24,
        textAlign: "center"
    },
    buttonMagicLinkText: {
        fontWeight: '600',
        color: "black",
        fontSize: 16,
        textDecorationLine: "underline",
        textAlign: "center"
    },
    subtitle: {
        fontSize: 16,
        color: '#475569',
        textAlign: 'center',
        marginBottom: 40,
    },
})