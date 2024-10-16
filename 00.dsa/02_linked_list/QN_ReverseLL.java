class QN_ReverseLL {
	
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	void insertAtBegin(int data) {
		Node new_node = new Node(data);

		if(head == null)
			head = new_node;
		else {
			new_node.next = head;
			head = new_node;
		}
	}

	void reverseLL() {
		// 1. next = current.next
		// 2. current.next = prev
		// 3. prev = current
		// 4. current = next

		Node next;
		Node current = head;
		Node prev = null;

		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	void display() {
		Node ptr = head;

		if(head == null)
			System.out.println("List is Empty");

		while(ptr != null) {
			System.out.print(ptr.data +" ");
			ptr = ptr.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		QN_ReverseLL ll = new QN_ReverseLL();

		ll.insertAtBegin(12);
		ll.insertAtBegin(22);
		ll.insertAtBegin(32);
		ll.insertAtBegin(21);
		ll.insertAtBegin(14);

		System.out.println("Before Reverse:");
		ll.display();

		System.out.println("After Reverse:");
		ll.reverseLL();
		ll.display();
	}
}