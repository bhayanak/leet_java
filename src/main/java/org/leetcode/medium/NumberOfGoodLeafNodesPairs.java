package org.leetcode.medium;


/**
 * <b>#1530 - Number of Good Leaf Nodes Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the root of a binary tree and an integer distance. A pair of two different leaf nodes of a binary tree is said to be good if the length of the shortest path between them is less than or equal to distance.
 *
 *
 * Return the number of good leaf node pairs in the tree.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,null,4], distance = 3
 * Output: 1
 * Explanation: The leaf nodes of the tree are 3 and 4 and the length of the shortest path between them is 3. This is the only good pair.
 *
 * Example 2:
 *
 * Input: root = [1,2,3,4,5,6,7], distance = 3
 * Output: 2
 * Explanation: The good pairs are [4,5] and [6,7] with shortest path = 2. The pair [4,6] is not good because the length of ther shortest path between them is 4.
 *
 * Example 3:
 *
 * Input: root = [7,1,4,6,null,5,3,null,null,null,null,null,2], distance = 3
 * Output: 1
 * Explanation: The only good pair is [2,5].
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is in the range [1, 210].
 *
 * 1 &lt;= Node.val &lt;= 100
 *
 * 1 &lt;= distance &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start DFS from each leaf node. stop the DFS when the number of steps done &gt; distance.
 * Hint 2: If you reach another leaf node within distance steps, add 1 to the answer.
 * Hint 3: Note that all pairs will be counted twice so divide the answer by 2.
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-good-leaf-nodes-pairs/">LeetCode #1530</a>
 */
public class NumberOfGoodLeafNodesPairs {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Returns the number of good leaf node pairs in the tree.
     *
     * @param root root of the binary tree
     * @param distance maximum allowed distance between leaf pairs
     * @return number of good leaf node pairs
     *
     * <p><b>Explanation:</b> Uses DFS to collect distances from each node to its leaves, then counts valid pairs whose path length is within the given distance. Time/space depend on tree size and distance.</p>
     */
    public int countPairs(TreeNode root, int distance) {
        // Implementation goes here
        throw new UnsupportedOperationException("Not yet implemented: Number of Good Leaf Nodes Pairs");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfGoodLeafNodesPairs ===");
        NumberOfGoodLeafNodesPairs sol = new NumberOfGoodLeafNodesPairs();
        System.out.println(sol.countPairs(
                new TreeNode(1) {{
                    left = new TreeNode(2) {{
                        right = new TreeNode(4);
                    }};
                    right = new TreeNode(3);
                }},
                3)); // 1
        System.out.println(sol.countPairs(
                new TreeNode(1) {{
                    left = new TreeNode(2) {{
                        left = new TreeNode(4);
                        right = new TreeNode(5);
                    }};
                    right = new TreeNode(3) {{
                        left = new TreeNode(6);
                        right = new TreeNode(7);
                    }};
                }},
                3)); // 2
        System.out.println(sol.countPairs(
                new TreeNode(7) {{
                    left = new TreeNode(1) {{
                        left = new TreeNode(6);
                    }};
                    right = new TreeNode(4) {{
                        left = new TreeNode(5) {{
                            left = new TreeNode(2);
                        }};
                        right = new TreeNode(3);
                    }};
                }},
                3)); // 1
    }
}
