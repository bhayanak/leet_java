package org.leetcode.easy;


/**
 * <b>#896 - Monotonic Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 *
 *
 * An array nums is monotone increasing if for all i &lt;= j, nums[i] &lt;= nums[j]. An array nums is monotone decreasing if for all i &lt;= j, nums[i] &gt;= nums[j].
 *
 *
 * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2,3]
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [6,5,4,4]
 * Output: true
 *
 * Example 3:
 *
 * Input: nums = [1,3,2]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -105 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/monotonic-array/">LeetCode #896</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class MonotonicArray {

    /**
     * Returns true if Is monotonic.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) dec = false;
            if (nums[i] < nums[i-1]) inc = false;
        }
        return inc || dec;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MonotonicArray.java &amp;&amp; java org.leetcode.easy.MonotonicArray</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MonotonicArray sol = new MonotonicArray();
                System.out.println(sol.isMonotonic(new int[]{1,2,2,3})); // true
                System.out.println(sol.isMonotonic(new int[]{6,5,4,4})); // true
                System.out.println(sol.isMonotonic(new int[]{1,3,2}));   // false
    }
}
