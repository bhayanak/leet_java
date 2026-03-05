package org.leetcode.medium;


/**
 * <b>#3592 - Inverse Coin Change</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 1-indexed integer array numWays, where numWays[i] represents the number of ways to select a total amount i using an infinite supply of some fixed coin denominations. Each denomination is a positive integer with value at most numWays.length.
 *
 *
 * However, the exact coin denominations have been lost. Your task is to recover the set of denominations that could have resulted in the given numWays array.
 *
 *
 * Return a sorted array containing unique integers which represents this set of denominations.
 *
 *
 * If no such set exists, return an empty array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numWays = [0,1,0,2,0,3,0,4,0,5]
 *
 *
 * Output: [2,4,6]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Amount
 * 			Number of ways
 * 			Explanation
 *
 *
 *
 *
 * 			1
 * 			0
 * 			There is no way to select coins with total value 1.
 *
 *
 *
 *
 * 			2
 * 			1
 * 			The only way is [2].
 *
 *
 *
 *
 * 			3
 * 			0
 * 			There is no way to select coins with total value 3.
 *
 *
 *
 *
 * 			4
 * 			2
 * 			The ways are [2, 2] and [4].
 *
 *
 *
 *
 * 			5
 * 			0
 * 			There is no way to select coins with total value 5.
 *
 *
 *
 *
 * 			6
 * 			3
 * 			The ways are [2, 2, 2], [2, 4], and [6].
 *
 *
 *
 *
 * 			7
 * 			0
 * 			There is no way to select coins with total value 7.
 *
 *
 *
 *
 * 			8
 * 			4
 * 			The ways are [2, 2, 2, 2], [2, 2, 4], [2, 6], and [4, 4].
 *
 *
 *
 *
 * 			9
 * 			0
 * 			There is no way to select coins with total value 9.
 *
 *
 *
 *
 * 			10
 * 			5
 * 			The ways are [2, 2, 2, 2, 2], [2, 2, 2, 4], [2, 4, 4], [2, 2, 6], and [4, 6].
 *
 *
 *
 *
 * Example 2:
 *
 * Input: numWays = [1,2,2,3,4]
 *
 *
 * Output: [1,2,5]
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Amount
 * 			Number of ways
 * 			Explanation
 *
 *
 *
 *
 * 			1
 * 			1
 * 			The only way is [1].
 *
 *
 *
 *
 * 			2
 * 			2
 * 			The ways are [1, 1] and [2].
 *
 *
 *
 *
 * 			3
 * 			2
 * 			The ways are [1, 1, 1] and [1, 2].
 *
 *
 *
 *
 * 			4
 * 			3
 * 			The ways are [1, 1, 1, 1], [1, 1, 2], and [2, 2].
 *
 *
 *
 *
 * 			5
 * 			4
 * 			The ways are [1, 1, 1, 1, 1], [1, 1, 1, 2], [1, 2, 2], and [5].
 *
 *
 *
 *
 * Example 3:
 *
 * Input: numWays = [1,2,3,4,15]
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * No set of denomination satisfies this array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= numWays.length &lt;= 100
 *
 * 0 &lt;= numWays[i] &lt;= 2 * 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Observe that for the smallest denomination <code>c</code>, you must have <code>numWays[c] == 1</code>.
 * Hint 2: Find the smallest <code>c &gt; 0</code> with <code>numWays[c] == 1</code> and append <code>c</code> to your <code>ans</code> list.
 * Hint 3: "Remove" that coin’s contribution by doing, for each <code>s</code> from <code>c</code> up to <code>n</code>: numWays[s] -= numWays[s - c]
 * Hint 4: Repeat: pick the next smallest <code>c</code> with <code>numWays[c] == 1</code>, remove it, and so on.
 * Hint 5: At the end, if <code>numWays</code> is all zeros, your <code>ans</code> is valid; otherwise, return an empty array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/inverse-coin-change/">LeetCode #3592</a>
 */
public class InverseCoinChange {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Inverse Coin Change");
    }

    public static void main(String[] args) {
        System.out.println("=== InverseCoinChange ===");
        InverseCoinChange sol = new InverseCoinChange();
        System.out.println(sol.solve(null));
    }
}
