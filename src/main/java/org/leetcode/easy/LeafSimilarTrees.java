package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>LeafSimilarTrees</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Tree, Array, Comparison</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Two binary trees are considered leaf-similar if their leaf value sequences are identical.
 * Given two arrays representing the leaf sequences of two trees, determine if they are leaf-similar.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Compare the two arrays for equality using direct array comparison.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(N), where N is the number of leaves.</li>
 *   <li>Space: O(1) (ignoring input arrays).</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Uses Arrays.equals to compare the leaf value sequences directly.</p>
 */
public class LeafSimilarTrees {

    /**
     * Two trees (given as sorted leaf sequences) are leaf-similar if their leaf
     * value sequences are identical.
     * @param leaves1 leaf sequence of tree 1
     * @param leaves2 leaf sequence of tree 2
     * @return true if sequences are equal
     * <p><b>Explanation:</b> Direct array equality check on the leaf value sequences.</p>
     */
    public boolean solve(int[] leaves1, int[] leaves2) {
        return Arrays.equals(leaves1, leaves2);
    }

    public static void main(String[] args) {
        LeafSimilarTrees sol = new LeafSimilarTrees();
        System.out.println(sol.solve(new int[]{6,7,4,9,8}, new int[]{6,7,4,9,8})); // true
        System.out.println(sol.solve(new int[]{1,2}, new int[]{2,1}));               // false
    }

}
