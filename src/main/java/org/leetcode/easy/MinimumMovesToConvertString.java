package org.leetcode.easy;


/**
 * <b>#2027 - Minimum Moves to Convert String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of n characters which are either 'X' or 'O'.
 *
 *
 * A move is defined as selecting three consecutive characters of s and converting them to 'O'. Note that if a move is applied to the character 'O', it will stay the same.
 *
 *
 * Return the minimum number of moves required so that all the characters of s are converted to 'O'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "XXX"
 * Output: 1
 * Explanation: XXX -&gt; OOO
 * We select all the 3 characters and convert them in one move.
 *
 * Example 2:
 *
 * Input: s = "XXOX"
 * Output: 2
 * Explanation: XXOX -&gt; OOOX -&gt; OOOO
 * We select the first 3 characters in the first move, and convert them to 'O'.
 * Then we select the last 3 characters and convert them so that the final string contains all 'O's.
 *
 * Example 3:
 *
 * Input: s = "OOOO"
 * Output: 0
 * Explanation: There are no 'X's in s to convert.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= s.length &lt;= 1000
 *
 * s[i] is either 'X' or 'O'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the smallest substring you need to consider at a time.
 * Hint 2: Try delaying a move as long as possible.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-convert-string/">LeetCode #2027</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumMovesToConvertString {

    /**
     * Solves the problem: Minimum moves.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumMoves(String s) {
        int moves=0, i=0;
        while (i<s.length()) {
            if (s.charAt(i)=='X') { moves++; i+=3; } else i++;
        }
        return moves;
    }

    public static void main(String[] args) {
        MinimumMovesToConvertString sol = new MinimumMovesToConvertString();
                System.out.println(sol.minimumMoves("XXX"));    // 1
                System.out.println(sol.minimumMoves("XXOX"));   // 2
                System.out.println(sol.minimumMoves("OOOO"));   // 0
    }
}
