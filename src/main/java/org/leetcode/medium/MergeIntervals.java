package org.leetcode.medium;

/**
 * <b>#56 - Merge Intervals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
 * 
 * Example 2:
 * 
 * Input: intervals = [[1,4],[4,5]]
 * Output: [[1,5]]
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * 
 * Example 3:
 * 
 * Input: intervals = [[4,7],[1,4]]
 * Output: [[1,7]]
 * Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= intervals.length &lt;= 104
 * 	
 * intervals[i].length == 2
 * 	
 * 0 &lt;= starti &lt;= endi &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Sort intervals by start time. Merge greedily: if the current interval overlaps
 * with the last merged one (cur.start &lt;= last.end), extend the end.
 *
 * <h2>Complexity</h2>
* Time: O(n log n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/merge-intervals/">LeetCode #56</a>
 */
public class MergeIntervals {

    /**
     * Merges all overlapping intervals.
     *
     * @param intervals array of [start, end] pairs
     * @return          array of merged non-overlapping intervals
     */
    public int[][] merge(int[][] intervals) {
        java.util.Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        java.util.List<int[]> merged = new java.util.ArrayList<>();
        for (int[] iv : intervals) {
            if (merged.isEmpty() || merged.get(merged.size()-1)[1] < iv[0]) {
                merged.add(iv);
            } else {
                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1], iv[1]);
            }
        }
        return merged.toArray(new int[0][]);
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                MergeIntervals sol = new MergeIntervals();
                for (int[] r : sol.merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}))
                    System.out.println(java.util.Arrays.toString(r)); // [1,6][8,10][15,18]
    }
}
