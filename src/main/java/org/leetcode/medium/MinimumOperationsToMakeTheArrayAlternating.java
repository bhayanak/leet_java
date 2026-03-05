package org.leetcode.medium;


/**
 * <b>#2170 - Minimum Operations to Make the Array Alternating</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums consisting of n positive integers.
 *
 *
 * The array nums is called alternating if:
 *
 *
 * nums[i - 2] == nums[i], where 2 &lt;= i &lt;= n - 1.
 *
 * nums[i - 1] != nums[i], where 1 &lt;= i &lt;= n - 1.
 *
 * In one operation, you can choose an index i and change nums[i] into any positive integer.
 *
 *
 * Return the minimum number of operations required to make the array alternating.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,3,2,4,3]
 * Output: 3
 * Explanation:
 * One way to make the array alternating is by converting it to [3,1,3,1,3,1].
 * The number of operations required in this case is 3.
 * It can be proven that it is not possible to make the array alternating in less than 3 operations. 
 *
 * Example 2:
 *
 * Input: nums = [1,2,2,2,2]
 * Output: 2
 * Explanation:
 * One way to make the array alternating is by converting it to [1,2,1,2,1].
 * The number of operations required in this case is 2.
 * Note that the array cannot be converted to [2,2,2,2,2] because in this case nums[0] == nums[1] which violates the conditions of an alternating array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each element in odd positions in the array. Do the same for elements in even positions.
 * Hint 2: To minimize the number of operations we need to maximize the number of elements we keep from the original array.
 * Hint 3: What are the possible combinations of elements we can choose from odd indices and even indices so that the number of unchanged elements is maximized?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-the-array-alternating/">LeetCode #2170</a>
 */
public class MinimumOperationsToMakeTheArrayAlternating {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make the Array Alternating");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeTheArrayAlternating ===");
        MinimumOperationsToMakeTheArrayAlternating sol = new MinimumOperationsToMakeTheArrayAlternating();
        System.out.println(sol.solve(null));
    }
}
