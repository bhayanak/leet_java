package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #756: Pyramid Transition Matrix
 * @see <a href="https://leetcode.com/problems/pyramid-transition-matrix/">Problem</a>
 */
public class PyramidTransitionMatrix {

    /**
     * LeetCode #756 – Pyramid Transition Matrix
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Backtracking, Bit Manipulation
     *
     * You are stacking blocks to form a pyramid. Each block has a color, which is
     * represented by a single letter. Each row of blocks contains one less block
     * than the row beneath it and is centered on top.
     * 
     * 
     * To make the pyramid aesthetically pleasing, there are only specific
     * triangular patterns that are allowed. A triangular pattern consists of a
     * single block stacked on top of two blocks. The patterns are given as a list
     * of three-letter strings allowed, where the first two characters of a
     * pattern represent the left and right bottom blocks respectively, and the
     * third character is the top block.
     * 
     * 
     * For example, "ABC" represents a triangular pattern with a 'C' block stacked
     * on top of an 'A' (left) and 'B' (right) block. Note that this is different
     * from "BAC" where 'B' is on the left bottom and 'A' is on the right bottom.
     * 
     * You start with a bottom row of blocks bottom, given as a single string,
     * that you must use as the base of the pyramid.
     * 
     * 
     * Given bottom and allowed, return true if you can build the pyramid all the
     * way to the top such that every triangular pattern in the pyramid is in
     * allowed, or false otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: bottom = "BCD", allowed = ["BCC","CDE","CEA","FFF"]
     * Output: true
     * Explanation: The allowed triangular patterns are shown on the right.
     * Starting from the bottom (level 3), we can build "CE" on level 2 and then
     * build "A" on level 1.
     * There are three triangular patterns in the pyramid, which are "BCC", "CDE",
     * and "CEA". All are allowed.
     * 
     * Example 2:
     * 
     * Input: bot
     */
    // TODO: Implement solution for Pyramid Transition Matrix
    // Difficulty: MEDIUM | Topics: Hash Table, String, Backtracking, Bit Manipulation
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
        PyramidTransitionMatrix sol = new PyramidTransitionMatrix();
        System.out.println(sol.solve());
    }
}
