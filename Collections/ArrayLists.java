package Collections;
import java.util.*;

class ArrayLists {
	public static void main(String[] args)
	{
		int n = 5;

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}

        arr.add(2, 10);

		System.out.println("Array: " + arr);
        System.out.println("Array's Third Element: " + arr.get(2));

        arr.remove(2);

        arr.remove(Integer.valueOf(3));
        System.out.println("Array: " + arr);

        // arr.clear()

        arr.set(2, 10);
        System.out.println("Array contains 2? " + arr.contains(2));
        System.out.println("Array contains 10? " + arr.size());

        Iterator<Integer> itr = arr.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

	}
}
