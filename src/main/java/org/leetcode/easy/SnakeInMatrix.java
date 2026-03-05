package org.leetcode.easy;


/**
 * <b>#3248 - Snake in Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a snake in an n x n matrix grid and can move in four possible directions. Each cell in the grid is identified by the position: grid[i][j] = (i * n) + j.
 *
 *
 * The snake starts at cell 0 and follows a sequence of commands.
 *
 *
 * You are given an integer n representing the size of the grid and an array of strings commands where each command[i] is either "UP", "RIGHT", "DOWN", and "LEFT". It's guaranteed that the snake will remain within the grid boundaries throughout its movement.
 *
 *
 * Return the position of the final cell where the snake ends up after executing commands.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, commands = ["RIGHT","DOWN"]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 *
 *
 * 			0
 * 			1
 *
 *
 *
 *
 * 			2
 * 			3
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 *
 *
 *
 *
 * 			2
 * 			3
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 *
 *
 *
 *
 * 			2
 * 			3
 *
 *
 *
 *
 * Example 2:
 *
 * Input: n = 3, commands = ["DOWN","RIGHT","UP"]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 *
 *
 * 			0
 * 			1
 * 			2
 *
 *
 *
 *
 * 			3
 * 			4
 * 			5
 *
 *
 *
 *
 * 			6
 * 			7
 * 			8
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 * 			2
 *
 *
 *
 *
 * 			3
 * 			4
 * 			5
 *
 *
 *
 *
 * 			6
 * 			7
 * 			8
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 * 			2
 *
 *
 *
 *
 * 			3
 * 			4
 * 			5
 *
 *
 *
 *
 * 			6
 * 			7
 * 			8
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 * 			2
 *
 *
 *
 *
 * 			3
 * 			4
 * 			5
 *
 *
 *
 *
 * 			6
 * 			7
 * 			8
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 10
 *
 * 1 &lt;= commands.length &lt;= 100
 *
 * commands consists only of "UP", "RIGHT", "DOWN", and "LEFT".
 *
 * The input is generated such the snake will not move outside of the boundaries.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to update the row and column of the snake after each command.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/snake-in-matrix/">LeetCode #3248</a>
  *
  * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
  */
public class SnakeInMatrix {

    /**
     * Returns Get final state.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @param multiplier the multiplier (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a PriorityQueue (heap) for efficient O(log n) min/max retrieval.</p>
      */
    public int getFinalState(int[] nums, int k, int multiplier) {
        java.util.PriorityQueue<int[]> pq=new java.util.PriorityQueue<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        for (int i=0;i<nums.length;i++) pq.offer(new int[]{nums[i],i});
        for (int op=0;op<k;op++) {
            int[] min=pq.poll(); min[0]*=multiplier; pq.offer(min);
        }
        for (int[] x:pq) nums[x[1]]=x[0];
        return java.util.Arrays.stream(nums).sum();
    }

    public static void main(String[] args) {
        SnakeInMatrix sol = new SnakeInMatrix();
        System.out.println(sol.getFinalState(new int[]{1,2,3}, 0, 0));
    }
}
