package org.leetcode.medium;


/**
 * <b>#3335 - Total Characters in String After Transformations I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Math, String, Dynamic Programming, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer t, representing the number of transformations to perform. In one transformation, every character in s is replaced according to the following rules:
 *
 *
 * If the character is 'z', replace it with the string "ab".
 *
 * Otherwise, replace it with the next character in the alphabet. For example, 'a' is replaced with 'b', 'b' is replaced with 'c', and so on.
 *
 * Return the length of the resulting string after exactly t transformations.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcyy", t = 2
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * First Transformation (t = 1):
 *
 *
 *
 *
 * 'a' becomes 'b'
 *
 * 'b' becomes 'c'
 *
 * 'c' becomes 'd'
 *
 * 'y' becomes 'z'
 *
 * 'y' becomes 'z'
 *
 * String after the first transformation: "bcdzz"
 *
 *
 *
 * Second Transformation (t = 2):
 *
 *
 *
 * 'b' becomes 'c'
 *
 * 'c' becomes 'd'
 *
 * 'd' becomes 'e'
 *
 * 'z' becomes "ab"
 *
 * 'z' becomes "ab"
 *
 * String after the second transformation: "cdeabab"
 *
 *
 *
 * Final Length of the string: The string is "cdeabab", which has 7 characters.
 *
 * Example 2:
 *
 * Input: s = "azbk", t = 1
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * First Transformation (t = 1):
 *
 *
 *
 *
 * 'a' becomes 'b'
 *
 * 'z' becomes "ab"
 *
 * 'b' becomes 'c'
 *
 * 'k' becomes 'l'
 *
 * String after the first transformation: "babcl"
 *
 *
 *
 * Final Length of the string: The string is "babcl", which has 5 characters.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists only of lowercase English letters.
 *
 * 1 &lt;= t &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain the frequency of each character.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, String, Dynamic Programming, Counting).
 *
 * @see <a href="https://leetcode.com/problems/total-characters-in-string-after-transformations-i/">LeetCode #3335</a>
 */
public class TotalCharactersInStringAfterTransformationsI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Total Characters in String After Transformations I");
    }

    public static void main(String[] args) {
        System.out.println("=== TotalCharactersInStringAfterTransformationsI ===");
        TotalCharactersInStringAfterTransformationsI sol = new TotalCharactersInStringAfterTransformationsI();
        System.out.println(sol.solve(null));
    }
}
