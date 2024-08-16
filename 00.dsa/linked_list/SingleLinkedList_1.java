class SingleLinkedList_1 {
	
	static class Node {
	
		int data;
		Node next;

		Node(int date) {

			this.data = date;
			this.next = null;
		}
	}
	Node head = null;
	
	void insertAtBegin(int data) {

		Node new_node = new Node(data);	//step-1 : Creating a new node

		if(head == null)				//step-2 : Checking Head is empty
			head = new_node;				//step-2.1 : If empty then head = new node 
		else {

			new_node.next = head;		//step-3 : If not empty then new node next = head
			head = new_node;			//step-4 : head = new node
		}
	}

	void insertAtEnd(int data) {
		Node new_node = new Node(data);

		Node temp = head;

		while(temp.next != null)
			temp = temp.next;
		temp.next = new_node;
	}

	void insertAtPosition(int data, int pos) {
		Node new_node = new Node(data);
	}

	void display() {
		
		Node temp = head;

		if (head == null) 	// or (temp == null)
			System.out.println("Empty!");
		else {

			while(temp != null) {
				
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		SingleLinkedList_1 ll = new SingleLinkedList_1();
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);
		ll.display();
		ll.insertAtEnd(40);
		ll.insertAtEnd(50);
		ll.insertAtEnd(60);
		ll.display();

	}
}