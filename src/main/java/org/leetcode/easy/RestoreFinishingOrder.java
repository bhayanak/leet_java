package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>#3468 - RestoreFinishingOrder</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given competitors and their finish positions, return the array in finishing order.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * <p><b>Explanation:</b> This solution creates (position, competitor) pairs, sorts by position, and extracts the competitors in order. Efficient for small arrays; time O(n log n) due to sorting.</p>
 * @see <a href="https://leetcode.com/problems/restorefinishingorder-/">LeetCode #3468</a>
 */
public class RestoreFinishingOrder {

    /**
     * Given competitors array and their finish positions, returns them in finishing order.
     * @param competitors array of competitor IDs
     * @param positions   finish position for each competitor (1-indexed)
     * @return competitors sorted by their finish positions
     * <p><b>Explanation:</b> Create pairs (position, competitor); sort by position; extract competitors.</p>
     */
    public int[] solve(int[] competitors, int[] positions) {
        int n = competitors.length;
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> positions[a] - positions[b]);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) result[i] = competitors[idx[i]];
        return result;
    }

    public static void main(String[] args) {
        RestoreFinishingOrder sol = new RestoreFinishingOrder();
        System.out.println(Arrays.toString(sol.solve(new int[]{5,4,3,2,1}, new int[]{2,3,5,4,1}))); // [1,5,4,2,3]
    }

}
