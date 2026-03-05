package org.leetcode.easy;

/**
 * <b>#205 - Isomorphic Strings</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * 
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * 
 * 
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "egg", t = "add"
 * 
 * 
 * Output: true
 * 
 * 
 * Explanation:
 * 
 * 
 * The strings s and t can be made identical by:
 * 
 * 	
 * Mapping 'e' to 'a'.
 * 	
 * Mapping 'g' to 'd'.
 * 
 * Example 2:
 * 
 * Input: s = "f11", t = "b23"
 * 
 * 
 * Output: false
 * 
 * 
 * Explanation:
 * 
 * 
 * The strings s and t can not be made identical as '1' needs to be mapped to both '2' and '3'.
 * 
 * Example 3:
 * 
 * Input: s = "paper", t = "title"
 * 
 * 
 * Output: true
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 5 * 104
 * 	
 * t.length == s.length
 * 	
 * s and t consist of any valid ascii character.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Maintain two maps: s→t char mapping and t→s reverse mapping.
 * If a mapping conflicts, return false.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1) (at most 256 entries)
 *
 * @see <a href="https://leetcode.com/problems/isomorphic-strings/">LeetCode #205</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class IsomorphicStrings {

    /**
     * Returns true if Is isomorphic.
     *
     * @param s the s (String)
     * @param t the t (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isIsomorphic(String s, String t) {
        int[] sToT = new int[256], tToS = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if (sToT[sc] != tToS[tc]) return false; // conflict
            sToT[sc] = tToS[tc] = i + 1;            // mark with 1-based index
        }
        return true;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        IsomorphicStrings sol = new IsomorphicStrings();
        System.out.println(sol.isIsomorphic("egg",  "add")); // true
        System.out.println(sol.isIsomorphic("foo",  "bar")); // false
        System.out.println(sol.isIsomorphic("paper","title"));// true
    }
}
