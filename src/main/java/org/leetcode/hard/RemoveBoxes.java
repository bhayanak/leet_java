package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #546: Remove Boxes
 * @see <a href="https://leetcode.com/problems/remove-boxes/">Problem</a>
 */
public class RemoveBoxes {

    /**
     * LeetCode #546 – Remove Boxes
     * Difficulty: HARD
     * Topics: Array, Dynamic Programming, Memoization
     *
     * You are given several boxes with different colors represented by different
     * positive numbers.
     * 
     * 
     * You may experience several rounds to remove boxes until there is no box
     * left. Each time you can choose some continuous boxes with the same color
     * (i.e., composed of k boxes, k &gt;= 1), remove them and get k * k points.
     * 
     * 
     * Return the maximum points you can get.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: boxes = [1,3,2,2,2,3,4,3,1]
     * Output: 23
     * Explanation:
     * [1, 3, 2, 2, 2, 3, 4, 3, 1]
     * ----&gt; [1, 3, 3, 4, 3, 1] (3*3=9 points)
     * ----&gt; [1, 3, 3, 3, 1] (1*1=1 points)
     * ----&gt; [1, 1] (3*3=9 points)
     * ----&gt; [] (2*2=4 points)
     * 
     * Example 2:
     * 
     * Input: boxes = [1,1,1]
     * Output: 9
     * 
     * Example 3:
     * 
     * Input: boxes = [1]
     * Output: 1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= boxes.length &lt;= 100
     * 
     * 1 &lt;= boxes[i] &lt;= 100
     */
    // TODO: Implement solution for Remove Boxes
    // Difficulty: HARD | Topics: Array, Dynamic Programming, Memoization
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
        RemoveBoxes sol = new RemoveBoxes();
        System.out.println(sol.solve());
    }
}
