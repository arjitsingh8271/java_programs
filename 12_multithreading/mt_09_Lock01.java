/*
Types of Lock
-------------
1. Intrinsic:
	● These are built into every object in Java
	● We don't see them, but they're there.
	● When e use a 'synchronized' keyword, we're using these automatic locks.

2. Explicit:
	● These are more advanced locks we can control ourself using the Lock Interface.
	● We explicitly say when to lock and unlock.


Lock Interface
--------------
The Lock interface in Java is part of the java.util.concurrent.locks package and provides 
more powerful and flexible locking mechanisms than the traditional synchronized keyword.

Why Use Lock Instead of synchronized?
-------------------------------------
● Try to acquire a lock without blocking (tryLock()).
● Interrupt a thread waiting on a lock (lockInterruptibly()).
● Fairness policies (first-come-first-serve).

Key Methods of Lock Interface
------------------------------
● lock(): Acquires the lock (waits if necessary).
● unlock(): Releases the lock.
● tryLock(): Tries to acquire the lock, returns immediately.
● tryLock(long time, TimeUnit unit): Waits for the lock for the given time.
● lockInterruptibly(): Acquires the lock unless the thread is interrupted.


What is ReentrantLock?
----------------------
ReentrantLock is a class in java.util.concurrent.locks package that gives explicit locking, 
as an alternative to the synchronized keyword. It allows more flexibility than synchronized blocks.

Why use ReentrantLock?
----------------------
● Gives manual control over locking.
● Supports tryLock(), lockInterruptibly(), and fairness.
● Can re-enter (a thread can acquire it multiple times).
● Supports condition variables via newCondition().
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private final Lock lock = new ReentrantLock();

    void printNumbers() {
        lock.lock(); // acquire the lock
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        } finally {
            lock.unlock(); // always release the lock
        }
    }
}

public class mt_09_Lock01 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = new Runnable() {
        	@Override
        	public void run() {
        		resource.printNumbers();
        	}
        };
        // OR
        // Runnable task = () -> resource.printNumbers();

        Thread t1 = new Thread(task, "Thread-A");
        Thread t2 = new Thread(task, "Thread-B");

        t1.start();
        t2.start();
    }
}


/*
Notes:
● Always use lock.unlock() in a finally block.
● Use tryLock() when you don’t want your thread to block.
● ReentrantLock allows a thread to acquire the same lock multiple times.
*/