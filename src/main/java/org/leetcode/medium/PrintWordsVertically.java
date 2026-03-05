package org.leetcode.medium;


/**
 * <b>#1324 - Print Words Vertically</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s. Return all the words vertically in the same order in which they appear in s.
 *
 * Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
 *
 * Each word would be put on only one column and that in one column there will be only one word.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: s = "HOW ARE YOU"
 * Output: ["HAY","ORO","WEU"]
 * Explanation: Each word is printed vertically. 
 *  "HAY"
 *  "ORO"
 *  "WEU"
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: s = "TO BE OR NOT TO BE"
 * Output: ["TBONTB","OEROOE","   T"]
 * Explanation: Trailing spaces is not allowed. 
 * "TBONTB"
 * "OEROOE"
 * "   T"
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: s = "CONTEST IS COMING"
 * Output: ["CIC","OSO","N M","T I","E N","S G","T"]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= s.length &lt;= 200
 *
 * s contains only upper case English letters.
 *
 * It's guaranteed that there is only one space between 2 words.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the maximum length of words to determine the length of the returned answer. However, don't forget to remove trailing spaces.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/print-words-vertically/">LeetCode #1324</a>
 */
public class PrintWordsVertically {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Print Words Vertically");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PrintWordsVertically ===");
        PrintWordsVertically sol = new PrintWordsVertically();
        System.out.println(sol.solve(null));
    }
}
