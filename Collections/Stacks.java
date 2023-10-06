package Collections;
import java.util.*;

public class Stacks {

    public static void main(String[] args){

        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
