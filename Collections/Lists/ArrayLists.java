import java.util.*;

class ArrayLists {
	public static void main(String[] args){
		int n = 5;

		List<Integer> arr = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			arr.add(i);
		}

        arr.add(2, 10);

		System.out.println("Array: " + arr);
        System.out.println("Array's Third Element: " + arr.get(2));

        arr.remove(2);
        System.out.println("Array: " + arr);

        arr.set(2, 10);
        System.out.println("Array: " + arr);

        arr.remove(Integer.valueOf(2));
        System.out.println("Array: " + arr);

        // arr.clear()

        System.out.println("Array contains 2? " + arr.contains(2));
        System.out.println("Array contains 10? " + arr.size());

	}
}
