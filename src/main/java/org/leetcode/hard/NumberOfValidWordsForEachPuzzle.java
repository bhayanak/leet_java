package org.leetcode.hard;


/**
 * <b>#1178 - Number of Valid Words for Each Puzzle</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Bit Manipulation, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * With respect to a given puzzle string, a word is valid if both the following conditions are satisfied:
 *
 *
 *
 * word contains the first letter of puzzle.
 *
 * For each letter in word, that letter is in puzzle.
 *
 *
 *
 * For example, if the puzzle is "abcdefg", then valid words are "faced", "cabbage", and "baggage", while
 *
 * invalid words are "beefed" (does not include 'a') and "based" (includes 's' which is not in the puzzle).
 *
 *
 *
 * Return an array answer, where answer[i] is the number of words in the given word list words that is valid with respect to the puzzle puzzles[i].
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["aaaa","asas","able","ability","actt","actor","access"], puzzles = ["aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"]
 * Output: [1,1,3,2,4,0]
 * Explanation: 
 * 1 valid word for "aboveyz" : "aaaa" 
 * 1 valid word for "abrodyz" : "aaaa"
 * 3 valid words for "abslute" : "aaaa", "asas", "able"
 * 2 valid words for "absoryz" : "aaaa", "asas"
 * 4 valid words for "actresz" : "aaaa", "asas", "actt", "access"
 * There are no valid words for "gaswxyz" cause none of the words in the list contains letter 'g'.
 *
 * Example 2:
 *
 * Input: words = ["apple","pleas","please"], puzzles = ["aelwxyz","aelpxyz","aelpsxy","saelpxy","xaelpsy"]
 * Output: [0,1,3,2,0]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 105
 *
 * 4 &lt;= words[i].length &lt;= 50
 *
 * 1 &lt;= puzzles.length &lt;= 104
 *
 * puzzles[i].length == 7
 *
 * words[i] and puzzles[i] consist of lowercase English letters.
 *
 * Each puzzles[i] does not contain repeated characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Exploit the fact that the length of the puzzle is only 7.
 * Hint 2: Use bit-masks to represent the word and puzzle strings.
 * Hint 3: For each puzzle, count the number of words whose bit-mask is a sub-mask of the puzzle's bit-mask.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Bit Manipulation, Trie).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-valid-words-for-each-puzzle/">LeetCode #1178</a>
 */
public class NumberOfValidWordsForEachPuzzle {

    /**
     * TODO: Implement "Number of Valid Words for Each Puzzle".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Valid Words for Each Puzzle");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfValidWordsForEachPuzzle.java &amp;&amp; java org.leetcode.hard.NumberOfValidWordsForEachPuzzle</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfValidWordsForEachPuzzle ===");
        NumberOfValidWordsForEachPuzzle sol = new NumberOfValidWordsForEachPuzzle();
        System.out.println(sol.solve(null));
    }
}
