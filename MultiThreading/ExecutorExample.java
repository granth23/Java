import java.util.concurrent.*;

class Doubler implements Runnable {
    Doubler(int[] a, int from, int to) {
        this.a = a;
        this.from = from;
        this.to = to;
    }

    private int[] a;
    private int from, to;

    public void run() {
        for (int i = from; i <= to; i++){
            a[i] *= 2;
            System.out.println((i) + " " +  a[i]/2 + " from: " + from + " to: " + to);
        }
    }
}

public class ExecutorExample {
    public static void main(String[] args) {
        int[] a = { 0,1,2,3,4,5,6,7,8 };
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.execute(new Doubler(a, 0, 2));
        executor.execute(new Doubler(a, 3, 5));
        executor.execute(new Doubler(a, 6, 8));
        executor.shutdown();
        while (!executor.isTerminated())
            ;
        for (int i = 0; i < 9; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}