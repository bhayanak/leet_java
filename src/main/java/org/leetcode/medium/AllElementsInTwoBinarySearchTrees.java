package org.leetcode.medium;


/**
 * <b>#1305 - All Elements in Two Binary Search Trees</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Search Tree, Sorting, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root1 = [2,1,4], root2 = [1,0,3]
 * Output: [0,1,1,2,3,4]
 *
 * Example 2:
 *
 * Input: root1 = [1,null,8], root2 = [8,1]
 * Output: [1,1,8,8]
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in each tree is in the range [0, 5000].
 *
 * -105 &lt;= Node.val &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse the first tree in list1 and the second tree in list2.
 * Hint 2: Merge the two trees in one list and sort it.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Search Tree, Sorting, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/all-elements-in-two-binary-search-trees/">LeetCode #1305</a>
 */
public class AllElementsInTwoBinarySearchTrees {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     * Uses binary search for O(log n) lookup.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: All Elements in Two Binary Search Trees");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== AllElementsInTwoBinarySearchTrees ===");
        AllElementsInTwoBinarySearchTrees sol = new AllElementsInTwoBinarySearchTrees();
        System.out.println(sol.solve(null));
    }
}
