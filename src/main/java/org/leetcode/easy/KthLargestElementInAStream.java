package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.PriorityQueue;

/**
 * LeetCode #703: Kth Largest Element in a Stream
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/">Problem</a>
 */
public class KthLargestElementInAStream {

    /**
     * LeetCode #703 – Kth Largest Element in a Stream
     * Difficulty: EASY
     * Topics: Tree, Design, Binary Search Tree, Heap (Priority Queue), Binary Tree, Data Stream
     *
     * You are part of a university admissions office and need to keep track of
     * the kth highest test score from applicants in real-time. This helps to
     * determine cut-off marks for interviews and admissions dynamically as new
     * applicants submit their scores.
     * 
     * 
     * You are tasked to implement a class which, for a given integer k, maintains
     * a stream of test scores and continuously returns the kth highest test score
     * after a new score has been submitted. More specifically, we are looking for
     * the kth highest score in the sorted list of all scores.
     * 
     * 
     * Implement the KthLargest class:
     * 
     * 
     * KthLargest(int k, int[] nums) Initializes the object with the integer k and
     * the stream of test scores nums.
     * 
     * int add(int val) Adds a new test score val to the stream and returns the
     * element representing the kth largest element in the pool of test scores so
     * far.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input:
     * 
     * ["KthLargest", "add", "add", "add", "add", "add"]
     * 
     * [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
     * 
     * 
     * Output: [null, 4, 5, 5, 8, 8]
     * 
     * 
     * Explanation:
     * 
     * 
     * KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(3, [4, 5, 8, 2]);
     * 
     * kthLargest.add(3); // return 4
     * 
     * kthLargest.add(5); // return 5
     * 
     * kthLargest.add(10); // return 5
     * 
     * kthLargest.add(9); // return 8
     * 
     * kthLargest.add(4); // return 8
     * 
     * Example 2:
     * 
     * Input:
     * 
     * ["KthLargest", "add", "add", "add", "add"]
     * 
     * [[4, [7, 7, 7, 7, 8, 3]], [2], [10], [9], [9]]
     * 
     * 
     * Output: [null, 7, 7, 7, 8]
     * 
     * 
     * Explanation:
     * KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(4, [7, 7, 7, 7, 8, 3]);
     * 
     * kthLargest.add(2); // return 7
     * 
     * kthLargest.add(10); // re
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    private PriorityQueue<Integer> pq;
    private int k;
    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(k);
        for (int n : nums) add(n);
    }
    /**
     * Adds Add.
     *
     * @param val the val (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int add(int val) {
        pq.offer(val);
        if (pq.size() > k) pq.poll();
        return pq.peek();
    }

    public static void main(String[] args) {
        KthLargestElementInAStream kth = new KthLargestElementInAStream(3, new int[]{4,5,8,2});
        System.out.println(kth.add(3));  // 4
        System.out.println(kth.add(5));  // 5
        System.out.println(kth.add(10)); // 8
        System.out.println(kth.add(9));  // 8
        System.out.println(kth.add(4));  // 8
    }
}
