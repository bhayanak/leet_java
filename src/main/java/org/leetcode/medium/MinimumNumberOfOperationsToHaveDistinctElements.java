package org.leetcode.medium;


/**
 * <b>#3779 - Minimum Number of Operations to Have Distinct Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * In one operation, you remove the first three elements of the current array. If there are fewer than three elements remaining, all remaining elements are removed.
 *
 *
 * Repeat this operation until the array is empty or contains no duplicate values.
 *
 *
 * Return an integer denoting the number of operations required.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,8,3,6,5,8]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * In the first operation, we remove the first three elements. The remaining elements [6, 5, 8] are all distinct, so we stop. Only one operation is needed.
 *
 * Example 2:
 *
 * Input: nums = [2,2]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * After one operation, the array becomes empty, which meets the stopping condition.
 *
 * Example 3:
 *
 * Input: nums = [4,3,5,1,2]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * All elements in the array are distinct, therefore no operations are needed.
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
 * Hint 1: Simulate the operations as described using a map that is initially filled.
 * Hint 2: While the map does not contain all distinct elements, delete the first three values using a pointer.
 * Hint 3: Repeat until the map contains all distinct elements or becomes empty.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-have-distinct-elements/">LeetCode #3779</a>
 */
public class MinimumNumberOfOperationsToHaveDistinctElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Operations to Have Distinct Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfOperationsToHaveDistinctElements ===");
        MinimumNumberOfOperationsToHaveDistinctElements sol = new MinimumNumberOfOperationsToHaveDistinctElements();
        System.out.println(sol.solve(null));
    }
}
