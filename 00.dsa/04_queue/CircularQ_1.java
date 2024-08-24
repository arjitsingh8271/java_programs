/*
OPERATION 	LinearQ			CircularQ
---------	-------			---------

underFlow 	(F=-1 & R=-1)	(F=-1 & R=-1)
OverFlow 	(R == Size-1)	(F == (R+1) % Size)

enQueue		R = R+1 		R = (R+1) % Size
deQueue		F = F+1 		F = (F+1) % Size
*/



class CircularQ_1 {
	
	int arr[] = new int[5];
	int front = -1;
	int rear = -1;


	boolean isUnderflow() {
		return (front == -1 && rear == -1);
	}


	boolean isOverflow() {
		return (front == (rear+1) % arr.length);
	}


	void enQueue(int data) {
		if (isOverflow()) {
			System.out.println("Queue is Overflow");
		}
		else {		
			if(isUnderflow()) {
				front++;
				rear++;
				arr[rear] = data;
				System.out.println("enQueue(" +data +")");
			}
			else {
				rear = (rear + 1) % arr.length;
				arr[rear] = data;
				System.out.println("enQueue(" +data +")");
			}
		}
	}


	void deQueue() {
		System.out.println("deQueue()");
		if (isUnderflow()) {
			System.out.println("Queue is Underflow");
		}
		else if (front == rear) {
			front = rear = -1;
		}
		else
			front = (front + 1) % arr.length;
	}


	void display() {
		System.out.print("Queue: ");
		if (isUnderflow()) {
			System.out.println("Queue is Underflow");
		}
		else {
			for (int i=front; i!=rear; i=(i+1)%arr.length) {
				System.out.print(arr[i] +" ");
			}
			System.out.print(arr[rear]);
			System.out.println();
		}
	}



	public static void main(String[] args) {
		
		CircularQ_1 cq = new CircularQ_1();

		System.out.println("isUnderflow(): " +cq.isUnderflow());
		System.out.println("isOverflow(): " +cq.isOverflow());

		cq.enQueue(10);
		cq.display();
		cq.enQueue(20);
		cq.display();
		cq.enQueue(30);
		cq.display();
		cq.enQueue(40);
		cq.display();
		cq.enQueue(50);
		cq.display();

		cq.deQueue();
		cq.display();
		cq.deQueue();
		cq.display();

		cq.enQueue(60);
		cq.display();
		cq.enQueue(70);
		cq.display();		

		System.out.println("isOverflow(): " +cq.isOverflow());

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
		enQueue(40)
		Queue: 10 20 30 40
		enQueue(50)
		Queue: 10 20 30 40 50
		deQueue()
		Queue: 20 30 40 50
		deQueue()
		Queue: 30 40 50
		enQueue(60)
		Queue: 30 40 50 60
		enQueue(70)
		Queue: 30 40 50 60 70
		isOverflow(): true
*/