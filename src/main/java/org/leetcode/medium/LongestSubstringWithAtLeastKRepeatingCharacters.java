package org.leetcode.medium;

/**
 * <b>#395 - Longest Substring with At Least K Repeating Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Divide and Conquer, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and an integer k, return the length of the longest substring of s such that the frequency of each character in this substring is greater than or equal to k.
 * 
 * 
 * if no such substring exists, return 0.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "aaabb", k = 3
 * Output: 3
 * Explanation: The longest substring is "aaa", as 'a' is repeated 3 times.
 * 
 * Example 2:
 * 
 * Input: s = "ababbc", k = 2
 * Output: 5
 * Explanation: The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 104
 * 	
 * s consists of only lowercase English letters.
 * 	
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/">LeetCode #395</a>
 */
public class LongestSubstringWithAtLeastKRepeatingCharacters {

    /** TODO: implement solution for "Longest Substring with At Least K Repeating Characters". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Substring with At Least K Repeating Characters");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== LongestSubstringWithAtLeastKRepeatingCharacters ===");
        LongestSubstringWithAtLeastKRepeatingCharacters sol = new LongestSubstringWithAtLeastKRepeatingCharacters();
        System.out.println(sol.solve(null));
    }
}
