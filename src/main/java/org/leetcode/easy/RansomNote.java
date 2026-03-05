package org.leetcode.easy;

/**
 * <b>#383 - Ransom Note</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * 
 * 
 * Each letter in magazine can only be used once in ransomNote.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * 
 * 
 * Example 2:
 * 
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * 
 * 
 * Example 3:
 * 
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= ransomNote.length, magazine.length &lt;= 105
 * 	
 * ransomNote and magazine consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Count character frequencies in magazine; check ransomNote can be formed.
 *
 * <h2>Complexity</h2>
* Time: O(n+m)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/ransom-note/">LeetCode #383</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class RansomNote {

    /**
     * Returns true if the input can Can construct.
     *
     * @param ransomNote the ransomNote (String)
     * @param magazine the magazine (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] cnt=new int[26];
        for(char c:magazine.toCharArray()) cnt[c-'a']++;
        for(char c:ransomNote.toCharArray()) if(--cnt[c-'a']<0) return false;
        return true;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        RansomNote sol = new RansomNote();
        System.out.println(sol.canConstruct("a","b"));    // false
        System.out.println(sol.canConstruct("aa","aab")); // true
    }
}
