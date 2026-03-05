package org.leetcode.medium;

/**
 * <b>#201 - Bitwise AND of Numbers Range</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: left = 5, right = 7
 * Output: 4
 * 
 * Example 2:
 * 
 * Input: left = 0, right = 0
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: left = 1, right = 2147483647
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= left &lt;= right &lt;= 231 - 1
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
 * @see <a href="https://leetcode.com/problems/bitwise-and-of-numbers-range/">LeetCode #201</a>
 */
public class BitwiseAndOfNumbersRange {

    /** TODO: implement solution for "Bitwise AND of Numbers Range". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Bitwise AND of Numbers Range");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== BitwiseAndOfNumbersRange ===");
        BitwiseAndOfNumbersRange sol = new BitwiseAndOfNumbersRange();
        System.out.println(sol.solve(null));
    }
}
