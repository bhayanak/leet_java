package org.leetcode.hard;


/**
 * <b>#3273 - Minimum Amount of Damage Dealt to Bob</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer power and two integer arrays damage and health, both having length n.
 *
 *
 * Bob has n enemies, where enemy i will deal Bob damage[i] points of damage per second while they are alive (i.e. health[i] &gt; 0).
 *
 *
 * Every second, after the enemies deal damage to Bob, he chooses one of the enemies that is still alive and deals power points of damage to them.
 *
 *
 * Determine the minimum total amount of damage points that will be dealt to Bob before all n enemies are dead.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: power = 4, damage = [1,2,3,4], health = [4,5,6,8]
 *
 *
 * Output: 39
 *
 *
 * Explanation:
 *
 *
 * Attack enemy 3 in the first two seconds, after which enemy 3 will go down, the number of damage points dealt to Bob is 10 + 10 = 20 points.
 *
 * Attack enemy 2 in the next two seconds, after which enemy 2 will go down, the number of damage points dealt to Bob is 6 + 6 = 12 points.
 *
 * Attack enemy 0 in the next second, after which enemy 0 will go down, the number of damage points dealt to Bob is 3 points.
 *
 * Attack enemy 1 in the next two seconds, after which enemy 1 will go down, the number of damage points dealt to Bob is 2 + 2 = 4 points.
 *
 * Example 2:
 *
 * Input: power = 1, damage = [1,1,1,1], health = [1,2,3,4]
 *
 *
 * Output: 20
 *
 *
 * Explanation:
 *
 *
 * Attack enemy 0 in the first second, after which enemy 0 will go down, the number of damage points dealt to Bob is 4 points.
 *
 * Attack enemy 1 in the next two seconds, after which enemy 1 will go down, the number of damage points dealt to Bob is 3 + 3 = 6 points.
 *
 * Attack enemy 2 in the next three seconds, after which enemy 2 will go down, the number of damage points dealt to Bob is 2 + 2 + 2 = 6 points.
 *
 * Attack enemy 3 in the next four seconds, after which enemy 3 will go down, the number of damage points dealt to Bob is 1 + 1 + 1 + 1 = 4 points.
 *
 * Example 3:
 *
 * Input: power = 8, damage = [40], health = [59]
 *
 *
 * Output: 320
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= power &lt;= 104
 *
 * 1 &lt;= n == damage.length == health.length &lt;= 105
 *
 * 1 &lt;= damage[i], health[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use sorting here along with a custom comparator?
 * Hint 2: For any two enemies <code>i</code> and <code>j</code> with damages <code>damage[i]</code> and <code>damage[j]</code>, and time to take each of them down <code>t<sub>i</sub></code> and <code>t<sub>j</sub></code>, when is it better to choose enemy <code>i</code> over enemy <code>j</code> first?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-amount-of-damage-dealt-to-bob/">LeetCode #3273</a>
 */
public class MinimumAmountOfDamageDealtToBob {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Amount of Damage Dealt to Bob");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumAmountOfDamageDealtToBob ===");
        MinimumAmountOfDamageDealtToBob sol = new MinimumAmountOfDamageDealtToBob();
        System.out.println(sol.solve(null));
    }
}
