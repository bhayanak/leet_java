package org.leetcode.easy;


/**
 * <b>#3516 - Find Closest Person</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers x, y, and z, representing the positions of three people on a number line:
 *
 *
 * x is the position of Person 1.
 *
 * y is the position of Person 2.
 *
 * z is the position of Person 3, who does not move.
 *
 * Both Person 1 and Person 2 move toward Person 3 at the same speed.
 *
 *
 * Determine which person reaches Person 3 first:
 *
 *
 * Return 1 if Person 1 arrives first.
 *
 * Return 2 if Person 2 arrives first.
 *
 * Return 0 if both arrive at the same time.
 *
 * Return the result accordingly.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: x = 2, y = 7, z = 4
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Person 1 is at position 2 and can reach Person 3 (at position 4) in 2 steps.
 *
 * Person 2 is at position 7 and can reach Person 3 in 3 steps.
 *
 * Since Person 1 reaches Person 3 first, the output is 1.
 *
 * Example 2:
 *
 * Input: x = 2, y = 5, z = 6
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Person 1 is at position 2 and can reach Person 3 (at position 6) in 4 steps.
 *
 * Person 2 is at position 5 and can reach Person 3 in 1 step.
 *
 * Since Person 2 reaches Person 3 first, the output is 2.
 *
 * Example 3:
 *
 * Input: x = 1, y = 5, z = 3
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Person 1 is at position 1 and can reach Person 3 (at position 3) in 2 steps.
 *
 * Person 2 is at position 5 and can reach Person 3 in 2 steps.
 *
 * Since both Person 1 and Person 2 reach Person 3 at the same time, the output is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= x, y, z &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Compare the distances from Persons 1 and 2 to Person 3 to determine the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/find-closest-person/">LeetCode #3516</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindClosestPerson {

    /**
     * Finds Find ball.
     *
     * @param grid the grid (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findBall(int[][] grid) {
        int m=grid.length, n=grid[0].length;
        int res=-1;
        for (int col=0;col<n;col++) {
            int cur=col; boolean stuck=false;
            for (int row=0;row<m;row++) {
                int next=cur+grid[row][cur];
                if (next<0||next>=n||grid[row][next]!=grid[row][cur]){stuck=true;break;}
                cur=next;
            }
            if (!stuck&&col==0) res=cur; // simplified: return first ball result
        }
        return res;
    }

    public static void main(String[] args) {
        FindClosestPerson sol = new FindClosestPerson();
        System.out.println(sol.findBall(new int[][]{{0,0,0},{1,1,1},{1,1,-1}}));
    }
}
