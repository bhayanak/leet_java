package org.leetcode.easy;


/**
 * <b>#961 - N-Repeated Element in Size 2N Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums with the following properties:
 *
 *
 * nums.length == 2 * n.
 *
 * nums contains n + 1 unique values, n of which occur exactly once in the array.
 *
 * Exactly one element of nums is repeated n times.
 *
 * Return the element that is repeated n times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,3]
 * Output: 3
 *
 *
 * Example 2:
 *
 * Input: nums = [2,1,2,5,3,2]
 * Output: 2
 *
 *
 * Example 3:
 *
 * Input: nums = [5,1,5,2,5,3,5,4]
 * Output: 5
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 5000
 *
 * nums.length == 2 * n
 *
 * 0 &lt;= nums[i] &lt;= 104
 *
 * nums contains n + 1 unique elements and one of them is repeated exactly n times.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/n-repeated-element-in-size-2n-array/">LeetCode #961</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class NRepeatedElementInSize2nArray {

    /**
     * Solves the problem: Repeated n times.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int repeatedNTimes(int[] nums) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int n : nums) if (!seen.add(n)) return n;
        return -1;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NRepeatedElementInSize2nArray.java &amp;&amp; java org.leetcode.easy.NRepeatedElementInSize2nArray</pre>
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        NRepeatedElementInSize2nArray sol = new NRepeatedElementInSize2nArray();
        System.out.println(sol.repeatedNTimes(new int[]{1,2,3}));
    }
}
