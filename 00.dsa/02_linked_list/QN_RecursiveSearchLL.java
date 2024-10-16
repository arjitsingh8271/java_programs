class QN_RecursiveSearchLL {
	
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

	int search(Node head, int key) {
		if(head == null)
			return -1;
		else if(head.data == key)
			return 0;

		int ind = search(head.next, key);

		if(ind == -1)
			return -1;

		return ind+1;
	}
	int recursiveSearch(int key) {
		return search(head, key);
	}


	public static void main(String[] args) {
		
		QN_RecursiveSearchLL ll = new QN_RecursiveSearchLL();

		ll.insertAtBegin(12);
		ll.insertAtBegin(22);
		ll.insertAtBegin(32);
		ll.insertAtBegin(21);
		ll.insertAtBegin(14);

		System.out.println("Index: " +ll.recursiveSearch(32));		// Index: 2
		System.out.println("Index: " +ll.recursiveSearch(3));		// Index: -1

	}
}