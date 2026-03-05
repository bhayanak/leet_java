package org.leetcode.hard;


/**
 * <b>#3405 - Count the Number of Arrays with K Matching Adjacent Elements</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers n, m, k. A good array arr of size n is defined as follows:
 *
 *
 * Each element in arr is in the inclusive range [1, m].
 *
 * Exactly k indices i (where 1 &lt;= i &lt; n) satisfy the condition arr[i - 1] == arr[i].
 *
 * Return the number of good arrays that can be formed.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, m = 2, k = 1
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * There are 4 good arrays. They are [1, 1, 2], [1, 2, 2], [2, 1, 1] and [2, 2, 1].
 *
 * Hence, the answer is 4.
 *
 * Example 2:
 *
 * Input: n = 4, m = 2, k = 2
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The good arrays are [1, 1, 1, 2], [1, 1, 2, 2], [1, 2, 2, 2], [2, 1, 1, 1], [2, 2, 1, 1] and [2, 2, 2, 1].
 *
 * Hence, the answer is 6.
 *
 * Example 3:
 *
 * Input: n = 5, m = 2, k = 0
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The good arrays are [1, 2, 1, 2, 1] and [2, 1, 2, 1, 2]. Hence, the answer is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= m &lt;= 105
 *
 * 0 &lt;= k &lt;= n - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The first position <code>arr[0]</code> has <code>m</code> choices.
 * Hint 2: For each of the remaining <code>n - 1</code> indices, <code>0 &lt; i &lt; n</code>, select <code>k</code> positions from left to right and set <code>arr[i] = arr[i - 1]</code>.
 * Hint 3: For all other indices, <code>set arr[i] != arr[i - 1]</code> with (<code>m - 1</code>) choices for each of the <code>n - 1 - k</code> positions.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-arrays-with-k-matching-adjacent-elements/">LeetCode #3405</a>
 */
public class CountTheNumberOfArraysWithKMatchingAdjacentElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Arrays with K Matching Adjacent Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfArraysWithKMatchingAdjacentElements ===");
        CountTheNumberOfArraysWithKMatchingAdjacentElements sol = new CountTheNumberOfArraysWithKMatchingAdjacentElements();
        System.out.println(sol.solve(null));
    }
}
