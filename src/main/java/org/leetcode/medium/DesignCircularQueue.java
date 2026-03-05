package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #622: Design Circular Queue
 * @see <a href="https://leetcode.com/problems/design-circular-queue/">Problem</a>
 */
public class DesignCircularQueue {

    /**
     * LeetCode #622 – Design Circular Queue
     * Difficulty: MEDIUM
     * Topics: Array, Linked List, Design, Queue
     *
     * Design your implementation of the circular queue. The circular queue is a
     * linear data structure in which the operations are performed based on FIFO
     * (First In First Out) principle, and the last position is connected back to
     * the first position to make a circle. It is also called "Ring Buffer".
     * 
     * 
     * One of the benefits of the circular queue is that we can make use of the
     * spaces in front of the queue. In a normal queue, once the queue becomes
     * full, we cannot insert the next element even if there is a space in front
     * of the queue. But using the circular queue, we can use the space to store
     * new values.
     * 
     * 
     * Implement the MyCircularQueue class:
     * 
     * 
     * MyCircularQueue(k) Initializes the object with the size of the queue to be
     * k.
     * 
     * int Front() Gets the front item from the queue. If the queue is empty,
     * return -1.
     * 
     * int Rear() Gets the last item from the queue. If the queue is empty, return
     * -1.
     * 
     * boolean enQueue(int value) Inserts an element into the circular queue.
     * Return true if the operation is successful.
     * 
     * boolean deQueue() Deletes an element from the circular queue. Return true
     * if the operation is successful.
     * 
     * boolean isEmpty() Checks whether the circular queue is empty or not.
     * 
     * boolean isFull() Checks whether the circular queue is full or not.
     * 
     * You must solve the problem without using the built-in queue data structure
     * in your programming language.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MyCircularQueue", "enQueue", "enQueue", "enQueue", "enQueue", "Rear",
     * "isFull", "deQueue", "enQueue", "Rear"]
     * [[3], [
     */
    private int[] data;
    private int head, tail, size, cap;

    public DesignCircularQueue(int k) { data = new int[k]; cap = k; }

    /**
     * Solves the problem: En queue.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param value the value (int)
     * @return the computed boolean result
     */
    public boolean enQueue(int value) {
        if (isFull()) return false;
        data[tail] = value; tail = (tail + 1) % cap; size++; return true;
    }
    /**
     * Solves the problem: De queue.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @return the computed boolean result
     */
    public boolean deQueue() {
        if (isEmpty()) return false;
        head = (head + 1) % cap; size--; return true;
    }
    /**
     * Solves the problem: Front.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @return the computed int result
     */
    public int Front() { return isEmpty() ? -1 : data[head]; }
    /**
     * Solves the problem: Rear.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @return the computed int result
     */
    public int Rear() { return isEmpty() ? -1 : data[(tail - 1 + cap) % cap]; }
    /**
     * Returns true if Is empty.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @return the computed boolean result
     */
    public boolean isEmpty() { return size == 0; }
    /**
     * Returns true if Is full.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @return the computed boolean result
     */
    public boolean isFull() { return size == cap; }

    public static void main(String[] args) {
        DesignCircularQueue cq = new DesignCircularQueue(3);
        System.out.println(cq.enQueue(1)); // true
        System.out.println(cq.enQueue(2)); // true
        System.out.println(cq.enQueue(3)); // true
        System.out.println(cq.enQueue(4)); // false (full)
        System.out.println(cq.Rear());     // 3
        System.out.println(cq.isFull());   // true
        System.out.println(cq.deQueue());  // true
        System.out.println(cq.enQueue(4)); // true
        System.out.println(cq.Rear());     // 4
    }
}
