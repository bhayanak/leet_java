package org.leetcode.hard;


/**
 * <b>#864 - Shortest Path to Get All Keys</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n grid grid where:
 *
 *
 * '.' is an empty cell.
 *
 * '#' is a wall.
 *
 * '@' is the starting point.
 *
 * Lowercase letters represent keys.
 *
 * Uppercase letters represent locks.
 *
 * You start at the starting point and one move consists of walking one space in one of the four cardinal directions. You cannot walk outside the grid, or walk into a wall.
 *
 *
 * If you walk over a key, you can pick it up and you cannot walk over a lock unless you have its corresponding key.
 *
 *
 * For some 1 &lt;= k &lt;= 6, there is exactly one lowercase and one uppercase letter of the first k letters of the English alphabet in the grid. This means that there is exactly one key for each lock, and one lock for each key; and also that the letters used to represent the keys and locks were chosen in the same order as the English alphabet.
 *
 *
 * Return the lowest number of moves to acquire all keys. If it is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = ["@.a..","###.#","b.A.B"]
 * Output: 8
 * Explanation: Note that the goal is to obtain all the keys not to open all the locks.
 *
 * Example 2:
 *
 * Input: grid = ["@..aA","..B#.","....b"]
 * Output: 6
 *
 * Example 3:
 *
 * Input: grid = ["@Aa"]
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m, n &lt;= 30
 *
 * grid[i][j] is either an English letter, '.', '#', or '@'. 
 *
 * There is exactly one '@' in the grid.
 *
 * The number of keys in the grid is in the range [1, 6].
 *
 * Each key in the grid is unique.
 *
 * Each key in the grid has a matching lock.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-path-to-get-all-keys/">LeetCode #864</a>
 */
public class ShortestPathToGetAllKeys {

    /**
     * TODO: Implement "Shortest Path to Get All Keys".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Path to Get All Keys");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestPathToGetAllKeys.java &amp;&amp; java org.leetcode.hard.ShortestPathToGetAllKeys</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestPathToGetAllKeys ===");
        ShortestPathToGetAllKeys sol = new ShortestPathToGetAllKeys();
        System.out.println(sol.solve(null));
    }
}
