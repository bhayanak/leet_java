package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #421: Maximum XOR of Two Numbers in an Array
 * @see <a href="https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/">Problem</a>
 */
public class MaximumXorOfTwoNumbersInAnArray {

    /**
     * LeetCode #421 – Maximum XOR of Two Numbers in an Array
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Bit Manipulation, Trie
     *
     * Given an integer array nums, return the maximum result of nums[i] XOR
     * nums[j], where 0 &lt;= i &lt;= j &lt; n.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,10,5,25,2,8]
     * Output: 28
     * Explanation: The maximum result is 5 XOR 25 = 28.
     * 
     * Example 2:
     * 
     * Input: nums = [14,70,53,83,49,91,36,80,92,51,66,70]
     * Output: 127
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 2 * 105
     * 
     * 0 &lt;= nums[i] &lt;= 231 - 1
     */
    // Use Trie to find max XOR: for each number try to go opposite bit path
    /**
     * Finds Find maximum x o r.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int findMaximumXOR(int[] nums) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask |= (1 << i);
            Set<Integer> prefixes = new HashSet<>();
            for (int n : nums) prefixes.add(n & mask);
            int candidate = max | (1 << i);
            for (int p : prefixes) {
                if (prefixes.contains(candidate ^ p)) { max = candidate; break; }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumXorOfTwoNumbersInAnArray sol = new MaximumXorOfTwoNumbersInAnArray();
        System.out.println(sol.findMaximumXOR(new int[]{1,2,3}));
    }
}
