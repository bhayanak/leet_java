package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #526: Beautiful Arrangement
 * @see <a href="https://leetcode.com/problems/beautiful-arrangement/">Problem</a>
 */
public class BeautifulArrangement {

    /**
     * LeetCode #526 – Beautiful Arrangement
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask
     *
     * Suppose you have n integers labeled 1 through n. A permutation of those n
     * integers perm (1-indexed) is considered a beautiful arrangement if for
     * every i (1 &lt;= i &lt;= n), either of the following is true:
     * 
     * 
     * perm[i] is divisible by i.
     * 
     * i is divisible by perm[i].
     * 
     * Given an integer n, return the number of the beautiful arrangements that
     * you can construct.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 2
     * Output: 2
     * Explanation:
     * The first beautiful arrangement is [1,2]:
     *     - perm[1] = 1 is divisible by i = 1
     *     - perm[2] = 2 is divisible by i = 2
     * The second beautiful arrangement is [2,1]:
     *     - perm[1] = 2 is divisible by i = 1
     *     - i = 2 is divisible by perm[2] = 1
     * 
     * Example 2:
     * 
     * Input: n = 1
     * Output: 1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= n &lt;= 15
     */
    // TODO: Implement solution for Beautiful Arrangement
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
        BeautifulArrangement sol = new BeautifulArrangement();
        System.out.println(sol.solve());
    }
}
