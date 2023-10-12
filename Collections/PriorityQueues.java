import java.util.*;

// They work under the Heap

public class PriorityQueues {
    public static void main(String[] args){
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(15);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        priorityQueue.offer(25);
        priorityQueue.offer(5);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        Queue<Integer> revPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        revPriorityQueue.offer(15);
        revPriorityQueue.offer(20);
        revPriorityQueue.offer(10);
        revPriorityQueue.offer(25);
        revPriorityQueue.offer(5);

        System.out.println(revPriorityQueue);
        System.out.println(revPriorityQueue.poll());
        System.out.println(revPriorityQueue.peek());
        System.out.println(revPriorityQueue);

    }
}
