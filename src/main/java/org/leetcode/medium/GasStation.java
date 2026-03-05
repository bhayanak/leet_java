package org.leetcode.medium;

/**
 * <b>#134 - Gas Station</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * 
 * 
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 * 
 * 
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
 * Output: 3
 * Explanation:
 * Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
 * Travel to station 4. Your tank = 4 - 1 + 5 = 8
 * Travel to station 0. Your tank = 8 - 2 + 1 = 7
 * Travel to station 1. Your tank = 7 - 3 + 2 = 6
 * Travel to station 2. Your tank = 6 - 4 + 3 = 5
 * Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
 * Therefore, return 3 as the starting index.
 * 
 * Example 2:
 * 
 * Input: gas = [2,3,4], cost = [3,4,3]
 * Output: -1
 * Explanation:
 * You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
 * Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
 * Travel to station 0. Your tank = 4 - 3 + 2 = 3
 * Travel to station 1. Your tank = 3 - 3 + 3 = 3
 * You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
 * Therefore, you can't travel around the circuit once no matter where you start.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == gas.length == cost.length
 * 	
 * 1 &lt;= n &lt;= 105
 * 	
 * 0 &lt;= gas[i], cost[i] &lt;= 104
 * 	
 * The input is generated such that the answer is unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Two observations:
 * 1. If total gas &gt;= total cost, a solution always exists.
 * 2. If we run out of gas at station k, no station from 0..k can be the start.
 * So reset start to k+1 whenever tank goes negative.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/gas-station/">LeetCode #134</a>
 */
public class GasStation {

    /**
     * Finds the starting gas station index to complete a circular route, or -1.
     * @param gas  gas available at each station
     * @param cost gas cost to travel to the next station
     * @return starting station index, or -1 if impossible
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0, curTank = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            int net = gas[i] - cost[i];
            totalTank += net;
            curTank   += net;
            if (curTank < 0) { start = i + 1; curTank = 0; } // reset
        }
        return totalTank >= 0 ? start : -1;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac GasStation.java &amp;&amp; java org.leetcode.medium.GasStation
     *
     * @param args not used
     */
    public static void main(String[] args) {
        GasStation sol = new GasStation();
        System.out.println(sol.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2})); // 3
        System.out.println(sol.canCompleteCircuit(new int[]{2,3,4},     new int[]{3,4,3}));     // -1
    }
}
