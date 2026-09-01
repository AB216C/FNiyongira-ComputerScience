
import { StyleSheet, Button, Text, TextInput, View, ScrollView , FlatList} from "react-native"
import React, { useState } from 'react'

export default function GoalList(){
    const [enteredGoalText,setEnteredGoalText] = useState('');
    const [courseGoals, setCourseGoals] = useState([]);

    function goalInputHandler(enteredText){
        setEnteredGoalText(enteredText)
    };

    // function addGoalHandler(){
    //     setCourseGoals((currentCourseGoals)=>[
    //         ...currentCourseGoals, 
    //         enteredGoalText
    //     ])
    // };

// TO USE FlatList, THIS addGoalHandler FUNCTION NEED TO BE CHANGED:
    function addGoalHandler(){
        if(!enteredGoalText.trim()) return; //This will ignore empty input
        setCourseGoals((currentCourseGoals)=>[
            ...currentCourseGoals, 
            {text:enteredGoalText, id:Math.random().toString()},
        ]);
        setEnteredGoalText(""); //This will clear all input
    }

    return (
        <View style={styles.appContainer}>

            <View style={styles.inputContainer} >
                <TextInput style={styles.textInput} placeholder="Your course goal" onChangeText={goalInputHandler}/>
                <Button title="Add goal" onPress={addGoalHandler}/>
            </View>

{/* 
            <View style={styles.goalsContainer}>
                <ScrollView AlwaysBounceVertical={false}>
                    {courseGoals.map((goal,index)=>(
                        <View key={index} style={styles.goalItem}>
                            <Text style={styles.goalText}>{goal}</Text>
                        </View>
                    ))}

                </ScrollView>
            </View> */}

{/* using FlatList in place of Scroll view */}

            <View style={styles.goalsContainer}>
                <FlatList 
                data={courseGoals} 
                renderItem={(itemData)=>{
                    return (
                        <View style={styles.goalItem}>
                            <Text style={styles.goalText}>{itemData.item.text}</Text>
                        </View>
                    );
                }} 
                keyExtractor={(item,index)=>{
                    return item.id}}
                alwaysBounceVertical={false}/>
            </View>
        </View>
    )
}

const styles = StyleSheet.create({
    appContainer: {
        paddingTop:50,
        width:'80%',
        flex:1,
        // justifyContent:'center',
        // alignItems:'center'
    },

    inputContainer: {
        flex:1,
        flexDirection: 'row',
        justifyContent:'space-between',
        alignItems:'center',
        marginBottomWidth:1,
        marginBottomColor:'#cccc',
        borderBottomWidth:1,
        borderBottomColor:'#0a0a0acc'

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
        flex: 3,
        marginTop: 25
    },

    goalItem:{
        backgroundColor:'rgba(46, 11, 99, 0.87)',
        padding:8,
        margin:8,
    },

    goalText: {
        color:'white'
    }

})