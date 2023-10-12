import java.util.*;

public class ArrayDeques {
    public static void main(String[] args){
        ArrayDeque<Integer> deque = new ArrayDeque<Integer>();

        deque.offer(20);
        deque.offerFirst(10);
        deque.offerLast(30);
        deque.offer(25);

        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
    }
}
