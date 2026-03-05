package org.leetcode.hard;


/**
 * <b>#2953 - Count Complete Substrings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word and an integer k.
 *
 *
 * A substring s of word is complete if:
 *
 *
 * Each character in s occurs exactly k times.
 *
 * The difference between two adjacent characters is at most 2. That is, for any two adjacent characters c1 and c2 in s, the absolute difference in their positions in the alphabet is at most 2.
 *
 * Return the number of complete substrings of word.
 *
 *
 * A substring is a non-empty contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "igigee", k = 2
 * Output: 3
 * Explanation: The complete substrings where each character appears exactly twice and the difference between adjacent characters is at most 2 are: igigee, igigee, igigee.
 *
 * Example 2:
 *
 * Input: word = "aaabbbccc", k = 3
 * Output: 6
 * Explanation: The complete substrings where each character appears exactly three times and the difference between adjacent characters is at most 2 are: aaabbbccc, aaabbbccc, aaabbbccc, aaabbbccc, aaabbbccc, aaabbbccc.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 105
 *
 * word consists only of lowercase English letters.
 *
 * 1 &lt;= k &lt;= word.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are at most 26 different lengths of the complete substrings: <code>k *1, k * 2, … k * 26</code>.****
 * Hint 2: For each length, we can use sliding window to count the frequency of each letter in the window.
 * Hint 3: We still need to check for all characters in the window that <code>abs(word[i] - word[i - 1]) &lt;= 2</code>. We do this by maintaining the values of <code>abs(word[i] - word[i - 1])</code> in the sliding window dynamically in an ordered multiset or priority queue, so that we know the maximum value at each iteration.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-complete-substrings/">LeetCode #2953</a>
 */
public class CountCompleteSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Complete Substrings");
    }

    public static void main(String[] args) {
        System.out.println("=== CountCompleteSubstrings ===");
        CountCompleteSubstrings sol = new CountCompleteSubstrings();
        System.out.println(sol.solve(null));
    }
}
