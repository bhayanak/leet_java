package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree solution. */
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    /**
     * Finds the node in a cloned tree that corresponds to a target in the original.
     * Arrays represent level-order tree encoding (index i, children 2i+1, 2i+2).
     * @param original level-order original tree
     * @param cloned   level-order cloned tree (same structure)
     * @param target   value to find in original
     * @return value at the corresponding position in cloned tree
     * <p><b>Explanation:</b> Linear scan: find target index in original, return cloned[index].</p>
     */
    public int solve(int[] original, int[] cloned, int target) {
        for (int i = 0; i < original.length; i++)
            if (original[i] == target) return cloned[i];
        return -1;
    }

    public static void main(String[] args) {
        FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree sol =
            new FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree();
        System.out.println(sol.solve(new int[]{7,4,3,0,0,5,7}, new int[]{7,4,3,0,0,5,7}, 3)); // 3
    }

}
