package org.leetcode.hard;


/**
 * <b>#3569 - Maximize Count of Distinct Primes After Split</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Segment Tree, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums having length n and a 2D integer array queries where queries[i] = [idx, val].
 *
 *
 * For each query:
 *
 *
 * Update nums[idx] = val.
 *
 * Choose an integer k with 1 &lt;= k &lt; n to split the array into the non-empty prefix nums[0..k-1] and suffix nums[k..n-1] such that the sum of the counts of distinct prime values in each part is maximum.
 *
 * Note: The changes made to the array in one query persist into the next query.
 *
 *
 * Return an array containing the result for each query, in the order they are given.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,1,2], queries = [[1,2],[3,3]]
 *
 *
 * Output: [3,4]
 *
 *
 * Explanation:
 *
 *
 * Initially nums = [2, 1, 3, 1, 2].
 *
 * After 1st query, nums = [2, 2, 3, 1, 2]. Split nums into [2] and [2, 3, 1, 2]. [2] consists of 1 distinct prime and [2, 3, 1, 2] consists of 2 distinct primes. Hence, the answer for this query is 1 + 2 = 3.
 *
 * After 2nd query, nums = [2, 2, 3, 3, 2]. Split nums into [2, 2, 3] and [3, 2] with an answer of 2 + 2 = 4.
 *
 * The output is [3, 4].
 *
 * Example 2:
 *
 * Input: nums = [2,1,4], queries = [[0,1]]
 *
 *
 * Output: [0]
 *
 *
 * Explanation:
 *
 *
 * Initially nums = [2, 1, 4].
 *
 * After 1st query, nums = [1, 1, 4]. There are no prime numbers in nums, hence the answer for this query is 0.
 *
 * The output is [0].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == nums.length &lt;= 5 * 104
 *
 * 1 &lt;= queries.length &lt;= 5 * 104
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 0 &lt;= queries[i][0] &lt; nums.length
 *
 * 1 &lt;= queries[i][1] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Preprocess all primes up to <code>max(nums)</code> with a sieve to enable O(1) primality checks.
 * Hint 2: For each prime <code>p</code>, record its occurrence <code>indices</code>; if it appears at least twice, treat <code>[first, last]</code> as a segment, and note that the split position <code>k</code> with the most overlapping segments equals the number of primes counted on both sides.
 * Hint 3: Use a segment tree with lazy propagation over all possible <code>k</code> to maintain, update, and query the sum of distinct-prime counts in the prefix and suffix, adjusting for overlaps.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Segment Tree, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/maximize-count-of-distinct-primes-after-split/">LeetCode #3569</a>
 */
public class MaximizeCountOfDistinctPrimesAfterSplit {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Count of Distinct Primes After Split");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeCountOfDistinctPrimesAfterSplit ===");
        MaximizeCountOfDistinctPrimesAfterSplit sol = new MaximizeCountOfDistinctPrimesAfterSplit();
        System.out.println(sol.solve(null));
    }
}
