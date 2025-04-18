/*
● Part of the Queue interface.
● Order elements based on their natural ordering (for primitives lowest first).
● Custome comparator for customised ordering.
● Does not allow null elements.

Internal working
----------------
● PriorityQueue is implemented as a min-heap by default (for natural ordering)
Min-Heap: The value of the parent node is less than or equal to the values of its children.
*/

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue01 {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("PriorityQueue: " + pq);     // Not sorted

        // peek()
        System.out.println(pq.peek());


        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll());
        }
    }
}
