package org.leetcode.medium;


/**
 * <b>#3361 - Shift Distance Between Two Strings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and t of the same length, and two integer arrays nextCost and previousCost.
 *
 *
 * In one operation, you can pick any index i of s, and perform either one of the following actions:
 *
 *
 * Shift s[i] to the next letter in the alphabet. If s[i] == 'z', you should replace it with 'a'. This operation costs nextCost[j] where j is the index of s[i] in the alphabet.
 *
 * Shift s[i] to the previous letter in the alphabet. If s[i] == 'a', you should replace it with 'z'. This operation costs previousCost[j] where j is the index of s[i] in the alphabet.
 *
 * The shift distance is the minimum total cost of operations required to transform s into t.
 *
 *
 * Return the shift distance from s to t.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abab", t = "baba", nextCost = [100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], previousCost = [1,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We choose index i = 0 and shift s[0] 25 times to the previous character for a total cost of 1.
 *
 * We choose index i = 1 and shift s[1] 25 times to the next character for a total cost of 0.
 *
 * We choose index i = 2 and shift s[2] 25 times to the previous character for a total cost of 1.
 *
 * We choose index i = 3 and shift s[3] 25 times to the next character for a total cost of 0.
 *
 * Example 2:
 *
 * Input: s = "leet", t = "code", nextCost = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1], previousCost = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]
 *
 *
 * Output: 31
 *
 *
 * Explanation:
 *
 *
 * We choose index i = 0 and shift s[0] 9 times to the previous character for a total cost of 9.
 *
 * We choose index i = 1 and shift s[1] 10 times to the next character for a total cost of 10.
 *
 * We choose index i = 2 and shift s[2] 1 time to the previous character for a total cost of 1.
 *
 * We choose index i = 3 and shift s[3] 11 times to the next character for a total cost of 11.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length == t.length &lt;= 105
 *
 * s and t consist only of lowercase English letters.
 *
 * nextCost.length == previousCost.length == 26
 *
 * 0 &lt;= nextCost[i], previousCost[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: - For every unordered pair of characters <code>(a, b)</code>, the cost of turning <code>a</code> into <code>b</code> is equal to the minimum between: 
<ul>
<li>If <code>i &lt; j</code>, <code>nextCost[i] + nextCost[i + 1] + … + nextCost[j - 1]</code>, and <code>nextCost[i] + nextCost[i + 1] + … + nextCost[25] + nextCost[0] + … + nextCost[j - 1]</code> otherwise.</li>

    <li>If <code>i &lt; j</code>, <code>prevCost[i] + prevCost[i - 1] + … + prevCost[0] + prevCost[25] + … + prevCost[j + 1]</code>, and <code>prevCost[i] + prevCost[i - 1] + … + prevCost[j + 1]</code> otherwise.</li>
    </ul>
    Where <code>i</code> and <code>j</code> are the indices of <code>a</code> and <code>b</code> in the alphabet.
 * Hint 2: The shift distance is the sum of costs of turning <code>s[i]</code> into <code>t[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/shift-distance-between-two-strings/">LeetCode #3361</a>
 */
public class ShiftDistanceBetweenTwoStrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shift Distance Between Two Strings");
    }

    public static void main(String[] args) {
        System.out.println("=== ShiftDistanceBetweenTwoStrings ===");
        ShiftDistanceBetweenTwoStrings sol = new ShiftDistanceBetweenTwoStrings();
        System.out.println(sol.solve(null));
    }
}
