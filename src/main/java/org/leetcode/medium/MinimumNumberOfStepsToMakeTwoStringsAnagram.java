package org.leetcode.medium;


/**
 * <b>#1347 - Minimum Number of Steps to Make Two Strings Anagram</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.
 *
 *
 * Return the minimum number of steps to make t an anagram of s.
 *
 *
 * An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "bab", t = "aba"
 * Output: 1
 * Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
 *
 * Example 2:
 *
 * Input: s = "leetcode", t = "practice"
 * Output: 5
 * Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
 *
 * Example 3:
 *
 * Input: s = "anagram", t = "mangaar"
 * Output: 0
 * Explanation: "anagram" and "mangaar" are anagrams. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 5 * 104
 *
 * s.length == t.length
 *
 * s and t consist of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of characters of each string.
 * Hint 2: Loop over all characters if the frequency of a character in t is less than the frequency of the same character in s then add the difference between the frequencies to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/">LeetCode #1347</a>
 */
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Steps to Make Two Strings Anagram");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfStepsToMakeTwoStringsAnagram ===");
        MinimumNumberOfStepsToMakeTwoStringsAnagram sol = new MinimumNumberOfStepsToMakeTwoStringsAnagram();
        System.out.println(sol.solve(null));
    }
}
