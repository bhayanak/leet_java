package org.leetcode.medium;


/**
 * <b>#3469 - Find Minimum Cost to Remove Array Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. Your task is to remove all elements from the array by performing one of the following operations at each step until nums is empty:
 *
 *
 * Choose any two elements from the first three elements of nums and remove them. The cost of this operation is the maximum of the two elements removed.
 *
 * If fewer than three elements remain in nums, remove all the remaining elements in a single operation. The cost of this operation is the maximum of the remaining elements.
 *
 * Return the minimum cost required to remove all the elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [6,2,8,4]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * Initially, nums = [6, 2, 8, 4].
 *
 *
 * In the first operation, remove nums[0] = 6 and nums[2] = 8 with a cost of max(6, 8) = 8. Now, nums = [2, 4].
 *
 * In the second operation, remove the remaining elements with a cost of max(2, 4) = 4.
 *
 * The cost to remove all elements is 8 + 4 = 12. This is the minimum cost to remove all elements in nums. Hence, the output is 12.
 *
 * Example 2:
 *
 * Input: nums = [2,1,3,3]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Initially, nums = [2, 1, 3, 3].
 *
 *
 * In the first operation, remove nums[0] = 2 and nums[1] = 1 with a cost of max(2, 1) = 2. Now, nums = [3, 3].
 *
 * In the second operation remove the remaining elements with a cost of max(3, 3) = 3.
 *
 * The cost to remove all elements is 2 + 3 = 5. This is the minimum cost to remove all elements in nums. Hence, the output is 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use dynamic programming here?
 * Hint 2: Use dynamic programming. The process guarantees that the remaining elements form a prefix of the array with at most one previous element.
 * Hint 3: Define the state as <code>dp[i][j]</code>, where <code>i</code> represents the last remaining element and <code>j</code> represents the starting index of the current prefix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-minimum-cost-to-remove-array-elements/">LeetCode #3469</a>
 */
public class FindMinimumCostToRemoveArrayElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Minimum Cost to Remove Array Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMinimumCostToRemoveArrayElements ===");
        FindMinimumCostToRemoveArrayElements sol = new FindMinimumCostToRemoveArrayElements();
        System.out.println(sol.solve(null));
    }
}
