class myThread extends Thread
{
	myThread (String name)
	{
		super(name);
	}
}

class mt_04_Thread_methods
{
	public static void main(String[] args)
	{
		myThread t1 = new myThread("Thread-1");
		myThread t2 = new myThread("Thread-2");


		// methods of Thread class

		System.out.println("ID: " + t1.getId());
		System.out.println("Name: " + t1.getName());
		System.out.println("Priority: " + t1.getPriority());
		t1.start();
		System.out.println("State: " + t1.getState());
		System.out.println("Alive: " + t1.isAlive());

		t2.start();
		System.out.println();
		System.out.println("ID: " + t2.getId());
		System.out.println("Name: " + t2.getName());
		System.out.println("Priority: " + t2.getPriority());
		System.out.println("State: " + t2.getState());
		System.out.println("Alive: " + t2.isAlive());
	}
}


/*
OUTPUT:

ID: 20
Name: Thread-1
Priority: 5
State: RUNNABLE
Alive: false

ID: 21
Name: Thread-2
Priority: 5
State: TERMINATED
Alive: false
*/