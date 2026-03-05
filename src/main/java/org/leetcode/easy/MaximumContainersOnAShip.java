package org.leetcode.easy;


/**
 * <b>#3492 - Maximum Containers on a Ship</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n representing an n x n cargo deck on a ship. Each cell on the deck can hold one container with a weight of exactly w.
 *
 *
 * However, the total weight of all containers, if loaded onto the deck, must not exceed the ship's maximum weight capacity, maxWeight.
 *
 *
 * Return the maximum number of containers that can be loaded onto the ship.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, w = 3, maxWeight = 15
 *
 *
 * Output: 4
 *
 *
 * Explanation: 
 *
 *
 * The deck has 4 cells, and each container weighs 3. The total weight of loading all containers is 12, which does not exceed maxWeight.
 *
 * Example 2:
 *
 * Input: n = 3, w = 5, maxWeight = 20
 *
 *
 * Output: 4
 *
 *
 * Explanation: 
 *
 *
 * The deck has 9 cells, and each container weighs 5. The maximum number of containers that can be loaded without exceeding maxWeight is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 1 &lt;= w &lt;= 1000
 *
 * 1 &lt;= maxWeight &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What are the limits on the number of containers?
 * Hint 2: We can load at most <code>min(n * n, maxWeight / w)</code> containers.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/maximum-containers-on-a-ship/">LeetCode #3492</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps. Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class MaximumContainersOnAShip {

    /**
     * Computes the maximum Max distance.
     * Sorts the input first to enable efficient processing.
     *
     * @param position the position (int[])
     * @param m the m (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps. Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int maxDistance(int[] position, int m) {
        java.util.Arrays.sort(position);
        int lo=1, hi=position[position.length-1]-position[0], res=0;
        while (lo<=hi) {
            int mid=(lo+hi)/2;
            if (canPlace(position,m,mid)){res=mid;lo=mid+1;}else hi=mid-1;
        }
        return res;
    }
    private boolean canPlace(int[] pos,int m,int minDist){
        int cnt=1,last=pos[0];
        for (int i=1;i<pos.length;i++) if (pos[i]-last>=minDist){cnt++;last=pos[i];if(cnt==m)return true;}
        return cnt>=m;
    }

    public static void main(String[] args) {
        MaximumContainersOnAShip sol = new MaximumContainersOnAShip();
        System.out.println(sol.maxDistance(new int[]{1,2,3}, 0));
    }
}
