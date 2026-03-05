package org.leetcode.medium;


/**
 * <b>#1400 - Construct K Palindrome Strings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and an integer k, return true if you can use all the characters in s to construct non-empty k palindrome strings or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "annabelle", k = 2
 * Output: true
 * Explanation: You can construct two palindromes using all characters in s.
 * Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
 *
 * Example 2:
 *
 * Input: s = "leetcode", k = 3
 * Output: false
 * Explanation: It is impossible to construct 3 palindromes using all the characters of s.
 *
 * Example 3:
 *
 * Input: s = "true", k = 4
 * Output: true
 * Explanation: The only possible solution is to put each character in a separate string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the s.length &lt; k we cannot construct k strings from s and answer is false.
 * Hint 2: If the number of characters that have odd counts is &gt; k then the minimum number of palindrome strings we can construct is &gt; k and answer is false.
 * Hint 3: Otherwise you can construct exactly k palindrome strings and answer is true (why ?).
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/construct-k-palindrome-strings/">LeetCode #1400</a>
 */
public class ConstructKPalindromeStrings {

    /**
     * Returns true if the input can Can construct.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed boolean result
     */
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c-'a']++;
        int odd=0; for (int v : cnt) if (v%2!=0) odd++;
        return odd <= k;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        ConstructKPalindromeStrings sol = new ConstructKPalindromeStrings();
                System.out.println(sol.canConstruct("annabelle", 2)); // true
                System.out.println(sol.canConstruct("leetcode", 3));  // false
                System.out.println(sol.canConstruct("true", 4));      // true
    }
}
