package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #457: Circular Array Loop
 * @see <a href="https://leetcode.com/problems/circular-array-loop/">Problem</a>
 */
public class CircularArrayLoop {

    /**
     * LeetCode #457 – Circular Array Loop
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Two Pointers
     *
     * You are playing a game involving a circular array of non-zero integers
     * nums. Each nums[i] denotes the number of indices forward/backward you must
     * move if you are located at index i:
     * 
     * 
     * If nums[i] is positive, move nums[i] steps forward, and
     * 
     * If nums[i] is negative, move abs(nums[i]) steps backward.
     * 
     * Since the array is circular, you may assume that moving forward from the
     * last element puts you on the first element, and moving backwards from the
     * first element puts you on the last element.
     * 
     * 
     * A cycle in the array consists of a sequence of indices seq of length k
     * where:
     * 
     * 
     * Following the movement rules above results in the repeating index sequence
     * seq[0] -&gt; seq[1] -&gt; ... -&gt; seq[k - 1] -&gt; seq[0] -&gt; ...
     * 
     * Every nums[seq[j]] is either all positive or all negative.
     * 
     * k &gt; 1
     * 
     * Return true if there is a cycle in nums, or false otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,-1,1,2,2]
     * Output: true
     * Explanation: The graph shows how the indices are connected. White nodes are
     * jumping forward, while red is jumping backward.
     * We can see the cycle 0 --&gt; 2 --&gt; 3 --&gt; 0 --&gt; ..., and all of its nodes are
     * white (jumping in the same direction).
     * 
     * Example 2:
     * 
     * Input: nums = [-1,-2,-3,-4,-5,6]
     * Output: false
     * Explanation: The graph shows how the indices are connected. White nodes are
     * jumping forward, while red is jumping backward.
     * The only cycle is of size 1, so we return false.
     * 
     * Example 3:
     * 
     * Input: nums = [1,-1,5,1,4]
     * Output: true
     * Explanation: The graph shows how the indices are connected. White nodes are
     * jumpin
     */
    // TODO: Implement solution for Circular Array Loop
    // Difficulty: MEDIUM | Topics: Array, Hash Table, Two Pointers
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
        CircularArrayLoop sol = new CircularArrayLoop();
        System.out.println(sol.solve());
    }
}
