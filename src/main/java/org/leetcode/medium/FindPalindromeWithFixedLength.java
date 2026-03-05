package org.leetcode.medium;


/**
 * <b>#2217 - Find Palindrome With Fixed Length</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array queries and a positive integer intLength, return an array answer where answer[i] is either the queries[i]th smallest positive palindrome of length intLength or -1 if no such palindrome exists.
 *
 *
 * A palindrome is a number that reads the same backwards and forwards. Palindromes cannot have leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = [1,2,3,4,5,90], intLength = 3
 * Output: [101,111,121,131,141,999]
 * Explanation:
 * The first few palindromes of length 3 are:
 * 101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202, ...
 * The 90th palindrome of length 3 is 999.
 *
 * Example 2:
 *
 * Input: queries = [2,4,6], intLength = 4
 * Output: [1111,1331,1551]
 * Explanation:
 * The first six palindromes of length 4 are:
 * 1001, 1111, 1221, 1331, 1441, and 1551.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length &lt;= 5 * 104
 *
 * 1 &lt;= queries[i] &lt;= 109
 *
 * 1 &lt;= intLength &lt;= 15
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For any value of queries[i] and intLength, how can you check if there exists at least queries[i] palindromes of length intLength?
 * Hint 2: Since a palindrome reads the same forwards and backwards, consider how you can efficiently find the first half (ceil(intLength/2) digits) of the palindrome.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/find-palindrome-with-fixed-length/">LeetCode #2217</a>
 */
public class FindPalindromeWithFixedLength {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Palindrome With Fixed Length");
    }

    public static void main(String[] args) {
        System.out.println("=== FindPalindromeWithFixedLength ===");
        FindPalindromeWithFixedLength sol = new FindPalindromeWithFixedLength();
        System.out.println(sol.solve(null));
    }
}
