package org.leetcode.easy;

/**
 * <b>#242 - Valid Anagram</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram"
 * 
 * 
 * Output: true
 * 
 * Example 2:
 * 
 * Input: s = "rat", t = "car"
 * 
 * 
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length, t.length &lt;= 5 * 104
 * 	
 * s and t consist of lowercase English letters.
 * 
 *  
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Count character frequencies in s, decrement for t. Any non-zero count → false.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1) (26 letters)
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/">LeetCode #242</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class ValidAnagram {

    /**
     * Returns true if Is anagram.
     *
     * @param s the s (String)
     * @param t the t (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] cnt=new int[26];
        for (char c:s.toCharArray()) cnt[c-'a']++;
        for (char c:t.toCharArray()) if(--cnt[c-'a']<0) return false;
        return true;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ValidAnagram sol = new ValidAnagram();
        System.out.println(sol.isAnagram("anagram","nagaram")); // true
        System.out.println(sol.isAnagram("rat","car"));         // false
    }
}
