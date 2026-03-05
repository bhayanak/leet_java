package org.leetcode.medium;


/**
 * <b>#915 - Partition Array into Disjoint Intervals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, partition it into two (contiguous) subarrays left and right so that:
 *
 *
 * Every element in left is less than or equal to every element in right.
 *
 * left and right are non-empty.
 *
 * left has the smallest possible size.
 *
 * Return the length of left after such a partitioning.
 *
 *
 * Test cases are generated such that partitioning exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,0,3,8,6]
 * Output: 3
 * Explanation: left = [5,0,3], right = [8,6]
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,0,6,12]
 * Output: 4
 * Explanation: left = [1,1,1,0], right = [6,12]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 106
 *
 * There is at least one valid answer for the given input.
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
 * @see <a href="https://leetcode.com/problems/partition-array-into-disjoint-intervals/">LeetCode #915</a>
 */
public class PartitionArrayIntoDisjointIntervals {

    /**
     * TODO: Implement "Partition Array into Disjoint Intervals".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Partition Array into Disjoint Intervals");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PartitionArrayIntoDisjointIntervals.java &amp;&amp; java org.leetcode.medium.PartitionArrayIntoDisjointIntervals</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PartitionArrayIntoDisjointIntervals ===");
        PartitionArrayIntoDisjointIntervals sol = new PartitionArrayIntoDisjointIntervals();
        System.out.println(sol.solve(null));
    }
}
