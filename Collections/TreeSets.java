import java.util.*;

// Its nothing different but a sorted set

public class TreeSets {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grapes");
        treeSet.add("Banana");

        System.out.println("TreeSet: " + treeSet);

        treeSet.remove("Orange");

        System.out.println("TreeSet after removing an element: " + treeSet);
        System.out.println("Is Banana present in the TreeSet? " + treeSet.contains("Banana"));
        System.out.println("First element of the TreeSet: " + treeSet.first());
        System.out.println("Last element of the TreeSet: " + treeSet.last());
    }
}
