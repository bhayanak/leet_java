package org.leetcode.medium;


/**
 * <b>#2817 - Minimum Absolute Difference Between Elements With Constraint</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer x.
 *
 *
 * Find the minimum absolute difference between two elements in the array that are at least x indices apart.
 *
 *
 * In other words, find two indices i and j such that abs(i - j) &gt;= x and abs(nums[i] - nums[j]) is minimized.
 *
 *
 * Return an integer denoting the minimum absolute difference between two elements that are at least x indices apart.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,4], x = 2
 * Output: 0
 * Explanation: We can select nums[0] = 4 and nums[3] = 4. 
 * They are at least 2 indices apart, and their absolute difference is the minimum, 0. 
 * It can be shown that 0 is the optimal answer.
 *
 * Example 2:
 *
 * Input: nums = [5,3,2,10,15], x = 1
 * Output: 1
 * Explanation: We can select nums[1] = 3 and nums[2] = 2.
 * They are at least 1 index apart, and their absolute difference is the minimum, 1.
 * It can be shown that 1 is the optimal answer.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4], x = 3
 * Output: 3
 * Explanation: We can select nums[0] = 1 and nums[3] = 4.
 * They are at least 3 indices apart, and their absolute difference is the minimum, 3.
 * It can be shown that 3 is the optimal answer.
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
 * 0 &lt;= x &lt; nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Let's only consider the cases where <code>i &lt; j</code>, as the problem is symmetric.</div>
 * Hint 2: <div class="_1l1MA">For an index <code>j</code>, we are interested in an index <code>i</code> in the range <code>[0, j - x]</code> that minimizes <code>abs(nums[i] - nums[j])</code>.</div>
 * Hint 3: <div class="_1l1MA">For every index <code>j</code>, while going from left to right, add <code>nums[j - x]</code> to a set (C++ set, Java TreeSet, and Python sorted set).</div>
 * Hint 4: <div class="_1l1MA">After inserting <code>nums[j - x]</code>, we can calculate the closest value to <code>nums[j]</code> in the set using binary search and store the absolute difference. In C++, we can achieve this by using lower_bound and/or upper_bound.</div>
 * Hint 5: <div class="_1l1MA">Calculate the minimum absolute difference among all indices.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/minimum-absolute-difference-between-elements-with-constraint/">LeetCode #2817</a>
 */
public class MinimumAbsoluteDifferenceBetweenElementsWithConstraint {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Absolute Difference Between Elements With Constraint");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumAbsoluteDifferenceBetweenElementsWithConstraint ===");
        MinimumAbsoluteDifferenceBetweenElementsWithConstraint sol = new MinimumAbsoluteDifferenceBetweenElementsWithConstraint();
        System.out.println(sol.solve(null));
    }
}
