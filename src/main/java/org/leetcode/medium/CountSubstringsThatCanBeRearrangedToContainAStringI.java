package org.leetcode.medium;


/**
 * <b>#3297 - Count Substrings That Can Be Rearranged to Contain a String I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings word1 and word2.
 *
 *
 * A string x is called valid if x can be rearranged to have word2 as a prefix.
 *
 *
 * Return the total number of valid substrings of word1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "bcca", word2 = "abc"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only valid substring is "bcca" which can be rearranged to "abcc" having "abc" as a prefix.
 *
 * Example 2:
 *
 * Input: word1 = "abcabc", word2 = "abc"
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * All the substrings except substrings of size 1 and size 2 are valid.
 *
 * Example 3:
 *
 * Input: word1 = "abcabc", word2 = "aaabc"
 *
 *
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word1.length &lt;= 105
 *
 * 1 &lt;= word2.length &lt;= 104
 *
 * word1 and word2 consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store the frequency of each character for all prefixes.
 * Hint 2: Use Binary Search.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-substrings-that-can-be-rearranged-to-contain-a-string-i/">LeetCode #3297</a>
 */
public class CountSubstringsThatCanBeRearrangedToContainAStringI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Substrings That Can Be Rearranged to Contain a String I");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubstringsThatCanBeRearrangedToContainAStringI ===");
        CountSubstringsThatCanBeRearrangedToContainAStringI sol = new CountSubstringsThatCanBeRearrangedToContainAStringI();
        System.out.println(sol.solve(null));
    }
}
