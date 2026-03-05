package org.leetcode.easy;


/**
 * <b>#1863 - Sum of All Subset XOR Totals</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Backtracking, Bit Manipulation, Combinatorics, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
 *
 *
 * For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
 *
 * Given an array nums, return the sum of all XOR totals for every subset of nums. 
 *
 *
 * Note: Subsets with the same elements should be counted multiple times.
 *
 *
 * An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3]
 * Output: 6
 * Explanation: The 4 subsets of [1,3] are:
 * - The empty subset has an XOR total of 0.
 * - [1] has an XOR total of 1.
 * - [3] has an XOR total of 3.
 * - [1,3] has an XOR total of 1 XOR 3 = 2.
 * 0 + 1 + 3 + 2 = 6
 *
 * Example 2:
 *
 * Input: nums = [5,1,6]
 * Output: 28
 * Explanation: The 8 subsets of [5,1,6] are:
 * - The empty subset has an XOR total of 0.
 * - [5] has an XOR total of 5.
 * - [1] has an XOR total of 1.
 * - [6] has an XOR total of 6.
 * - [5,1] has an XOR total of 5 XOR 1 = 4.
 * - [5,6] has an XOR total of 5 XOR 6 = 3.
 * - [1,6] has an XOR total of 1 XOR 6 = 7.
 * - [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
 * 0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28
 *
 * Example 3:
 *
 * Input: nums = [3,4,5,6,7,8]
 * Output: 480
 * Explanation: The sum of all XOR totals for every subset is 480.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 12
 *
 * 1 &lt;= nums[i] &lt;= 20
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is there a way to iterate through all the subsets of the array?
 * Hint 2: Can we use recursion to efficiently iterate through all the subsets?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Backtracking, Bit Manipulation, Combinatorics, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-all-subset-xor-totals/">LeetCode #1863</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SumOfAllSubsetXorTotals {

    /**
     * Solves the problem: Subset x o r sum.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int subsetXORSum(int[] nums) {
        int or=0;
        for (int n:nums) or|=n;
        return or << (nums.length-1);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        SumOfAllSubsetXorTotals sol = new SumOfAllSubsetXorTotals();
                System.out.println(sol.subsetXORSum(new int[]{1,3}));    // 6
                System.out.println(sol.subsetXORSum(new int[]{5,1,6}));  // 28
                System.out.println(sol.subsetXORSum(new int[]{3,4,5,6,7,8})); // 480
    }
}
