package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #775: Global and Local Inversions
 * @see <a href="https://leetcode.com/problems/global-and-local-inversions/">Problem</a>
 */
public class GlobalAndLocalInversions {

    /**
     * LeetCode #775 – Global and Local Inversions
     * Difficulty: MEDIUM
     * Topics: Array, Math
     *
     * You are given an integer array nums of length n which represents a
     * permutation of all the integers in the range [0, n - 1].
     * 
     * 
     * The number of global inversions is the number of the different pairs (i, j)
     * where:
     * 
     * 
     * 0 &lt;= i &lt; j &lt; n
     * 
     * nums[i] &gt; nums[j]
     * 
     * The number of local inversions is the number of indices i where:
     * 
     * 
     * 0 &lt;= i &lt; n - 1
     * 
     * nums[i] &gt; nums[i + 1]
     * 
     * Return true if the number of global inversions is equal to the number of
     * local inversions.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [1,0,2]
     * Output: true
     * Explanation: There is 1 global inversion and 1 local inversion.
     * 
     * Example 2:
     * 
     * Input: nums = [1,2,0]
     * Output: false
     * Explanation: There are 2 global inversions and 1 local inversion.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == nums.length
     * 
     * 1 &lt;= n &lt;= 105
     * 
     * 0 &lt;= nums[i] &lt; n
     * 
     * All the integers of nums are unique.
     * 
     * nums is a permutation of all the numbers in the range [0, n - 1].
     */
    // TODO: Implement solution for Global and Local Inversions
    // Difficulty: MEDIUM | Topics: Array, Math
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
        GlobalAndLocalInversions sol = new GlobalAndLocalInversions();
        System.out.println(sol.solve());
    }
}
