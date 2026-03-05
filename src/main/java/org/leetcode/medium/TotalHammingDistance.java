package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #477: Total Hamming Distance
 * @see <a href="https://leetcode.com/problems/total-hamming-distance/">Problem</a>
 */
public class TotalHammingDistance {

    /**
     * LeetCode #477 – Total Hamming Distance
     * Difficulty: MEDIUM
     * Topics: Array, Math, Bit Manipulation
     *
     * The Hamming distance between two integers is the number of positions at
     * which the corresponding bits are different.
     * 
     * 
     * Given an integer array nums, return the sum of Hamming distances between
     * all the pairs of the integers in nums.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [4,14,2]
     * Output: 6
     * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is
     * 0010 (just
     * showing the four bits relevant in this case).
     * The answer will be:
     * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2
     * + 2 + 2 = 6.
     * 
     * Example 2:
     * 
     * Input: nums = [4,14,4]
     * Output: 4
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 104
     * 
     * 0 &lt;= nums[i] &lt;= 109
     * 
     * The answer for the given input will fit in a 32-bit integer.
     */
    // For each bit position, count zeros and ones; contribution = zeros * ones
    /**
     * Solves the problem: Total hamming distance.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int totalHammingDistance(int[] nums) {
        int total = 0;
        for (int i = 0; i < 32; i++) {
            int ones = 0;
            for (int n : nums) ones += (n >> i) & 1;
            total += ones * (nums.length - ones);
        }
        return total;
    }

    public static void main(String[] args) {
        TotalHammingDistance sol = new TotalHammingDistance();
        System.out.println(sol.totalHammingDistance(new int[]{1,2,3}));
    }
}
