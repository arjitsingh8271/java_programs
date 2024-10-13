/*
Synchronization is crucial in a multithreaded environment to prevent 
concurrent access to shared resources, which can lead to data inconsistency. 
Java provides the synchronized keyword to control access to critical sections.
*/

// Resources or Shared Data
class Counter {
	int count;

	public synchronized void incre() {
		count++;
	}
}


// Thread 1
class myThread_1 extends Thread {
	Counter c1;

	myThread_1(Counter data) {
		c1=data;
	}

	public void run() {
		for(int i=0; i<1000; i++) {
			c1.incre();
		}
	}
}


// Thread 2
class myThread_2 extends Thread {
	Counter c2;

	myThread_2(Counter data) {
		c2=data;
	}

	public void run() {
		for(int i=0; i<1000; i++) {
			c2.incre();
		}
	}

}


// Main class
class mt_08_Thread_with_Synchronization {
	public static void main(String[] args) {
		
		Counter c = new Counter();

		myThread_1 t1 = new myThread_1(c);
		myThread_2 t2 = new myThread_2(c);

		t1.start();
		t2.start();

		
		try { 
			t1.join();	// for main to wait for t1 & t2
			t2.join();
		} catch (InterruptedException e) {System.out.println(e);}


		System.out.println(c.count);
	}
}


/*
2000
2000
2000
Always 2000
*/