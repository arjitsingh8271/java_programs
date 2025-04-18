/*
Thread Life Cycle
-----------------
1. New – Thread is created.
2. Runnable – Thread is ready to run.
3. Running – Thread is executing.
4. Blocked/Waiting – Thread is waiting for a resource or signal.
5. Terminated – Thread completes or is stopped.
*/

class mt_05_Thread_LifeCycle extends Thread {
	@Override
	public void run() {
		System.out.println("RUNNING");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException{
		mt_05_Thread_LifeCycle t1 = new mt_05_Thread_LifeCycle();
		System.out.println(t1.getState());	// NEW

		t1.start();
		System.out.println(t1.getState());	// RUNNABLE
		System.out.println(Thread.currentThread().getState()); // RUNNABLE

		Thread.sleep(100);

		System.out.println(t1.getState());	// TIMED_WAITING

		t1.join();		// main() will wait for t1 to get finished

		System.out.println(t1.getState());	// TERMINATED
	}
}