package org.leetcode.easy;

/**
 * <b>#125 - Valid Palindrome</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * 
 * 
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Example 2:
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 * Example 3:
 * 
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 2 * 105
 * 	
 * s consists only of printable ASCII characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Two pointers from both ends. Skip non-alphanumeric characters.
 * Compare lowercased characters; if mismatch found, return false.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/valid-palindrome/">LeetCode #125</a>
  *
  * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
  */
public class ValidPalindrome {

    /**
     * Checks if a string is a palindrome, considering only alphanumeric characters (case-insensitive).
     * @param s input string
     * @return true if s is a valid palindrome
      *
      * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
      */
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            l++; r--;
        }
        return true;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ValidPalindrome.java &amp;&amp; java org.leetcode.easy.ValidPalindrome
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ValidPalindrome sol = new ValidPalindrome();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car"));                      // false
        System.out.println(sol.isPalindrome(" "));                               // true
    }
}
