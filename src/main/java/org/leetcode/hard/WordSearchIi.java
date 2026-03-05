package org.leetcode.hard;

/**
 * <b>#212 - Word Search II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Backtracking, Trie, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 * 
 * 
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
 * Output: ["eat","oath"]
 * 
 * Example 2:
 * 
 * Input: board = [["a","b"],["c","d"]], words = ["abcb"]
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * m == board.length
 * 	
 * n == board[i].length
 * 	
 * 1 &lt;= m, n &lt;= 12
 * 	
 * board[i][j] is a lowercase English letter.
 * 	
 * 1 &lt;= words.length &lt;= 3 * 104
 * 	
 * 1 &lt;= words[i].length &lt;= 10
 * 	
 * words[i] consists of lowercase English letters.
 * 	
 * All the strings of words are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You would need to optimize your backtracking to pass the larger test. Could you stop backtracking earlier?
 * Hint 2: If the current candidate does not exist in all words&#39; prefix, you could stop backtracking immediately. What kind of data structure could answer such query efficiently? Does a hash table work? Why or why not? How about a Trie? If you would like to learn how to implement a basic trie, please work on this problem: <a href="https://leetcode.com/problems/implement-trie-prefix-tree/">Implement Trie (Prefix Tree)</a> first.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/word-search-ii/">LeetCode #212</a>
 */
public class WordSearchIi {

    /** TODO: implement solution for "Word Search II". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Word Search II");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== WordSearchIi ===");
        WordSearchIi sol = new WordSearchIi();
        System.out.println(sol.solve(null));
    }
}
