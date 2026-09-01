import {StyleSheet, Pressable, Text } from 'react-native';
import FontAwesome6 from '@expo/vector-icons/FontAwesome6';
import FontAwesome from '@expo/vector-icons/FontAwesome';

import { useUser } from '../../hooks/useUser';
import Spacer from '../../components/Spacer';
import ThemedView from '../../components/ThemedView';
import ThemedText from '../../components/ThemedText';
import { useRouter } from 'expo-router';
import { useTranslation } from 'react-i18next';

const NewEntry = () => {
    const { t } = useTranslation();
    const {user} = useUser();
    const router = useRouter();

    const onPressSpeak = () => {
        router.push('/dashboard/(modal)/VoiceInput');
    }

    const onPressText = () => {
        router.push('/dashboard/(modal)/TextInput');
    }

    return (
        <ThemedView style={styles.buttonContainer} safe="true">
            <ThemedText title='true' style={{textAlign: 'center'}}>{t("app.welcomeName")} {user.nickname}!</ThemedText>
            <Spacer height={40}/>
            
            <Pressable 
                onPress={onPressSpeak}
                style={({ pressed }) => [
                    styles.semiCircleTop,
                    pressed && styles.buttonPressed,
                ]}
            >
                <Text style={styles.buttonText}><FontAwesome name="microphone" size={50} color="black" />{"\n"}{t('app.speak')}</Text>
            </Pressable>

            <Spacer height={15}/>

            <Pressable 
                onPress={onPressText}
                style={({ pressed }) => [
                    styles.semiCircleBottom,
                    pressed && styles.buttonPressed,
                ]}
            >
                <Text style={styles.buttonText}><FontAwesome6 name="keyboard" size={50} color="black" />{"\n"}{t('app.type')}</Text>
            </Pressable>
        </ThemedView>
    );
}

export default NewEntry;

const styles = StyleSheet.create({
    buttonContainer: {
        flex: 1,
        alignItems: "center",
        justifyContent: "center",
    },
    circleButtons: {
        justifyContent: 'center',
        alignItems: 'center'
    },
    semiCircleTop: {
        width: 300, 
        height: 150, 
        backgroundColor: '#3aa9f3ff',
        borderTopLeftRadius: 150, 
        borderTopRightRadius: 150, 
        alignItems: "center",
        justifyContent: "center",
        borderWidth: 3,
        borderColor: "#3aa9f3ff",
        shadowColor: "#000000ff",
        shadowOpacity: 0.5,
        shadowRadius: 3,
        shadowOffset: {width: 0, height: 1},
        elevation: 1,
    },
    semiCircleBottom: {
        width: 300,
        height: 150,
        backgroundColor: "#3aa9f3ff",
        borderBottomLeftRadius: 150,
        borderBottomRightRadius: 150,
        alignItems: "center",
        justifyContent: "center",
        borderWidth: 3,
        borderColor: "#3aa9f3ff",
        shadowColor: "#000000ff",
        shadowOpacity: 0.5,
        shadowRadius: 3,
        shadowOffset: {width: 0, height: 1},
        elevation: 1
    },
    buttonText: {
        color: 'black',
        fontSize: 30,
        fontWeight: 'bold',
        textAlign: "center",
    },
    buttonPressed: {
        backgroundColor: '#88cfffff',
        borderColor: "#88cfffff",
        transform: [{scale: 0.95}]
    },

});