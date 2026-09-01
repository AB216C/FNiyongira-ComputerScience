package cCollections;

import java.util.TreeSet;
//TreeSet maintains sorted order but is slower for operations compared to HashSet.
//Removes duplicates
//Sort added items

// They feature a set of interesting methods

public class setExamplesTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(100);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println(treeSet);


// They feature a set of interesting methods

        System.out.println(treeSet.higher(20));
        System.out.println(treeSet.lower(20));
        System.out.println(treeSet.ceiling(36));
        System.out.println(treeSet.floor(36));

    }

}
