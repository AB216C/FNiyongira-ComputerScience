import { useEffect, useState, useCallback } from "react";
import ThemedText from "../../components/ThemedText";
import ThemedView from "../../components/ThemedView";
import { StyleSheet, View, Text, ScrollView } from "react-native";
import JournalEntries from "../../components/JournalEntries";
import Spacer from "../../components/Spacer";
import { useFocusEffect } from '@react-navigation/native';
import { useTranslation } from "react-i18next";
import api from '../../utils/api'; 

const Journal = () => {
    const { i18n, t } = useTranslation();
    const [entries, setEntries] = useState([]);
    const [error, setError] = useState("");

    const fetchEntries = async () => {
        try {
            const response = await api.get(`/entries`);
            const entryList = await response.data;
            setEntries(entryList);
        } catch (error) {
            console.log("Error fetching entry: ", error);
            setError(t('app.errorFetchingEntry'));
        }
        
    }

    useEffect(() => {
        fetchEntries();
    }, [])

    // Reset entries and error message when user leaves Journal page
    useFocusEffect(
        useCallback(() => {
            fetchEntries();
            setError('');
        }, [])
    );

    // Group the entries by date, returns the date groups
    const groupByDate = (entries) => {
        const groups = {};

        const formatter = new Intl.DateTimeFormat(i18n.language, {
            month: "short",
            day: "numeric",
            year: "numeric",
        });

        entries.forEach((entry) => {
            const date = new Date(entry.captured_at + "Z");

            const entryDate = formatter.format(date);

            if (!groups[entryDate]) groups[entryDate] = [];
            groups[entryDate].push(entry);
        });

        return groups;
    };

    const groupedEntries = groupByDate(entries);
    const dates = Object.keys(groupedEntries);
    const sortedDates = dates.reverse();

    return (
        <ThemedView safe='true' style={styles.fullScreenContainer}>
            <ThemedText title='true'>{t('app.journal')}</ThemedText>

            <Spacer />

            <ScrollView 
                contentContainerStyle={{ paddingBottom: 30, width: "100%" }}
                style={{ flex: 1, width: "90%", borderRadius: 10 }}
            >
                {entries && entries.length > 0 ? 
                    <View style={styles.container}>
                        {sortedDates.map((date) => (
                            <View key={date}>
                                <JournalEntries  date={date} entries={groupedEntries[date]} />
                            </View>
                            
                        ))}
                    </View>
                    : <View style={[styles.container, {alignItems: 'center'}]}>
                        <Text>{t("app.noEntriesFound")}</Text>
                    </View>
                }
                
                {error && <Text style={{color: "red", alignSelf: "center"}}>{error}</Text>}
            </ScrollView>
        </ThemedView>
    )
}

export default Journal;

const styles = StyleSheet.create({
    fullScreenContainer: {
        flex: 1,
        alignItems: 'center',
        width: "100%"
    },
    container: {
        width: "100%"
    }
})