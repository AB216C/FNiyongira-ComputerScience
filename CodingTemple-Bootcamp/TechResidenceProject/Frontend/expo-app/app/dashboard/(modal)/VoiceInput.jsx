import { useState, useEffect, useCallback } from "react";
import { View, Text, Pressable, StyleSheet, TouchableOpacity, Alert, TextInput } from "react-native";
import { useRouter } from "expo-router";
import ThemedText from "../../../components/ThemedText";
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import FontAwesome from '@expo/vector-icons/FontAwesome';
import {
    useAudioRecorder,
    AudioModule,
    RecordingPresets,
    setAudioModeAsync,
    useAudioRecorderState,
    useAudioPlayer,
    useAudioPlayerStatus
} from 'expo-audio';
import Toast from "react-native-toast-message";
import Spacer from "../../../components/Spacer";
import { useTranslation } from "react-i18next";
import { useFocusEffect } from "@react-navigation/native";
import api from "../../../utils/api";

const VoiceInputModal = () => {
    const router = useRouter();
    const { t } = useTranslation();

    const audioRecorder = useAudioRecorder(RecordingPresets.HIGH_QUALITY);
    const recorderState = useAudioRecorderState(audioRecorder);
    const [recordingUri, setRecordingUri] = useState(null);
    const player = useAudioPlayer(recordingUri ? { uri: recordingUri } : null);
    const playerStatus = useAudioPlayerStatus(player);

    const [playback, setPlayback] = useState(false);
    const [playing, setPlaying] = useState(false);
    const [error, setError] = useState("");
    const [text, setText] = useState("");
    const [transcribing, setTranscribing] = useState(false);

    useFocusEffect(
        useCallback(() => {
            reset();
        }, [])
    );

    const startRecording = async () => {
        await audioRecorder.prepareToRecordAsync();
        audioRecorder.record();
    };

    const stopRecording = async () => {
        setError('');
        await audioRecorder.stop();
        const uri = audioRecorder.uri;
        setRecordingUri(uri);
        setPlayback(true);
        transcribe(uri);
    }

    const transcribe = async (uri) => {
        setTranscribing(true);
        try {
            const formData = new FormData();

            formData.append('file',{
                uri: uri,
                name: 'recording.m4a',
                type: 'audio/m4a',
            })
            
            const transcribed = await api.post(`/whisper/transcribe`, formData, {
                headers: {
                    'Content-Type': 'multipart/form-data',
                },
            });

            const data = transcribed.data;
            setText(data.transcription);
            setTranscribing(false);
            
        } catch (error) {
            setTranscribing(false);
            setError(t("app.audioUploadError"));
            console.error('Error uploading audio:', error);
        }
    };

    useEffect(() => {
        (async () => {
            const status = await AudioModule.requestRecordingPermissionsAsync();
            if (!status.granted) {
                Alert.alert(t('app.microphoneDenied'));
            }

            setAudioModeAsync({
                playsInSilentMode: true,
                allowsRecording: true,
            });

            setPlayback(false);
        })();
    }, []);

    const closeModal = () => {
        reset();
        router.back();
    };

    const reset = async () => {
        if (audioRecorder.isRecording) {
            await audioRecorder.stop();
        }
        setPlayback(false);
        setRecordingUri(null);
        setError("");
        setPlaying(false);
        setText("");
        setTranscribing(false);
    }

    const replay = () => {
        player.seekTo(0);
        player.play();
        setPlaying(true);
    }

    useEffect(() => {
        if (playerStatus.didJustFinish) {
            setPlaying(false);
        }
    }, [playerStatus.didJustFinish])

    const playPauseToggle = () => {
        if (playerStatus.didJustFinish) {
            replay();
        } else if (playerStatus.playing) {
            player.pause();
            setPlaying(false);
        } else {
            player.play();
            setPlaying(true);
        }
    }

    const formatTime = (totalSeconds) => {
        const minutes = Math.floor(totalSeconds / 60);
        const seconds = totalSeconds % 60;

        const formattedMinutes = String(minutes).padStart(2, '0');
        const formattedSeconds = String(seconds).padStart(2, '0');

        return `${formattedMinutes}:${formattedSeconds}`;
    }

    const redirectToTypingModal = () => {
        reset();
        router.replace("dashboard/(modal)/TextInput")
    }

    const handleSubmit = async () => {
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
            setError(t("app.errorCreatingEntry"))
        }
    };

    return (
        <Pressable style={styles.overlayContainer} onPress={closeModal}>
        <Pressable style={styles.modalContent} onPress={(e) => e.stopPropagation()}>
            <Pressable onPress={closeModal} style={styles.closeButton}>
                <Text style={styles.closeText}>×</Text>
            </Pressable>

            <ThemedText style={styles.title}>{t('app.newEntryTitle')}</ThemedText>
            <ThemedText style={styles.subtext}>{t('app.newEntrySubtext')}</ThemedText>
            <ThemedText style={[styles.subtext, {color: "#626262ff", fontSize: 12}]}>{t('app.newEntrySubText2Voice')}</ThemedText>

            {!playback && 
                <>
                    <Spacer />
                    <TouchableOpacity
                        style={[styles.button, recorderState.isRecording && styles.recordingButton]}
                        onPress={recorderState.isRecording ? stopRecording : startRecording}
                    >
                        <Text style={styles.buttonText}>
                        {recorderState.isRecording ? <><FontAwesome name="microphone" size={60} color="black" />{'\n'}<Text style={{fontSize: 20}}>{t('app.recording')}</Text></> : <><FontAwesome name="microphone" size={60} color="black" />{'\n'}<Text style={{fontSize: 20}}>{t('app.record')}</Text></>}
                        </Text>
                    </TouchableOpacity>
                    <Spacer />
                </>
            }

            {playback && 
            <>
                <View style={styles.playbackContainer}>
                    <Text style={{alignSelf: "center", fontSize: 20, fontWeight: 700, textDecorationLine: "underline"}}>{t('app.playbackRecording')}</Text>
                    <Spacer />
                    <View style={styles.playbackContainerControls}>
                        <TouchableOpacity onPress={replay}>
                            <FontAwesome name="repeat" size={28} color="black" />
                        </TouchableOpacity>

                        <TouchableOpacity onPress={playPauseToggle}>
                            <FontAwesome name={playing ? "pause" : "play"} size={28} color="black" />
                        </TouchableOpacity>

                        <TouchableOpacity onPress={reset}>
                            <FontAwesome name="trash" size={28} color="red" />
                        </TouchableOpacity>
                    </View>
                    <Text style={{alignSelf: "center", fontSize: 20}}>{playerStatus.currentTime > playerStatus.duration ? formatTime(playerStatus.duration.toFixed(0)) : formatTime(playerStatus.currentTime.toFixed(0))} / {formatTime(playerStatus.duration.toFixed(0))}</Text>
                </View>
            </>
            }

            {transcribing && playback && <Text style={{fontWeight: 700, alignSelf: 'center', color: '#3db732ff', fontSize: 20}}>{t('app.loadingTranscription')}</Text>}

            {!transcribing && playback &&
                <TextInput
                    style={styles.input}
                    multiline
                    value={text}
                    onChangeText={setText}
                    scrollEnabled={true}
                    textAlignVertical="top"
                    placeholder={t('app.noTranscription')}
                />
            }
            {!transcribing && playback &&
                <Pressable style={({pressed}) => [styles.submitButton, pressed && styles.buttonPressed, !text && { opacity: 0.4 }]} onPress={handleSubmit} disabled={!text}>
                    <ThemedText style={styles.submitText}>{t('app.submit')}</ThemedText>
                </Pressable>
            }

            {playback && error && <Text style={{color: "red", alignSelf: "center"}}>{error}</Text>}
            
            <Pressable style={styles.textButton} onPress={redirectToTypingModal}>
                <ThemedText style={styles.textButtonText}><FontAwesome6 name="keyboard" size={20} color="black" />{t('app.useTextInstead')}</ThemedText>
            </Pressable>
        </Pressable>
        </Pressable>
    );
    }

    export default VoiceInputModal;

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
            maxHeight: "85%",
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
        button: {
            paddingVertical: 14,
            alignItems: "center",
            alignSelf: "center",
            justifyContent: "center",
            width: 180, 
            height: 180, 
            backgroundColor: '#5fff50ff',
            borderTopLeftRadius: 90, 
            borderTopRightRadius: 90,
            borderBottomLeftRadius: 90, 
            borderBottomRightRadius: 90,
            borderWidth: 1,
            shadowColor: "#000000ff",
            shadowOpacity: 0.5,
            shadowRadius: 3,
            shadowOffset: {width: 0, height: 1},
            elevation: 5,
        },
        recordingButton: {
            backgroundColor: "#fe5047ff",
        },
        buttonText: { 
            color: "#000000ff", 
            fontWeight: "800", 
            fontSize: 20,
            textAlign: "center"
        },
        input: {
            borderWidth: 1,
            borderColor: "#ccc",
            borderRadius: 10,
            padding: 10,
            textAlignVertical: "top",
            height: "20%",
        },
        textButton: {
            marginTop: 10,
            borderRadius: 10,
            paddingVertical: 6,
            alignItems: "center",
            alignSelf: "center",
        },
        textButtonText: {
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
        playbackContainer: {
            padding: 10,
            borderRadius: 12,
            backgroundColor: '#f2f2f2',
            marginVertical: 10,
        },
        playbackContainerControls: {
            flexDirection: 'row',
            justifyContent: 'space-around',
            marginBottom: 10,
        },
});