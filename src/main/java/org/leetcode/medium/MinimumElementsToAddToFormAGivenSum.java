package org.leetcode.medium;


/**
 * <b>#1785 - Minimum Elements to Add to Form a Given Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two integers limit and goal. The array nums has an interesting property that abs(nums[i]) &lt;= limit.
 *
 *
 * Return the minimum number of elements you need to add to make the sum of the array equal to goal. The array must maintain its property that abs(nums[i]) &lt;= limit.
 *
 *
 * Note that abs(x) equals x if x &gt;= 0, and -x otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-1,1], limit = 3, goal = -4
 * Output: 2
 * Explanation: You can add -2 and -3, then the sum of the array will be 1 - 1 + 1 - 2 - 3 = -4.
 *
 * Example 2:
 *
 * Input: nums = [1,-10,9,1], limit = 100, goal = 0
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= limit &lt;= 106
 *
 * -limit &lt;= nums[i] &lt;= limit
 *
 * -109 &lt;= goal &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try thinking about the problem as if the array is empty. Then you only need to form goal using elements whose absolute value is &lt;= limit.
 * Hint 2: You can greedily set all of the elements except one to limit or -limit, so the number of elements you need is ceil(abs(goal)/ limit).
 * Hint 3: You can "normalize" goal by offsetting it by the sum of the array. For example, if the goal is 5 and the sum is -3, then it's exactly the same as if the goal is 8 and the array is empty.
 * Hint 4: The answer is ceil(abs(goal-sum)/limit) = (abs(goal-sum)+limit-1) / limit.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-elements-to-add-to-form-a-given-sum/">LeetCode #1785</a>
 */
public class MinimumElementsToAddToFormAGivenSum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Elements to Add to Form a Given Sum");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumElementsToAddToFormAGivenSum ===");
        MinimumElementsToAddToFormAGivenSum sol = new MinimumElementsToAddToFormAGivenSum();
        System.out.println(sol.solve(null));
    }
}
