package org.leetcode.easy;


/**
 * <b>#1812 - Determine Color of a Chessboard Square</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.
 *
 * Return true if the square is white, and false if the square is black.
 *
 *
 * The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coordinates = "a1"
 * Output: false
 * Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
 *
 * Example 2:
 *
 * Input: coordinates = "h3"
 * Output: true
 * Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
 *
 * Example 3:
 *
 * Input: coordinates = "c7"
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * coordinates.length == 2
 *
 * 'a' &lt;= coordinates[0] &lt;= 'h'
 *
 * '1' &lt;= coordinates[1] &lt;= '8'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the coordinates to (x, y) - that is, "a1" is (1, 1), "d7" is (4, 7).
 * Hint 2: Try add the numbers together and look for a pattern.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/determine-color-of-a-chessboard-square/">LeetCode #1812</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class DetermineColorOfAChessboardSquare {

    /**
     * Solves the problem: Square is white.
     *
     * @param coordinates the coordinates (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0) - 'a' + coordinates.charAt(1) - '0') % 2 != 0;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        DetermineColorOfAChessboardSquare sol = new DetermineColorOfAChessboardSquare();
                System.out.println(sol.squareIsWhite("a1")); // false (black)
                System.out.println(sol.squareIsWhite("h3")); // true (white)
                System.out.println(sol.squareIsWhite("c7")); // false (black)
    }
}
