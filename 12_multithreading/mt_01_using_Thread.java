/*
➢Java provides thread class and runnable interface to achieve
multithreading.
➢ Thread class contains the actual mechanism for multithreading.
➢ In java a class can extend from only one class.➢ Runnable interface is used to extends class from some other class
➢ To achieve multithreading there need to be a class extending another
class.

➢ Example program using thread class:
*/


class myThread extends Thread {
	@Override
	public void run() {	
		
		// Infinite Loop
		while (true) {
			System.out.println("World " + Thread.currentThread().getName());
		}
	}
}

class mt_01_using_Thread {
	public static void main(String[] args) {
		myThread t1 = new myThread();
		t1.start();		// to start run method
		
		// Infinite Loop
		for (; ; ) {
			System.out.println("Hello " + Thread.currentThread().getName());
		}

	}
}

/*
➢ Run is the starting point of a program for multithreading.
➢ There should be a class having all the features for multithreading like
the one in the above program.
➢ the object of thread class is created in the main method.
➢ The start method call the thread class and runs the method which is a
built in method of thread class.
*/




/*
OUTPUT:
   
World Thread-0
World Thread-0
Hello main
Hello main
World Thread-0
World Thread-0
*/