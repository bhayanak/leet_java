package org.leetcode.medium;

/**
 * <b>#400 - Nth Digit</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: 3
 * 
 * Example 2:
 * 
 * Input: n = 11
 * Output: 0
 * Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 231 - 1
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
 * @see <a href="https://leetcode.com/problems/nth-digit/">LeetCode #400</a>
 */
public class NthDigit {

    /** TODO: implement solution for "Nth Digit". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Nth Digit");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== NthDigit ===");
        NthDigit sol = new NthDigit();
        System.out.println(sol.solve(null));
    }
}
