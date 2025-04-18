class myThread extends Thread {
	myThread (String name) {
		super(name);	// Passing name to Thread costructor.
	}
}

class mt_04_Thread_methods {

	public static void main(String[] args) {
		// Main thread
		System.out.println("Name: " +Thread.currentThread().getName());		// main
		System.out.println("State: " +Thread.currentThread().getState());	// RUNNABLE

		myThread t1 = new myThread("Thread-1");
		myThread t2 = new myThread("Thread-2");
		System.out.println();

		// methods of Thread class

		System.out.println("State: " + t1.getState());			// NEW
		System.out.println("ID: " + t1.getId());				// 28
		System.out.println("Name: " + t1.getName());			// Thread-1
		System.out.println("Priority: " + t1.getPriority());	// 5
		t1.start();
		System.out.println("State: " + t1.getState());			// RUNNABLE
		System.out.println("Alive: " + t1.isAlive());			// true

		System.out.println();
		System.out.println("State: " + t2.getState());			// NEW
		t2.start();
		System.out.println("State: " + t2.getState());			// RUNNABLE
		System.out.println("ID: " + t2.getId());				// 29
		System.out.println("Name: " + t2.getName());			// Thread-2
		System.out.println("Priority: " + t2.getPriority());	// 5
		System.out.println("State: " + t2.getState());			// TERMINATED
		System.out.println("Alive: " + t2.isAlive());			// false
	}
}