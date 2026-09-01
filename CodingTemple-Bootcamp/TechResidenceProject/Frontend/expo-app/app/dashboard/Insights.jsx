import ThemedText from "../../components/ThemedText";
import ThemedView from "../../components/ThemedView";
import { StyleSheet } from 'react-native';
import { useTranslation } from "react-i18next";

const Insights = () => {
    const { t } = useTranslation();
    
    return (
        <ThemedView safe='true' style={styles.fullScreenContainer}>
            <ThemedText title='true'>{t('app.insights')}</ThemedText>
        </ThemedView>
    )
}

export default Insights;

const styles = StyleSheet.create({
    fullScreenContainer: {
        flex: 1,
        alignItems: 'center',
    }
})