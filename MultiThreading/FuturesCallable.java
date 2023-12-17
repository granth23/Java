import java.util.concurrent.*;
import java.util.*;

class Adder implements Callable<Integer> {
    Adder(int[] a, int from, int to) {
        this.a = a;
        this.from = from;
        this.to = to;
    }

    int[] a;
    int from, to;

    public Integer call() {
        int sum = 0;
        for (int i = from; i <= to; i++)
            sum += a[i];
        return sum;
    }
}

public class FuturesCallable {
    public static void main(String[] args) {
        int[] a = { 0,1,2,3,4,5,6,7,8 };
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
        futures.add(executor.submit(new Adder(a, 0, 2)));
        futures.add(executor.submit(new Adder(a, 3, 5)));
        futures.add(executor.submit(new Adder(a, 6, 8)));
        executor.shutdown();
        int sum = 0;
        for (Future<Integer> f : futures) {
            try {
                int n = f.get();
                System.out.println(n);
                sum += n;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(sum);
    }
}