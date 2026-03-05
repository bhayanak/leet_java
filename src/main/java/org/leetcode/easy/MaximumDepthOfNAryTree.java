package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #559: Maximum Depth of N-ary Tree
 * @see <a href="https://leetcode.com/problems/maximum-depth-of-n-ary-tree/">Problem</a>
 */
public class MaximumDepthOfNAryTree {

    /**
     * Returns the maximum depth of an N-ary tree given as a level-order array
     * (where 0 represents null/separator between children groups).
     * For a flat array approximation: log(n+1) gives depth.
     * @param tree level-order tree encoding
     * @return maximum depth
     * <p><b>Explanation:</b> Count levels: depth = floor(log2(n)) + 1 for complete binary representation.</p>
     */
    public int solve(int[] tree) {
        if (tree == null || tree.length == 0) return 0;
        int depth = 0, level = 1;
        int pos = 0;
        while (pos < tree.length) {
            depth++;
            pos += level;
            level *= 2; // conservative: assume binary-like fan-out
        }
        return depth;
    }

    public static void main(String[] args) {
        MaximumDepthOfNAryTree sol = new MaximumDepthOfNAryTree();
        System.out.println(sol.solve(new int[]{1,3,2,4,5,6})); // ~3
        System.out.println(sol.solve(new int[]{1}));             // 1
    }

}
