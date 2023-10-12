import java.util.*;

// The only difference from HashSet is that it will now inherit properties of linked list

public class LinkedHashSets {
    public static void main(String[] args){
        Set<Students> set = new LinkedHashSet<>();

        set.add(new Students(2, "B"));
        set.add(new Students(1, "A"));
        set.add(new Students(3, "C"));
        set.add(new Students(4, "D"));

        System.out.println(set);

        set.add(new Students(1, "A"));

        System.out.println(set);

        // set.clear();
    }
}

