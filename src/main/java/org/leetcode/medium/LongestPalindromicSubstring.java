package org.leetcode.medium;

/**
 * <b>#5 - Longest Palindromic Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the longest palindromic substring in s.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * 
 * Example 2:
 * 
 * Input: s = "cbbd"
 * Output: "bb"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 1000
 * 	
 * s consist of only digits and English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - How can we reuse a previously computed palindrome to compute a larger palindrome?
 * - If “aba” is a palindrome, is “xabax” a palindrome? Similarly is “xabay” a palindrome?
 * - Complexity based hint:<br>
If we use brute-force and check whether for every start and end position a substring is a palindrome we have O(n^2) start - end pairs and O(n) palindromic checks. Can we reduce the time for palindromic checks to O(1) by reusing some previous computation.
 *
 * <h2>Approach</h2>
 * Expand Around Center: for each index (and each pair of adjacent indices),
 * expand outward as long as characters match. Track the longest palindrome found.
 * Alternatively, Manacher's algorithm achieves O(n) but expand-center is simpler.
 *
 * <h2>Complexity</h2>
* Time: O(n²)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">LeetCode #5</a>
 */
public class LongestPalindromicSubstring {

    /**
     * Returns the longest palindromic substring of s.
     *
     * @param s input string
     * @return  the longest palindrome substring
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindromes centred at i
            int len1 = expand(s, i, i);
            // Even-length palindromes centred between i and i+1
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }

    /**
     * Expands around the center (l, r) and returns the palindrome length.
     *
     * @param s input string
     * @param l left  starting index
     * @param r right starting index
     * @return  length of the palindrome found
     */
    private int expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        return r - l - 1;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                LongestPalindromicSubstring sol = new LongestPalindromicSubstring();
                System.out.println(sol.longestPalindrome("babad")); // "bab" or "aba"
                System.out.println(sol.longestPalindrome("cbbd"));  // "bb" 
    }
}
