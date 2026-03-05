package org.leetcode.easy;


/**
 * <b>#1758 - Minimum Changes To Make Alternating Binary String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.
 *
 *
 * The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.
 *
 *
 * Return the minimum number of operations needed to make s alternating.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "0100"
 * Output: 1
 * Explanation: If you change the last character to '1', s will be "0101", which is alternating.
 *
 * Example 2:
 *
 * Input: s = "10"
 * Output: 0
 * Explanation: s is already alternating.
 *
 * Example 3:
 *
 * Input: s = "1111"
 * Output: 2
 * Explanation: You need two operations to reach "0101" or "1010".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 104
 *
 * s[i] is either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about how the final string will look like.
 * Hint 2: It will either start with a '0' and be like '010101010..' or with a '1' and be like '10101010..'
 * Hint 3: Try both ways, and check for each way, the number of changes needed to reach it from the given string. The answer is the minimum of both ways.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/">LeetCode #1758</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumChangesToMakeAlternatingBinaryString {

    /**
     * Computes the minimum Min operations.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minOperations(String s) {
        int cost=0;
        for (int i=0;i<s.length();i++)
            if (s.charAt(i)-'0' != i%2) cost++;
        return Math.min(cost, s.length()-cost);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MinimumChangesToMakeAlternatingBinaryString sol = new MinimumChangesToMakeAlternatingBinaryString();
                System.out.println(sol.minOperations("0100")); // 1
                System.out.println(sol.minOperations("1111")); // 2
                System.out.println(sol.minOperations("10"));   // 0
    }
}
