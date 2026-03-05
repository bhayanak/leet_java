package org.leetcode.hard;

/**
 * <b>#76 - Minimum Window Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
 * 
 * 
 * The testcases will be generated such that the answer is unique.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * Output: "BANC"
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * 
 * Example 2:
 * 
 * Input: s = "a", t = "a"
 * Output: "a"
 * Explanation: The entire string s is the minimum window.
 * 
 * Example 3:
 * 
 * Input: s = "a", t = "aa"
 * Output: ""
 * Explanation: Both 'a's from t must be included in the window.
 * Since the largest window of s only has one 'a', return empty string.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * m == s.length
 * 	
 * n == t.length
 * 	
 * 1 &lt;= m, n &lt;= 105
 * 	
 * s and t consist of uppercase and lowercase English letters.
 * 
 *  
 * 
 * Follow up: Could you find an algorithm that runs in O(m + n) time?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Use two pointers to create a window of letters in s, which would have all the characters from t.
 * - Expand the right pointer until all the characters of t are covered.
 * - Once all the characters are covered, move the left pointer and ensure that all the characters are still covered to minimize the subarray size.
 * - Continue expanding the right and left pointers until you reach the end of s.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/minimum-window-substring/">LeetCode #76</a>
 */
public class MinimumWindowSubstring {

    /**
     * TODO: Implement solution for "Minimum Window Substring".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Minimum Window Substring");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        MinimumWindowSubstring sol = new MinimumWindowSubstring();
        System.out.println(sol.solve(null));
    }
}
