package org.leetcode.easy;


/**
 * <b>#1518 - Water Bottles</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are numBottles water bottles that are initially full of water. You can exchange numExchange empty water bottles from the market with one full water bottle.
 *
 *
 * The operation of drinking a full water bottle turns it into an empty bottle.
 *
 *
 * Given the two integers numBottles and numExchange, return the maximum number of water bottles you can drink.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: numBottles = 9, numExchange = 3
 * Output: 13
 * Explanation: You can exchange 3 empty bottles to get 1 full water bottle.
 * Number of water bottles you can drink: 9 + 3 + 1 = 13.
 *
 * Example 2:
 *
 * Input: numBottles = 15, numExchange = 4
 * Output: 19
 * Explanation: You can exchange 4 empty bottles to get 1 full water bottle. 
 * Number of water bottles you can drink: 15 + 3 + 1 = 19.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= numBottles &lt;= 100
 *
 * 2 &lt;= numExchange &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process until there are not enough empty bottles for even one full bottle of water.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/water-bottles/">LeetCode #1518</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class WaterBottles {

    /**
     * Solves the problem: Num water bottles.
     *
     * @param numBottles the numBottles (int)
     * @param numExchange the numExchange (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles, empty=numBottles;
        while (empty>=numExchange) {
            int new_=empty/numExchange; total+=new_; empty=empty%numExchange+new_;
        }
        return total;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        WaterBottles sol = new WaterBottles();
                System.out.println(sol.numWaterBottles(9, 3));  // 13
                System.out.println(sol.numWaterBottles(15, 4)); // 19
    }
}
