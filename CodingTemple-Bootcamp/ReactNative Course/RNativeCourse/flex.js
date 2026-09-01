import {View, Text} from 'react-native'

export default function Flex(){

    return (

        <View>
            <View style={{flexDirection:'row-reverse', height:300, width:'80%' }}>
                <View style={{backgroundColor:'yellow', height:100, width:100, justifyContent:'center', alignItems:'center'}}>

                    <Text>1</Text>

                </View>

                <View style={{backgroundColor:'red', width:100, height:100, justifyContent:'center', alignItems:'center'}}>

                    <Text>2</Text>
                    
                </View>

                <View style={{backgroundColor:'blue', width:100, height:100, justifyContent:'center', alignItems:'center'}}>

                    <Text>3</Text>
                    
                </View>
            </View>

            <View style={{flexDirection:'row', height:300,padding:50, width:'80%', justifyContent:'space-between', alignItems:'stretch' }}>

                <View style={{backgroundColor:'yellow', height:100, width:100, justifyContent:'center', alignItems:'center'}}>

                    <Text>1</Text>

                </View>

                <View style={{backgroundColor:'red', width:100, height:100, justifyContent:'center', alignItems:'center'}}>

                    <Text>2</Text>
                    
                </View>

                <View style={{backgroundColor:'blue', width:100, height:100, justifyContent:'center', alignItems:'center'}}>

                    <Text>3</Text>
                    
                </View>
            </View>

            <View style={{flexDirection:'row', height:300,padding:50, width:'80%', justifyContent:'space-between', alignItems:'stretch' }}>

                <View style={{backgroundColor:'yellow',flex:1, justifyContent:'center', alignItems:'center'}}>

                    <Text>1</Text>

                </View>

                <View style={{backgroundColor:'red',width:120, justifyContent:'center', alignItems:'center'}}>

                    <Text>2</Text>
                    
                </View>

                <View style={{backgroundColor:'blue',flex:2,justifyContent:'center', alignItems:'center'}}>

                    <Text>3</Text>
                    
                </View>
            </View>

        </View>
  

    )
};