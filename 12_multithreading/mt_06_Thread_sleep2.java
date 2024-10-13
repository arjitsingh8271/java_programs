class myRunnable implements Runnable {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10);	// 10 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class mt_06_Thread_sleep2 {
	
	public static void main(String[] args) {
		//myRunnable mt = new myRunnable();
		//Thread t1 = new Thread(mt);
		//t1.start();

		Thread t1 = new Thread(new myRunnable());
		t1.start();
		try {
			Thread.sleep(5);		// 5 ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i=0; i<5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(10);	// 10 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}


/*
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
Hi
Hello
*/