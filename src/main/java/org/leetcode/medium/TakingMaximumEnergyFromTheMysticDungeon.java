package org.leetcode.medium;


/**
 * <b>#3147 - Taking Maximum Energy From the Mystic Dungeon</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a mystic dungeon, n magicians are standing in a line. Each magician has an attribute that gives you energy. Some magicians can give you negative energy, which means taking energy from you.
 *
 *
 * You have been cursed in such a way that after absorbing energy from magician i, you will be instantly transported to magician (i + k). This process will be repeated until you reach the magician where (i + k) does not exist.
 *
 *
 * In other words, you will choose a starting point and then teleport with k jumps until you reach the end of the magicians' sequence, absorbing all the energy during the journey.
 *
 *
 * You are given an array energy and an integer k. Return the maximum possible energy you can gain.
 *
 *
 * Note that when you reach a magician, you must take energy from them, whether it is negative or positive energy.
 *
 *
 *
 *
 * Example 1:
 *
 * Input:  energy = [5,2,-10,-5,1], k = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation: We can gain a total energy of 3 by starting from magician 1 absorbing 2 + 1 = 3.
 *
 * Example 2:
 *
 * Input: energy = [-2,-3,-1], k = 2
 *
 *
 * Output: -1
 *
 *
 * Explanation: We can gain a total energy of -1 by starting from magician 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= energy.length &lt;= 105
 *
 * -1000 &lt;= energy[i] &lt;= 1000
 *
 * 1 &lt;= k &lt;= energy.length - 1
 *
 *
 * ​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> denote the energy we gain starting from index <code>i</code>.
 * Hint 2: We can notice, that <code> dp[i] = dp[i + k] + energy[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/">LeetCode #3147</a>
 */
public class TakingMaximumEnergyFromTheMysticDungeon {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Taking Maximum Energy From the Mystic Dungeon");
    }

    public static void main(String[] args) {
        System.out.println("=== TakingMaximumEnergyFromTheMysticDungeon ===");
        TakingMaximumEnergyFromTheMysticDungeon sol = new TakingMaximumEnergyFromTheMysticDungeon();
        System.out.println(sol.solve(null));
    }
}
