package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #473: Matchsticks to Square
 * @see <a href="https://leetcode.com/problems/matchsticks-to-square/">Problem</a>
 */
public class MatchsticksToSquare {

    /**
     * LeetCode #473 – Matchsticks to Square
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask
     *
     * You are given an integer array matchsticks where matchsticks[i] is the
     * length of the ith matchstick. You want to use all the matchsticks to make
     * one square. You should not break any stick, but you can link them up, and
     * each matchstick must be used exactly one time.
     * 
     * 
     * Return true if you can make this square and false otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: matchsticks = [1,1,2,2,2]
     * Output: true
     * Explanation: You can form a square with length 2, one side of the square
     * came two sticks with length 1.
     * 
     * Example 2:
     * 
     * Input: matchsticks = [3,3,3,3,4]
     * Output: false
     * Explanation: You cannot find a way to form a square with all the
     * matchsticks.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= matchsticks.length &lt;= 15
     * 
     * 1 &lt;= matchsticks[i] &lt;= 108

     *
     * Hints:
     *   1. Treat the matchsticks as an array. Can we split the array into 4 equal parts?
     *   2. Every matchstick can belong to either of the 4 sides. We don't know which one. Maybe try out all options!
     *   3. For every matchstick, we have to try out each of the 4 options i.e. which side it can belong to. We can make use of recursion for this.
     */
    // TODO: Implement solution for Matchsticks to Square
    // Difficulty: MEDIUM | Topics: Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask
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
        MatchsticksToSquare sol = new MatchsticksToSquare();
        System.out.println(sol.solve());
    }
}
