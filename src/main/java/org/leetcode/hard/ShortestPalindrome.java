package org.leetcode.hard;

/**
 * <b>#214 - Shortest Palindrome</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Rolling Hash, String Matching, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s. You can convert s to a palindrome by adding characters in front of it.
 * 
 * 
 * Return the shortest palindrome you can find by performing this transformation.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "aacecaaa"
 * Output: "aaacecaaa"
 * 
 * 
 * Example 2:
 * 
 * Input: s = "abcd"
 * Output: "dcbabcd"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= s.length &lt;= 5 * 104
 * 	
 * s consists of lowercase English letters only.
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
 * @see <a href="https://leetcode.com/problems/shortest-palindrome/">LeetCode #214</a>
 */
public class ShortestPalindrome {

    /** TODO: implement solution for "Shortest Palindrome". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Palindrome");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== ShortestPalindrome ===");
        ShortestPalindrome sol = new ShortestPalindrome();
        System.out.println(sol.solve(null));
    }
}
