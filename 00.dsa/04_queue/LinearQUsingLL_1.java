class LinearQUsingLL_1 {

	static class Node {
		int data;
		Node next;

		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node front = null;
	Node rear = null;


	boolean isUnderflow() {
		if (front == null)
			return true;
		else
			return false;
	}	


	void enQueue(int data) {
		Node new_node = new Node(data);

		if (front == null) {
			front = new_node;
			rear = new_node;
			System.out.println("enQueue(" +data +")");
		}

		else {
			rear.next = new_node;
			rear = new_node;
			System.out.println("enQueue(" +data +")");
		}
	}


	void deQueue() {
		
		if (front == null)
			System.out.println("deQueue(): Queue is Underflow");
		
		else {
			front = front.next;
			System.out.println("deQueue()");
		}
	}


	void display() {
		System.out.print("Queue: ");

		if (front == null)
			System.out.println("Queue is Underflow");
		
		else {
			Node ptr = front;

			while (ptr != null) {
				System.out.print(ptr.data +" ");
				ptr = ptr.next;
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		
		LinearQUsingLL_1 q = new LinearQUsingLL_1();

		System.out.println("isUnderflow(): "+q.isUnderflow());

		q.enQueue(10);
		q.display();
		q.enQueue(20);
		q.display();
		q.enQueue(30);
		q.display();
		
		q.deQueue();
		q.display();
		
		q.deQueue();
		q.display();

		q.deQueue();
		q.display();

		q.deQueue();

	}
	
}



/*
OUTPUT: isUnderflow(): true
		enQueue(10)
		Queue: 10
		enQueue(20)
		Queue: 10 20
		enQueue(30)
		Queue: 10 20 30 
		deQueue()
		Queue: 20 30 
		deQueue()
		Queue: 30 
		deQueue()
		Queue: Queue is Underflow
		deQueue(): Queue is Underflow
*/