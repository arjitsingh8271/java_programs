import java.util.Scanner;

class CircularLL_2_Manu {
	
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

	Scanner sc = new Scanner(System.in);

	void insertAtBegin() {
		System.out.print("Data: ");
		int data = sc.nextInt();
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


	void insertAtEnd() {
		System.out.print("Data: ");
		int data = sc.nextInt();
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


	void insertAtPosition() {
		System.out.print("Position: ");
		int pos = sc.nextInt();
		System.out.print("Data: ");
		int data = sc.nextInt();
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
		Scanner sc = new Scanner(System.in);

		CircularLL_2_Manu ll = new CircularLL_2_Manu();
		
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
					System.out.print("List: ");
					ll.display();
					break;
			
				case 2:
					ll.insertAtEnd();
					System.out.print("List: ");
					ll.display();
					break;
			
				case 3:	
					ll.insertAtPosition();
					System.out.print("List: ");
					ll.display();
					break;
			
				case 4:
					ll.deleteAtBegin();
					System.out.print("List: ");
					ll.display();
					break;
				
				case 5:
					ll.deleteAtEnd();
					System.out.print("List: ");
					ll.display();
					break;
			
				case 6:
					ll.deleteAtPosition();
					System.out.print("List: ");
					ll.display();
					break;
			
				case 7:
					System.out.print("List: ");
					ll.display();
					break;
			
				default:
					System.out.println("Enter a valid number.");
			}

			System.out.print("Do you want to continue (Type y or n) ");
            ch = sc.next().charAt(0);                         

		} while (ch == 'Y'|| ch == 'y');

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