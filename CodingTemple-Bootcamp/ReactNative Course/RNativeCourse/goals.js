
import { StyleSheet, Button, Text, TextInput, View } from "react-native"
import React from 'react'

export default function GoalList(){

    return (
        <View style={styles.appContainer}>

            <View style={styles.inputContainer} >
                <TextInput style={styles.textInput} placeholder="Your course goal"/>
                <Button title="Add goal"/>
            </View>

            <View style={styles.goalsContainer}>
                <Text>List of goals</Text>
            </View>

        </View>
    )
}

const styles = StyleSheet.create({
    appContainer: {
        padding: 0,
        width:'80%',
        flex:1,
        justifyContent:'center',
        alignItems:'center'
    },

    inputContainer: {
        flex:1,
        flexDirection: 'row',
        justifyContent:'space-between',
        alignItems:'center',
        marginBottom:2,
        marginBottomWidth:1,
        marginBottomColor:'#cccc'

    },

    textInput: {
        width:'70%',
        borderWidth:1,
        borderColor:'#cccccc',
        marginRight:8,
        padding:15,
        marginLeft:5,
        marginTop:5,
        marginBottom:5

    },

    goalsContainer: {
        flex: 4
    }

})