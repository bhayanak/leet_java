package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #719: Find K-th Smallest Pair Distance
 * @see <a href="https://leetcode.com/problems/find-k-th-smallest-pair-distance/">Problem</a>
 */
public class FindKThSmallestPairDistance {

    /**
     * LeetCode #719 – Find K-th Smallest Pair Distance
     * Difficulty: HARD
     * Topics: Array, Two Pointers, Binary Search, Sorting
     *
     * The distance of a pair of integers a and b is defined as the absolute
     * difference between a and b.
     * 
     * 
     * Given an integer array nums and an integer k, return the kth smallest
     * distance among all the pairs nums[i] and nums[j] where 0 &lt;= i &lt; j &lt;
     * nums.length.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,3,1], k = 1
     * Output: 0
     * Explanation: Here are all the pairs:
     * (1,3) -&gt; 2
     * (1,1) -&gt; 0
     * (3,1) -&gt; 2
     * Then the 1st smallest distance pair is (1,1), and its distance is 0.
     * 
     * Example 2:
     * 
     * Input: nums = [1,1,1], k = 2
     * Output: 0
     * 
     * Example 3:
     * 
     * Input: nums = [1,6,1], k = 3
     * Output: 5
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == nums.length
     * 
     * 2 &lt;= n &lt;= 104
     * 
     * 0 &lt;= nums[i] &lt;= 106
     * 
     * 1 &lt;= k &lt;= n * (n - 1) / 2
     */
    // TODO: Implement solution for Find K-th Smallest Pair Distance
    // Difficulty: HARD | Topics: Array, Two Pointers, Binary Search, Sorting
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
        FindKThSmallestPairDistance sol = new FindKThSmallestPairDistance();
        System.out.println(sol.solve());
    }
}
