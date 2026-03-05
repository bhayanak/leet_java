package org.leetcode.hard;


/**
 * <b>#2272 - Substring With Largest Variance</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters present in the string. Note the two characters may or may not be the same.
 *
 *
 * Given a string s consisting of lowercase English letters only, return the largest variance possible among all substrings of s.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aababbb"
 * Output: 3
 * Explanation:
 * All possible variances along with their respective substrings are listed below:
 * - Variance 0 for substrings "a", "aa", "ab", "abab", "aababb", "ba", "b", "bb", and "bbb".
 * - Variance 1 for substrings "aab", "aba", "abb", "aabab", "ababb", "aababbb", and "bab".
 * - Variance 2 for substrings "aaba", "ababbb", "abbb", and "babb".
 * - Variance 3 for substring "babbb".
 * Since the largest possible variance is 3, we return it.
 *
 * Example 2:
 *
 * Input: s = "abcde"
 * Output: 0
 * Explanation:
 * No letter occurs more than once in s, so the variance of every substring is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 104
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about how to solve the problem if the string had only two distinct characters.
 * Hint 2: If we replace all occurrences of the first character by +1 and those of the second character by -1, can we efficiently calculate the largest possible variance of a string with only two distinct characters?
 * Hint 3: Now, try finding the optimal answer by taking all possible pairs of characters into consideration.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/substring-with-largest-variance/">LeetCode #2272</a>
 */
public class SubstringWithLargestVariance {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Substring With Largest Variance");
    }

    public static void main(String[] args) {
        System.out.println("=== SubstringWithLargestVariance ===");
        SubstringWithLargestVariance sol = new SubstringWithLargestVariance();
        System.out.println(sol.solve(null));
    }
}
