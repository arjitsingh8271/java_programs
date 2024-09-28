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
	// overriding run methods
	public void run() {	
		int i=1;
		// Infinite Loop
		while (true) {
			System.out.println(i + " Hello");
			i++;
		}
	}
}

class mt_01_using_Thread {
	public static void main(String[] args) {
		myThread t1 = new myThread();
		t1.start();		// to start run method
		
		int i=1;
		// Infinite Loop
		for (; ; ) {
			System.out.println(i + " World");
			i++;
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

1 Hello    
2 Hello    
3 Hello    
4 Hello    
5 Hello    
6 Hello
7 Hello                                                               
8 Hello
9 Hello
1 World
2 World
3 World
10 Hello
4 World
11 Hello
5 World
12 Hello
6 World
13 Hello
7 World
14 Hello
*/