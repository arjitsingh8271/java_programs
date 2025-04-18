class mt_04_Thread_interrupt extends Thread{
	@Override
	public void run() {
		try {
			System.out.println("Wait for 1 sec");
			Thread.sleep(1000);
			System.out.println("Thread is Running...");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		mt_04_Thread_interrupt t1 = new mt_04_Thread_interrupt();
		t1.start();

		t1.interrupt();		// Interrupt this thread.
	}
}

/*
Wait for 1 sec
java.lang.InterruptedException: sleep interrupted
*/
