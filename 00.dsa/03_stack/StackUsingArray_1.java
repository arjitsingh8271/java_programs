class StackUsingArray_1 {
	
	int size = 5;
	int arr[] = new int[size];
	int top = -1;


	void push(int data) {
		if(top == size-1)
			System.out.println("Stack Overflow.");
		else {
			top++;
			arr[top] = data;
			System.out.println("push(" +arr[top] +")");
		}
	}


	void pop() {
		if(top == -1)
			System.out.println("Stack Underflow.");
		else {
			top--;
			System.out.println("pop()");
		} 		
	}


	void peek() {
		System.out.println("peek(): " +arr[top]);
	}


	void display() {
		System.out.print("Stack: ");
		if(top == -1)
			System.out.println("Stack Underflow.");
		else {
			for(int i=0; i<= top; i++)
				System.out.print(arr[i] +" ");
		}
		System.out.println();
	}



	public static void main(String[] args) {
		StackUsingArray_1 s = new StackUsingArray_1();

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

		s.push(50);	
		s.push(60);	
		s.push(70);

		s.display();
		s.peek();

	}
}



/*
OUTPUT: Stack Underflow.
		push(10)
		Stack: 10 
		push(20)
		Stack: 10 20 
		push(30)
		Stack: 10 20 30 
		peek(): 30
		pop()
		Stack: 10 20 
		push(40)
		Stack: 10 20 40 
		peek(): 40
		push(50)
		push(60)
		Stack Overflow.
		Stack: 10 20 40 50 60 
		peek(): 60
*/