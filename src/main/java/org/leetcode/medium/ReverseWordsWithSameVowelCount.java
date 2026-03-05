package org.leetcode.medium;


/**
 * <b>#3775 - Reverse Words With Same Vowel Count</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English words, each separated by a single space.
 *
 *
 * Determine how many vowels appear in the first word. Then, reverse each following word that has the same vowel count. Leave all remaining words unchanged.
 *
 *
 * Return the resulting string.
 *
 *
 * Vowels are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cat and mice"
 *
 *
 * Output: "cat dna mice"
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * The first word "cat" has 1 vowel.
 *
 * "and" has 1 vowel, so it is reversed to form "dna".
 *
 * "mice" has 2 vowels, so it remains unchanged.
 *
 * Thus, the resulting string is "cat dna mice".
 *
 * Example 2:
 *
 * Input: s = "book is nice"
 *
 *
 * Output: "book is ecin"
 *
 *
 * Explanation:
 *
 *
 * The first word "book" has 2 vowels.
 *
 * "is" has 1 vowel, so it remains unchanged.
 *
 * "nice" has 2 vowels, so it is reversed to form "ecin".
 *
 * Thus, the resulting string is "book is ecin".
 *
 * Example 3:
 *
 * Input: s = "banana healthy"
 *
 *
 * Output: "banana healthy"
 *
 *
 * Explanation:
 *
 *
 * The first word "banana" has 3 vowels.
 *
 * "healthy" has 2 vowels, so it remains unchanged.
 *
 * Thus, the resulting string is "banana healthy".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters and spaces.
 *
 * Words in s are separated by a single space.
 *
 * s does not contain leading or trailing spaces.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate as described
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/reverse-words-with-same-vowel-count/">LeetCode #3775</a>
 */
public class ReverseWordsWithSameVowelCount {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reverse Words With Same Vowel Count");
    }

    public static void main(String[] args) {
        System.out.println("=== ReverseWordsWithSameVowelCount ===");
        ReverseWordsWithSameVowelCount sol = new ReverseWordsWithSameVowelCount();
        System.out.println(sol.solve(null));
    }
}
