package org.example.puzzles;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ThreadSafeCounter
 *
 * Problem: Design a thread-safe counter in Java that increments safely across multiple threads.
 *
 * Approach: Use AtomicInteger for lock-free thread safety, or use synchronized methods/blocks.
 * This is a classic concurrency problem, testing understanding of atomic operations and thread safety.
 *
 * Example:
 *   Two threads increment the counter 1000 times each; final value should be 2000.
 */
public class ThreadSafeCounter {
    // AtomicInteger provides lock-free, thread-safe operations
    private final AtomicInteger count = new AtomicInteger(0);

    /**
     * Increments the counter safely.
     * @return the incremented value
     */
    public int increment() {
        return count.incrementAndGet();
    }

    /**
     * Gets the current value of the counter.
     * @return the current count
     */
    public int get() {
        return count.get();
    }

    /**
     * Main method to demonstrate thread-safe counting.
     */
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeCounter counter = new ThreadSafeCounter();
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(counter.get()); // 2000
    }
}
