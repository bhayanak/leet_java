package org.leetcode.medium;


/**
 * <b>#1927 - Sum Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, String, Greedy, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 *
 * You are given a string num of even length consisting of digits and '?' characters. On each turn, a player will do the following if there is still at least one '?' in num:
 *
 *
 * Choose an index i where num[i] == '?'.
 *
 * Replace num[i] with any digit between '0' and '9'.
 *
 * The game ends when there are no more '?' characters in num.
 *
 *
 * For Bob to win, the sum of the digits in the first half of num must be equal to the sum of the digits in the second half. For Alice to win, the sums must not be equal.
 *
 *
 * For example, if the game ended with num = "243801", then Bob wins because 2+4+3 = 8+0+1. If the game ended with num = "243803", then Alice wins because 2+4+3 != 8+0+3.
 *
 * Assuming Alice and Bob play optimally, return true if Alice will win and false if Bob will win.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "5023"
 * Output: false
 * Explanation: There are no moves to be made.
 * The sum of the first half is equal to the sum of the second half: 5 + 0 = 2 + 3.
 *
 * Example 2:
 *
 * Input: num = "25??"
 * Output: true
 * Explanation: Alice can replace one of the '?'s with '9' and it will be impossible for Bob to make the sums equal.
 *
 * Example 3:
 *
 * Input: num = "?3295???"
 * Output: false
 * Explanation: It can be proven that Bob will always win. One possible outcome is:
 * - Alice replaces the first '?' with '9'. num = "93295???".
 * - Bob replaces one of the '?' in the right half with '9'. num = "932959??".
 * - Alice replaces one of the '?' in the right half with '2'. num = "9329592?".
 * - Bob replaces the last '?' in the right half with '7'. num = "93295927".
 * Bob wins because 9 + 3 + 2 + 9 = 5 + 9 + 2 + 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= num.length &lt;= 105
 *
 * num.length is even.
 *
 * num consists of only digits and '?'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Bob can always make the total sum of both sides equal in mod 9.
 * Hint 2: Why does the difference between the number of question marks on the left and right side matter?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Greedy, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-game/">LeetCode #1927</a>
 */
public class SumGame {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum Game");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SumGame ===");
        SumGame sol = new SumGame();
        System.out.println(sol.solve(null));
    }
}
