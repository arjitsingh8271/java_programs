/*
● tryLock(): Tries to acquire the lock, returns immediately.
● tryLock(long time, TimeUnit unit): Waits for the lock for the given time.
*/

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class mt_09_Lock02_tryLock {
    private final Lock lock = new ReentrantLock();

    public void doWork() {
        if (lock.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " got the lock.");
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock.");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't get the lock.");
        }
    }

    public static void main(String[] args) {
        mt_09_Lock02_tryLock example = new mt_09_Lock02_tryLock();

        Runnable task = () -> example.doWork();

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}
