package org.leetcode.medium;


/**
 * <b>#1996 - The Number of Weak Characters in the Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Greedy, Sorting, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are playing a game that contains multiple characters, and each of the characters has two main properties: attack and defense. You are given a 2D integer array properties where properties[i] = [attacki, defensei] represents the properties of the ith character in the game.
 *
 *
 * A character is said to be weak if any other character has both attack and defense levels strictly greater than this character's attack and defense levels. More formally, a character i is said to be weak if there exists another character j where attackj &gt; attacki and defensej &gt; defensei.
 *
 *
 * Return the number of weak characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: properties = [[5,5],[6,3],[3,6]]
 * Output: 0
 * Explanation: No character has strictly greater attack and defense than the other.
 *
 * Example 2:
 *
 * Input: properties = [[2,2],[3,3]]
 * Output: 1
 * Explanation: The first character is weak because the second character has a strictly greater attack and defense.
 *
 * Example 3:
 *
 * Input: properties = [[1,5],[10,4],[4,3]]
 * Output: 1
 * Explanation: The third character is weak because the second character has a strictly greater attack and defense.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= properties.length &lt;= 105
 *
 * properties[i].length == 2
 *
 * 1 &lt;= attacki, defensei &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array on the basis of the attack values and group characters with the same attack together. How can you use these groups?
 * Hint 2: Characters in one group will always have a lesser attack value than the characters of the next group. Hence, we will only need to check if there is a higher defense value present in the next groups.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Greedy, Sorting, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/the-number-of-weak-characters-in-the-game/">LeetCode #1996</a>
 */
public class TheNumberOfWeakCharactersInTheGame {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: The Number of Weak Characters in the Game");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TheNumberOfWeakCharactersInTheGame ===");
        TheNumberOfWeakCharactersInTheGame sol = new TheNumberOfWeakCharactersInTheGame();
        System.out.println(sol.solve(null));
    }
}
