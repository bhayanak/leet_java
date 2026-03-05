package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #435: Non-overlapping Intervals
 * @see <a href="https://leetcode.com/problems/non-overlapping-intervals/">Problem</a>
 */
public class NonOverlappingIntervals {

    /**
     * LeetCode #435 – Non-overlapping Intervals
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Greedy, Sorting
     *
     * Given an array of intervals intervals where intervals[i] = [starti, endi],
     * return the minimum number of intervals you need to remove to make the rest
     * of the intervals non-overlapping.
     * 
     * 
     * Note that intervals which only touch at a point are non-overlapping. For
     * example, [1, 2] and [2, 3] are non-overlapping.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
     * Output: 1
     * Explanation: [1,3] can be removed and the rest of the intervals are
     * non-overlapping.
     * 
     * Example 2:
     * 
     * Input: intervals = [[1,2],[1,2],[1,2]]
     * Output: 2
     * Explanation: You need to remove two [1,2] to make the rest of the intervals
     * non-overlapping.
     * 
     * Example 3:
     * 
     * Input: intervals = [[1,2],[2,3]]
     * Output: 0
     * Explanation: You don't need to remove any of the intervals since they're
     * already non-overlapping.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= intervals.length &lt;= 105
     * 
     * intervals[i].length == 2
     * 
     * -5 * 104 &lt;= starti &lt; endi &lt;= 5 * 104
     */
    // Greedy: sort by end time, greedily select intervals that don't overlap
    // Count intervals to remove = total - max non-overlapping
    /**
     * Solves the problem: Erase overlap intervals.
     * Sorts the input first to enable efficient processing.
     *
     * @param intervals the intervals (int[][])
     * @return the computed int result
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;
        Arrays.sort(intervals, (a,b) -> a[1] - b[1]);
        int count = 0, end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) count++;
            else end = intervals[i][1];
        }
        return count;
    }

    public static void main(String[] args) {
        NonOverlappingIntervals sol = new NonOverlappingIntervals();
        System.out.println(sol.eraseOverlapIntervals(new int[][]{{1,2},{3,4}}));
    }
}
