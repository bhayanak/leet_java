package org.leetcode.easy;


/**
 * <b>#1678 - Goal Parser Interpretation</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
 *
 *
 * Given the string command, return the Goal Parser's interpretation of command.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: command = "G()(al)"
 * Output: "Goal"
 * Explanation: The Goal Parser interprets the command as follows:
 * G -&gt; G
 * () -&gt; o
 * (al) -&gt; al
 * The final concatenated result is "Goal".
 *
 * Example 2:
 *
 * Input: command = "G()()()()(al)"
 * Output: "Gooooal"
 *
 * Example 3:
 *
 * Input: command = "(al)G(al)()()G"
 * Output: "alGalooG"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= command.length &lt;= 100
 *
 * command consists of "G", "()", and/or "(al)" in some order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You need to check at most 2 characters to determine which character comes next.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/goal-parser-interpretation/">LeetCode #1678</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class GoalParserInterpretation {

    /**
     * Solves the problem: Interpret.
     *
     * @param command the command (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        GoalParserInterpretation sol = new GoalParserInterpretation();
                System.out.println(sol.interpret("G()(al)"));        // "Goal"
                System.out.println(sol.interpret("G()()()()(al)")); // "Gooooal"
                System.out.println(sol.interpret("(al)G(al)()()G")); // "alGalooG"
    }
}
