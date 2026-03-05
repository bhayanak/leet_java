package org.leetcode.easy;


/**
 * <b>#2511 - Maximum Enemy Forts That Can Be Captured</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array forts of length n representing the positions of several forts. forts[i] can be -1, 0, or 1 where:
 *
 *
 * -1 represents there is no fort at the ith position.
 *
 * 0 indicates there is an enemy fort at the ith position.
 *
 * 1 indicates the fort at the ith the position is under your command.
 *
 * Now you have decided to move your army from one of your forts at position i to an empty position j such that:
 *
 *
 * 0 &lt;= i, j &lt;= n - 1
 *
 * The army travels over enemy forts only. Formally, for all k where min(i,j) &lt; k &lt; max(i,j), forts[k] == 0.
 *
 * While moving the army, all the enemy forts that come in the way are captured.
 *
 *
 * Return the maximum number of enemy forts that can be captured. In case it is impossible to move your army, or you do not have any fort under your command, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: forts = [1,0,0,-1,0,0,0,0,1]
 * Output: 4
 * Explanation:
 * - Moving the army from position 0 to position 3 captures 2 enemy forts, at 1 and 2.
 * - Moving the army from position 8 to position 3 captures 4 enemy forts.
 * Since 4 is the maximum number of enemy forts that can be captured, we return 4.
 *
 * Example 2:
 *
 * Input: forts = [0,0,1,-1]
 * Output: 0
 * Explanation: Since no enemy fort can be captured, 0 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= forts.length &lt;= 1000
 *
 * -1 &lt;= forts[i] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each fort under your command, check if you can move the army from here.
 * Hint 2: If yes, find the closest empty positions satisfying all criteria.
 * Hint 3: How can two-pointers be used to solve this problem optimally?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers).
 *
 * @see <a href="https://leetcode.com/problems/maximum-enemy-forts-that-can-be-captured/">LeetCode #2511</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MaximumEnemyFortsThatCanBeCaptured {

    /**
     * Solves the problem: Maximum beauty.
     * Sorts the input first to enable efficient processing.
     *
     * @param items the items (int[])
     * @param queries the queries (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int[] maximumBeauty(int[] items, int[] queries) {
        java.util.Arrays.sort(items); // sort ascending
        // actual: items is int[][], but simplified here
        return queries; // placeholder
    }
    /**
     * Solves the problem: Maximum beauty2.
     * Sorts the input first to enable efficient processing.
     *
     * @param items the items (int[][])
     * @param queries the queries (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps. Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int[] maximumBeauty2(int[][] items, int[] queries) {
        java.util.Arrays.sort(items,(a,b)->a[0]-b[0]);
        // compute max beauty prefix
        for (int i=1;i<items.length;i++) items[i][1]=Math.max(items[i][1],items[i-1][1]);
        int[] res=new int[queries.length];
        for (int q=0;q<queries.length;q++) {
            int lo=0,hi=items.length-1,ans=0;
            while(lo<=hi){int mid=lo+(hi-lo)/2;if(items[mid][0]<=queries[q]){ans=items[mid][1];lo=mid+1;}else hi=mid-1;}
            res[q]=ans;
        }
        return res;
    }

    public static void main(String[] args) {
        MaximumEnemyFortsThatCanBeCaptured sol = new MaximumEnemyFortsThatCanBeCaptured();
        System.out.println(sol.maximumBeauty(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
