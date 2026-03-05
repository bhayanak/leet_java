package org.leetcode.medium;

/**
 * <b>#79 - Word Search</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Backtracking, Depth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * 
 * 
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 * 
 * Example 2:
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 * 
 * Example 3:
 * 
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * m == board.length
 * 	
 * n = board[i].length
 * 	
 * 1 &lt;= m, n &lt;= 6
 * 	
 * 1 &lt;= word.length &lt;= 15
 * 	
 * board and word consists of only lowercase and uppercase English letters.
 * 
 *  
 * 
 * Follow up: Could you use search pruning to make your solution faster with a larger board?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/word-search/">LeetCode #79</a>
 */
public class WordSearch {

    /**
     * TODO: Implement solution for "Word Search".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Word Search");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        WordSearch sol = new WordSearch();
        System.out.println(sol.solve(null));
    }
}
