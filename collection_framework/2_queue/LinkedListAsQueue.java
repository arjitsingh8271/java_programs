import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");         // throws exception if full
        queue.offer("Bob");         // better than add("xyz");
        queue.add("Charlie");

        System.out.println(queue);

        // remove()     -> throws exception if empty
        System.out.println("Removed: " + queue.remove()); // Alice

        // poll()       -> better than remove()
        System.out.println("Removed: " + queue.poll());   // Bob
        
        // peek()
        System.out.println("Next: " + queue.peek());      // Charlie
        
        System.out.println("Queue after poll: " + queue); // [Charlie]
    }
}
