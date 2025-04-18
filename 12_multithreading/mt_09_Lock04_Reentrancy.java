// A thread can lock the same ReentrantLock multiple times:

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class mt_09_Lock04_Reentrancy {
	
	private final Lock lock = new ReentrantLock();

	public void outerMethod() {
		lock.lock();
		try {
			System.out.println("outerMethod() got the lock.");
			innerMethod();
		} finally {
			lock.unlock();
			System.out.println("outerMethod() released the lock.");
		}
	}

	public void innerMethod() {
		lock.lock();
		try {
			System.out.println("innerMethod() got the lock.");
		} finally {
			lock.unlock();
			System.out.println("innerMethod() released the lock.");
		}
	}

	public static void main(String[] args) {
		
		mt_09_Lock04 t1 = new mt_09_Lock04();
		t1.outerMethod();

	}
}