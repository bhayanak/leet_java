package org.leetcode.easy;

/** ConvertSortedArrayToBinarySearchTree solution. */
public class ConvertSortedArrayToBinarySearchTree {
    // Minimal TreeNode for this solution
    static class TreeNode { int val; TreeNode left, right; TreeNode(int v){val=v;} }

    /**
     * Converts a sorted array into a height-balanced BST.
     *
     * @param nums sorted integer array
     * @return root of the height-balanced BST
     *
     * <p><b>Explanation:</b> Always picks the middle element as root (guaranteed balance),</p>
     *   then recursively builds left subtree from the left half and right subtree
     *   from the right half. Time O(n), Space O(log n) recursive stack.
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }
    private TreeNode buildBST(int[] nums, int lo, int hi) {
        if (lo > hi) return null;
        int mid = lo + (hi - lo) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left  = buildBST(nums, lo, mid - 1);
        node.right = buildBST(nums, mid + 1, hi);
        return node;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ConvertSortedArrayToBinarySearchTree.java &amp;&amp; java org.leetcode.easy.ConvertSortedArrayToBinarySearchTree
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== ConvertSortedArrayToBinarySearchTree ===");
        ConvertSortedArrayToBinarySearchTree sol = new ConvertSortedArrayToBinarySearchTree();
        System.out.println(sol.sortedArrayToBST(new int[]{1,2,3}));
    }
}
