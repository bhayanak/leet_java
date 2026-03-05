package org.leetcode.medium;


/**
 * <b>#3522 - Calculate Score After Performing Instructions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays, instructions and values, both of size n.
 *
 *
 * You need to simulate a process based on the following rules:
 *
 *
 * You start at the first instruction at index i = 0 with an initial score of 0.
 *
 * If instructions[i] is "add":
 *
 *
 *
 * Add values[i] to your score.
 *
 * Move to the next instruction (i + 1).
 *
 *
 *
 * If instructions[i] is "jump":
 *
 *
 *
 * Move to the instruction at index (i + values[i]) without modifying your score.
 *
 *
 *
 * The process ends when you either:
 *
 *
 * Go out of bounds (i.e., i &lt; 0 or i &gt;= n), or
 *
 * Attempt to revisit an instruction that has been previously executed. The revisited instruction is not executed.
 *
 * Return your score at the end of the process.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: instructions = ["jump","add","add","jump","add","jump"], values = [2,1,3,1,-2,-3]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Simulate the process starting at instruction 0:
 *
 *
 * At index 0: Instruction is "jump", move to index 0 + 2 = 2.
 *
 * At index 2: Instruction is "add", add values[2] = 3 to your score and move to index 3. Your score becomes 3.
 *
 * At index 3: Instruction is "jump", move to index 3 + 1 = 4.
 *
 * At index 4: Instruction is "add", add values[4] = -2 to your score and move to index 5. Your score becomes 1.
 *
 * At index 5: Instruction is "jump", move to index 5 + (-3) = 2.
 *
 * At index 2: Already visited. The process ends.
 *
 * Example 2:
 *
 * Input: instructions = ["jump","add","add"], values = [3,1,1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Simulate the process starting at instruction 0:
 *
 *
 * At index 0: Instruction is "jump", move to index 0 + 3 = 3.
 *
 * At index 3: Out of bounds. The process ends.
 *
 * Example 3:
 *
 * Input: instructions = ["jump"], values = [0]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Simulate the process starting at instruction 0:
 *
 *
 * At index 0: Instruction is "jump", move to index 0 + 0 = 0.
 *
 * At index 0: Already visited. The process ends.
 *
 *
 *
 * Constraints:
 *
 *
 * n == instructions.length == values.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * instructions[i] is either "add" or "jump".
 *
 * -105 &lt;= values[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process step by step, following the rules for each instruction.
 * Hint 2: Use a data structure to track which instructions have already been executed to detect revisits.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/calculate-score-after-performing-instructions/">LeetCode #3522</a>
 */
public class CalculateScoreAfterPerformingInstructions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Calculate Score After Performing Instructions");
    }

    public static void main(String[] args) {
        System.out.println("=== CalculateScoreAfterPerformingInstructions ===");
        CalculateScoreAfterPerformingInstructions sol = new CalculateScoreAfterPerformingInstructions();
        System.out.println(sol.solve(null));
    }
}
