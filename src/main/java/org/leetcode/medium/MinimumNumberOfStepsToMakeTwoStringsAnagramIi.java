package org.leetcode.medium;


/**
 * <b>#2186 - Minimum Number of Steps to Make Two Strings Anagram II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and t. In one step, you can append any character to either s or t.
 *
 *
 * Return the minimum number of steps to make s and t anagrams of each other.
 *
 *
 * An anagram of a string is a string that contains the same characters with a different (or the same) ordering.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode", t = "coats"
 * Output: 7
 * Explanation: 
 * - In 2 steps, we can append the letters in "as" onto s = "leetcode", forming s = "leetcodeas".
 * - In 5 steps, we can append the letters in "leede" onto t = "coats", forming t = "coatsleede".
 * "leetcodeas" and "coatsleede" are now anagrams of each other.
 * We used a total of 2 + 5 = 7 steps.
 * It can be shown that there is no way to make them anagrams of each other with less than 7 steps.
 *
 * Example 2:
 *
 * Input: s = "night", t = "thing"
 * Output: 0
 * Explanation: The given strings are already anagrams of each other. Thus, we do not need any further steps.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 2 * 105
 *
 * s and t consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that for anagrams, the order of the letters is irrelevant.
 * Hint 2: For each letter, we can count its frequency in s and t.
 * Hint 3: For each letter, its contribution to the answer is the absolute difference between its frequency in s and t.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram-ii/">LeetCode #2186</a>
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagramIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Steps to Make Two Strings Anagram II");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfStepsToMakeTwoStringsAnagramIi ===");
        MinimumNumberOfStepsToMakeTwoStringsAnagramIi sol = new MinimumNumberOfStepsToMakeTwoStringsAnagramIi();
        System.out.println(sol.solve(null));
    }
}
