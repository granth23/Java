import java.util.*;

// Main class
public class LinkedLists {

    // Driver code
    public static void main(String args[])
    {
        int n = 5;

        List<Integer> arr = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
			arr.add(i);
		}

        arr.add(2, 10);

		System.out.println("Array: " + arr);
        System.out.println("Array's Third Element: " + arr.get(2));
        System.out.println("Array's Index of Element 10: " + arr.indexOf(10));

        arr.remove(2);

        arr.remove(Integer.valueOf(3));
        System.out.println("Array: " + arr);

        // arr.clear()

        arr.set(2, 10);
        System.out.println("Array contains 2? " + arr.contains(2));
        System.out.println("Array contains 10? " + arr.size());

    }
}