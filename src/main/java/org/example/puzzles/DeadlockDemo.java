package org.example.puzzles;

/**
 * DeadlockDemo
 *
 * Problem: Write a Java program that creates a deadlock between two threads. Then explain how to fix it.
 *
 * Approach: Create two locks and two threads, each acquiring the locks in different order. To fix, always acquire locks in the same order.
 * This is a classic concurrency problem, testing understanding of deadlocks and synchronization.
 *
 * Example:
 *   Thread 1 locks lock1 then lock2; Thread 2 locks lock2 then lock1. This can cause a deadlock.
 *   To fix: Always acquire locks in the same order in all threads.
 */
public class DeadlockDemo {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    /**
     * Main method to demonstrate deadlock.
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock2) {
                    System.out.println("Thread 1 acquired both locks");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try { Thread.sleep(100); } catch (InterruptedException ignored) {}
                synchronized (lock1) {
                    System.out.println("Thread 2 acquired both locks");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

/**
 * How to fix the deadlock:
 * Always acquire locks in the same order in all threads. For example, always lock lock1 before lock2.
 */
