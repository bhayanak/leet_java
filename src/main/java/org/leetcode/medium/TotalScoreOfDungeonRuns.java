package org.leetcode.medium;


/**
 * <b>#3771 - Total Score of Dungeon Runs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer hp and two positive 1-indexed integer arrays damage and requirement.
 *
 *
 * There is a dungeon with n trap rooms numbered from 1 to n. Entering room i reduces your health points by damage[i]. After that reduction, if your remaining health points are at least requirement[i], you earn 1 point for that room.
 *
 *
 * Let score(j) be the number of points you get if you start with hp health points and enter the rooms j, j + 1, ..., n in this order.
 *
 *
 * Return the integer score(1) + score(2) + ... + score(n), the sum of scores over all starting rooms.
 *
 *
 * Note: You cannot skip rooms. You can finish your journey even if your health points become non-positive.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hp = 11, damage = [3,6,7], requirement = [4,2,5]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * score(1) = 2, score(2) = 1, score(3) = 0. The total score is 2 + 1 + 0 = 3.
 *
 *
 * As an example, score(1) = 2 because you get 2 points if you start from room 1.
 *
 *
 * You start with 11 health points.
 *
 * Enter room 1. Your health points are now 11 - 3 = 8. You get 1 point because 8 &gt;= 4.
 *
 * Enter room 2. Your health points are now 8 - 6 = 2. You get 1 point because 2 &gt;= 2.
 *
 * Enter room 3. Your health points are now 2 - 7 = -5. You do not get any points because -5 &lt; 5.
 *
 * Example 2:
 *
 * Input: hp = 2, damage = [10000,1], requirement = [1,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * score(1) = 0, score(2) = 1. The total score is 0 + 1 = 1.
 *
 *
 * score(1) = 0 because you do not get any points if you start from room 1.
 *
 *
 * You start with 2 health points.
 *
 * Enter room 1. Your health points are now 2 - 10000 = -9998. You do not get any points because -9998 &lt; 1.
 *
 * Enter room 2. Your health points are now -9998 - 1 = -9999. You do not get any points because -9999 &lt; 1.
 *
 * score(2) = 1 because you get 1 point if you start from room 2.
 *
 *
 * You start with 2 health points.
 *
 * Enter room 2. Your health points are now 2 - 1 = 1. You get 1 point because 1 &gt;= 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= hp &lt;= 109
 *
 * 1 &lt;= n == damage.length == requirement.length &lt;= 105
 *
 * 1 &lt;= damage[i], requirement[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use prefix sums on the damage. Create <code>pref</code> with the prefix sums.
 * Hint 2: Initially, the total points/score is the total number of subarrays <code>n * (n + 1) / 2</code>.
 * Hint 3: We need to subtract subarrays <code>[i, j]</code> that do not satisfy <code>hp - (pref[j] - pref[i-1]) &gt;= requirement[j]</code>. The inequality is equivalent to <code>pref[i-1] &gt;= requirement[j] - hp + pref[j]</code>.
 * Hint 4: For each <code>j</code>, count the previous <code>i</code>s with <code>pref[i-1] &lt; requirement[j] - hp + pref[j]</code> using binary search or an ordered data structure.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/total-score-of-dungeon-runs/">LeetCode #3771</a>
 */
public class TotalScoreOfDungeonRuns {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Total Score of Dungeon Runs");
    }

    public static void main(String[] args) {
        System.out.println("=== TotalScoreOfDungeonRuns ===");
        TotalScoreOfDungeonRuns sol = new TotalScoreOfDungeonRuns();
        System.out.println(sol.solve(null));
    }
}
