package org.leetcode.medium;


/**
 * <b>#3799 - Word Squares II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Backtracking, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string array words, consisting of distinct 4-letter strings, each containing lowercase English letters.
 *
 *
 * A word square consists of 4 distinct words: top, left, right and bottom, arranged as follows:
 *
 *
 * top forms the top row.
 *
 * bottom forms the bottom row.
 *
 * left forms the left column (top to bottom).
 *
 * right forms the right column (top to bottom).
 *
 * It must satisfy:
 *
 *
 * top[0] == left[0], top[3] == right[0]
 *
 * bottom[0] == left[3], bottom[3] == right[3]
 *
 * Return all valid distinct word squares, sorted in ascending lexicographic order by the 4-tuple (top, left, right, bottom)​​​​​​​.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["able","area","echo","also"]
 *
 *
 * Output: [["able","area","echo","also"],["area","able","also","echo"]]
 *
 *
 * Explanation:
 *
 *
 * There are exactly two valid 4-word squares that satisfy all corner constraints:
 *
 *
 * "able" (top), "area" (left), "echo" (right), "also" (bottom)
 *
 *
 *
 *
 * top[0] == left[0] == 'a'
 *
 * top[3] == right[0] == 'e'
 *
 * bottom[0] == left[3] == 'a'
 *
 * bottom[3] == right[3] == 'o'
 *
 *
 *
 * "area" (top), "able" (left), "also" (right), "echo" (bottom)
 *
 *
 *
 * All corner constraints are satisfied.
 *
 *
 *
 * Thus, the answer is [["able","area","echo","also"],["area","able","also","echo"]].
 *
 * Example 2:
 *
 * Input: words = ["code","cafe","eden","edge"]
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * No combination of four words satisfies all four corner constraints. Thus, the answer is empty array [].
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= words.length &lt;= 15
 *
 * words[i].length == 4
 *
 * words[i] consists of only lowercase English letters.
 *
 * All words[i] are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use bruteforce
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Backtracking, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/word-squares-ii/">LeetCode #3799</a>
 */
public class WordSquaresIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Word Squares II");
    }

    public static void main(String[] args) {
        System.out.println("=== WordSquaresIi ===");
        WordSquaresIi sol = new WordSquaresIi();
        System.out.println(sol.solve(null));
    }
}
