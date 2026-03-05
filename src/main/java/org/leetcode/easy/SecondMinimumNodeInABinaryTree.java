package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #671: Second Minimum Node In a Binary Tree
 * @see <a href="https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/">Problem</a>
 */
public class SecondMinimumNodeInABinaryTree {

    /**
     * Returns the second minimum value in a special binary tree where each node's value
     * equals the smaller of its children's values (root is always minimum).
     * Tree given as level-order array; -1 means null.
     * @param tree level-order array
     * @return second smallest value, or -1 if none exists
     * <p><b>Explanation:</b> Collect all unique values; sort; return 2nd smallest.</p>
     */
    public int solve(int[] tree) {
        TreeSet<Integer> vals = new TreeSet<>();
        for (int x : tree) if (x != -1) vals.add(x);
        if (vals.size() < 2) return -1;
        Iterator<Integer> it = vals.iterator();
        it.next(); // skip minimum
        return it.next();
    }

    public static void main(String[] args) {
        SecondMinimumNodeInABinaryTree sol = new SecondMinimumNodeInABinaryTree();
        System.out.println(sol.solve(new int[]{2,2,5,2,2,5,7})); // 5
        System.out.println(sol.solve(new int[]{2,2,2}));           // -1
    }

}
