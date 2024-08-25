class PriorityQUsingLL_1 {
	
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
	Node rear = null;


	boolean isUnderflow() {
		return front == null;
	}


	void enQueue(int data, int pri) {
		Node new_node = new Node(data, pri);

		if (isUnderflow()) {
			front = new_node;
			rear = new_node;
			System.out.println("enQueue(" +data +"," +pri +")");
		}
		else {
			rear.next = new_node;
			rear = new_node;
			System.out.println("enQueue(" +data +"," +pri +")");
		}
	}


	void deQueue() {
        if (isUnderflow()) {
            System.out.println("Queue is Underflow");
            return;
        }

    	Node ptr = front;			// pointer
        Node prevPtr = null;		// previous pointer
        Node nodeHPri = front;		// Node of High Priority pointer
        Node prevNodeHPri = null;	// Previous Node of High Priority pointer

        // Find the node with the highest priority
        while (ptr != null) {
            if (ptr.pri < nodeHPri.pri) {
                nodeHPri = ptr;
                prevNodeHPri = prevPtr;
            }
            prevPtr = ptr;
            ptr = ptr.next;
        }

        // Remove the node with the highest priority
        if (nodeHPri == front) {
            front = front.next;
        } 
        else {
            prevNodeHPri.next = nodeHPri.next;
        }

        if (nodeHPri == rear) {
            rear = prevNodeHPri;
        }

        System.out.println("deQueue(): " + nodeHPri.data + " with priority " + nodeHPri.pri);
    }



	void display() {
		System.out.print("Queue: ");
		if (isUnderflow())
			System.out.println("Queue is Underflow");
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
		
		PriorityQUsingLL_1 pq = new PriorityQUsingLL_1();

		System.out.println("isUnderflow(): " +pq.isUnderflow());

		pq.enQueue(10,3);
		pq.display();

		pq.enQueue(20,1);
		pq.display();

		pq.enQueue(30,4);
		pq.display();

		pq.enQueue(40,1);
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
		enQueue(10,3)
		Queue: [10,3] 
		enQueue(20,1)
		Queue: [10,3] [20,1] 
		enQueue(30,4)
		Queue: [10,3] [20,1] [30,4] 
		enQueue(40,1)
		Queue: [10,3] [20,1] [30,4] [40,1] 
		deQueue(): 20 with priority 1
		Queue: [10,3] [30,4] [40,1] 
		deQueue(): 40 with priority 1
		Queue: [10,3] [30,4] 
		deQueue(): 10 with priority 3
		Queue: [30,4]
*/