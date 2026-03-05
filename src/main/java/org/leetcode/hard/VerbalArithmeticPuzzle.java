package org.leetcode.hard;


/**
 * <b>#1307 - Verbal Arithmetic Puzzle</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an equation, represented by words on the left side and the result on the right side.
 *
 *
 * You need to check if the equation is solvable under the following rules:
 *
 *
 * Each character is decoded as one digit (0 - 9).
 *
 * No two characters can map to the same digit.
 *
 * Each words[i] and result are decoded as one number without leading zeros.
 *
 * Sum of numbers on the left side (words) will equal to the number on the right side (result).
 *
 * Return true if the equation is solvable, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["SEND","MORE"], result = "MONEY"
 * Output: true
 * Explanation: Map 'S'-&gt; 9, 'E'-&gt;5, 'N'-&gt;6, 'D'-&gt;7, 'M'-&gt;1, 'O'-&gt;0, 'R'-&gt;8, 'Y'-&gt;'2'
 * Such that: "SEND" + "MORE" = "MONEY" ,  9567 + 1085 = 10652
 *
 * Example 2:
 *
 * Input: words = ["SIX","SEVEN","SEVEN"], result = "TWENTY"
 * Output: true
 * Explanation: Map 'S'-&gt; 6, 'I'-&gt;5, 'X'-&gt;0, 'E'-&gt;8, 'V'-&gt;7, 'N'-&gt;2, 'T'-&gt;1, 'W'-&gt;'3', 'Y'-&gt;4
 * Such that: "SIX" + "SEVEN" + "SEVEN" = "TWENTY" ,  650 + 68782 + 68782 = 138214
 *
 * Example 3:
 *
 * Input: words = ["LEET","CODE"], result = "POINT"
 * Output: false
 * Explanation: There is no possible mapping to satisfy the equation, so we return false.
 * Note that two different characters cannot map to the same digit.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= words.length &lt;= 5
 *
 * 1 &lt;= words[i].length, result.length &lt;= 7
 *
 * words[i], result contain only uppercase English letters.
 *
 * The number of different characters used in the expression is at most 10.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Backtracking and pruning to solve this problem.
 * Hint 2: If you set the values of some digits (from right to left), the other digits will be constrained.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, String, Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/verbal-arithmetic-puzzle/">LeetCode #1307</a>
 */
public class VerbalArithmeticPuzzle {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Verbal Arithmetic Puzzle");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== VerbalArithmeticPuzzle ===");
        VerbalArithmeticPuzzle sol = new VerbalArithmeticPuzzle();
        System.out.println(sol.solve(null));
    }
}
