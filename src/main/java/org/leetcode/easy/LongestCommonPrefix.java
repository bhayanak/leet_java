package org.leetcode.easy;

/**
 * <b>#14 - Longest Common Prefix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * 
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * 
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= strs.length &lt;= 200
 * 	
 * 0 &lt;= strs[i].length &lt;= 200
 * 	
 * strs[i] consists of only lowercase English letters if it is non-empty.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Use the first string as the reference prefix. Shorten it until every other
 * string starts with it. Early exit if prefix becomes empty.
 *
 * <h2>Complexity</h2>
* Time: O(S) where S = total chars  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">LeetCode #14</a>
  *
  * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class LongestCommonPrefix {

    /**
     * Finds the longest common prefix among an array of strings.
     *
     * @param strs array of strings
     * @return     longest common prefix, or "" if none
      *
      * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // Trim prefix until strs[i] starts with it
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
                LongestCommonPrefix sol = new LongestCommonPrefix();
                System.out.println(sol.longestCommonPrefix(new String[]{"flower","flow","flight"})); // "fl"
                System.out.println(sol.longestCommonPrefix(new String[]{"dog","racecar","car"}));    // "" 
    }
}
