package org.leetcode.medium;


/**
 * <b>#2375 - Construct Smallest Number From DI String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking, Stack, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string pattern of length n consisting of the characters 'I' meaning increasing and 'D' meaning decreasing.
 *
 *
 * A 0-indexed string num of length n + 1 is created using the following conditions:
 *
 *
 * num consists of the digits '1' to '9', where each digit is used at most once.
 *
 * If pattern[i] == 'I', then num[i] &lt; num[i + 1].
 *
 * If pattern[i] == 'D', then num[i] &gt; num[i + 1].
 *
 * Return the lexicographically smallest possible string num that meets the conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: pattern = "IIIDIDDD"
 * Output: "123549876"
 * Explanation:
 * At indices 0, 1, 2, and 4 we must have that num[i] &lt; num[i+1].
 * At indices 3, 5, 6, and 7 we must have that num[i] &gt; num[i+1].
 * Some possible values of num are "245639871", "135749862", and "123849765".
 * It can be proven that "123549876" is the smallest possible num that meets the conditions.
 * Note that "123414321" is not possible because the digit '1' is used more than once.
 *
 * Example 2:
 *
 * Input: pattern = "DDD"
 * Output: "4321"
 * Explanation:
 * Some possible values of num are "9876", "7321", and "8742".
 * It can be proven that "4321" is the smallest possible num that meets the conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pattern.length &lt;= 8
 *
 * pattern consists of only the letters 'I' and 'D'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: With the constraints, could we generate every possible string?
 * Hint 2: Yes we can. Now we just need to check if the string meets all the conditions.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Backtracking, Stack, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/construct-smallest-number-from-di-string/">LeetCode #2375</a>
 */
public class ConstructSmallestNumberFromDiString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Construct Smallest Number From DI String");
    }

    public static void main(String[] args) {
        System.out.println("=== ConstructSmallestNumberFromDiString ===");
        ConstructSmallestNumberFromDiString sol = new ConstructSmallestNumberFromDiString();
        System.out.println(sol.solve(null));
    }
}
