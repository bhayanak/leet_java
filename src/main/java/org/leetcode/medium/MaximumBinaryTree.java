package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #654: Maximum Binary Tree
 * @see <a href="https://leetcode.com/problems/maximum-binary-tree/">Problem</a>
 */
public class MaximumBinaryTree {

    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * LeetCode #654 – Maximum Binary Tree
     * Difficulty: MEDIUM
     * Topics: Array, Divide and Conquer, Stack, Tree, Monotonic Stack, Binary Tree
     *
     * You are given an integer array nums with no duplicates. A maximum binary
     * tree can be built recursively from nums using the following algorithm:
     * 
     * 
     * Create a root node whose value is the maximum value in nums.
     * 
     * Recursively build the left subtree on the subarray prefix to the left of
     * the maximum value.
     * 
     * Recursively build the right subtree on the subarray suffix to the right of
     * the maximum value.
     * 
     * Return the maximum binary tree built from nums.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [3,2,1,6,0,5]
     * Output: [6,3,5,null,2,0,null,null,1]
     * Explanation: The recursive calls are as follow:
     * - The largest value in [3,2,1,6,0,5] is 6. Left prefix is [3,2,1] and right
     * suffix is [0,5].
     * - The largest value in [3,2,1] is 3. Left prefix is [] and right suffix is
     * [2,1].
     *         - Empty array, so no child.
     * - The largest value in [2,1] is 2. Left prefix is [] and right suffix is
     * [1].
     *             - Empty array, so no child.
     *             - Only one element, so child is a node with value 1.
     * - The largest value in [0,5] is 5. Left prefix is [0] and right suffix is
     * [].
     *         - Only one element, so child is a node with value 0.
     *         - Empty array, so no child.
     * 
     * Example 2:
     * 
     * Input: nums = [3,2,1]
     * Output: [3,null,2,null,1]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= nums.length &lt;= 1000
     * 
     * 0 &lt;= nums[i] &lt;= 1000
     * 
     * All integers in nums are unique.
     */
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }
    private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;
        int maxIdx = left;
        for (int i = left+1; i <= right; i++) if (nums[i] > nums[maxIdx]) maxIdx = i;
        TreeNode root = new TreeNode(nums[maxIdx]);
        root.left = build(nums, left, maxIdx - 1);
        root.right = build(nums, maxIdx + 1, right);
        return root;
    }

    public static void main(String[] args) {
        MaximumBinaryTree sol = new MaximumBinaryTree();
        System.out.println(sol.constructMaximumBinaryTree(new int[]{1,2,3}));
    }
}
