package org.leetcode.medium;


/**
 * <b>#3403 - Find the Lexicographically Largest String From the Box I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word, and an integer numFriends.
 *
 *
 * Alice is organizing a game for her numFriends friends. There are multiple rounds in the game, where in each round:
 *
 *
 * word is split into numFriends non-empty strings, such that no previous round has had the exact same split.
 *
 * All the split words are put into a box.
 *
 * Find the lexicographically largest string from the box after all the rounds are finished.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "dbca", numFriends = 2
 *
 *
 * Output: "dbc"
 *
 *
 * Explanation: 
 *
 *
 * All possible splits are:
 *
 *
 * "d" and "bca".
 *
 * "db" and "ca".
 *
 * "dbc" and "a".
 *
 * Example 2:
 *
 * Input: word = "gggg", numFriends = 4
 *
 *
 * Output: "g"
 *
 *
 * Explanation: 
 *
 *
 * The only possible split is: "g", "g", "g", and "g".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 5 * 103
 *
 * word consists only of lowercase English letters.
 *
 * 1 &lt;= numFriends &lt;= word.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find lexicographically largest substring of size <code>n - numFriends + 1</code> or less starting at every index.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/">LeetCode #3403</a>
 */
public class FindTheLexicographicallyLargestStringFromTheBoxI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Lexicographically Largest String From the Box I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheLexicographicallyLargestStringFromTheBoxI ===");
        FindTheLexicographicallyLargestStringFromTheBoxI sol = new FindTheLexicographicallyLargestStringFromTheBoxI();
        System.out.println(sol.solve(null));
    }
}
