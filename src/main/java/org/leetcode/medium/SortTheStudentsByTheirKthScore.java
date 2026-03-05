package org.leetcode.medium;


/**
 * <b>#2545 - Sort the Students by Their Kth Score</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a class with m students and n exams. You are given a 0-indexed m x n integer matrix score, where each row represents one student and score[i][j] denotes the score the ith student got in the jth exam. The matrix score contains distinct integers only.
 *
 *
 * You are also given an integer k. Sort the students (i.e., the rows of the matrix) by their scores in the kth (0-indexed) exam from the highest to the lowest.
 *
 *
 * Return the matrix after sorting it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2
 * Output: [[7,5,11,2],[10,6,9,1],[4,8,3,15]]
 * Explanation: In the above diagram, S denotes the student, while E denotes the exam.
 * - The student with index 1 scored 11 in exam 2, which is the highest score, so they got first place.
 * - The student with index 0 scored 9 in exam 2, which is the second highest score, so they got second place.
 * - The student with index 2 scored 3 in exam 2, which is the lowest score, so they got third place.
 *
 * Example 2:
 *
 * Input: score = [[3,4],[5,6]], k = 0
 * Output: [[5,6],[3,4]]
 * Explanation: In the above diagram, S denotes the student, while E denotes the exam.
 * - The student with index 1 scored 5 in exam 0, which is the highest score, so they got first place.
 * - The student with index 0 scored 3 in exam 0, which is the lowest score, so they got second place.
 *
 *
 *
 * Constraints:
 *
 *
 * m == score.length
 *
 * n == score[i].length
 *
 * 1 &lt;= m, n &lt;= 250
 *
 * 1 &lt;= score[i][j] &lt;= 105
 *
 * score consists of distinct integers.
 *
 * 0 &lt;= k &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the row with the highest score in the kth exam and swap it with the first row.
 * Hint 2: After fixing the first row, perform the same operation for the rest of the rows, and the matrix's rows will get sorted one by one.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/sort-the-students-by-their-kth-score/">LeetCode #2545</a>
 */
public class SortTheStudentsByTheirKthScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sort the Students by Their Kth Score");
    }

    public static void main(String[] args) {
        System.out.println("=== SortTheStudentsByTheirKthScore ===");
        SortTheStudentsByTheirKthScore sol = new SortTheStudentsByTheirKthScore();
        System.out.println(sol.solve(null));
    }
}
