import { useColorScheme, Dimensions, Text } from "react-native";
import { Colors } from "../constants/Colors";

const ThemedText = ({style, title=false, ...props}) => {
    const color = useColorScheme();
    const theme = Colors[color] ?? Colors[light];

    const {width: screenWidth} = Dimensions.get('window');

    if (!title) {
        return (
            <Text 
                style={[{
                    text: theme.text,
                    fontSize: screenWidth * 0.05,
                }, style]}
                {...props}
            />
        )
    }

    return (
        <Text 
            style={[{
                text: theme.text,
                fontSize: screenWidth * 0.1,
                fontWeight: 'bold',
            }, style]}
            {...props}
        />
    )
}

export default ThemedText;