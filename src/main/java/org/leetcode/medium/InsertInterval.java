package org.leetcode.medium;

/**
 * <b>#57 - Insert Interval</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * 
 * 
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * 
 * 
 * Return intervals after the insertion.
 * 
 * 
 * Note that you don't need to modify intervals in-place. You can make a new array and return it.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * Output: [[1,5],[6,9]]
 * 
 * Example 2:
 * 
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * Output: [[1,2],[3,10],[12,16]]
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= intervals.length &lt;= 104
 * 	
 * intervals[i].length == 2
 * 	
 * 0 &lt;= starti &lt;= endi &lt;= 105
 * 	
 * intervals is sorted by starti in ascending order.
 * 	
 * newInterval.length == 2
 * 	
 * 0 &lt;= start &lt;= end &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Intervals Array is sorted. Can you use Binary Search to find the correct position to insert the new Interval.?
 * - Can you try merging the overlapping intervals while inserting the new interval?
 * - This can be done by comparing the end of the last interval with the start of the new interval and vice versa.
 *
 * <h2>Approach</h2>
 * Three phases without sorting (list is already sorted):
 * 1. Add all intervals ending before newInterval starts.
 * 2. Merge all overlapping intervals with newInterval.
 * 3. Add all intervals starting after newInterval ends.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/insert-interval/">LeetCode #57</a>
 */
public class InsertInterval {

    /**
     * Inserts a new interval into a sorted, non-overlapping list and merges if needed.
     *
     * @param intervals sorted non-overlapping intervals
     * @param newInterval interval to insert
     * @return           updated sorted intervals after insertion and merging
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        java.util.List<int[]> res = new java.util.ArrayList<>();
        int i = 0, n = intervals.length;
        // Phase 1: before overlap
        while (i < n && intervals[i][1] < newInterval[0]) res.add(intervals[i++]);
        // Phase 2: merge overlapping
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        // Phase 3: after overlap
        while (i < n) res.add(intervals[i++]);
        return res.toArray(new int[0][]);
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                InsertInterval sol = new InsertInterval();
                for (int[] r : sol.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5}))
                    System.out.println(java.util.Arrays.toString(r)); // [1,5][6,9]
    }
}
