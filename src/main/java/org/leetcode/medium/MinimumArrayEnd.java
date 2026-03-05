package org.leetcode.medium;


/**
 * <b>#3133 - Minimum Array End</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers n and x. You have to construct an array of positive integers nums of size n where for every 0 &lt;= i &lt; n - 1, nums[i + 1] is greater than nums[i], and the result of the bitwise AND operation between all elements of nums is x.
 *
 *
 * Return the minimum possible value of nums[n - 1].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, x = 4
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * nums can be [4,5,6] and its last element is 6.
 *
 * Example 2:
 *
 * Input: n = 2, x = 7
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * nums can be [7,15] and its last element is 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, x &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each element of the array should be obtained by “merging” <code>x</code> and <code>v</code> where <code>v = 0, 1, 2, …(n - 1)</code>.
 * Hint 2: To merge <code>x</code> with another number <code>v</code>, keep the set bits of <code>x</code> untouched, for all the other bits, fill the set bits of <code>v</code> from right to left in order one by one.
 * Hint 3: So the final answer is the “merge” of <code>x</code> and <code>n - 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimum-array-end/">LeetCode #3133</a>
 */
public class MinimumArrayEnd {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Array End");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumArrayEnd ===");
        MinimumArrayEnd sol = new MinimumArrayEnd();
        System.out.println(sol.solve(null));
    }
}
