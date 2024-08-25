// Sorted based on the priority of a node

class PriorityQUsingSortedLL_1 {
	
	static class Node {
		int data;
		int pri;
		Node next;

		Node(int data, int pri) {
			this.data = data;
			this.pri = pri;
			this.next = null;
		}
	}

	Node front = null;

	boolean isUnderflow() {
		return front == null;
	}


   	void enQueue(int data, int pri) {
        Node newNode = new Node(data, pri);

        // If the list is empty or the new node has higher pri than the front
        if (front == null || front.pri > pri) {
            newNode.next = front;
            front = newNode;
        } 
        else {
            // Traverse the list and find the appropriate position for the new node
            Node ptr = front;
            while (ptr.next != null && ptr.next.pri <= pri) {
                ptr = ptr.next;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
        }
        System.out.println("enQueue(" + data + ", pri: " + pri + ")");
    }


	void deQueue() {
		System.out.println("deQueue()");

		if (isUnderflow()) {
			System.out.println("Queue is Underflow");
		}
		else {
			front = front.next;
		}
	}


	void display() {
		System.out.print("Queue: ");

		if (isUnderflow()) {
			System.out.println("Queue is Underflow");
		}
		else {
			Node ptr = front;
			while (ptr != null) {
				System.out.print("[" +ptr.data +"," +ptr.pri +"]" +" ");
				ptr = ptr.next;
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		
		PriorityQUsingSortedLL_1 pq = new PriorityQUsingSortedLL_1();

		System.out.println("isUnderflow(): " +pq.isUnderflow());

		pq.enQueue(10,3);
		pq.display();

		pq.enQueue(20,1);
		pq.display();

		pq.enQueue(30,4);
		pq.display();

		pq.enQueue(40,1);
		pq.display();

		pq.enQueue(50,5);
		pq.display();

		pq.deQueue();
		pq.display();

		pq.deQueue();
		pq.display();

		pq.deQueue();
		pq.display();
	}

}



/*
OUTPUT: isUnderflow(): true
		enQueue(10, pri: 3)
		Queue: [10,3] 
		enQueue(20, pri: 1)
		Queue: [20,1] [10,3] 
		enQueue(30, pri: 4)
		Queue: [20,1] [10,3] [30,4] 
		enQueue(40, pri: 1)
		Queue: [20,1] [40,1] [10,3] [30,4] 
		enQueue(50, pri: 5)
		Queue: [20,1] [40,1] [10,3] [30,4] [50,5] 
		deQueue()
		Queue: [40,1] [10,3] [30,4] [50,5] 
		deQueue()
		Queue: [10,3] [30,4] [50,5] 
		deQueue()
		Queue: [30,4] [50,5]
*/