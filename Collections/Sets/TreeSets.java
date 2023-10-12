import java.util.*;

// Its nothing different but a sorted set

public class TreeSets {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(20);
        set.add(10);
        set.add(30);
        set.add(25);
        set.add(20);

        System.out.println(set);

        set.remove(10);

        System.out.println(set.contains(30));

        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
}
