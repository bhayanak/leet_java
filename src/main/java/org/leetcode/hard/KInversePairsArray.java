package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #629: K Inverse Pairs Array
 * @see <a href="https://leetcode.com/problems/k-inverse-pairs-array/">Problem</a>
 */
public class KInversePairsArray {

    /**
     * LeetCode #629 – K Inverse Pairs Array
     * Difficulty: HARD
     * Topics: Dynamic Programming
     *
     * For an integer array nums, an inverse pair is a pair of integers [i, j]
     * where 0 &lt;= i &lt; j &lt; nums.length and nums[i] &gt; nums[j].
     * 
     * 
     * Given two integers n and k, return the number of different arrays
     * consisting of numbers from 1 to n such that there are exactly k inverse
     * pairs. Since the answer can be huge, return it modulo 109 + 7.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 3, k = 0
     * Output: 1
     * Explanation: Only the array [1,2,3] which consists of numbers from 1 to 3
     * has exactly 0 inverse pairs.
     * 
     * Example 2:
     * 
     * Input: n = 3, k = 1
     * Output: 2
     * Explanation: The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= n &lt;= 1000
     * 
     * 0 &lt;= k &lt;= 1000
     */
    // TODO: Implement solution for K Inverse Pairs Array
    // Difficulty: HARD | Topics: Dynamic Programming
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
        KInversePairsArray sol = new KInversePairsArray();
        System.out.println(sol.solve());
    }
}
