package org.leetcode.medium;

/**
 * <b>#279 - Perfect Squares</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the least number of perfect square numbers that sum to n.
 * 
 * 
 * A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 12
 * Output: 3
 * Explanation: 12 = 4 + 4 + 4.
 * 
 * Example 2:
 * 
 * Input: n = 13
 * Output: 2
 * Explanation: 13 = 4 + 9.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 104
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
 * @see <a href="https://leetcode.com/problems/perfect-squares/">LeetCode #279</a>
 */
public class PerfectSquares {

    /** TODO: implement solution for "Perfect Squares". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Perfect Squares");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== PerfectSquares ===");
        PerfectSquares sol = new PerfectSquares();
        System.out.println(sol.solve(null));
    }
}
