package org.leetcode.medium;

/**
 * <b>#365 - Water and Jug Problem</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Depth-First Search, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two jugs with capacities x liters and y liters. You have an infinite water supply. Return whether the total amount of water in both jugs may reach target using the following operations:
 * 
 * 	
 * Fill either jug completely with water.
 * 	
 * Completely empty either jug.
 * 	
 * Pour water from one jug into another until the receiving jug is full, or the transferring jug is empty.
 * 
 *  
 * 
 * Example 1: 
 * 
 * Input:   x = 3, y = 5, target = 4 
 * 
 * 
 * Output:   true 
 * 
 * 
 * Explanation:
 * 
 * 
 * Follow these steps to reach a total of 4 liters:
 * 
 * 	
 * Fill the 5-liter jug (0, 5).
 * 	
 * Pour from the 5-liter jug into the 3-liter jug, leaving 2 liters (3, 2).
 * 	
 * Empty the 3-liter jug (0, 2).
 * 	
 * Transfer the 2 liters from the 5-liter jug to the 3-liter jug (2, 0).
 * 	
 * Fill the 5-liter jug again (2, 5).
 * 	
 * Pour from the 5-liter jug into the 3-liter jug until the 3-liter jug is full. This leaves 4 liters in the 5-liter jug (3, 4).
 * 	
 * Empty the 3-liter jug. Now, you have exactly 4 liters in the 5-liter jug (0, 4).
 * 
 * Reference: The Die Hard example.
 * 
 * Example 2: 
 * 
 * Input:   x = 2, y = 6, target = 5 
 * 
 * 
 * Output:   false 
 * 
 * Example 3: 
 * 
 * Input:   x = 1, y = 2, target = 3 
 * 
 * 
 * Output:   true 
 * 
 * 
 * Explanation: Fill both jugs. The total amount of water in both jugs is equal to 3 now.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= x, y, target &lt;= 103
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
 * @see <a href="https://leetcode.com/problems/water-and-jug-problem/">LeetCode #365</a>
 */
public class WaterAndJugProblem {

    /** TODO: implement solution for "Water and Jug Problem". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Water and Jug Problem");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== WaterAndJugProblem ===");
        WaterAndJugProblem sol = new WaterAndJugProblem();
        System.out.println(sol.solve(null));
    }
}
