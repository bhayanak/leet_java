package org.leetcode.medium;

/**
 * <b>#386 - Lexicographical Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.
 * 
 * 
 * You must write an algorithm that runs in O(n) time and uses O(1) extra space. 
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 13
 * Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
 * 
 * 
 * Example 2:
 * 
 * Input: n = 2
 * Output: [1,2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 5 * 104
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
 * @see <a href="https://leetcode.com/problems/lexicographical-numbers/">LeetCode #386</a>
 */
public class LexicographicalNumbers {

    /** TODO: implement solution for "Lexicographical Numbers". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Lexicographical Numbers");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== LexicographicalNumbers ===");
        LexicographicalNumbers sol = new LexicographicalNumbers();
        System.out.println(sol.solve(null));
    }
}
