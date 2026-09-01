import { StyleSheet, View, Text, TouchableOpacity } from "react-native";
import JournalEntryComponent from "./JournalEntryComponent";
import Collapsible from 'react-native-collapsible';
import { useState, useCallback } from "react";
import { useFocusEffect } from '@react-navigation/native';


const JournalEntries = ({date, entries}) => {
    const [collapsed, setCollapsed] = useState(true);

    useFocusEffect (
        useCallback(() => {
            return () => setCollapsed(true);
        }, [])
    )

    return(
        <View style={styles.container}>
            <TouchableOpacity
                onPress={() => setCollapsed(!collapsed)}
                style={styles.header}
            >
                <Text style={styles.headerText}>{date}</Text>
            </TouchableOpacity>

            <Collapsible collapsed={collapsed}>
                <View style={styles.content}>
                {entries.map((entry) => (
                    <View key={entry.id}>
                        <JournalEntryComponent entry={entry} />
                    </View>
                ))}
                </View>
            </Collapsible>
        </View>
    )
}

export default JournalEntries;

const styles = StyleSheet.create({
    container: {
        backgroundColor: '#c0e6ffff',
        marginVertical: 5,
        borderRadius: 10
    },
    header: {
        backgroundColor: '#3498db',
        padding: 15,
        borderRadius: 8,
    },
    headerText: { 
        color: 'white', 
        fontWeight: 'bold', 
        fontSize: 16 
    },
    content: { 
        padding: 5 
    },
})