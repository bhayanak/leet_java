package org.leetcode.medium;

/**
 * <b>#390 - Elimination Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a list arr of all integers in the range [1, n] sorted in a strictly increasing order. Apply the following algorithm on arr:
 * 
 * 	
 * Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.
 * 	
 * Repeat the previous step again, but this time from right to left, remove the rightmost number and every other number from the remaining numbers.
 * 	
 * Keep repeating the steps again, alternating left to right and right to left, until a single number remains.
 * 
 * Given the integer n, return the last number that remains in arr.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 9
 * Output: 6
 * Explanation:
 * arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * arr = [2, 4, 6, 8]
 * arr = [2, 6]
 * arr = [6]
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 109
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
 * @see <a href="https://leetcode.com/problems/elimination-game/">LeetCode #390</a>
 */
public class EliminationGame {

    /** TODO: implement solution for "Elimination Game". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Elimination Game");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== EliminationGame ===");
        EliminationGame sol = new EliminationGame();
        System.out.println(sol.solve(null));
    }
}
