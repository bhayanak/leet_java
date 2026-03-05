package org.leetcode.medium;


/**
 * <b>#2957 - Remove Adjacent Almost-Equal Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string word.
 *
 *
 * In one operation, you can pick any index i of word and change word[i] to any lowercase English letter.
 *
 *
 * Return the minimum number of operations needed to remove all adjacent almost-equal characters from word.
 *
 *
 * Two characters a and b are almost-equal if a == b or a and b are adjacent in the alphabet.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aaaaa"
 * Output: 2
 * Explanation: We can change word into "acaca" which does not have any adjacent almost-equal characters.
 * It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
 *
 * Example 2:
 *
 * Input: word = "abddez"
 * Output: 2
 * Explanation: We can change word into "ybdoez" which does not have any adjacent almost-equal characters.
 * It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 2.
 *
 * Example 3:
 *
 * Input: word = "zyxyxyz"
 * Output: 3
 * Explanation: We can change word into "zaxaxaz" which does not have any adjacent almost-equal characters. 
 * It can be shown that the minimum number of operations needed to remove all adjacent almost-equal characters from word is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 100
 *
 * word consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For <code>i &gt; 0</code>, if <code>word[i]</code> and <code>word[i - 1]</code> are adjacent, we will change <code>word[i]</code> to another character. Which character should we change it to?
 * Hint 2: We will change <code>word[i]</code> to some character that is not adjacent to <code>word[i - 1]</code> nor <code>word[i + 1]</code> (if it exists). Such a character always exists. However, since the problem does not ask for the final state of the string, It is enough to prove that the character exists and we do not need to find it.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/remove-adjacent-almost-equal-characters/">LeetCode #2957</a>
 */
public class RemoveAdjacentAlmostEqualCharacters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove Adjacent Almost-Equal Characters");
    }

    public static void main(String[] args) {
        System.out.println("=== RemoveAdjacentAlmostEqualCharacters ===");
        RemoveAdjacentAlmostEqualCharacters sol = new RemoveAdjacentAlmostEqualCharacters();
        System.out.println(sol.solve(null));
    }
}
