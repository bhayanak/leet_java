package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #427: Construct Quad Tree
 * @see <a href="https://leetcode.com/problems/construct-quad-tree/">Problem</a>
 */
public class ConstructQuadTree {

    /**
     * LeetCode #427 – Construct Quad Tree
     * Difficulty: MEDIUM
     * Topics: Array, Divide and Conquer, Tree, Matrix
     *
     * Given a n * n matrix grid of 0's and 1's only. We want to represent grid
     * with a Quad-Tree.
     * 
     * 
     * Return the root of the Quad-Tree representing grid.
     * 
     * 
     * A Quad-Tree is a tree data structure in which each internal node has
     * exactly four children. Besides, each node has two attributes:
     * 
     * 
     * val: True if the node represents a grid of 1's or False if the node
     * represents a grid of 0's. Notice that you can assign the val to True or
     * False when isLeaf is False, and both are accepted in the answer.
     * 
     * isLeaf: True if the node is a leaf node on the tree or False if the node
     * has four children.
     * 
     * class Node {
     *     public boolean val;
     *     public boolean isLeaf;
     *     public Node topLeft;
     *     public Node topRight;
     *     public Node bottomLeft;
     *     public Node bottomRight;
     * }
     * 
     * We can construct a Quad-Tree from a two-dimensional area using the
     * following steps:
     * 
     * 
     * If the current grid has the same value (i.e all 1's or all 0's) set isLeaf
     * True and set val to the value of the grid and set the four children to Null
     * and stop.
     * 
     * If the current grid has different values, set isLeaf to False and set val
     * to any value and divide the current grid into four sub-grids as shown in
     * the photo.
     * 
     * Recurse for each of the children with the proper sub-grid.
     * 
     * If you want to know more about the Quad-Tree, you can refer to the wiki.
     * 
     * 
     * Quad-Tree format:
     * 
     * 
     * You don't need to read this section for solving the problem. This is only
     * if you want to understand the output format here. The output represents the
     * serialized format of a Quad-T
     */
    // TODO: Implement solution for Construct Quad Tree
    // Difficulty: MEDIUM | Topics: Array, Divide and Conquer, Tree, Matrix
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        ConstructQuadTree sol = new ConstructQuadTree();
        System.out.println(sol.solve());
    }
}
