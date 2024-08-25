class LinearQUsing2Stack_1 {
	
	int size = 5;
	int s1[] = new int[size];
	int s2[] = new int[size];

	int top1 = -1;
	int top2 = -1;


	void enQueue(int data) {
		if(top1 == size-1) {
			System.out.println("Queue is Overflow");
		}
		else {
			s1[++top1] = data;
			System.out.println("enQueue(" +data +")");
		}
	}


	int deQueue() {
		System.out.println("deQueue()");
		if(top2 == -1) {
			if(top1 == -1) {
				System.out.println("Queue is Underflow");
				return -1;
			}
			while (top1 != -1) {
				s2[++top2] = s1[top1--];
			}
		}
		return s2[top2--];
	}


	int peek() {
		if(top2 == -1) {
			if(top1 == -1) {
				System.out.println("Queue is Underflow");
				return -1;
			}
			else {
				while (top1 != -1) {
					s2[top2++] = s1[top1--];
				}
			}
		}
		return s2[top2];
	}


	boolean isEmpty() {
		return top1 == -1 && top2 == -1;
	}


	public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return;
        }

        System.out.print("Queue: ");

        // If elements are present in stack2, print them first
        for (int i=top2; i>=0; i--) {
            System.out.print(s2[i] + " ");
        }

        // Then print the elements in stack1 in order
        for (int i=0; i<=top1; i++) {
            System.out.print(s1[i] + " ");
        }
        System.out.println();
    }



	public static void main(String[] args) {
		LinearQUsing2Stack_1 q = new LinearQUsing2Stack_1();

		q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        q.display(); // Output: Queue: 10 20 30

        q.deQueue();
        q.display(); // Output: Queue: 20 30

        q.enQueue(40);
        q.display(); // Output: Queue: 20 30 40

        q.deQueue();
        q.display(); // Output: Queue: 30 40
	}

}



/*
OUTPUT: enQueue(10)
		enQueue(20)
		enQueue(30)
		Queue: 10 20 30 
		deQueue()
		Queue: 20 30 
		enQueue(40)
		Queue: 20 30 40 
		deQueue()
		Queue: 30 40
*/