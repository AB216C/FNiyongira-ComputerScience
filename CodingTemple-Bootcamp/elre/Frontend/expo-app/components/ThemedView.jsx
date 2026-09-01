import { useColorScheme, View, Dimensions } from "react-native";
import { Colors } from "../constants/Colors";
import { useSafeAreaInsets } from "react-native-safe-area-context";
import { Platform } from "react-native";

const ThemedView = ({style, safe=false, ...props}) => {
    let color = useColorScheme();

    const isWeb = Platform.OS === 'web';
    if (isWeb) {
        color = 'light';
    }

    const theme = Colors[color] ?? Colors[light];

    const {width: screenWidth} = Dimensions.get('window');
    const inset = useSafeAreaInsets();

    if (!safe) {
        return (
            <View 
                style={[{
                    backgroundColor: theme.backgroundColor,
                }, style]}
                {...props}
            />
        )
    }

    return (
        <View
            style={[{
                backgroundColor: theme.backgroundColor,
                paddingTop: inset.top * 1.1,
                paddingBottom: inset.bottom * 1.1,
                paddingLeft: screenWidth * 0.05,
                paddingRight: screenWidth * 0.05
            }, style]}
            {...props}
        />
    )
}

export default ThemedView;