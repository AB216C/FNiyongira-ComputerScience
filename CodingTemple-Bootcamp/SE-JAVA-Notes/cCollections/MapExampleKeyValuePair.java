package cCollections;
import java.util.Map;
import java.util.HashMap;
//Map
//A Map is a collection that maps keys to values, where each key is associated with exactly one value.
// These keys must be unique.  This collection is good for having to lookup data based on an identifier.
public class MapExampleKeyValuePair {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Fruit1", "Apple");
        map.put("Fruit2", "Orange");
        map.put("Fruit3", "Grapes");
        map.put("Fruit4", "Banana");
        System.out.println(map);
        System.out.println(map.get("Fruit1"));
    }


}
