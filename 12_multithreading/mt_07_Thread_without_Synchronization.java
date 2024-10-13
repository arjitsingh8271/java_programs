// Race Condition - when two or more than two threads access Shared resources at same time.
// Its occured without Synchronized


// Resources or Shared Data
class Counter {
	int count;

	public void incre() {
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
class mt_07_Thread_without_Synchronization {
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
1578
1940
1705
Always < 2000
*/