package org.leetcode.medium;


/**
 * <b>#3796 - Find Maximum Value in a Constrained Sequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n, a 2D integer array restrictions, and an integer array diff of length n - 1. Your task is to construct a sequence of length n, denoted by a[0], a[1], ..., a[n - 1], such that it satisfies the following conditions:
 *
 *
 * a[0] is 0.
 *
 * All elements in the sequence are non-negative.
 *
 * For every index i (0 &lt;= i &lt;= n - 2), abs(a[i] - a[i + 1]) &lt;= diff[i].
 *
 * For each restrictions[i] = [idx, maxVal], the value at position idx in the sequence must not exceed maxVal (i.e., a[idx] &lt;= maxVal).
 *
 * Your goal is to construct a valid sequence that maximizes the largest value within the sequence while satisfying all the above conditions.
 *
 *
 * Return an integer denoting the largest value present in such an optimal sequence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 10, restrictions = [[3,1],[8,1]], diff = [2,2,3,1,4,5,1,1,2]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The sequence a = [0, 2, 4, 1, 2, 6, 2, 1, 1, 3] satisfies the given constraints (a[3] &lt;= 1 and a[8] &lt;= 1).
 *
 * The maximum value in the sequence is 6.
 *
 * Example 2:
 *
 * Input: n = 8, restrictions = [[3,2]], diff = [3,5,2,4,2,3,1]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The sequence a = [0, 3, 3, 2, 6, 8, 11, 12] satisfies the given constraints (a[3] &lt;= 2).
 *
 * The maximum value in the sequence is 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= restrictions.length &lt;= n - 1
 *
 * restrictions[i].length == 2
 *
 * restrictions[i] = [idx, maxVal]
 *
 * 1 &lt;= idx &lt; n
 *
 * 1 &lt;= maxVal &lt;= 106
 *
 * diff.length == n - 1
 *
 * 1 &lt;= diff[i] &lt;= 10
 *
 * The values of restrictions[i][0] are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be solved greedily.
 * Hint 2: Any restriction at index <code>i</code> also indirectly limits nearby positions due to the cumulative <code>diff</code> bounds.
 * Hint 3: The maximum possible value at each index is the minimum of all bounds propagated from the left and from the right.
 * Hint 4: Once all upper bounds are fixed, the answer is simply the maximum value among them.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/find-maximum-value-in-a-constrained-sequence/">LeetCode #3796</a>
 */
public class FindMaximumValueInAConstrainedSequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Maximum Value in a Constrained Sequence");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMaximumValueInAConstrainedSequence ===");
        FindMaximumValueInAConstrainedSequence sol = new FindMaximumValueInAConstrainedSequence();
        System.out.println(sol.solve(null));
    }
}
