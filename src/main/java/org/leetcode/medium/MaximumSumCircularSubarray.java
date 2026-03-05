package org.leetcode.medium;


/**
 * <b>#918 - Maximum Sum Circular Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Dynamic Programming, Queue, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.
 *
 *
 * A circular array means the end of the array connects to the beginning of the array. Formally, the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].
 *
 *
 * A subarray may only include each element of the fixed buffer nums at most once. Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i &lt;= k1, k2 &lt;= j with k1 % n == k2 % n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-2,3,-2]
 * Output: 3
 * Explanation: Subarray [3] has maximum sum 3.
 *
 * Example 2:
 *
 * Input: nums = [5,-3,5]
 * Output: 10
 * Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.
 *
 * Example 3:
 *
 * Input: nums = [-3,-2,-3]
 * Output: -2
 * Explanation: Subarray [-2] has maximum sum -2.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= n &lt;= 3 * 104
 *
 * -3 * 104 &lt;= nums[i] &lt;= 3 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For those of you who are familiar with the <b>Kadane's algorithm</b>, think in terms of that. For the newbies, Kadane's algorithm is used to finding the maximum sum subarray from a given array. This problem is a twist on that idea and it is advisable to read up on that algorithm first before starting this problem. Unless you already have a great algorithm brewing up in your mind in which case, go right ahead!
 * Hint 2: What is an alternate way of representing a circular array so that it appears to be a straight array?
Essentially, there are two cases of this problem that we need to take care of. Let's look at the figure below to understand those two cases:

<br>
<img alt="Circular subarray hint" src="https://assets.leetcode.com/uploads/2019/10/20/circular_subarray_hint_1.png" width="700"/>
 * Hint 3: The first case can be handled by the good old Kadane's algorithm. However, is there a smarter way of going about handling the second case as well?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Dynamic Programming, Queue, Monotonic Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-circular-subarray/">LeetCode #918</a>
 */
public class MaximumSumCircularSubarray {

    /**
     * TODO: Implement "Maximum Sum Circular Subarray".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum Circular Subarray");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumSumCircularSubarray.java &amp;&amp; java org.leetcode.medium.MaximumSumCircularSubarray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSumCircularSubarray ===");
        MaximumSumCircularSubarray sol = new MaximumSumCircularSubarray();
        System.out.println(sol.solve(null));
    }
}
