import java.util.*;

public class Sets {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<Integer>();

        set.add(20);
        set.add(10);
        set.add(30);
        set.add(25);
        set.add(20);

        System.out.println(set);

        set.remove(10);

        System.out.println(set.contains(30));

        System.out.println(set.size());

        // set.clear();
    }
}
