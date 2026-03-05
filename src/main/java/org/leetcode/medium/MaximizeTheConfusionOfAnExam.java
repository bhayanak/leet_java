package org.leetcode.medium;


/**
 * <b>#2024 - Maximize the Confusion of an Exam</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Binary Search, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A teacher is writing a test with n true/false questions, with 'T' denoting true and 'F' denoting false. He wants to confuse the students by maximizing the number of consecutive questions with the same answer (multiple trues or multiple falses in a row).
 *
 *
 * You are given a string answerKey, where answerKey[i] is the original answer to the ith question. In addition, you are given an integer k, the maximum number of times you may perform the following operation:
 *
 *
 * Change the answer key for any question to 'T' or 'F' (i.e., set answerKey[i] to 'T' or 'F').
 *
 * Return the maximum number of consecutive 'T's or 'F's in the answer key after performing the operation at most k times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: answerKey = "TTFF", k = 2
 * Output: 4
 * Explanation: We can replace both the 'F's with 'T's to make answerKey = "TTTT".
 * There are four consecutive 'T's.
 *
 * Example 2:
 *
 * Input: answerKey = "TFFT", k = 1
 * Output: 3
 * Explanation: We can replace the first 'T' with an 'F' to make answerKey = "FFFT".
 * Alternatively, we can replace the second 'T' with an 'F' to make answerKey = "TFFF".
 * In both cases, there are three consecutive 'F's.
 *
 * Example 3:
 *
 * Input: answerKey = "TTFTTFTT", k = 1
 * Output: 5
 * Explanation: We can replace the first 'F' to make answerKey = "TTTTTFTT"
 * Alternatively, we can replace the second 'F' to make answerKey = "TTFTTTTT". 
 * In both cases, there are five consecutive 'T's.
 *
 *
 *
 * Constraints:
 *
 *
 * n == answerKey.length
 *
 * 1 &lt;= n &lt;= 5 * 104
 *
 * answerKey[i] is either 'T' or 'F'
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use the maximum length at the previous position to help us find the answer for the current position?
 * Hint 2: Can we use binary search to find the maximum consecutive same answer at every position?
 *
 * <h2>Approach</h2>
 * Think about the category (String, Binary Search, Sliding Window, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-confusion-of-an-exam/">LeetCode #2024</a>
 */
public class MaximizeTheConfusionOfAnExam {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Confusion of an Exam");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheConfusionOfAnExam ===");
        MaximizeTheConfusionOfAnExam sol = new MaximizeTheConfusionOfAnExam();
        System.out.println(sol.solve(null));
    }
}
