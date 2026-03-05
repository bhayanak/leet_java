package org.leetcode.medium;


/**
 * <b>#3186 - Maximum Total Damage With Spell Casting</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Binary Search, Dynamic Programming, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A magician has various spells.
 *
 *
 * You are given an array power, where each element represents the damage of a spell. Multiple spells can have the same damage value.
 *
 *
 * It is a known fact that if a magician decides to cast a spell with a damage of power[i], they cannot cast any spell with a damage of power[i] - 2, power[i] - 1, power[i] + 1, or power[i] + 2.
 *
 *
 * Each spell can be cast only once.
 *
 *
 * Return the maximum possible total damage that a magician can cast.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: power = [1,1,3,4]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The maximum possible damage of 6 is produced by casting spells 0, 1, 3 with damage 1, 1, 4.
 *
 * Example 2:
 *
 * Input: power = [7,1,6,6]
 *
 *
 * Output: 13
 *
 *
 * Explanation:
 *
 *
 * The maximum possible damage of 13 is produced by casting spells 1, 2, 3 with damage 1, 6, 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= power.length &lt;= 105
 *
 * 1 &lt;= power[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we ever decide to use some spell with power <code>x</code>, then we will use all spells with power <code>x</code>.
 * Hint 2: Think of dynamic programming.
 * Hint 3: <code>dp[i][j]</code> represents the maximum damage considering up to the <code>i</code>-th unique spell and <code>j</code> represents the number of spells skipped (up to 3 as per constraints).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Binary Search, Dynamic Programming, Sorting, Counting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-damage-with-spell-casting/">LeetCode #3186</a>
 */
public class MaximumTotalDamageWithSpellCasting {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Total Damage With Spell Casting");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumTotalDamageWithSpellCasting ===");
        MaximumTotalDamageWithSpellCasting sol = new MaximumTotalDamageWithSpellCasting();
        System.out.println(sol.solve(null));
    }
}
