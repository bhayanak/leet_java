package org.leetcode.medium;


/**
 * <b>#3281 - Maximize Score of Numbers in Ranges</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers start and an integer d, representing n intervals [start[i], start[i] + d].
 *
 *
 * You are asked to choose n integers where the ith integer must belong to the ith interval. The score of the chosen integers is defined as the minimum absolute difference between any two integers that have been chosen.
 *
 *
 * Return the maximum possible score of the chosen integers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: start = [6,0,3], d = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The maximum possible score can be obtained by choosing integers: 8, 0, and 4. The score of these chosen integers is min(|8 - 0|, |8 - 4|, |0 - 4|) which equals 4.
 *
 * Example 2:
 *
 * Input: start = [2,6,13,13], d = 5
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The maximum possible score can be obtained by choosing integers: 2, 7, 13, and 18. The score of these chosen integers is min(|2 - 7|, |2 - 13|, |2 - 18|, |7 - 13|, |7 - 18|, |13 - 18|) which equals 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= start.length &lt;= 105
 *
 * 0 &lt;= start[i] &lt;= 109
 *
 * 0 &lt;= d &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use binary search here?
 * Hint 2: Suppose that the answer is <code>x</code>. We can find a valid configuration of integers by sorting <code>start</code>, the first integer should be <code>start[0]</code>, then each subsequent integer should be the smallest one in <code>[start[i], start[i] + d]</code> that is greater than <code>last_chosen_value + x</code>.
 * Hint 3: Binary search over <code>x</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-score-of-numbers-in-ranges/">LeetCode #3281</a>
 */
public class MaximizeScoreOfNumbersInRanges {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Score of Numbers in Ranges");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeScoreOfNumbersInRanges ===");
        MaximizeScoreOfNumbersInRanges sol = new MaximizeScoreOfNumbersInRanges();
        System.out.println(sol.solve(null));
    }
}
