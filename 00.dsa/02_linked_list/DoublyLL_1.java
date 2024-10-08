class DoublyLL_1 {
	
	static class Node {
		int data;
		Node prev;
		Node next;

		Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	Node head = null;
	Node tail = null;

	void insertAtBegin(int data) {
		Node new_node = new Node(data);

		if(head == null) {
			head = new_node;
			tail = new_node;
		}
		else {
			head.prev = new_node;
			new_node.next = head;
			head = new_node;
		}
	}


	void insertAtEnd(int data) {
		Node new_node = new Node(data);

		if(head == null) {
			head = new_node;
			tail = new_node;
		}
		else {
			Node ptr = head;
			while(ptr.next != null) {
				ptr = ptr.next;
			}
			new_node.prev = ptr;
			ptr.next = new_node;
			tail = new_node;
		}
	}


	void insertAtPosition(int pos, int data) {
		Node new_node = new Node(data);

		if(head == null) {
			head = new_node;
			tail = new_node;
		}
		else {
			Node ptr = head, ptr2 = ptr;

			for(int i=1; i<pos; i++) {
				ptr = ptr2;
				ptr2 = ptr.next;
			}
			ptr.next = new_node;
			ptr2.prev = new_node;
			new_node.next = ptr2;
			new_node.prev = ptr;
		}
	}


	void deleteAtBegin() {
		if(head == null)
			System.out.println("List is Empty.");
		else {
			// Node ptr = head;
			// ptr = ptr.next;
			// head = ptr;
			// head.prev = null;
			// or 
			// Node ptr = head.next;
			// ptr.prev = null;
			// head = ptr;
			// or
			head = head.next;
			head.prev = null;
		}
	}


	void deleteAtEnd() {
		if(head == null)
			System.out.println("List is Empty.");
		else {
			// Node ptr = tail;
			// ptr = ptr.prev;
			// tail = ptr;
			// tail.next = null;
			// or
			// Node ptr = tail.prev;
			// ptr.next = null;
			// tail = ptr;
			// or
			tail = tail.prev;
			tail.next = null;
		}
	}


	void deleteAtPosition(int pos) {
		if(head == null)
			System.out.println("List is Empty.");
		else {
			Node ptr = head, ptr2 = ptr.next;
			for(int i=1; i<pos-1; i++) {
				ptr = ptr2;
				ptr2 = ptr.next;
			}
			ptr.next = ptr2.next;
			ptr2.next.prev = ptr;
		}
	}


	void forwardDisplay() {
		Node ptr = head;
		System.out.print("Forward List: ");
		if (head == null) 	// or (ptr == null)
			System.out.println("Empty!");
		else {

			while(ptr != null) {
				
				System.out.print(ptr.data +" ");
				ptr = ptr.next;
			}
			System.out.println();
		}
	}

	void backwardDisplay() {
		Node ptr = tail;
		System.out.print("Backward List: ");
		if (tail == null) 	// or (ptr == null)
			System.out.println("Empty!");
		else {

			while(ptr != null) {
				
				System.out.print(ptr.data +" ");
				ptr = ptr.prev;
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		
		DoublyLL_1 ll = new DoublyLL_1();

		System.out.println("insertAtBegin():");
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);


		ll.forwardDisplay();
		ll.backwardDisplay();

		System.out.println("insertAtEnd():");
		ll.insertAtEnd(40);
		ll.insertAtEnd(50);
		ll.insertAtEnd(60);

		ll.forwardDisplay();
		ll.backwardDisplay();

		System.out.println("insertAtPosition(3, 70):");
		ll.insertAtPosition(3, 70);

		ll.forwardDisplay();
		ll.backwardDisplay();

		System.out.println("deleteAtBegin():");
		ll.deleteAtBegin();

		ll.forwardDisplay();
		ll.backwardDisplay();

		System.out.println("deleteAtEnd():");
		ll.deleteAtEnd();

		ll.forwardDisplay();
		ll.backwardDisplay();

		System.out.println("deleteAtPosition(4):");
		ll.deleteAtPosition(4);

		ll.forwardDisplay();
		ll.backwardDisplay();
	}

}


/*
OUTPUT:	insertAtBegin():
		Forward List: 30 20 10 
		Backward List: 10 20 30 
		insertAtEnd():
		Forward List: 30 20 10 40 50 60 
		Backward List: 60 50 40 10 20 30 
		insertAtPosition(3, 70):
		Forward List: 30 20 70 10 40 50 60 
		Backward List: 60 50 40 10 70 20 30 
		deleteAtBegin():
		Forward List: 20 70 10 40 50 60 
		Backward List: 60 50 40 10 70 20 
		deleteAtEnd():
		Forward List: 20 70 10 40 50 
		Backward List: 50 40 10 70 20 
		deleteAtPosition(4):
		Forward List: 20 70 10 50 
		Backward List: 50 10 70 20 
*/