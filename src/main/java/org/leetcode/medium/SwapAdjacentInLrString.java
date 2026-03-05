package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #777: Swap Adjacent in LR String
 * @see <a href="https://leetcode.com/problems/swap-adjacent-in-lr-string/">Problem</a>
 */
public class SwapAdjacentInLrString {

    /**
     * LeetCode #777 – Swap Adjacent in LR String
     * Difficulty: MEDIUM
     * Topics: Two Pointers, String
     *
     * In a string composed of 'L', 'R', and 'X' characters, like "RXXLRXRXL", a
     * move consists of either replacing one occurrence of "XL" with "LX", or
     * replacing one occurrence of "RX" with "XR". Given the starting string start
     * and the ending string result, return True if and only if there exists a
     * sequence of moves to transform start to result.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: start = "RXXLRXRXL", result = "XRLXXRRLX"
     * Output: true
     * Explanation: We can transform start to result following these steps:
     * RXXLRXRXL -&gt;
     * XRXLRXRXL -&gt;
     * XRLXRXRXL -&gt;
     * XRLXXRRXL -&gt;
     * XRLXXRRLX
     * 
     * Example 2:
     * 
     * Input: start = "X", result = "L"
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= start.length &lt;= 104
     * 
     * start.length == result.length
     * 
     * Both start and result will only consist of characters in 'L', 'R', and 'X'.
     */
    // TODO: Implement solution for Swap Adjacent in LR String
    // Difficulty: MEDIUM | Topics: Two Pointers, String
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        SwapAdjacentInLrString sol = new SwapAdjacentInLrString();
        System.out.println(sol.solve());
    }
}
