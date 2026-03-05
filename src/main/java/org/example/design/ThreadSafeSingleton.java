package org.example.design;

/**
 * ThreadSafeSingleton
 *
 * Problem: Implement a thread-safe Singleton in Java. What are the pitfalls and how do you avoid them?
 *
 * Approach: Use double-checked locking with volatile, or Enum Singleton.
 * This is a classic concurrency and design patterns problem.
 *
 * Example: Only one instance is created, even in multithreaded environments.
 */
public class ThreadSafeSingleton {
    // Volatile ensures visibility of changes to instance across threads
    private static volatile ThreadSafeSingleton instance;
    // Private constructor prevents instantiation from outside
    private ThreadSafeSingleton() {}
    /**
     * Returns the singleton instance, creating it if necessary (thread-safe).
     */
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
    /**
     * Example method to show singleton usage.
     */
    public void doSomething() { System.out.println("Singleton instance doing something"); }
    /**
     * Main method to demonstrate thread-safe singleton.
     */
    public static void main(String[] args) {
        ThreadSafeSingleton.getInstance().doSomething();
    }
}
