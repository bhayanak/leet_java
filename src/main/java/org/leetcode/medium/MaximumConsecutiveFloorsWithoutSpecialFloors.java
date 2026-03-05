package org.leetcode.medium;


/**
 * <b>#2274 - Maximum Consecutive Floors Without Special Floors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice manages a company and has rented some floors of a building as office space. Alice has decided some of these floors should be special floors, used for relaxation only.
 *
 *
 * You are given two integers bottom and top, which denote that Alice has rented all the floors from bottom to top (inclusive). You are also given the integer array special, where special[i] denotes a special floor that Alice has designated for relaxation.
 *
 *
 * Return the maximum number of consecutive floors without a special floor.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: bottom = 2, top = 9, special = [4,6]
 * Output: 3
 * Explanation: The following are the ranges (inclusive) of consecutive floors without a special floor:
 * - (2, 3) with a total amount of 2 floors.
 * - (5, 5) with a total amount of 1 floor.
 * - (7, 9) with a total amount of 3 floors.
 * Therefore, we return the maximum number which is 3 floors.
 *
 * Example 2:
 *
 * Input: bottom = 6, top = 8, special = [7,6,8]
 * Output: 0
 * Explanation: Every floor rented is a special floor, so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= special.length &lt;= 105
 *
 * 1 &lt;= bottom &lt;= special[i] &lt;= top &lt;= 109
 *
 * All the values of special are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Say we have a pair of special floors (x, y) with no other special floors in between. There are x - y - 1 consecutive floors in between them without a special floor.
 * Hint 2: Say there are n special floors. After sorting special, we have answer = max(answer, special[i] – special[i – 1] – 1) for all 0 &lt; i &lt; n.
 * Hint 3: However, there are two special cases left to consider: the floors before special[0] and after special[n-1].
 * Hint 4: To consider these cases, we have answer = max(answer, special[0] – bottom, top – special[n-1]).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-consecutive-floors-without-special-floors/">LeetCode #2274</a>
 */
public class MaximumConsecutiveFloorsWithoutSpecialFloors {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Consecutive Floors Without Special Floors");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumConsecutiveFloorsWithoutSpecialFloors ===");
        MaximumConsecutiveFloorsWithoutSpecialFloors sol = new MaximumConsecutiveFloorsWithoutSpecialFloors();
        System.out.println(sol.solve(null));
    }
}
