package org.leetcode.easy;


/**
 * <b>#922 - Sort Array By Parity II</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 *
 *
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 *
 *
 * Return any answer array that satisfies this condition.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 *
 * Example 2:
 *
 * Input: nums = [2,3]
 * Output: [2,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 2 * 104
 *
 * nums.length is even.
 *
 * Half of the integers in nums are even.
 *
 * 0 &lt;= nums[i] &lt;= 1000
 *
 *
 *
 * Follow Up: Could you solve it in-place?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-array-by-parity-ii/">LeetCode #922</a>
  *
  * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
  */
public class SortArrayByParityIi {

    /**
     * Sorts Sort array by parity i i.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
      */
    public int[] sortArrayByParityII(int[] nums) {
        int j = 1; // next odd index to fill
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 != 0) {
                while (nums[j] % 2 != 0) j += 2;
                int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
            }
        }
        return nums;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SortArrayByParityIi.java &amp;&amp; java org.leetcode.easy.SortArrayByParityIi</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        SortArrayByParityIi sol = new SortArrayByParityIi();
                System.out.println(java.util.Arrays.toString(sol.sortArrayByParityII(new int[]{4,2,5,7})));
                // e.g. [4,5,2,7]
    }
}
