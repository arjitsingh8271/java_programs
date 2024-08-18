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

		if(head == null)
			head = new_node;
		else {
			Node ptr = head;
			while(ptr.next != null)
				ptr = ptr.next;
			ptr.next = new_node;
		}
	}

	void insertAtPosition(int pos, int data) {
		Node new_node = new Node(data);

		if(head == null) {
			System.out.println("List is Empty " +data +" insert at 1");
			head = new_node;
		}
		else {

			Node ptr = head;
			for(int i=1; i<pos-1; i++)
				ptr = ptr.next;
			new_node.next = ptr.next;
			ptr.next = new_node;
		}
	}


	void deleteAtBegin() {
		if (head == null)
			System.out.println("List is Empty!");
		else
			head = head.next;
	}


	void deleteAtEnd(){
		if(head == null)
			System.out.println("List is Empty");
		else {
			Node ptr = head, ptr2 = ptr.next;
			while(ptr2.next != null) {
				ptr = ptr2;
				ptr2 = ptr.next;
			}
			ptr.next = null;
		}
	}


	void deleteAtPosition(int pos) {
		if(head == null)
			System.out.println("List is Empty!");
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
		
		Node ptr = head;

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

		SingleLinkedList_1 ll = new SingleLinkedList_1();

		System.out.println("insertAtBegin(): ");
		ll.insertAtBegin(10);
		ll.insertAtBegin(20);
		ll.insertAtBegin(30);
		ll.display();

		System.out.println("insertAtEnd(): ");
		ll.insertAtEnd(40);
		ll.insertAtEnd(50);
		ll.insertAtEnd(60);
		ll.display();

		System.out.println("insertAtPosition(3, 70): ");
		ll.insertAtPosition(3, 70);
		ll.display();

		System.out.println("deletAtBegin(): ");
		ll.deleteAtBegin();
		ll.display();

		System.out.println("deletAtEnd(): ");
		ll.deleteAtEnd();
		ll.display();

		System.out.println("deleteAtPosition(4): ");
		ll.deleteAtPosition(4);
		ll.display();

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
		deleteAtPosition(4): 
		20 70 10 50
*/