package org.leetcode.hard;


/**
 * <b>#1728 - Cat and Mouse II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Graph Theory, Topological Sort, Memoization, Matrix, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A game is played by a cat and a mouse named Cat and Mouse.
 *
 *
 * The environment is represented by a grid of size rows x cols, where each element is a wall, floor, player (Cat, Mouse), or food.
 *
 *
 * Players are represented by the characters 'C'(Cat),'M'(Mouse).
 *
 * Floors are represented by the character '.' and can be walked on.
 *
 * Walls are represented by the character '#' and cannot be walked on.
 *
 * Food is represented by the character 'F' and can be walked on.
 *
 * There is only one of each character 'C', 'M', and 'F' in grid.
 *
 * Mouse and Cat play according to the following rules:
 *
 *
 * Mouse moves first, then they take turns to move.
 *
 * During each turn, Cat and Mouse can jump in one of the four directions (left, right, up, down). They cannot jump over the wall nor outside of the grid.
 *
 * catJump, mouseJump are the maximum lengths Cat and Mouse can jump at a time, respectively. Cat and Mouse can jump less than the maximum length.
 *
 * Staying in the same position is allowed.
 *
 * Mouse can jump over Cat.
 *
 * The game can end in 4 ways:
 *
 *
 * If Cat occupies the same position as Mouse, Cat wins.
 *
 * If Cat reaches the food first, Cat wins.
 *
 * If Mouse reaches the food first, Mouse wins.
 *
 * If Mouse cannot get to the food within 1000 turns, Cat wins.
 *
 * Given a rows x cols matrix grid and two integers catJump and mouseJump, return true if Mouse can win the game if both Cat and Mouse play optimally, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = ["####F","#C...","M...."], catJump = 1, mouseJump = 2
 * Output: true
 * Explanation: Cat cannot catch Mouse on its turn nor can it get the food before Mouse.
 *
 * Example 2:
 *
 * Input: grid = ["M.C...F"], catJump = 1, mouseJump = 4
 * Output: true
 *
 * Example 3:
 *
 * Input: grid = ["M.C...F"], catJump = 1, mouseJump = 3
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * rows == grid.length
 *
 * cols = grid[i].length
 *
 * 1 &lt;= rows, cols &lt;= 8
 *
 * grid[i][j] consist only of characters 'C', 'M', 'F', '.', and '#'.
 *
 * There is only one of each character 'C', 'M', and 'F' in grid.
 *
 * 1 &lt;= catJump, mouseJump &lt;= 8
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try working backward: consider all trivial states you know to be winning or losing, and work backward to determine which other states can be labeled as winning or losing.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Graph Theory, Topological Sort, Memoization, Matrix, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/cat-and-mouse-ii/">LeetCode #1728</a>
 */
public class CatAndMouseIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Cat and Mouse II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CatAndMouseIi ===");
        CatAndMouseIi sol = new CatAndMouseIi();
        System.out.println(sol.solve(null));
    }
}
