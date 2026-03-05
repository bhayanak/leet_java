package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #749: Contain Virus
 * @see <a href="https://leetcode.com/problems/contain-virus/">Problem</a>
 */
public class ContainVirus {

    /**
     * LeetCode #749 – Contain Virus
     * Difficulty: HARD
     * Topics: Array, Depth-First Search, Breadth-First Search, Matrix, Simulation
     *
     * A virus is spreading rapidly, and your task is to quarantine the infected
     * area by installing walls.
     * 
     * 
     * The world is modeled as an m x n binary grid isInfected, where
     * isInfected[i][j] == 0 represents uninfected cells, and isInfected[i][j] ==
     * 1 represents cells contaminated with the virus. A wall (and only one wall)
     * can be installed between any two 4-directionally adjacent cells, on the
     * shared boundary.
     * 
     * 
     * Every night, the virus spreads to all neighboring cells in all four
     * directions unless blocked by a wall. Resources are limited. Each day, you
     * can install walls around only one region (i.e., the affected area
     * (continuous block of infected cells) that threatens the most uninfected
     * cells the following night). There will never be a tie.
     * 
     * 
     * Return the number of walls used to quarantine all the infected regions. If
     * the world will become fully infected, return the number of walls used.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: isInfected =
     * [[0,1,0,0,0,0,0,1],[0,1,0,0,0,0,0,1],[0,0,0,0,0,0,0,1],[0,0,0,0,0,0,0,0]]
     * Output: 10
     * Explanation: There are 2 contaminated regions.
     * On the first day, add 5 walls to quarantine the viral region on the left.
     * The board after the virus spreads is:
     * 
     * On the second day, add 5 walls to quarantine the viral region on the right.
     * The virus is fully contained.
     * 
     * Example 2:
     * 
     * Input: isInfected = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: 4
     * Explanation: Even though there is only one cell saved, there are 4 walls
     * built.
     * Notice that walls are only built on the shared boundary of two different c
     */
    // TODO: Implement solution for Contain Virus
    // Difficulty: HARD | Topics: Array, Depth-First Search, Breadth-First Search, Matrix, Simulation
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
        ContainVirus sol = new ContainVirus();
        System.out.println(sol.solve());
    }
}
