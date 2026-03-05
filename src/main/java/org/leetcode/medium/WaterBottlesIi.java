package org.leetcode.medium;


/**
 * <b>#3100 - Water Bottles II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers numBottles and numExchange.
 *
 *
 * numBottles represents the number of full water bottles that you initially have. In one operation, you can perform one of the following operations:
 *
 *
 * Drink any number of full water bottles turning them into empty bottles.
 *
 * Exchange numExchange empty bottles with one full water bottle. Then, increase numExchange by one.
 *
 * Note that you cannot exchange multiple batches of empty bottles for the same value of numExchange. For example, if numBottles == 3 and numExchange == 1, you cannot exchange 3 empty water bottles for 3 full bottles.
 *
 *
 * Return the maximum number of water bottles you can drink.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numBottles = 13, numExchange = 6
 * Output: 15
 * Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
 *
 * Example 2:
 *
 * Input: numBottles = 10, numExchange = 3
 * Output: 13
 * Explanation: The table above shows the number of full water bottles, empty water bottles, the value of numExchange, and the number of bottles drunk.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= numBottles &lt;= 100 
 *
 * 1 &lt;= numExchange &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process step by step. At each step, drink <code>numExchange</code> bottles of water then exchange them for a full bottle. Keep repeating this step until you cannot exchange  bottles anymore.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/water-bottles-ii/">LeetCode #3100</a>
 */
public class WaterBottlesIi {

    /**
     * Solves the problem: Watering plants.
     *
     * @param plants the plants (int[])
     * @param capacity the capacity (int)
     * @return the computed int result
     */
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0, water=capacity;
        for (int i=0;i<plants.length;i++) {
            if (water<plants[i]) { steps+=2*i; water=capacity; }
            water-=plants[i]; steps++;
        }
        return steps;
    }

    public static void main(String[] args) {
        WaterBottlesIi sol = new WaterBottlesIi();
        System.out.println(sol.wateringPlants(new int[]{1,2,3}, 0));
    }
}
