package org.leetcode.medium;


/**
 * <b>#2063 - Vowels of All Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string word, return the sum of the number of vowels ('a', 'e', 'i', 'o', and 'u') in every substring of word.
 *
 *
 * A substring is a contiguous (non-empty) sequence of characters within a string.
 *
 *
 * Note: Due to the large constraints, the answer may not fit in a signed 32-bit integer. Please be careful during the calculations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aba"
 * Output: 6
 * Explanation: 
 * All possible substrings are: "a", "ab", "aba", "b", "ba", and "a".
 * - "b" has 0 vowels in it
 * - "a", "ab", "ba", and "a" have 1 vowel each
 * - "aba" has 2 vowels in it
 * Hence, the total sum of vowels = 0 + 1 + 1 + 1 + 1 + 2 = 6. 
 *
 * Example 2:
 *
 * Input: word = "abc"
 * Output: 3
 * Explanation: 
 * All possible substrings are: "a", "ab", "abc", "b", "bc", and "c".
 * - "a", "ab", and "abc" have 1 vowel each
 * - "b", "bc", and "c" have 0 vowels each
 * Hence, the total sum of vowels = 1 + 1 + 1 + 0 + 0 + 0 = 3.
 *
 * Example 3:
 *
 * Input: word = "ltcd"
 * Output: 0
 * Explanation: There are no vowels in any substring of "ltcd".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 105
 *
 * word consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since generating substrings is not an option, can we count the number of substrings a vowel appears in?
 * Hint 2: How much does each vowel contribute to the total sum?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/vowels-of-all-substrings/">LeetCode #2063</a>
 */
public class VowelsOfAllSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Vowels of All Substrings");
    }

    public static void main(String[] args) {
        System.out.println("=== VowelsOfAllSubstrings ===");
        VowelsOfAllSubstrings sol = new VowelsOfAllSubstrings();
        System.out.println(sol.solve(null));
    }
}
