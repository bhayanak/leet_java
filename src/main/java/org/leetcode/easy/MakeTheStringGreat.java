package org.leetcode.easy;


/**
 * <b>#1544 - Make The String Great</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s of lower and upper case English letters.
 *
 *
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 *
 *
 * 0 &lt;= i &lt;= s.length - 2
 *
 * s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 *
 * To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
 *
 *
 * Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 *
 *
 * Notice that an empty string is also good.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leEeetcode"
 * Output: "leetcode"
 * Explanation: In the first step, either you choose i = 1 or i = 2, both will result "leEeetcode" to be reduced to "leetcode".
 *
 * Example 2:
 *
 * Input: s = "abBAcC"
 * Output: ""
 * Explanation: We have many possible scenarios, and all lead to the same answer. For example:
 * "abBAcC" --&gt; "aAcC" --&gt; "cC" --&gt; ""
 * "abBAcC" --&gt; "abBA" --&gt; "aA" --&gt; ""
 *
 * Example 3:
 *
 * Input: s = "s"
 * Output: "s"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s contains only lower and upper case English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The order you choose 2 characters to remove doesn't matter.
 * Hint 2: Keep applying the mentioned step to s till the length of the string is not changed.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/make-the-string-great/">LeetCode #1544</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class MakeTheStringGreat {

    /**
     * Solves the problem: Make good.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length()>0 && Math.abs(sb.charAt(sb.length()-1)-c)==32)
                sb.deleteCharAt(sb.length()-1);
            else sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MakeTheStringGreat sol = new MakeTheStringGreat();
                System.out.println(sol.makeGood("leEeetcode")); // "leetcode"
                System.out.println(sol.makeGood("abBAcC"));     // ""
                System.out.println(sol.makeGood("s"));           // "s"
    }
}
