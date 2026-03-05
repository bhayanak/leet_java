package org.leetcode.easy;


/**
 * <b>#3274 - Check if Two Chessboard Squares Have the Same Color</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings, coordinate1 and coordinate2, representing the coordinates of a square on an 8 x 8 chessboard.
 *
 *
 * Below is the chessboard for reference.
 *
 * Return true if these two squares have the same color and false otherwise.
 *
 *
 * The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first (indicating its column), and the number second (indicating its row).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coordinate1 = "a1", coordinate2 = "c3"
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Both squares are black.
 *
 * Example 2:
 *
 * Input: coordinate1 = "a1", coordinate2 = "h3"
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * Square "a1" is black and "h3" is white.
 *
 *
 *
 * Constraints:
 *
 *
 * coordinate1.length == coordinate2.length == 2
 *
 * 'a' &lt;= coordinate1[0], coordinate2[0] &lt;= 'h'
 *
 * '1' &lt;= coordinate1[1], coordinate2[1] &lt;= '8'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The color of the chessboard is black the sum of row coordinates and column coordinates is even. Otherwise, it's white.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 *
 * @see <a href="https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/">LeetCode #3274</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfTwoChessboardSquaresHaveTheSameColor {

    /**
     * Checks Check two chessboards.
     *
     * @param c1 the c1 (String)
     * @param c2 the c2 (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int checkTwoChessboards(String c1, String c2) {
        int r1=c1.charAt(1)-'1', col1=c1.charAt(0)-'a';
        int r2=c2.charAt(1)-'1', col2=c2.charAt(0)-'a';
        return (r1+col1)%2==(r2+col2)%2?1:0;
    }

    public static void main(String[] args) {
        CheckIfTwoChessboardSquaresHaveTheSameColor sol = new CheckIfTwoChessboardSquaresHaveTheSameColor();
                System.out.println(sol.checkTwoChessboards("a1","c3")); // 1 (true)
                System.out.println(sol.checkTwoChessboards("a1","h3")); // 0 (false)
    }
}
