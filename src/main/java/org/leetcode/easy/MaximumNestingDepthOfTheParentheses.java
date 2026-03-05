package org.leetcode.easy;


/**
 * <b>#1614 - Maximum Nesting Depth of the Parentheses</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "(1+(2*3)+((8)/4))+1"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Digit 8 is inside of 3 nested parentheses in the string.
 *
 * Example 2:
 *
 * Input: s = "(1)+((2))+(((3)))"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Digit 3 is inside of 3 nested parentheses in the string.
 *
 * Example 3:
 *
 * Input: s = "()(())((()()))"
 *
 *
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
 *
 * It is guaranteed that parentheses expression s is a VPS.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The depth of any character in the VPS is the ( number of left brackets before it ) - ( number of right brackets before it )
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/">LeetCode #1614</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumNestingDepthOfTheParentheses {

    /**
     * Computes the maximum Max depth.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxDepth(String s) {
        int depth=0, max=0;
        for (char c : s.toCharArray()) {
            if (c=='(') max=Math.max(max,++depth);
            else if (c==')') depth--;
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses sol = new MaximumNestingDepthOfTheParentheses();
                System.out.println(sol.maxDepth("(1+(2*3)+((8)/4))+1")); // 3
                System.out.println(sol.maxDepth("(1)+((2))+(((3)))"));   // 3
                System.out.println(sol.maxDepth("1+(2*3)/(2-1)"));       // 1
    }
}
