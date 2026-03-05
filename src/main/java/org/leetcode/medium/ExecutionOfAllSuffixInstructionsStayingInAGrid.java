package org.leetcode.medium;


/**
 * <b>#2120 - Execution of All Suffix Instructions Staying in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an n x n grid, with the top-left cell at (0, 0) and the bottom-right cell at (n - 1, n - 1). You are given the integer n and an integer array startPos where startPos = [startrow, startcol] indicates that a robot is initially at cell (startrow, startcol).
 *
 *
 * You are also given a 0-indexed string s of length m where s[i] is the ith instruction for the robot: 'L' (move left), 'R' (move right), 'U' (move up), and 'D' (move down).
 *
 *
 * The robot can begin executing from any ith instruction in s. It executes the instructions one by one towards the end of s but it stops if either of these conditions is met:
 *
 *
 * The next instruction will move the robot off the grid.
 *
 * There are no more instructions left to execute.
 *
 * Return an array answer of length m where answer[i] is the number of instructions the robot can execute if the robot begins executing from the ith instruction in s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, startPos = [0,1], s = "RRDDLU"
 * Output: [1,5,4,3,1,0]
 * Explanation: Starting from startPos and beginning execution from the ith instruction:
 * - 0th: "RRDDLU". Only one instruction "R" can be executed before it moves off the grid.
 * - 1st:  "RDDLU". All five instructions can be executed while it stays in the grid and ends at (1, 1).
 * - 2nd:   "DDLU". All four instructions can be executed while it stays in the grid and ends at (1, 0).
 * - 3rd:    "DLU". All three instructions can be executed while it stays in the grid and ends at (0, 0).
 * - 4th:     "LU". Only one instruction "L" can be executed before it moves off the grid.
 * - 5th:      "U". If moving up, it would move off the grid.
 *
 * Example 2:
 *
 * Input: n = 2, startPos = [1,1], s = "LURD"
 * Output: [4,1,0,0]
 * Explanation:
 * - 0th: "LURD".
 * - 1st:  "URD".
 * - 2nd:   "RD".
 * - 3rd:    "D".
 *
 * Example 3:
 *
 * Input: n = 1, startPos = [0,0], s = "LRUD"
 * Output: [0,0,0,0]
 * Explanation: No matter which instruction the robot begins execution from, it would move off the grid.
 *
 *
 *
 * Constraints:
 *
 *
 * m == s.length
 *
 * 1 &lt;= n, m &lt;= 500
 *
 * startPos.length == 2
 *
 * 0 &lt;= startrow, startcol &lt; n
 *
 * s consists of 'L', 'R', 'U', and 'D'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are not very large. Can we simulate the execution by starting from each index of s?
 * Hint 2: Before any of the stopping conditions is met, stop the simulation for that index and set the answer for that index.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/execution-of-all-suffix-instructions-staying-in-a-grid/">LeetCode #2120</a>
 */
public class ExecutionOfAllSuffixInstructionsStayingInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Execution of All Suffix Instructions Staying in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== ExecutionOfAllSuffixInstructionsStayingInAGrid ===");
        ExecutionOfAllSuffixInstructionsStayingInAGrid sol = new ExecutionOfAllSuffixInstructionsStayingInAGrid();
        System.out.println(sol.solve(null));
    }
}
