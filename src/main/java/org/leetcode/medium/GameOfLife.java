package org.leetcode.medium;

/**
 * <b>#289 - Game of Life</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * 
 * 
 * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * 
 * 	
 * Any live cell with fewer than two live neighbors dies as if caused by under-population.
 * 	
 * Any live cell with two or three live neighbors lives on to the next generation.
 * 	
 * Any live cell with more than three live neighbors dies, as if by over-population.
 * 	
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 * 
 * The next state of the board is determined by applying the above rules simultaneously to every cell in the current state of the m x n grid board. In this process, births and deaths occur simultaneously.
 * 
 * 
 * Given the current state of the board, update the board to reflect its next state.
 * 
 * 
 * Note that you do not need to return anything.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: board = [[0,1,0],[0,0,1],[1,1,1],[0,0,0]]
 * Output: [[0,0,0],[1,0,1],[0,1,1],[0,1,0]]
 * 
 * Example 2:
 * 
 * Input: board = [[1,1],[1,0]]
 * Output: [[1,1],[1,1]]
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
 * 1 &lt;= m, n &lt;= 25
 * 	
 * board[i][j] is 0 or 1.
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * Could you solve it in-place? Remember that the board needs to be updated simultaneously: You cannot update some cells first and then use their updated values to update other cells.
 * 	
 * In this question, we represent the board using a 2D array. In principle, the board is infinite, which would cause problems when the active area encroaches upon the border of the array (i.e., live cells reach the border). How would you address these problems?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Encode state transitions in-place using extra bits:
 * bit0 = current state, bit1 = next state.
 * Then shift right by 1 to finalize.
 *
 * <h2>Complexity</h2>
* Time: O(m·n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/game-of-life/">LeetCode #289</a>
 */
public class GameOfLife {

    /**
     * Solves the problem: Game of life.
     *
     * @param board the board (int[][])
     */
    public void gameOfLife(int[][] board) {
        int m=board.length, n=board[0].length;
        int[] dr={-1,-1,-1,0,0,1,1,1}, dc={-1,0,1,-1,1,-1,0,1};
        for(int r=0;r<m;r++) for(int c=0;c<n;c++){
            int live=0;
            for(int d=0;d<8;d++){
                int nr=r+dr[d],nc=c+dc[d];
                if(nr>=0&&nr<m&&nc>=0&&nc<n&&(board[nr][nc]&1)==1) live++;
            }
            if((board[r][c]&1)==1&&(live==2||live==3)) board[r][c]|=2;
            if((board[r][c]&1)==0&&live==3)             board[r][c]|=2;
        }
        for(int r=0;r<m;r++) for(int c=0;c<n;c++) board[r][c]>>=1;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        GameOfLife sol = new GameOfLife();
        int[][] b={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        sol.gameOfLife(b);
        for(int[] row:b) System.out.println(java.util.Arrays.toString(row));
        // [0,0,0],[1,0,1],[0,1,1],[0,1,0]
    }
}
