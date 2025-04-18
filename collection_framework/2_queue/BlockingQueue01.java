/*
● Thread-Safety Queue
● Wait for queue to become non-empty / wait for space
● Simplify concurrency problems like producer-consumer

● Standart queue -> immediately
	empty -> remove (no waiting)
	full -> add (no waiting)

● Blocking queue
	put -> Blocks if the queue is full, until space becomes available.
	take -> Blocks if the queue is empty, until an element becomes available
	offer -> Waits for space to become available, up to the specified timeout.


Interfaces and Implementations:
-------------------------------
BlockingQueue is an interface. Common implementations:
● ArrayBlockingQueue – Bounded (fixed size)
● LinkedBlockingQueue – Optionally bounded
● PriorityBlockingQueue – Elements ordered by priority
● DelayQueue – Elements available after a delay
● SynchronousQueue – No internal capacity
*/

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;


class BlockingQueue01 {
	public static void main(String[] args) {
		BlockingQueue<Integer> bque = ArrayBlockingQueue<>();
		// A bounded, blocking queue backed by an array.
	}
}