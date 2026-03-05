package org.leetcode.medium;


/**
 * <b>#2840 - Check if Strings Can be Made Equal With Operations II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s1 and s2, both of length n, consisting of lowercase English letters.
 *
 *
 * You can apply the following operation on any of the two strings any number of times:
 *
 *
 * Choose any two indices i and j such that i &lt; j and the difference j - i is even, then swap the two characters at those indices in the string.
 *
 * Return true if you can make the strings s1 and s2 equal, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "abcdba", s2 = "cabdab"
 * Output: true
 * Explanation: We can apply the following operations on s1:
 * - Choose the indices i = 0, j = 2. The resulting string is s1 = "cbadba".
 * - Choose the indices i = 2, j = 4. The resulting string is s1 = "cbbdaa".
 * - Choose the indices i = 1, j = 5. The resulting string is s1 = "cabdab" = s2.
 *
 * Example 2:
 *
 * Input: s1 = "abe", s2 = "bea"
 * Output: false
 * Explanation: It is not possible to make the two strings equal.
 *
 *
 *
 * Constraints:
 *
 *
 * n == s1.length == s2.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * s1 and s2 consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Characters in two positions can be swapped if and only if the two positions have the same parity.</div>
 * Hint 2: <div class="_1l1MA">To be able to make the two strings equal, the characters at even and odd positions in the strings should be the same.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/check-if-strings-can-be-made-equal-with-operations-ii/">LeetCode #2840</a>
 */
public class CheckIfStringsCanBeMadeEqualWithOperationsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if Strings Can be Made Equal With Operations II");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfStringsCanBeMadeEqualWithOperationsIi ===");
        CheckIfStringsCanBeMadeEqualWithOperationsIi sol = new CheckIfStringsCanBeMadeEqualWithOperationsIi();
        System.out.println(sol.solve(null));
    }
}
