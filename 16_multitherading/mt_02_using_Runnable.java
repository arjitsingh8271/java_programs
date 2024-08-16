class myRunnable implements Runnable
{
	public void run()
	{
		int i=1;
		
		while (true)
		{
			System.out.println(i + " Hello");
			i++;
		}
	}
}

class mt_02_using_Runnable
{
	public static void main(String[] args)
	{
		//myRunnable mt = new myRunnable();
		//Thread t1 = new Thread(mt);
		//t1.start();

		Thread t1 = new Thread(new myRunnable());
		t1.start();

		int i=1;
		
		while (true)
		{
			System.out.println(i + " World");
			i++;
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