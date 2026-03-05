package org.leetcode.medium;


/**
 * <b>#3639 - Minimum Time to Activate String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n and an integer array order, where order is a permutation of the numbers in the range [0, n - 1].
 *
 *
 * Starting from time t = 0, replace the character at index order[t] in s with '*' at each time step.
 *
 *
 * A substring is valid if it contains at least one '*'.
 *
 *
 * A string is active if the total number of valid substrings is greater than or equal to k.
 *
 *
 * Return the minimum time t at which the string s becomes active. If it is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", order = [1,0,2], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			t
 * 			order[t]
 * 			Modified s
 * 			Valid Substrings
 * 			Count
 * 			Active
 *
 * 			(Count &gt;= k)
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 * 			"a*c"
 * 			"*", "a*", "*c", "a*c"
 * 			4
 * 			Yes
 *
 *
 *
 *
 * The string s becomes active at t = 0. Thus, the answer is 0.
 *
 * Example 2:
 *
 * Input: s = "cat", order = [0,2,1], k = 6
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			t
 * 			order[t]
 * 			Modified s
 * 			Valid Substrings
 * 			Count
 * 			Active
 *
 * 			(Count &gt;= k)
 *
 *
 *
 *
 *
 *
 * 			0
 * 			0
 * 			"*at"
 * 			"*", "*a", "*at"
 * 			3
 * 			No
 *
 *
 *
 *
 * 			1
 * 			2
 * 			"*a*"
 * 			"*", "*a", "*a*", "a*", "*"
 * 			5
 * 			No
 *
 *
 *
 *
 * 			2
 * 			1
 * 			"***"
 * 			All substrings (contain '*')
 * 			6
 * 			Yes
 *
 *
 *
 *
 * The string s becomes active at t = 2. Thus, the answer is 2.
 *
 * Example 3:
 *
 * Input: s = "xy", order = [0,1], k = 4
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * Even after all replacements, it is impossible to obtain k = 4 valid substrings. Thus, the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length &lt;= 105
 *
 * order.length == n
 *
 * 0 &lt;= order[i] &lt;= n - 1
 *
 * s consists of lowercase English letters.
 *
 * order is a permutation of integers from 0 to n - 1.
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary-search on <code>t</code> and for each <code>t</code> mark the first <code>t+1</code> positions in <code>order</code> as <code>*</code>, then in one pass subtract from <code>n(n+1)/2</code> the substrings of each non-<code>*</code> run of length <code>L</code> (<code>L(L+1)/2</code>) and check if the remainder &gt;= <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-activate-string/">LeetCode #3639</a>
 */
public class MinimumTimeToActivateString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Activate String");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToActivateString ===");
        MinimumTimeToActivateString sol = new MinimumTimeToActivateString();
        System.out.println(sol.solve(null));
    }
}
