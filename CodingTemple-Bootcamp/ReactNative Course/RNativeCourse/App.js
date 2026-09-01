import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, Button,ScrollView} from 'react-native';
import GoalList from './goals.js';
import Flex from './flex.js';


export default function App() {
  return (
    <ScrollView>
      <View style={styles.container}>
        {/* inline styling */}
        <Text style={{ margin:20, borderWidth:2, borderColor:'red', padding:20}}> Hello Word</Text>
        <View>
          {/* using stylesheet object */}
          <Text style={styles.text}>Another piece of Text</Text>
        </View>
        <View style={styles.buttonContainer}>
            <Button  title="Tap here"/>
            <Button title="Tab There"/>
        </View>
        <GoalList/>
        <Flex/>
      </View>
    </ScrollView>

  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    margin:20,
    borderWidth:2,
    borderColor:'blue',
    padding:20
  },
  buttonContainer: {
    backgroundColor:'black',
    color:'white',
    borderRadius:8,
    padding:8
  }
});
