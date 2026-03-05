package org.leetcode.easy;

/**
 * <b>#387 - First Unique Character in a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Queue, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "leetcode"
 * 
 * 
 * Output: 0
 * 
 * 
 * Explanation:
 * 
 * 
 * The character 'l' at index 0 is the first character that does not occur at any other index.
 * 
 * Example 2:
 * 
 * Input: s = "loveleetcode"
 * 
 * 
 * Output: 2
 * 
 * Example 3:
 * 
 * Input: s = "aabb"
 * 
 * 
 * Output: -1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 105
 * 	
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Count character frequencies, then return the index of the first character with count 1.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">LeetCode #387</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class FirstUniqueCharacterInAString {

    /**
     * Solves the problem: First uniq char.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int firstUniqChar(String s) {
        int[] cnt=new int[26];
        for(char c:s.toCharArray()) cnt[c-'a']++;
        for(int i=0;i<s.length();i++) if(cnt[s.charAt(i)-'a']==1) return i;
        return -1;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        FirstUniqueCharacterInAString sol = new FirstUniqueCharacterInAString();
        System.out.println(sol.firstUniqChar("leetcode")); // 0 ('l')
        System.out.println(sol.firstUniqChar("loveleetcode")); // 2 ('v')
        System.out.println(sol.firstUniqChar("aabb")); // -1
    }
}
