package org.leetcode.hard;


/**
 * <b>#1349 - Maximum Students Taking Exam</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Matrix, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a m * n matrix seats  that represent seats distributions in a classroom. If a seat is broken, it is denoted by '#' character otherwise it is denoted by a '.' character.
 *
 *
 * Students can see the answers of those sitting next to the left, right, upper left and upper right, but he cannot see the answers of the student sitting directly in front or behind him. Return the maximum number of students that can take the exam together without any cheating being possible.
 *
 *
 * Students must be placed in seats in good condition.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: seats = [["#",".","#","#",".","#"],
 *                 [".","#","#","#","#","."],
 *                 ["#",".","#","#",".","#"]]
 * Output: 4
 * Explanation: Teacher can place 4 students in available seats so they don't cheat on the exam. 
 *
 * Example 2:
 *
 * Input: seats = [[".","#"],
 *                 ["#","#"],
 *                 ["#","."],
 *                 ["#","#"],
 *                 [".","#"]]
 * Output: 3
 * Explanation: Place all students in available seats. 
 *
 * Example 3:
 *
 * Input: seats = [["#",".",".",".","#"],
 *                 [".","#",".","#","."],
 *                 [".",".","#",".","."],
 *                 [".","#",".","#","."],
 *                 ["#",".",".",".","#"]]
 * Output: 10
 * Explanation: Place students in available seats in column 1, 3 and 5.
 *
 *
 *
 * Constraints:
 *
 *
 * seats contains only characters '.' and'#'.
 *
 * m == seats.length
 *
 * n == seats[i].length
 *
 * 1 &lt;= m &lt;= 8
 *
 * 1 &lt;= n &lt;= 8
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Students in row i only can see exams in row i+1.
 * Hint 2: Use Dynamic programming to compute the result given a (current row, bitmask people seated in previous row).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Matrix, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-students-taking-exam/">LeetCode #1349</a>
 */
public class MaximumStudentsTakingExam {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Students Taking Exam");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumStudentsTakingExam ===");
        MaximumStudentsTakingExam sol = new MaximumStudentsTakingExam();
        System.out.println(sol.solve(null));
    }
}
