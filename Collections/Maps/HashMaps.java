import java.util.*;

public class HashMaps {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Granth");
        map.put(4, "Subbu");
        map.put(3, "Chirag");
        map.put(1, "Gaurang");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        System.out.println(map);

        // set.clear();
    }
}
