package org.leetcode.medium;

/**
 * <b>#49 - Group Anagrams</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * 
 * 
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * 
 * 
 * Explanation:
 * 
 * 	
 * There is no string in strs that can be rearranged to form "bat".
 * 	
 * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 * 	
 * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 * 
 * Example 2:
 * 
 * Input: strs = [""]
 * 
 * 
 * Output: [[""]]
 * 
 * Example 3:
 * 
 * Input: strs = ["a"]
 * 
 * 
 * Output: [["a"]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= strs.length &lt;= 104
 * 	
 * 0 &lt;= strs[i].length &lt;= 100
 * 	
 * strs[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Sort each word's characters to produce a canonical key.
 * Group words sharing the same key in a HashMap.
 * Alternative: use a frequency count of 26 characters as the key.
 *
 * <h2>Complexity</h2>
* Time: O(n·k·log k)  |  Space: O(n·k)
 *
 * @see <a href="https://leetcode.com/problems/group-anagrams/">LeetCode #49</a>
 */
public class GroupAnagrams {

    /**
     * Groups strings that are anagrams of each other.
     *
     * @param strs array of lowercase strings
     * @return     list of anagram groups
     */
    public java.util.List<java.util.List<String>> groupAnagrams(String[] strs) {
        java.util.Map<String, java.util.List<String>> map = new java.util.HashMap<>();
        for (String s : strs) {
            char[] ch = s.toCharArray();
            java.util.Arrays.sort(ch);           // canonical key
            String key = new String(ch);
            map.computeIfAbsent(key, k -> new java.util.ArrayList<>()).add(s);
        }
        return new java.util.ArrayList<>(map.values());
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        GroupAnagrams sol = new GroupAnagrams();
        System.out.println("No method available");
    }
}
