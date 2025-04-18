// yield(): Hints to the thread scheduler that the current thread is willing to yield its current use of CPU.

class mt_04_Thread_yield extends Thread{
	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println(Thread.currentThread().getName() + " is Running...");
			Thread.yield();
		}
	}

	public static void main(String[] args) {
		mt_04_Thread_yield t1 = new mt_04_Thread_yield();
		mt_04_Thread_yield t2 = new mt_04_Thread_yield();

		t1.start();
		t2.start();

	}
}

// Without yeild
/*
Thread-0 is Running...                                                                    
Thread-0 is Running...
Thread-0 is Running...
Thread-1 is Running...
Thread-1 is Running...
Thread-1 is Running...
*/

// With yeild
/*
Thread-1 is Running...
Thread-0 is Running...
Thread-1 is Running...
Thread-1 is Running...
Thread-0 is Running...
Thread-0 is Running...
*/