package org.leetcode.medium;


/**
 * <b>#3412 - Find Mirror Score of a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s.
 *
 *
 * We define the mirror of a letter in the English alphabet as its corresponding letter when the alphabet is reversed. For example, the mirror of 'a' is 'z', and the mirror of 'y' is 'b'.
 *
 *
 * Initially, all characters in the string s are unmarked.
 *
 *
 * You start with a score of 0, and you perform the following process on the string s:
 *
 *
 * Iterate through the string from left to right.
 *
 * At each index i, find the closest unmarked index j such that j &lt; i and s[j] is the mirror of s[i]. Then, mark both indices i and j, and add the value i - j to the total score.
 *
 * If no such index j exists for the index i, move on to the next index without making any changes.
 *
 * Return the total score at the end of the process.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aczzx"
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * i = 0. There is no index j that satisfies the conditions, so we skip.
 *
 * i = 1. There is no index j that satisfies the conditions, so we skip.
 *
 * i = 2. The closest index j that satisfies the conditions is j = 0, so we mark both indices 0 and 2, and then add 2 - 0 = 2 to the score.
 *
 * i = 3. There is no index j that satisfies the conditions, so we skip.
 *
 * i = 4. The closest index j that satisfies the conditions is j = 1, so we mark both indices 1 and 4, and then add 4 - 1 = 3 to the score.
 *
 * Example 2:
 *
 * Input: s = "abcdef"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * For each index i, there is no index j that satisfies the conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a stack for every character.
 * Hint 2: For each index, check if the stack for mirror of the letter at that index is empty.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Stack, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/find-mirror-score-of-a-string/">LeetCode #3412</a>
 */
public class FindMirrorScoreOfAString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Mirror Score of a String");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMirrorScoreOfAString ===");
        FindMirrorScoreOfAString sol = new FindMirrorScoreOfAString();
        System.out.println(sol.solve(null));
    }
}
