package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #605: Can Place Flowers
 * @see <a href="https://leetcode.com/problems/can-place-flowers/">Problem</a>
 */
public class CanPlaceFlowers {

    /**
     * LeetCode #605 – Can Place Flowers
     * Difficulty: EASY
     * Topics: Array, Greedy
     *
     * You have a long flowerbed in which some of the plots are planted, and some
     * are not. However, flowers cannot be planted in adjacent plots.
     * 
     * 
     * Given an integer array flowerbed containing 0's and 1's, where 0 means
     * empty and 1 means not empty, and an integer n, return true if n new flowers
     * can be planted in the flowerbed without violating the no-adjacent-flowers
     * rule and false otherwise.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: true
     * 
     * 
     * Example 2:
     * 
     * Input: flowerbed = [1,0,0,0,1], n = 2
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= flowerbed.length &lt;= 2 * 104
     * 
     * flowerbed[i] is 0 or 1.
     * 
     * There are no two adjacent flowers in flowerbed.
     * 
     * 0 &lt;= n &lt;= flowerbed.length
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i-1] == 0) &&
                (i == flowerbed.length-1 || flowerbed[i+1] == 0)) {
                flowerbed[i] = 1; n--;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        CanPlaceFlowers sol = new CanPlaceFlowers();
        System.out.println(sol.canPlaceFlowers(new int[]{1,2,3}, 0));
    }
}
