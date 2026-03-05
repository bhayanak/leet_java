package org.leetcode.medium;


/**
 * <b>#1433 - Check If a String Can Break Another String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings: s1 and s2 with the same size, check if some permutation of string s1 can break some permutation of string s2 or vice-versa. In other words s2 can break s1 or vice-versa.
 *
 *
 * A string x can break string y (both of size n) if x[i] &gt;= y[i] (in alphabetical order) for all i between 0 and n-1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "abc", s2 = "xya"
 * Output: true
 * Explanation: "ayx" is a permutation of s2="xya" which can break to string "abc" which is a permutation of s1="abc".
 *
 * Example 2:
 *
 * Input: s1 = "abe", s2 = "acd"
 * Output: false 
 * Explanation: All permutations for s1="abe" are: "abe", "aeb", "bae", "bea", "eab" and "eba" and all permutation for s2="acd" are: "acd", "adc", "cad", "cda", "dac" and "dca". However, there is not any permutation from s1 which can break some permutation from s2 and vice-versa.
 *
 * Example 3:
 *
 * Input: s1 = "leetcodee", s2 = "interview"
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * s1.length == n
 *
 * s2.length == n
 *
 * 1 &lt;= n &lt;= 10^5
 *
 * All strings consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort both strings and then check if one of them can break the other.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-a-string-can-break-another-string/">LeetCode #1433</a>
 */
public class CheckIfAStringCanBreakAnotherString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check If a String Can Break Another String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfAStringCanBreakAnotherString ===");
        CheckIfAStringCanBreakAnotherString sol = new CheckIfAStringCanBreakAnotherString();
        System.out.println(sol.solve(null));
    }
}
