package org.leetcode.easy;


/**
 * <b>#1221 - Split a String in Balanced Strings</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 *
 *
 * Given a balanced string s, split it into some number of substrings such that:
 *
 *
 * Each substring is balanced.
 *
 * Return the maximum number of balanced strings you can obtain.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "RLRRLLRLRL"
 * Output: 4
 * Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 *
 * Example 2:
 *
 * Input: s = "RLRRRLLRLL"
 * Output: 2
 * Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
 * Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
 *
 * Example 3:
 *
 * Input: s = "LLLLRRRR"
 * Output: 1
 * Explanation: s can be split into "LLLLRRRR".
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 1000
 *
 * s[i] is either 'L' or 'R'.
 *
 * s is a balanced string.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Loop from left to right maintaining a balance variable when it gets an L increase it by one otherwise decrease it by one.
 * Hint 2: Whenever the balance variable reaches zero then we increase the answer by one.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/split-a-string-in-balanced-strings/">LeetCode #1221</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class SplitAStringInBalancedStrings {

    /**
     * Solves the problem: Balanced string split.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int balancedStringSplit(String s) {
        int count=0, bal=0;
        for (char c : s.toCharArray()) {
            bal += (c=='L') ? 1 : -1;
            if (bal==0) count++;
        }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        SplitAStringInBalancedStrings sol = new SplitAStringInBalancedStrings();
                System.out.println(sol.balancedStringSplit("RLRRLLRLRL")); // 4
                System.out.println(sol.balancedStringSplit("RLRRRLLRLL")); // 2
                System.out.println(sol.balancedStringSplit("LLLLRRRR"));   // 1
    }
}
