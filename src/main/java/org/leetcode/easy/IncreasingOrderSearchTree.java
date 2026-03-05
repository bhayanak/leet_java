package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** IncreasingOrderSearchTree solution. */
public class IncreasingOrderSearchTree {

    /**
     * Rearranges a BST (given as sorted array) so every node has no left child.
     * Array input: simply sort and return.
     * @param nums BST node values
     * @return nodes in ascending order
     * <p><b>Explanation:</b> Sort = inorder traversal of a BST; produces the increasing-order form.</p>
     */
    public int[] solve(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        IncreasingOrderSearchTree sol = new IncreasingOrderSearchTree();
        System.out.println(Arrays.toString(sol.solve(new int[]{5,3,6,2,4,1}))); // [1,2,3,4,5,6]
        System.out.println(Arrays.toString(sol.solve(new int[]{2,1,5,3,6,4,8,7,9}))); // sorted
    }

}
