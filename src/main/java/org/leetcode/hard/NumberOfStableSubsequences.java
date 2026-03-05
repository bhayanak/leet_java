package org.leetcode.hard;


/**
 * <b>#3686 - Number of Stable Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A subsequence is stable if it does not contain three consecutive elements with the same parity when the subsequence is read in order (i.e., consecutive inside the subsequence).
 *
 *
 * Return the number of stable subsequences.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Stable subsequences are [1], [3], [5], [1, 3], [1, 5], and [3, 5].
 *
 * Subsequence [1, 3, 5] is not stable because it contains three consecutive odd numbers. Thus, the answer is 6.
 *
 * Example 2:
 *
 * Input: nums = [2,3,4,2]
 *
 *
 * Output: 14
 *
 *
 * Explanation:
 *
 *
 * The only subsequence that is not stable is [2, 4, 2], which contains three consecutive even numbers.
 *
 * All other subsequences are stable. Thus, the answer is 14.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 10​​​​​​​5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Any subsequence of length 1 or 2 is always stable.
 * Hint 2: A subsequence becomes invalid only if you add a third consecutive element of the same parity.
 * Hint 3: Use DP tracking the last element’s parity and how many consecutive of that parity you have (1 or 2).
 * Hint 4: For each new number, either start a new subsequence, extend with same parity (if <code>count &lt; 2</code>), or extend with different parity (reset count = 1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/number-of-stable-subsequences/">LeetCode #3686</a>
 */
public class NumberOfStableSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Stable Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfStableSubsequences ===");
        NumberOfStableSubsequences sol = new NumberOfStableSubsequences();
        System.out.println(sol.solve(null));
    }
}
