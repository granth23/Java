public class Threads extends Thread {
    protected int count, inc, delay;

    public Threads(int init, int inc, int delay) {
        this.count = init;
        this.inc = inc;
        this.delay = delay;
    }

    public void run() {
        try {
            for (;;) {
                System.out.print(count + " ");
                count += inc;
                sleep(delay);
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) {
        new Threads(0, 1, 33).start();
        new Threads(0, -1, 100).start();
    }
}