package org.leetcode.hard;

/**
 * <b>#51 - N-Queens</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
 * 
 * 
 * Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
 * 
 * 
 * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 4
 * Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
 * Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: [["Q"]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 9
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
 * @see <a href="https://leetcode.com/problems/n-queens/">LeetCode #51</a>
 */
public class NQueens {

    /**
     * TODO: Implement solution for "N-Queens".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: N-Queens");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        NQueens sol = new NQueens();
        System.out.println(sol.solve(null));
    }
}
