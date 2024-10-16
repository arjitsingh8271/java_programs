class QN_IterativeSearchLL {
	
	static class Node {
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


	int iterativeSearch(int key) {
		int i = 0;
		Node ptr = head;

		while(ptr != null) {
			if(ptr.data == key)
				return i;
			ptr = ptr.next;
			i++;
		}

		return -1;
	}


	public static void main(String[] args) {
		
		QN_IterativeSearchLL ll = new QN_IterativeSearchLL();

		ll.insertAtBegin(12);
		ll.insertAtBegin(22);
		ll.insertAtBegin(32);
		ll.insertAtBegin(21);
		ll.insertAtBegin(14);

		System.out.println("Index: " +ll.iterativeSearch(32));		// Index: 2
		System.out.println("Index: " +ll.iterativeSearch(3));		// Index: -1

	}
}