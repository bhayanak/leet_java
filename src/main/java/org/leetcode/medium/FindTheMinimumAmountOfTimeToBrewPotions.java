package org.leetcode.medium;


/**
 * <b>#3494 - Find the Minimum Amount of Time to Brew Potions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Simulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays, skill and mana, of length n and m, respectively.
 *
 *
 * In a laboratory, n wizards must brew m potions in order. Each potion has a mana capacity mana[j] and must pass through all the wizards sequentially to be brewed properly. The time taken by the ith wizard on the jth potion is timeij = skill[i] * mana[j].
 *
 *
 * Since the brewing process is delicate, a potion must be passed to the next wizard immediately after the current wizard completes their work. This means the timing must be synchronized so that each wizard begins working on a potion exactly when it arrives. ​
 *
 *
 * Return the minimum amount of time required for the potions to be brewed properly.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: skill = [1,5,2,4], mana = [5,1,4,2]
 *
 *
 * Output: 110
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Potion Number
 * 			Start time
 * 			Wizard 0 done by
 * 			Wizard 1 done by
 * 			Wizard 2 done by
 * 			Wizard 3 done by
 *
 *
 *
 *
 * 			0
 * 			0
 * 			5
 * 			30
 * 			40
 * 			60
 *
 *
 *
 *
 * 			1
 * 			52
 * 			53
 * 			58
 * 			60
 * 			64
 *
 *
 *
 *
 * 			2
 * 			54
 * 			58
 * 			78
 * 			86
 * 			102
 *
 *
 *
 *
 * 			3
 * 			86
 * 			88
 * 			98
 * 			102
 * 			110
 *
 *
 *
 *
 * As an example for why wizard 0 cannot start working on the 1st potion before time t = 52, consider the case where the wizards started preparing the 1st potion at time t = 50. At time t = 58, wizard 2 is done with the 1st potion, but wizard 3 will still be working on the 0th potion till time t = 60.
 *
 * Example 2:
 *
 * Input: skill = [1,1,1], mana = [1,1,1]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Preparation of the 0th potion begins at time t = 0, and is completed by time t = 3.
 *
 * Preparation of the 1st potion begins at time t = 1, and is completed by time t = 4.
 *
 * Preparation of the 2nd potion begins at time t = 2, and is completed by time t = 5.
 *
 * Example 3:
 *
 * Input: skill = [1,2,3,4], mana = [1,2]
 *
 *
 * Output: 21
 *
 *
 *
 * Constraints:
 *
 *
 * n == skill.length
 *
 * m == mana.length
 *
 * 1 &lt;= n, m &lt;= 5000
 *
 * 1 &lt;= mana[i], skill[i] &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain each wizard's earliest free time (for the last potion) as <code>f[i]</code>.
 * Hint 2: Let <code>x</code> be the current mana value. Starting from <code>now = f[0]</code>, update <code>now = max(now + skill[i - 1] * x, f[i])</code> for <code>i in [1..n]</code>. Then, the final <code>f[n - 1] = now + skill[n - 1] * x</code> for this potion.
 * Hint 3: Update all other <code>f</code> values by <code>f[i] = f[i + 1] - skill[i + 1] * x</code> for <code>i in [0..n - 2]</code> (in reverse order).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/">LeetCode #3494</a>
 */
public class FindTheMinimumAmountOfTimeToBrewPotions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Minimum Amount of Time to Brew Potions");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMinimumAmountOfTimeToBrewPotions ===");
        FindTheMinimumAmountOfTimeToBrewPotions sol = new FindTheMinimumAmountOfTimeToBrewPotions();
        System.out.println(sol.solve(null));
    }
}
