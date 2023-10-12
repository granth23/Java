import java.util.*;

// FIFO

public class Queues {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(10); //Exception if cant add
        queue.offer(20); //False if cant add

        System.out.println(queue);
        System.out.println(queue.poll());

        System.out.println(queue.element()); //Exception if cant find an element
        System.out.println(queue.peek()); // False if cant find an element
        System.out.println(queue.size()); //Exception if cant remove an element

    }
}
