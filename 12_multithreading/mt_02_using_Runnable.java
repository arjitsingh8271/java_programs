class myRunnable implements Runnable {
	@Override
	public void run() {
	
		// Infinite Loop
		while (true) {
			System.out.println("World " + Thread.currentThread().getName());
		}
	}
}

class mt_02_using_Runnable
{
	public static void main(String[] args) {
		//myRunnable mt = new myRunnable();
		//Thread t1 = new Thread(mt);
		//t1.start();

		Thread t1 = new Thread(new myRunnable());
		t1.start();

		// Infinite Loop
		while (true) {
			System.out.println("Hello " + Thread.currentThread().getName());
		}

	}
}


/*
Interfaces are implemented.
➢ The class becomes abstract if it does not implements all the features
of interface.
➢ In the above program it gives the example that the object also runs
when the thread runs.
*/

/*
OUTPUT:

Hello main
Hello main
World Thread-0
World Thread-0
Hello main
Hello main
World Thread-0
World Thread-0
Hello main
Hello main
World Thread-0
World Thread-0
*/