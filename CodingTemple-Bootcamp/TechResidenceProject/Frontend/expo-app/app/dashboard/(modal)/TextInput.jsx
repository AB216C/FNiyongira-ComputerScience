import { useState, useCallback } from "react";
import { Text, TextInput, Pressable, StyleSheet } from "react-native";
import { useRouter } from "expo-router";
import ThemedText from "../../../components/ThemedText";
import FontAwesome from '@expo/vector-icons/FontAwesome';
import Toast from "react-native-toast-message";
import { useTranslation } from "react-i18next";
import { useFocusEffect } from "@react-navigation/native";
import api from "../../../utils/api";

const TextInputModal = () => {
  const {t} = useTranslation();

  const router = useRouter();
  const [text, setText] = useState("");
  const [error, setError] = useState("");

  useFocusEffect(
      useCallback(() => {
          reset();
      }, [])
  );

  const handleSubmit = async () => {
    setError('');
    try {
      await api.post(`/entries`, {
        text: text
      })

      closeModal();

      Toast.show({
          type: 'success',
          text1: t('app.toastText1'),
          text2: t('app.toastText2'),
          visibilityTime: 5000,
          position: 'top',
          onPress: () => {
            Toast.hide();
            router.replace('dashboard/Journal');
          },
      });

    } catch (error) {
      console.log("Error creating entry: ", error);
      setError(t('app.errorCreatingEntry'))
    }
  };

  const closeModal = () => {
    reset();
    router.back();
  };

  const reset = () => {
    setText("");
    setError('');
  }

  const redirectToVoiceModal = async () => {
    setText("");
    router.replace("dashboard/(modal)/VoiceInput");
  }

  return (
    <Pressable style={styles.overlayContainer} onPress={closeModal}>
      <Pressable style={styles.modalContent} onPress={(e) => e.stopPropagation()}>
        <Pressable onPress={closeModal} style={styles.closeButton}>
          <Text style={styles.closeText}>×</Text>
        </Pressable>

        <ThemedText style={styles.title}>{t('app.newEntryTitle')}</ThemedText>
        <ThemedText style={styles.subtext}>{t('app.newEntrySubtext')}</ThemedText>
        <ThemedText style={[styles.subtext, {color: "#626262ff", fontSize: 12}]}>{t('app.newEntrySubtext3Text')}</ThemedText>
        <TextInput
          style={styles.input}
          placeholder={t('app.textPlaceholder')}
          multiline
          value={text}
          onChangeText={(t) => {
            setText(t),
            setError('')
          }
          }
          scrollEnabled={true}
          textAlignVertical="top"
        />

        <Pressable onPress={() => {setText("")}} style={({pressed}) => [styles.resetButton, pressed && styles.buttonPressed]}><Text style={styles.resetText}>{t('app.reset')}</Text></Pressable>

        <Pressable style={({pressed}) => [styles.submitButton, pressed && styles.buttonPressed, !text && { opacity: 0.4 }]} onPress={handleSubmit} disabled={!text}>
          <ThemedText style={styles.submitText}>{t('app.submit')}</ThemedText>
        </Pressable>

        {error && <Text style={{color: "red", alignSelf: "center"}}>{error}</Text>}

        <Pressable style={({pressed}) => [styles.voiceButton, pressed && styles.buttonPressed]} onPress={redirectToVoiceModal}>
          <ThemedText style={styles.voiceButtonText}><FontAwesome name="microphone" size={20} color="black" />{t('app.useVoiceInstead')}</ThemedText>
        </Pressable>
      </Pressable>
    </Pressable>
  );
}

export default TextInputModal;

const styles = StyleSheet.create({
  overlayContainer: {
    flex: 1,
    backgroundColor: "rgba(0,0,0,0.5)",
    justifyContent: "center",
    alignItems: "center",
  },
  modalContent: {
    backgroundColor: "#fff",
    borderRadius: 20,
    width: "90%",
    padding: 20,
  },
  backText: { 
    fontSize: 22, 
    alignSelf: "flex-end" 
  },
  title: { 
    fontSize: 20, 
    marginBottom: 10, 
    fontWeight: 700 
  },
  subtext: {
    fontSize: 15,
    marginBottom: 10
  },
  closeButton: {
    alignSelf: "flex-end",
  },
  closeText: {
    fontSize: 26,
    color: "#999",
  },
  input: {
    borderWidth: 1,
    borderColor: "#ccc",
    borderRadius: 10,
    padding: 10,
    textAlignVertical: "top",
    height: 300,
  },
  resetButton: {
    alignSelf: "flex-end",
  },
  resetText: {
    fontWeight: 700,
    color: "#eb0000ff"
  },
  voiceButton: {
    marginTop: 10,
    borderRadius: 10,
    paddingVertical: 6,
    alignItems: "center",
    alignSelf: "center",
  },
  buttonPressed: {
    opacity: 0.5
  },
  voiceButtonText: {
    color: "black",
    fontWeight: "600",
    textAlign: "center",
    fontSize: 16,
    textDecorationLine: "underline"
  },
  submitButton: {
    backgroundColor: "#007AFF",
    marginTop: 20,
    borderRadius: 10,
    paddingVertical: 12,
    alignItems: "center",
  },
  submitText: { 
    color: "#fff", 
    fontWeight: "600" 
  },
});