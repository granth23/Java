import java.util.*;

// The only difference from HashSet is that it will now inherit properties of linked list

public class LinkedHashSets {
    public static void main(String[] args){
        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Granth");
        map.put(4, "Subbu");
        map.put(3, "Chirag");
        map.put(1, "Gaurang");

        System.out.println(map);


        // set.clear();
    }
}

