package org.leetcode.medium;

/**
 * <b>#3 - Longest Substring Without Repeating Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, find the length of the longest substring without duplicate characters.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
 * 
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= s.length &lt;= 5 * 104
 * 	
 * s consists of English letters, digits, symbols and spaces.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Generate all possible substrings &amp; check for each substring if it's valid and keep updating maxLen accordingly.
 *
 * <h2>Approach</h2>
 * Sliding Window with a HashSet (or HashMap for O(1) jumps).
 * Expand the right boundary; when a duplicate is found, shrink from the left
 * until the duplicate is removed. Track the maximum window size seen.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(min(n, charset))
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">LeetCode #3</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Returns the length of the longest substring with all unique characters.
     *
     * @param s input string
     * @return  length of longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        java.util.Map<Character, Integer> lastSeen = new java.util.HashMap<>();
        int max = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // If we've seen this char inside the current window, jump left past it
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, right);
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                LongestSubstringWithoutRepeatingCharacters sol = new LongestSubstringWithoutRepeatingCharacters();
                System.out.println(sol.lengthOfLongestSubstring("abcabcbb")); // 3
                System.out.println(sol.lengthOfLongestSubstring("bbbbb"));    // 1
                System.out.println(sol.lengthOfLongestSubstring("pwwkew"));   // 3
    }
}
