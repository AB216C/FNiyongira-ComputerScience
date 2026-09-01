package cCollectionsUsefulMethods;
import java.util.HashMap;
import java.util.Map;
public class MergeExample {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("Apple",3);
        map.put("Chery",4);
        map.put("Banana", 45);

        System.out.println("Before Merging:"+map);

        // Merge a new value for the key "apple"
        // If the key already exists ("apple"), the merge() method updates the value using the specified function (oldValue + newValue).

        map.merge("Apple", 100, (OldValue,NewValue)->OldValue+NewValue);
        System.out.println("After Merging to form new value:"+ map);

        // Add a new key "orange" with a value

        map.merge("Orange", 300,(OldValue,NewValue)->OldValue+NewValue);
        System.out.println("After Merging to form new Key:value: "+map);

    }
}
