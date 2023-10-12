import java.util.*;

public class Iterators {
  public static void main(String[] args) {
    int n = 5;

    List<Integer> numbers = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      numbers.add(i);
    }

    numbers.add(2, 10);

    ListIterator<Integer> it = numbers.listIterator();

    while (it.hasNext()) {
      if (it.next() < 10) {
        it.remove();
      }
      else{
        it.set(15);
      }
    }

    System.out.println(numbers);
  }
}