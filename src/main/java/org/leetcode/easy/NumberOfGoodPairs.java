package org.leetcode.easy;


/**
 * <b>#1512 - Number of Good Pairs</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums, return the number of good pairs.
 *
 *
 * A pair (i, j) is called good if nums[i] == nums[j] and i &lt; j.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count how many times each number appears. If a number appears n times, then n * (n – 1) // 2 good pairs can be made with this number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-good-pairs/">LeetCode #1512</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class NumberOfGoodPairs {

    /**
     * Solves the problem: Num identical pairs.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] freq = new int[101];
        for (int n:nums) count+=freq[n]++;
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        NumberOfGoodPairs sol = new NumberOfGoodPairs();
                System.out.println(sol.numIdenticalPairs(new int[]{1,2,3,1,1,3})); // 4
                System.out.println(sol.numIdenticalPairs(new int[]{1,1,1,1}));     // 6
                System.out.println(sol.numIdenticalPairs(new int[]{1,2,3}));       // 0
    }
}
