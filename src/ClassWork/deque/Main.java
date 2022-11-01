package ClassWork.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        Deque<String> queue = new ArrayDeque<>();

        //FIFO

        queue.add("Harry Potter");
        queue.add("Spider Man");
        queue.add("Wonder Woman");

        System.out.println("Head element: " + queue.peek());
        System.out.println("\nPrinting Queue...");

        System.out.println(queue.remove());
        System.out.println(queue.removeFirst());
        System.out.println(queue.remove());

        Deque<String> stack = new ArrayDeque<>();

        //LIFO

        stack.push("Harry Potter");
        stack.push("Spider Man");
        stack.push("Wonder Woman");

        System.out.println(stack);
    }
}
