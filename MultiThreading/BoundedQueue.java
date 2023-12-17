import java.util.concurrent.*;

class Producer extends Thread {
    protected BoundedQueue q;
    protected int n;

    public Producer(BoundedQueue q, int n) {
        this.q = q;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            try {
                q.put(i);
                System.out.println("Producer produced: " + i);
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    protected BoundedQueue q;
    protected int n;

    public Consumer(BoundedQueue q, int n) {
        this.q = q;
        this.n = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            try {
                int item = q.get();
                System.out.println("Consumer consumed: " + item);
                sleep((int)(Math.random() * 400));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BoundedQueue {

    private int[] queue;
    private int front, rear, size, count;

    public BoundedQueue(int size) {
        if (size > 0) {
            this.size = size;
            queue = new int[size];
            rear = size - 1;
        }
    }

    public synchronized void put(int item) throws InterruptedException {
        while (isFull()) {
            wait();
        }
        rear = (rear + 1) % size;
        queue[rear] = item;
        count++;
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (isEmpty()) {
            wait();
        }
        int item = queue[front];
        front = (front + 1) % size;
        count--;
        notifyAll();
        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        BoundedQueue q = new BoundedQueue(5);
        Producer p = new Producer(q, 15);
        Consumer c = new Consumer(q, 10);
        p.start();
        c.start();
    }

}
