import java.util.*;

// The only difference from HashSet is that it will now inherit properties of linked list

public class TreeSets {
    public static void main(String[] args){
        Set<Students> set = new TreeSet<>();

        set.add(new Students(2, "B"));
        set.add(new Students(1, "A"));
        set.add(new Students(4, "D"));
        set.add(new Students(3, "C"));

        System.out.println(set);

        set.add(new Students(1, "A"));

        System.out.println(set);

        // set.clear();
    }
}

