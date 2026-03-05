package org.leetcode.hard;


/**
 * <b>#3261 - Count Substrings That Satisfy K-Constraint II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Binary Search, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s and an integer k.
 *
 *
 * You are also given a 2D integer array queries, where queries[i] = [li, ri].
 *
 *
 * A binary string satisfies the k-constraint if either of the following conditions holds:
 *
 *
 * The number of 0's in the string is at most k.
 *
 * The number of 1's in the string is at most k.
 *
 * Return an integer array answer, where answer[i] is the number of substrings of s[li..ri] that satisfy the k-constraint.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "0001111", k = 2, queries = [[0,6]]
 *
 *
 * Output: [26]
 *
 *
 * Explanation:
 *
 *
 * For the query [0, 6], all substrings of s[0..6] = "0001111" satisfy the k-constraint except for the substrings s[0..5] = "000111" and s[0..6] = "0001111".
 *
 * Example 2:
 *
 * Input: s = "010101", k = 1, queries = [[0,5],[1,4],[2,3]]
 *
 *
 * Output: [15,9,3]
 *
 *
 * Explanation:
 *
 *
 * The substrings of s with a length greater than 3 do not satisfy the k-constraint.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is either '0' or '1'.
 *
 * 1 &lt;= k &lt;= s.length
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i] == [li, ri]
 *
 * 0 &lt;= li &lt;= ri &lt; s.length
 *
 * All queries are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Answering online queries is tough. Try to answer them offline since the queries are known beforehand.
 * Hint 2: For each index, how do you calculate the left boundary so that the given condition is satisfied?
 * Hint 3: Using the precomputed left boundaries and a range data structure, you can now answer the queries optimally.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Binary Search, Sliding Window, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-ii/">LeetCode #3261</a>
 */
public class CountSubstringsThatSatisfyKConstraintIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Substrings That Satisfy K-Constraint II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubstringsThatSatisfyKConstraintIi ===");
        CountSubstringsThatSatisfyKConstraintIi sol = new CountSubstringsThatSatisfyKConstraintIi();
        System.out.println(sol.solve(null));
    }
}
