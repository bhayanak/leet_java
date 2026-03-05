package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #461: Hamming Distance
 * @see <a href="https://leetcode.com/problems/hamming-distance/">Problem</a>
 */
public class HammingDistance {

    /**
     * LeetCode #461 – Hamming Distance
     * Difficulty: EASY
     * Topics: Bit Manipulation
     *
     * The Hamming distance between two integers is the number of positions at
     * which the corresponding bits are different.
     * 
     * 
     * Given two integers x and y, return the Hamming distance between them.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: x = 1, y = 4
     * Output: 2
     * Explanation:
     * 1   (0 0 0 1)
     * 4   (0 1 0 0)
     *        ↑   ↑
     * The above arrows point to positions where the corresponding bits are
     * different.
     * 
     * Example 2:
     * 
     * Input: x = 3, y = 1
     * Output: 1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt;= x, y &lt;= 231 - 1
     * 
     * 
     * 
     * Note: This question is the same as 2220: Minimum Bit Flips to Convert
     * Number.
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        HammingDistance sol = new HammingDistance();
        System.out.println(sol.hammingDistance(0, 0));
    }
}
