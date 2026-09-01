import { StyleSheet, View, Text } from "react-native";

const JournalEntryComponent = ({entry}) => {

    const date = new Date(entry.captured_at + "Z");

    const date_formatted = date.toLocaleString(undefined, {
        hour: "2-digit",
        minute: "2-digit",
        hour12: false,
    });
    
    return(
        <View style={styles.container}>
            <Text style={{margin: 10, width: 60}}>{date_formatted}</Text>
            <Text style={{margin: 10,flexShrink: 1}}>{entry.text}</Text>
        </View>
    )
}

export default JournalEntryComponent;

const styles = StyleSheet.create({
    container: {
        backgroundColor: "#ffffffff",
        padding: 5,
        width: "90%",
        borderRadius:  5,
        alignSelf: "center",
        flexDirection: "row",
        marginVertical: 10,
    }
})