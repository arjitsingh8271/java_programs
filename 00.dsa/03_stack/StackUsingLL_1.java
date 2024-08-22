class StackUsingLL_1 {
	
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	Node top = null;


	void push(int data) {
		Node new_node = new Node(data);
		
		if(top == null)
			top = new_node;
		else {
			new_node.next = top;
			top = new_node;
		}
		System.out.println("push(" +data +")");
	}

	void pop() {
		if(top == null)
			System.out.println("Stack Underflow.");
		else {
			Node ptr = top, ptr2 = ptr.next;
			while (ptr2.next != null) {
				ptr = ptr2;
				ptr2 = ptr.next;
			}
			System.out.println("pop(" +ptr.next.data +")");
			ptr.next = null;
		}
	}

	void display() {
		System.out.print("Stack: ");
		if(top == null)
			System.out.println("Stack Underflow.");
		else {
			Node ptr = top;
			while(ptr != null) {
				System.out.print(ptr.data +" ");
				ptr = ptr.next;
			}
			System.out.println();
		}
	}

	void peek() {
		if(top == null)
			System.out.println("Stack Underflow.");
		else {
			System.out.println("peek(): " +top.data);
		}
	}



	public static void main(String[] args) {
		
		StackUsingLL_1 s = new StackUsingLL_1();

		s.pop();
		
		s.push(10);
		s.display();
		
		s.push(20);
		s.display();
		
		s.push(30);
		s.display();

		s.peek();

		s.pop();
		s.display();

		s.push(40);	
		s.display();

		s.peek();

	}
}


/*
OUTPUT: Stack Underflow.
		push(10)
		Stack: 10 
		push(20)
		Stack: 20 10 
		push(30)
		Stack: 30 20 10 
		peek(): 30
		pop(10)
		Stack: 30 20 
		push(40)
		Stack: 40 30 20 
		peek(): 40
*/