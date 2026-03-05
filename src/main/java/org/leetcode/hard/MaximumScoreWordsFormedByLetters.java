package org.leetcode.hard;


/**
 * <b>#1255 - Maximum Score Words Formed by Letters</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Dynamic Programming, Backtracking, Bit Manipulation, Counting, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a list of words, list of  single letters (might be repeating) and score of every character.
 *
 *
 * Return the maximum score of any valid set of words formed by using the given letters (words[i] cannot be used two or more times).
 *
 *
 * It is not necessary to use all characters in letters and each letter can only be used once. Score of letters 'a', 'b', 'c', ... ,'z' is given by score[0], score[1], ... , score[25] respectively.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["dog","cat","dad","good"], letters = ["a","a","c","d","d","d","g","o","o"], score = [1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]
 * Output: 23
 * Explanation:
 * Score  a=1, c=9, d=5, g=3, o=2
 * Given letters, we can form the words "dad" (5+1+5) and "good" (3+2+2+5) with a score of 23.
 * Words "dad" and "dog" only get a score of 21.
 *
 * Example 2:
 *
 * Input: words = ["xxxz","ax","bx","cx"], letters = ["z","a","b","c","x","x","x"], score = [4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]
 * Output: 27
 * Explanation:
 * Score  a=4, b=4, c=4, x=5, z=10
 * Given letters, we can form the words "ax" (4+5), "bx" (4+5) and "cx" (4+5) with a score of 27.
 * Word "xxxz" only get a score of 25.
 *
 * Example 3:
 *
 * Input: words = ["leetcode"], letters = ["l","e","t","c","o","d"], score = [0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]
 * Output: 0
 * Explanation:
 * Letter "e" can only be used once.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 14
 *
 * 1 &lt;= words[i].length &lt;= 15
 *
 * 1 &lt;= letters.length &lt;= 100
 *
 * letters[i].length == 1
 *
 * score.length == 26
 *
 * 0 &lt;= score[i] &lt;= 10
 *
 * words[i], letters[i] contains only lower case English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that words.length is small. This means you can iterate over every subset of words (2^N).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Dynamic Programming, Backtracking, Bit Manipulation, Counting, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-words-formed-by-letters/">LeetCode #1255</a>
 */
public class MaximumScoreWordsFormedByLetters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score Words Formed by Letters");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumScoreWordsFormedByLetters ===");
        MaximumScoreWordsFormedByLetters sol = new MaximumScoreWordsFormedByLetters();
        System.out.println(sol.solve(null));
    }
}
