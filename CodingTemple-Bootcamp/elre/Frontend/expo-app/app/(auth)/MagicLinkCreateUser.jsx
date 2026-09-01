import React, { useEffect, useState } from 'react';
import { Text, TextInput, Pressable, StyleSheet, Alert, ActivityIndicator } from 'react-native';
import { useRouter } from 'expo-router';
import ThemedView from '../../components/ThemedView';
import ThemedText from '../../components/ThemedText';
import { useUser } from '../../hooks/useUser';
import * as WebBrowser from 'expo-web-browser';
import { useTranslation } from 'react-i18next';

const MagicLinkCreateUser = () => {
  const {t} = useTranslation();

  const router = useRouter();
  const {loginMagicLink, login} = useUser();

  const [email, setEmail] = useState("");
  const [loading, setLoading] = useState(false);
  const [success, setSuccess] = useState(false);
  
  const handleCreate = async () => {
    if (!email) {
      Alert.alert(t('app.fieldsRequired'));
      return;
    }

    setLoading(true);

    try {
      const response = loginMagicLink(email);

      if (!response) {
        Alert.alert(t('app.error'), t('app.errorSendingMagicLink'));
      }
      setSuccess(true);
    } catch (error) {
      console.error(error.message);
      Alert.alert(t('app.error'), t('app.createUserError'));
    } finally {
      setLoading(false);
    }
  };

  const handleRedirect = async () => {
    setEmail("");
    setLoading(false);
    setSuccess(false);
    router.replace("/");
  }

  return (
    <ThemedView safe={true} style={styles.container}>
      <ThemedText style={styles.title}>{t('app.enterEmail')}</ThemedText>
      <TextInput
        placeholder={t('app.email')}
        style={styles.input}
        keyboardType="email-address"
        value={email}
        onChangeText={(t) => setEmail(t)}
        editable={!success}
      />
      {!success && 
      <>
        <Pressable style={({pressed}) => [styles.button, pressed && styles.pressedButton]} onPress={handleCreate} disabled={loading}>
          {loading ? <ActivityIndicator color="#000000ff" /> : <Text style={styles.buttonText}>{t('app.sendMagicLink')}</Text>}
        </Pressable>

      </>
      }

      { success && 
        <>
          <ThemedText style={styles.successText}>{t('app.magicLinkSentMessage', {email})}</ThemedText>
        </>
      }

      <Pressable style={({pressed}) => [styles.alternativeButton, pressed && styles.pressedAlternativeButton]} onPress={handleRedirect} disabled={loading}>
          <Text style={styles.alternativeButtonText}>{t('app.back')}</Text>
        </Pressable>

    </ThemedView>
  );
}

export default MagicLinkCreateUser;

const styles = StyleSheet.create({
  container: { 
    flex: 1, 
    padding: 20, 
    backgroundColor: '#fff',
    alignItems: "center",
    justifyContent: "center"
  },
  title: { 
    fontSize: 30, 
    fontWeight: 'bold', 
    marginBottom: 20 
  },
  input: { 
    borderWidth: 1, 
    borderColor: '#ccc', 
    borderRadius: 8, 
    padding: 12, 
    marginBottom: 15,
    width: "80%",
    fontSize: 18
  },
  button: { 
    backgroundColor: '#2563eb', 
    paddingVertical: 12, 
    borderRadius: 8, 
    alignItems: 'center',
    width: "80%",
  },
  buttonText: { 
    color: '#fff', 
    fontWeight: 'bold', 
    fontSize: 20
  },
  pressedButton: {
    backgroundColor: '#4a7decff',
    transform: [{scale: 0.97}]
  },
  alternativeButton: {
    marginVertical: 15,
    width: "70%",
  },
  pressedAlternativeButton: {
    opacity: 0.6
  },
  alternativeButtonText: {
    fontWeight: 600,
    fontSize: 16,
    textAlign: "center",
    textDecorationLine: "underline"
  },
  successText: {
    fontSize: 16,
    color: "green",
    margin: 12,
    fontWeight: "bold",
    width: "80%",
  }
});