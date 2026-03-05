package org.leetcode.medium;


/**
 * <b>#1145 - Binary Tree Coloring Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Tree, Depth-First Search, Binary Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Two players play a turn based game on a binary tree. We are given the root of this binary tree, and the number of nodes n in the tree. n is odd, and each node has a distinct value from 1 to n.
 *
 *
 * Initially, the first player names a value x with 1 &lt;= x &lt;= n, and the second player names a value y with 1 &lt;= y &lt;= n and y != x. The first player colors the node with value x red, and the second player colors the node with value y blue.
 *
 *
 * Then, the players take turns starting with the first player. In each turn, that player chooses a node of their color (red if player 1, blue if player 2) and colors an uncolored neighbor of the chosen node (either the left child, right child, or parent of the chosen node.)
 *
 *
 * If (and only if) a player cannot choose such a node in this way, they must pass their turn. If both players pass their turn, the game ends, and the winner is the player that colored more nodes.
 *
 *
 * You are the second player. If it is possible to choose such a y to ensure you win the game, return true. If it is not possible, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: root = [1,2,3,4,5,6,7,8,9,10,11], n = 11, x = 3
 * Output: true
 * Explanation: The second player can choose the node with value 2.
 *
 * Example 2:
 *
 * Input: root = [1,2,3], n = 3, x = 1
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * The number of nodes in the tree is n.
 *
 * 1 &lt;= x &lt;= n &lt;= 100
 *
 * n is odd.
 *
 * 1 &lt;= Node.val &lt;= n
 *
 * All the values of the tree are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The best move y must be immediately adjacent to x, since it locks out that subtree.
 * Hint 2: Can you count each of (up to) 3 different subtrees neighboring x?
 *
 * <h2>Approach</h2>
 * Think about the category (Tree, Depth-First Search, Binary Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/binary-tree-coloring-game/">LeetCode #1145</a>
 */
public class BinaryTreeColoringGame {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Binary Tree Coloring Game".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Binary Tree Coloring Game");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BinaryTreeColoringGame.java &amp;&amp; java org.leetcode.medium.BinaryTreeColoringGame</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BinaryTreeColoringGame ===");
        BinaryTreeColoringGame sol = new BinaryTreeColoringGame();
        System.out.println(sol.solve(null));
    }
}
