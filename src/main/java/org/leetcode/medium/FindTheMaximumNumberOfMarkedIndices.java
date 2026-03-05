package org.leetcode.medium;


/**
 * <b>#2576 - Find the Maximum Number of Marked Indices</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * Initially, all of the indices are unmarked. You are allowed to make this operation any number of times:
 *
 *
 * Pick two different unmarked indices i and j such that 2 * nums[i] &lt;= nums[j], then mark i and j.
 *
 * Return the maximum possible number of marked indices in nums using the above operation any number of times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,5,2,4]
 * Output: 2
 * Explanation: In the first operation: pick i = 2 and j = 1, the operation is allowed because 2 * nums[2] &lt;= nums[1]. Then mark index 2 and 1.
 * It can be shown that there's no other valid operation so the answer is 2.
 *
 * Example 2:
 *
 * Input: nums = [9,2,5,4]
 * Output: 4
 * Explanation: In the first operation: pick i = 3 and j = 0, the operation is allowed because 2 * nums[3] &lt;= nums[0]. Then mark index 3 and 0.
 * In the second operation: pick i = 1 and j = 2, the operation is allowed because 2 * nums[1] &lt;= nums[2]. Then mark index 1 and 2.
 * Since there is no other operation, the answer is 4.
 *
 * Example 3:
 *
 * Input: nums = [7,6,8]
 * Output: 0
 * Explanation: There is no valid operation to do, so the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about how to check that performing k operations is possible.
 * Hint 2: To perform k operations, it’s optimal to use the smallest k elements and the largest k elements and think about how to match them.
 * Hint 3: It’s optimal to match the ith smallest number with the k-i + 1 largest number.
 * Hint 4: Now we need to binary search on the answer and find the greatest possible valid k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-number-of-marked-indices/">LeetCode #2576</a>
 */
public class FindTheMaximumNumberOfMarkedIndices {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Maximum Number of Marked Indices");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMaximumNumberOfMarkedIndices ===");
        FindTheMaximumNumberOfMarkedIndices sol = new FindTheMaximumNumberOfMarkedIndices();
        System.out.println(sol.solve(null));
    }
}
