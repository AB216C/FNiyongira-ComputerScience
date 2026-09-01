package cCollections;
import java.util.TreeMap;
//TreeMap stores keys in a sorted structure.

public class MapExampleTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treemap = new TreeMap<>();
        treemap.put(1,"One");
        treemap.put(2,"Two");
        treemap.put(4,"Four");
        treemap.put(5,"Five");
        treemap.put(10,"Ten");
        treemap.put(0,"Zero");

        System.out.println(treemap);
        System.out.println(treemap.get(10));
    }
}
