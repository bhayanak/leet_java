package org.leetcode.easy;


/**
 * <b>#1710 - Maximum Units on a Truck</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are assigned to put some amount of boxes onto one truck. You are given a 2D array boxTypes, where boxTypes[i] = [numberOfBoxesi, numberOfUnitsPerBoxi]:
 *
 *
 * numberOfBoxesi is the number of boxes of type i.
 *
 * numberOfUnitsPerBoxi is the number of units in each box of the type i.
 *
 * You are also given an integer truckSize, which is the maximum number of boxes that can be put on the truck. You can choose any boxes to put on the truck as long as the number of boxes does not exceed truckSize.
 *
 *
 * Return the maximum total number of units that can be put on the truck.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: boxTypes = [[1,3],[2,2],[3,1]], truckSize = 4
 * Output: 8
 * Explanation: There are:
 * - 1 box of the first type that contains 3 units.
 * - 2 boxes of the second type that contain 2 units each.
 * - 3 boxes of the third type that contain 1 unit each.
 * You can take all the boxes of the first and second types, and one box of the third type.
 * The total number of units will be = (1 * 3) + (2 * 2) + (1 * 1) = 8.
 *
 * Example 2:
 *
 * Input: boxTypes = [[5,10],[2,5],[4,7],[3,9]], truckSize = 10
 * Output: 91
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= boxTypes.length &lt;= 1000
 *
 * 1 &lt;= numberOfBoxesi, numberOfUnitsPerBoxi &lt;= 1000
 *
 * 1 &lt;= truckSize &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we have space for at least one box, it's always optimal to put the box with the most units.
 * Hint 2: Sort the box types with the number of units per box non-increasingly.
 * Hint 3: Iterate on the box types and take from each type as many as you can.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-units-on-a-truck/">LeetCode #1710</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MaximumUnitsOnATruck {

    /**
     * Solves the problem: Maximum units.
     * Sorts the input first to enable efficient processing.
     *
     * @param boxTypes the boxTypes (int[][])
     * @param truckSize the truckSize (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        java.util.Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int total=0, rem=truckSize;
        for (int[] bt:boxTypes) {
            int take=Math.min(rem,bt[0]); total+=take*bt[1]; rem-=take;
            if (rem==0) break;
        }
        return total;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MaximumUnitsOnATruck sol = new MaximumUnitsOnATruck();
                System.out.println(sol.maximumUnits(new int[][]{{1,3},{2,2},{3,1}},4)); // 8
                System.out.println(sol.maximumUnits(new int[][]{{5,10},{2,5},{4,7},{3,9}},10)); // 91
    }
}
