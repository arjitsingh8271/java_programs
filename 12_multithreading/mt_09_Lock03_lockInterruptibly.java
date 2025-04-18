// ● lockInterruptibly(): Acquires the lock unless the thread is interrupted.


import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class mt_09_Lock03_lockInterruptibly  {
    private final Lock lock = new ReentrantLock();

    public void doWork() {
        try {
            lock.lockInterruptibly();
            try {
                System.out.println(Thread.currentThread().getName() + " got the lock.");
                Thread.sleep(5000); // Simulate long-running task
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released the lock.");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }

    public static void main(String[] args) {
        mt_09_Lock03_lockInterruptibly example = new mt_09_Lock03_lockInterruptibly();

        Thread t1 = new Thread(example::doWork, "Thread-A");
        Thread t2 = new Thread(example::doWork, "Thread-B");

        t1.start();
        t2.start();

        // Interrupt thread 2 after 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        t2.interrupt();
    }
}
