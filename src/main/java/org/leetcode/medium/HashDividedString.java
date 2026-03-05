package org.leetcode.medium;


/**
 * <b>#3271 - Hash Divided String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n and an integer k, where n is a multiple of k. Your task is to hash the string s into a new string called result, which has a length of n / k.
 *
 *
 * First, divide s into n / k substrings, each with a length of k. Then, initialize result as an empty string.
 *
 *
 * For each substring in order from the beginning:
 *
 *
 * The hash value of a character is the index of that character in the English alphabet (e.g., 'a' → 0, 'b' → 1, ..., 'z' → 25).
 *
 * Calculate the sum of all the hash values of the characters in the substring.
 *
 * Find the remainder of this sum when divided by 26, which is called hashedChar.
 *
 * Identify the character in the English lowercase alphabet that corresponds to hashedChar.
 *
 * Append that character to the end of result.
 *
 * Return result.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", k = 2
 *
 *
 * Output: "bf"
 *
 *
 * Explanation:
 *
 *
 * First substring: "ab", 0 + 1 = 1, 1 % 26 = 1, result[0] = 'b'.
 *
 *
 * Second substring: "cd", 2 + 3 = 5, 5 % 26 = 5, result[1] = 'f'.
 *
 * Example 2:
 *
 * Input: s = "mxz", k = 3
 *
 *
 * Output: "i"
 *
 *
 * Explanation:
 *
 *
 * The only substring: "mxz", 12 + 23 + 25 = 60, 60 % 26 = 8, result[0] = 'i'.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= 100
 *
 * k &lt;= s.length &lt;= 1000
 *
 * s.length is divisible by k.
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to find each substring.
 * Hint 2: Use a for loop to find <code>hashedChar</code> of each substring.
 * Hint 3: Find the answer using <code>hashedChar</code> of each substring.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/hash-divided-string/">LeetCode #3271</a>
 */
public class HashDividedString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Hash Divided String");
    }

    public static void main(String[] args) {
        System.out.println("=== HashDividedString ===");
        HashDividedString sol = new HashDividedString();
        System.out.println(sol.solve(null));
    }
}
