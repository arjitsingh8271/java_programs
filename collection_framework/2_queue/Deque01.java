/*
Double-ended queue.
Allows insertion and removal of element from both ends.
Versatile than regular Queue and Stacks because they support all the operations of both.

Insertion Methods
-----------------
addFirst(E e): Insert the specified element at the front.
addLast(E e): Insert the specified element at the end.
OfferFirst(E e): Insert the specified element at the front if possible.
OfferLast(E e): Insert the specified element at the end if possible.

Removal Methods
---------------
removeFirst(): Retrieves and remove the first element.
removeLast(): Retrieves and remove the last element.
pollFirst(): Retrieves and remove the first element, or returns null if empty.
pollLast(): Retrieves and remove the last element, or returns null if empty.

Examination Methods
-------------------
getFirst(): Retrieves, but does not remove, the first element.
getLast(): Retrieves, but does not remove, the last element.
peekFirst(): Retrieves, but does not remove, the first element, or returns null if empty.
peekLast(): Retrieves, but does not remove, the last element, or returns null if empty.

Stack Methods
-------------
push(E e): Adds an element at the front (equivalent to addFirst(E e)).
pop(E e): Removes and returns thr first element (equivalent to removeFirst()).

*/

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.LinkedList;


class Deque01 {
	public static void main(String[] args) {
		// faster, low memory, no null allow, circular array, head & tail pointer
		// no need to shift elements, just shift head & tail.
		Deque<Integer> deque1 = new ArrayDeque<>();
		deque1.addFirst(10);
		deque1.addLast(20);
		deque1.offerFirst(5);
		deque1.offerLast(30);
		
		System.out.println(deque1);		// [5, 10, 20, 30]

		System.out.println("First ele: " +deque1.getFirst());	// 5
		System.out.println("Last ele: " +deque1.getLast());		// 30

		deque1.removeFirst();	// 5
		deque1.pollLast();		// 30

		System.out.println(deque1);		// [10, 20]



		// insertion, deletion somewhere in middle. 
		Deque<Integer> deque2 = new LinkedList<>();
		// we can do all the above things using LinkedList.
	}
}