class LinearQUsingArray_1 {

	int size = 10;

	int arr[] = new int[size];
	
	int front = -1;
	int rear = -1;


	boolean isUnderflow() {
		return front == -1 && rear == -1;
	}


	boolean isOverflow() {
		return rear == size-1;
	}


	void enQueue(int data) {

		if(isOverflow()) {
			System.out.println("Queue is Overflow.");
		}		
		else {		
			if(isUnderflow()) {
				front +=1;
				rear +=1;
				arr[rear] = data;
				System.out.println("enQueue(" +data +")");
			}		
			else {
				rear +=1;
				arr[rear] = data;
				System.out.println("enQueue(" +data +")");
			}
		}
	}


	void deQueue() {
		if(isUnderflow()) {
			System.out.println("Queue is Underflow.");
		}
		else if (front == rear) {
			front = rear = -1;
		}
		else {
			front +=1;
			System.out.println("deQueue()");
		}
	}


	void front() {
		if (isUnderflow()) {
			System.out.println("Queue is Underflow.");
		}
		System.out.println("Front: " +arr[front]);
	}


	void display() {
		System.out.print("Queue: ");
		
		if(isUnderflow()) {
			System.out.println("Queue is Underflow.");
		}
		else {
			for (int i=front; i<=rear; i++) {
				System.out.print(arr[i] +" ");
			}
			System.out.println();
		}
	}



	public static void main(String[] args) {
		
		LinearQUsingArray_1 q = new LinearQUsingArray_1();

		System.out.println("isUnderflow(): " +q.isUnderflow());
		System.out.println("isOverflow(): " +q.isOverflow());

		q.enQueue(10);
		q.display();

		q.enQueue(20);
		q.display();

		q.enQueue(30);
		q.display();
		q.front();

		q.deQueue();
		q.display();
		q.front();

		q.deQueue();
		q.display();

		q.deQueue();
		q.display();

		q.deQueue();

	}

}



/*
OUTPUT: isUnderflow(): true
		isOverflow(): false
		enQueue(10)
		Queue: 10 
		enQueue(20)
		Queue: 10 20 
		enQueue(30)
		Queue: 10 20 30 
		Front: 10
		deQueue()
		Queue: 20 30 
		Front: 20
		deQueue()
		Queue: 30 
		deQueue()
		Queue: Queue is Underflow.
		Queue is Underflow.
*/