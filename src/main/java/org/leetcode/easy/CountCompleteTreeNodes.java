package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>CountCompleteTreeNodes</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Tree, Array, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a complete binary tree encoded as a level-order array (with -1 for null nodes),
 * count the number of non-null nodes.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Iterate through the array and count all entries that are not -1.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(n), where n is the length of the array.</li>
 *   <li>Space: O(1)</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Counts non-(-1) entries; for a proper tree, a more efficient approach uses binary search on height.</p>
 */
public class CountCompleteTreeNodes {

    /**
     * Counts nodes in a complete binary tree encoded as a level-order array
     * (index i has children at 2i+1 and 2i+2; -1 means null).
     * @param nums level-order array (-1 for null)
     * @return count of non-null nodes
     * <p><b>Explanation:</b> Count non-(-1) entries; for proper tree use binary search on height.</p>
     */
    public int solve(int[] nums) {
        int count = 0;
        for (int x : nums) if (x != -1) count++;
        return count;
    }

    public static void main(String[] args) {
        CountCompleteTreeNodes sol = new CountCompleteTreeNodes();
        System.out.println(sol.solve(new int[]{1, 2, 3, 4, 5, 6}));      // 6
        System.out.println(sol.solve(new int[]{1, 2, 3, 4, 5, 6, -1}));  // 6
    }

}
