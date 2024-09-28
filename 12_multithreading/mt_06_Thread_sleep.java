class myThread extends Thread {
	myThread(String name) {
		super(name);
	}

	public void run() {
		int i=1;

		while (true) {
			System.out.println(i++);
			try {
				Thread.sleep(1000);		// 1000 is in millisecond
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class mt_06_Thread_sleep {
	public static void main(String[] args) {
		myThread t1 = new myThread("Thread-1");

		// methods of Thread class

		t1.start();
		System.out.println("ID: " + t1.getId());
		System.out.println("Name: " + t1.getName());
		System.out.println("Priority: " + t1.getPriority());
		System.out.println("State: " + t1.getState());
		System.out.println("Alive: " + t1.isAlive());
		
		
	}
}