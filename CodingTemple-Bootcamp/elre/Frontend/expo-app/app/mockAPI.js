import React, {useState, useEffect} from 'react';
import {View, Text, FlatList,ActivityIndicator} from 'react-native';
import Styles from './MockApiStyles.js';

export default function MockAPI(){
    const [task, setTask] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(()=>{
        fetch('https://jsonplaceholder.typicode.com/todos')
        .then((response)=>response.json())
        .then((data)=>{
            const firstFive = data.slice(0,9);
            setTask(firstFive);
        })
        .catch((error)=>{
            console.log("Error fetching data",error)
            
        })
        .finally(()=>{
            setLoading(false)
        })
    },[]);

    if(loading){
        return(
            <View style={Styles.center}>
                <ActivityIndicator size="large" color="#09098fff"/>
                <Text>Loading...</Text>
            </View>
        )
    }

    return(
        <View style={Styles.content}>
            <Text style={Styles.header}> 9 Tasks to Complete-From MockAPI</Text>
            <FlatList
            data={task}
            keyExtractor = {(item)=>item.id.toString()}
            renderItem = {({item})=>(
                <View style={Styles.task}>
                    <Text style={Styles.title}>{item.title}</Text>
                    <Text>Status:{item.completed? 'Been Completed':'Still pending'}</Text>
                </View>
            )}
            scrollEnabled={false}
            />
        </View>
    )
}

