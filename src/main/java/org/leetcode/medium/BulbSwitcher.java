package org.leetcode.medium;

/**
 * <b>#319 - Bulb Switcher</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Brainteaser</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.
 * 
 * 
 * On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the ith round, you toggle every i bulb. For the nth round, you only toggle the last bulb.
 * 
 * 
 * Return the number of bulbs that are on after n rounds.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: 1
 * Explanation: At first, the three bulbs are [off, off, off].
 * After the first round, the three bulbs are [on, on, on].
 * After the second round, the three bulbs are [on, off, on].
 * After the third round, the three bulbs are [on, off, off]. 
 * So you should return 1 because there is only one bulb is on.
 * 
 * Example 2:
 * 
 * Input: n = 0
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: n = 1
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 109
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
 * @see <a href="https://leetcode.com/problems/bulb-switcher/">LeetCode #319</a>
 */
public class BulbSwitcher {

    /** TODO: implement solution for "Bulb Switcher". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Bulb Switcher");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== BulbSwitcher ===");
        BulbSwitcher sol = new BulbSwitcher();
        System.out.println(sol.solve(null));
    }
}
