package org.leetcode.hard;


/**
 * <b>#3357 - Minimize the Maximum Adjacent Element Difference</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums. Some values in nums are missing and are denoted by -1.
 *
 *
 * You must choose a pair of positive integers (x, y) exactly once and replace each missing element with either x or y.
 *
 *
 * You need to minimize the maximum absolute difference between adjacent elements of nums after replacements.
 *
 *
 * Return the minimum possible difference.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,-1,10,8]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * By choosing the pair as (6, 7), nums can be changed to [1, 2, 6, 10, 8].
 *
 *
 * The absolute differences between adjacent elements are:
 *
 *
 * |1 - 2| == 1
 *
 * |2 - 6| == 4
 *
 * |6 - 10| == 4
 *
 * |10 - 8| == 2
 *
 * Example 2:
 *
 * Input: nums = [-1,-1,-1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * By choosing the pair as (4, 4), nums can be changed to [4, 4, 4].
 *
 * Example 3:
 *
 * Input: nums = [-1,10,-1,8]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * By choosing the pair as (11, 9), nums can be changed to [11, 10, 9, 8].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * nums[i] is either -1 or in the range [1, 109].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: More than 2 occurrences of -1 can be ignored.
 * Hint 2: We can add the first positive number to the beginning and the last positive number to the end so that any consecutive of -1s are surrounded by positive numbers.
 * Hint 3: Suppose the answer is <code>d</code>, it can be proved that for the optimal case we'll replace -1s with values <code>0 &lt; x &lt;= y</code> and it's always optimal to select <code>x = min(a) + d</code>. So we only need to select <code>y</code>.
 * Hint 4: Binary search on <code>d</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimize-the-maximum-adjacent-element-difference/">LeetCode #3357</a>
 */
public class MinimizeTheMaximumAdjacentElementDifference {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize the Maximum Adjacent Element Difference");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeTheMaximumAdjacentElementDifference ===");
        MinimizeTheMaximumAdjacentElementDifference sol = new MinimizeTheMaximumAdjacentElementDifference();
        System.out.println(sol.solve(null));
    }
}
