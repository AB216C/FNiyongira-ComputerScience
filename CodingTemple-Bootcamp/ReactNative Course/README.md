# TO CREATE NEW PROJECT:

npx create-expo-app --template blank HandleEvents

cd projectname

npx expo start

# REACT NATIVE

There is no CSS

- Can use inline styles or 
- stylesheet objects

# Core components

<View/>
<Image/>
<!-- <Button/> -->
<TextInput/>
and many more


# When you have Iphone only, not Android, 
- It is better to have a simulator to help our in this situation

1. DOWNLOAD ANDROID studio, on macos or anroid
<!-- 2. OR DOWNLOAD XCODE FOR MacOS only -->
3. create a new device
4. Run the application
5. Press "A" to connect to android studio 

# WHEN SIMULATOR NOT WORKING, START YOUR APPLICATION AS FOLLOWS:

npx expo start --clear instead of npx expo start


Applying flex:1, means, a container is going to adjust accordingly and take the remaining space!
while flex:2, or 3 will take more space compared to the first one.

# FlastList vs Scroll View


## ScrollView

ScrollView is a simple component that renders all its children at once and makes them scrollable.

Use when:

- You have a small number of items (e.g. < 30).

- The content size is relatively fixed or small.

- You need custom layouts that aren’t simple lists.

Example:
<ScrollView>
  {courseGoals.map((goal, index) => (
    <Text key={index} style={styles.goalText}>{goal}</Text>
  ))}
</ScrollView>

Downside:

If you have many items (hundreds or thousands), it renders all at once, which can:

- Slow down performance

- Increase memory usage

- Lag on mobile devices

## FlatList

FlatList is optimized for long lists — it only renders what’s currently visible on the screen (plus a few buffer items).

It also handles scrolling, item recycling, and lazy rendering automatically.

Use when:

- You have dynamic or long lists.

- You want high performance and smooth scrolling.

- You want built-in support for:

- onEndReached (infinite scroll)

- Pull-to-refresh

- Item separators, headers, and footers.

Example:
import { FlatList, Text } from "react-native";

<FlatList
  data={courseGoals}
  renderItem={({ item }) => <Text style={styles.goalText}>{item}</Text>}
  keyExtractor={(item, index) => index.toString()}
/>