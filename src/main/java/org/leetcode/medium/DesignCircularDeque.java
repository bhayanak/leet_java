package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #641: Design Circular Deque
 * @see <a href="https://leetcode.com/problems/design-circular-deque/">Problem</a>
 */
public class DesignCircularDeque {

    /**
     * LeetCode #641 – Design Circular Deque
     * Difficulty: MEDIUM
     * Topics: Array, Linked List, Design, Queue
     *
     * Design your implementation of the circular double-ended queue (deque).
     * 
     * 
     * Implement the MyCircularDeque class:
     * 
     * 
     * MyCircularDeque(int k) Initializes the deque with a maximum size of k.
     * 
     * boolean insertFront() Adds an item at the front of Deque. Returns true if
     * the operation is successful, or false otherwise.
     * 
     * boolean insertLast() Adds an item at the rear of Deque. Returns true if the
     * operation is successful, or false otherwise.
     * 
     * boolean deleteFront() Deletes an item from the front of Deque. Returns true
     * if the operation is successful, or false otherwise.
     * 
     * boolean deleteLast() Deletes an item from the rear of Deque. Returns true
     * if the operation is successful, or false otherwise.
     * 
     * int getFront() Returns the front item from the Deque. Returns -1 if the
     * deque is empty.
     * 
     * int getRear() Returns the last item from Deque. Returns -1 if the deque is
     * empty.
     * 
     * boolean isEmpty() Returns true if the deque is empty, or false otherwise.
     * 
     * boolean isFull() Returns true if the deque is full, or false otherwise.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MyCircularDeque", "insertLast", "insertLast", "insertFront",
     * "insertFront", "getRear", "isFull", "deleteLast", "insertFront",
     * "getFront"]
     * [[3], [1], [2], [3], [4], [], [], [], [4], []]
     * Output
     * [null, true, true, true, false, 2, true, true, true, 4]
     * 
     * Explanation
     * MyCircularDeque myCircularDeque = new MyCircularDeque(3);
     * myCircularDeque.insertLast(1);  // return True
     * myCircularDeque.insertLast(2);  // return True
     * myCircularDeque.insertFront(3); // return True
     * my
     */
    // TODO: Implement solution for Design Circular Deque
    // Difficulty: MEDIUM | Topics: Array, Linked List, Design, Queue
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        DesignCircularDeque sol = new DesignCircularDeque();
        System.out.println(sol.solve());
    }
}
