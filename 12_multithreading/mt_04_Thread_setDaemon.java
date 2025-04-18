class mt_04_Thread_setDaemon extends Thread{
	@Override
	public void run() {
		for (; ;) {
			System.out.println(Thread.currentThread().getName() + " is Running...");
		}
	}

	public static void main(String[] args) {
		mt_04_Thread_setDaemon t1 = new mt_04_Thread_setDaemon();
		mt_04_Thread_setDaemon t2 = new mt_04_Thread_setDaemon();

		t1.setDaemon(true);		// Background thread
		t1.start();

		System.out.println(Thread.currentThread().getName());
	

	}
}