package org.leetcode.easy;


/**
 * <b>#2697 - Lexicographically Smallest Palindrome</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it. In one operation, you can replace a character in s with another lowercase English letter.
 *
 *
 * Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.
 *
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
 *
 *
 * Return the resulting palindrome string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "egcfe"
 * Output: "efcfe"
 * Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.
 *
 * Example 2:
 *
 * Input: s = "abcd"
 * Output: "abba"
 * Explanation: The minimum number of operations to make "abcd" a palindrome is 2, and the lexicographically smallest palindrome string we can get by modifying two characters is "abba".
 *
 * Example 3:
 *
 * Input: s = "seven"
 * Output: "neven"
 * Explanation: The minimum number of operations to make "seven" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "neven".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can make any string a palindrome, by simply making any character at index i equal to the character at index length - i - 1 (using 0-based indexing).
 * Hint 2: To make it lexicographically smallest we can change the character with maximum ASCII value to the one with minimum ASCII value.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-palindrome/">LeetCode #2697</a>
  *
  * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
  */
public class LexicographicallySmallestPalindrome {

    /**
     * Solves the problem: Make smallest palindrome.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
      */
    public String makeSmallestPalindrome(String s) {
        char[] arr=s.toCharArray();
        int lo=0, hi=arr.length-1;
        while (lo<hi) {
            arr[lo]=arr[hi]=(char)Math.min(arr[lo],arr[hi]);
            lo++; hi--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        LexicographicallySmallestPalindrome sol = new LexicographicallySmallestPalindrome();
                System.out.println(sol.makeSmallestPalindrome("egcfe")); // "efcfe"
                System.out.println(sol.makeSmallestPalindrome("abcd"));  // "abba"
                System.out.println(sol.makeSmallestPalindrome("seven")); // neven
    }
}
