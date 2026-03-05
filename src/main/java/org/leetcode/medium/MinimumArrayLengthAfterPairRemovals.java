package org.leetcode.medium;


/**
 * <b>#2856 - Minimum Array Length After Pair Removals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Binary Search, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array num sorted in non-decreasing order.
 *
 *
 * You can perform the following operation any number of times:
 *
 *
 * Choose two indices, i and j, where nums[i] &lt; nums[j].
 *
 * Then, remove the elements at indices i and j from nums. The remaining elements retain their original order, and the array is re-indexed.
 *
 * Return the minimum length of nums after applying the operation zero or more times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * Example 2:
 *
 * Input: nums = [1,1,2,2,3,3]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * Example 3:
 *
 * Input: nums = [1000000000,1000000000]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Since both numbers are equal, they cannot be removed.
 *
 * Example 4:
 *
 * Input: nums = [2,3,4,4,4]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * nums is sorted in non-decreasing order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To minimize the length of the array, we should maximize the number of operations performed.
 * Hint 2: To perform <code>k</code> operations, it is optimal to use the smallest <code>k</code> values and the largest <code>k</code> values in <code>nums</code>.
 * Hint 3: What is the best way to make pairs from the smallest <code>k</code> values and the largest <code>k</code> values so it is possible to remove all the pairs?
 * Hint 4: If we consider the smallest <code>k</code> values and the largest <code>k</code> values as two separate <strong>sorted 0-indexed</strong> arrays, <code>a</code> and <code>b</code>, It is optimal to pair <code>a[i]</code> and <code>b[i]</code>. So, a <code>k</code> is valid if <code>a[i] &lt; b[i]</code> for all <code>i</code> in the range <code>[0, k - 1]</code>.
 * Hint 5: The greatest possible valid <code>k</code> can be found using binary search.
 * Hint 6: The answer is <code>nums.length - 2 * k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Binary Search, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-array-length-after-pair-removals/">LeetCode #2856</a>
 */
public class MinimumArrayLengthAfterPairRemovals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Array Length After Pair Removals");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumArrayLengthAfterPairRemovals ===");
        MinimumArrayLengthAfterPairRemovals sol = new MinimumArrayLengthAfterPairRemovals();
        System.out.println(sol.solve(null));
    }
}
