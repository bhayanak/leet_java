package org.leetcode.easy;

/**
 * <b>#392 - Is Subsequence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * 
 * 
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= s.length &lt;= 100
 * 	
 * 0 &lt;= t.length &lt;= 104
 * 	
 * s and t consist only of lowercase English letters.
 * 
 *  
 * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k &gt;= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Two pointers: advance j only when s[i]==t[j]. s is a subsequence if i reaches len(s).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/is-subsequence/">LeetCode #392</a>
  *
  * <p><b>Explanation:</b> Uses two pointers moving towards each other to process pairs in O(n) time.</p>
  */
public class IsSubsequence {

    /**
     * Returns true if Is subsequence.
     *
     * @param s the s (String)
     * @param t the t (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses two pointers moving towards each other to process pairs in O(n) time.</p>
      */
    public boolean isSubsequence(String s, String t) {
        int i=0;
        for(int j=0;j<t.length()&&i<s.length();j++)
            if(s.charAt(i)==t.charAt(j)) i++;
        return i==s.length();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        IsSubsequence sol = new IsSubsequence();
        System.out.println(sol.isSubsequence("ace","abcde")); // true
        System.out.println(sol.isSubsequence("aec","abcde")); // false
    }
}
