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


	void forwardDisplay() {
		Node ptr = head;
		System.out.print("List: ");
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



	public static void main(String[] args) {
		
		DoublyLL_1 ll = new DoublyLL_1();

		System.out.println("insertAtBegin():");
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);


		ll.forwardDisplay();
	}

}