package org.leetcode.medium;


/**
 * <b>#3306 - Count of Substrings Containing Every Vowel and K Consonants II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word and a non-negative integer k.
 *
 *
 * Return the total number of substrings of word that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly k consonants.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aeioqq", k = 1
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There is no substring with every vowel.
 *
 * Example 2:
 *
 * Input: word = "aeiou", k = 0
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".
 *
 * Example 3:
 *
 * Input: word = "ieaouqqieaouqq", k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The substrings with every vowel and one consonant are:
 *
 *
 * word[0..5], which is "ieaouq".
 *
 * word[6..11], which is "qieaou".
 *
 * word[7..12], which is "ieaouq".
 *
 *
 *
 * Constraints:
 *
 *
 * 5 &lt;= word.length &lt;= 2 * 105
 *
 * word consists only of lowercase English letters.
 *
 * 0 &lt;= k &lt;= word.length - 5
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can use sliding window and binary search.
 * Hint 2: For each index <code>r</code>, find the maximum <code>l</code> such that both conditions are satisfied using binary search.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/">LeetCode #3306</a>
 */
public class CountOfSubstringsContainingEveryVowelAndKConsonantsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count of Substrings Containing Every Vowel and K Consonants II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountOfSubstringsContainingEveryVowelAndKConsonantsIi ===");
        CountOfSubstringsContainingEveryVowelAndKConsonantsIi sol = new CountOfSubstringsContainingEveryVowelAndKConsonantsIi();
        System.out.println(sol.solve(null));
    }
}
