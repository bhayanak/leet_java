package org.leetcode.medium;


/**
 * <b>#930 - Binary Subarrays With Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
 *
 *
 * A subarray is a contiguous part of the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,1,0,1], goal = 2
 * Output: 4
 * Explanation: The 4 subarrays are bolded and underlined below:
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 *
 * Example 2:
 *
 * Input: nums = [0,0,0,0,0], goal = 0
 * Output: 15
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 3 * 104
 *
 * nums[i] is either 0 or 1.
 *
 * 0 &lt;= goal &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-subarrays-with-sum/">LeetCode #930</a>
 */
public class BinarySubarraysWithSum {

    /**
     * TODO: Implement "Binary Subarrays With Sum".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Subarrays With Sum");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinarySubarraysWithSum.java &amp;&amp; java org.leetcode.medium.BinarySubarraysWithSum</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinarySubarraysWithSum ===");
        BinarySubarraysWithSum sol = new BinarySubarraysWithSum();
        System.out.println(sol.solve(null));
    }
}
