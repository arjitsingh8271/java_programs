/*
	THREAD PRIORITIES

➢ JAVA supports thread priorities from 1-10.
➢ Execution of threads depends upon scheduler.
➢ If a thread is having higher priority then it should get some
preference over other threads.
➢ In java there are different levels of priority that are:
	• MIN_PRIORITY=1.
	• NORM_PRIORITY=5.
	• MAX_PRIORITY=10.
➢ The priority of default thread is always 5.
➢ The higher priority is given to the thread which gets the input or the
data.
➢ The thread with higher priority gets the more CPU time.
➢ Multithreading features are provided by the operating systems but in
java JVM have its own scheduler.
*/

/*
class myThread extends Thread
{
	myThread (String name)
	{
		super(name);
		setPriority(Thread.MIN_PRIORITY+2);		
	}
}

class mt_05_Thread_setPriority
{
	public static void main(String[] args)
	{
		myThread t1 = new myThread("Thread-1");

		// methods of Thread class

		t1.start();
		System.out.println("ID: " + t1.getId());
		System.out.println("Name: " + t1.getName());
		System.out.println("Priority: " + t1.getPriority());	
	}
}



OUTPUT:

ID: 20        
Name: Thread-1
Priority: 3
*/



class MyRunnable implements Runnable 
{
    public void run() 
    {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running");
    }
}

public class mt_05_Thread_setPriority 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("ID: " + t1.getId());
        System.out.println("Priority: " + t1.getPriority());
        
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("ID: " + t2.getId());
        System.out.println("Priority: " + t2.getPriority());


        t1.start();
        t2.start();
    }
}

