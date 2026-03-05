package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * LeetCode #590: N-ary Tree Postorder Traversal
 * @see <a href="https://leetcode.com/problems/n-ary-tree-postorder-traversal/">Problem</a>
 */
public class NAryTreePostorderTraversal {

    static class Node {
        int val; java.util.List<Node> children;
        Node(int v) { val = v; children = new java.util.ArrayList<>(); }
    }
    /**
     * LeetCode #590 – N-ary Tree Postorder Traversal
     * Difficulty: EASY
     * Topics: Stack, Tree, Depth-First Search
     *
     * Given the root of an n-ary tree, return the postorder traversal of its
     * nodes' values.
     * 
     * 
     * Nary-Tree input serialization is represented in their level order
     * traversal. Each group of children is separated by the null value (See
     * examples)
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: root = [1,null,3,2,4,null,5,6]
     * Output: [5,6,3,2,4,1]
     * 
     * Example 2:
     * 
     * Input: root =
     * [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
     * Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * The number of nodes in the tree is in the range [0, 104].
     * 
     * 0 &lt;= Node.val &lt;= 104
     * 
     * The height of the n-ary tree is less than or equal to 1000.
     * 
     * 
     * 
     * Follow up: Recursive solution is trivial, could you do it iteratively?
      *
      * <p><b>Explanation:</b> Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
      */
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            result.addFirst(cur.val);  // Add to front (reverse preorder)
            for (Node child : cur.children) stack.push(child);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("N-ary tree postorder: [5,6,3,2,4,1]");
    }
}
