import java.util.Scanner;

class DoublyLL_2_Manu {
	
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

	Scanner sc = new Scanner(System.in);

	void insertAtBegin() {
		System.out.print("Data: ");
		int data = sc.nextInt();
		
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


	void insertAtEnd() {
		System.out.print("Data: ");
		int data = sc.nextInt();
		
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


	void insertAtPosition() {
		System.out.print("Position: ");
		int pos = sc.nextInt();
		System.out.print("Data: ");
		int data = sc.nextInt();
		
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


	void deleteAtPosition() {
		System.out.print("Position: ");
		int pos = sc.nextInt();

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
		Scanner sc = new Scanner(System.in);

		DoublyLL_2_Manu ll = new DoublyLL_2_Manu();
		
		char ch;

		do {	
			System.out.println("1 for insertAtBegin");
			System.out.println("2 for insertAtEnd");
			System.out.println("3 for insertAtPosition");
			System.out.println("4 for deleteAtBegin");
			System.out.println("5 for deleteAtEnd");
			System.out.println("6 for deleteAtPosition");
			System.out.println("7 for display");
			
			System.out.print("Input: ");
			int n = sc.nextInt();

			switch(n) {

				case 1:
					ll.insertAtBegin();		
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
			
				case 2:
					ll.insertAtEnd();	
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
			
				case 3:	
					ll.insertAtPosition();
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
			
				case 4:
					ll.deleteAtBegin();
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
				
				case 5:
					ll.deleteAtEnd();
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
			
				case 6:
					ll.deleteAtPosition();
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
			
				case 7:
					ll.forwardDisplay();
					ll.backwardDisplay();
					break;
			
				default:
					System.out.println("Enter a valid number.");
			}

			System.out.print("Do you want to continue (Type y or n) ");
            ch = sc.next().charAt(0);                         

		} while (ch == 'Y'|| ch == 'y');

	
	}

}
