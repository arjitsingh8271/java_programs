class CircularLL_1 {
	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
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
			new_node.next = head; 	// new_node.next = new_node / tail
		}
		else {
			new_node.next = head;
			head = new_node;
			tail.next = head;
		}
	}


	void insertAtEnd(int data) {

		Node new_node = new Node(data);

		if(head == null) {
			head = new_node;
			tail = new_node;
			new_node.next = head;
		}
		else {
			tail.next = new_node;
			tail = new_node;
			new_node.next = head;
		}
	}


	void insertAtPosition(int pos, int data) {
		Node new_node = new Node(data);
		if(head == null){
			head = new_node;
			tail = new_node;
			new_node = head;
		}
		else {
			Node ptr = head;
			for(int i=1; i<pos-1; i++){
				ptr = ptr.next;
			}
			new_node.next = ptr.next;
			ptr.next = new_node;
		}
	}


	void deleteAtBegin() {
		if(head == null)
			System.out.println("List is Empty.");
		else {
			head = head.next;
			tail.next = head;
		}
	}


	void deleteAtEnd() {
		if(head == null)
			System.out.println("List is Empty.");
		else {
			Node ptr = head, ptr2 = ptr.next;
			while(ptr2.next != head) {
				ptr = ptr2;
				ptr2 = ptr.next;
			}
			ptr.next = head;
			tail = ptr;
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
		}
	}


	void display() {
		if(head == null)
			System.out.println("List is Empty.");
		else {
			Node ptr = head;
			do{
				System.out.print(ptr.data +" ");
				ptr = ptr.next;
			}while(ptr != head);
			System.out.println();
		}
	}



	public static void main(String[] args) {
		CircularLL_1 cll = new CircularLL_1();

		System.out.println("insertAtBegin():");
		cll.insertAtBegin(10);
		cll.insertAtBegin(20);
		cll.insertAtBegin(30);
		cll.display();

		System.out.println("insertAtEnd():");
		cll.insertAtEnd(40);
		cll.insertAtEnd(50);
		cll.insertAtEnd(60);
		cll.display();

		System.out.println("insertAtPosition(3, 70):");
		cll.insertAtPosition(3, 70);
		cll.display();

		System.out.println("deletAtBegin():");
		cll.deleteAtBegin();
		cll.display();

		System.out.println("deletAtEnd():");
		cll.deleteAtEnd();
		cll.display();

		System.out.println("deletAtPosition(4):");
		cll.deleteAtPosition(4);
		cll.display();

	}
}


/*
OUTPUT: insertAtBegin():
		30 20 10 
		insertAtEnd():
		30 20 10 40 50 60 
		insertAtPosition(3, 70):
		30 20 70 10 40 50 60 
		deletAtBegin():
		20 70 10 40 50 60 
		deletAtEnd():
		20 70 10 40 50 
		deletAtPosition(4):
		20 70 10 50 
*/