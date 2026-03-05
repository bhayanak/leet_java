package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #495: Teemo Attacking
 * @see <a href="https://leetcode.com/problems/teemo-attacking/">Problem</a>
 */
public class TeemoAttacking {

    /**
     * Returns total seconds Ashe is poisoned given attack times and poison duration.
     * @param timeSeries attack timestamps
     * @param duration   poison duration per attack
     * @return total poisoned seconds
     * <p><b>Explanation:</b> For each attack: add min(duration, gap to next attack); last always adds full duration.</p>
     */
    public int solve(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length - 1; i++)
            total += Math.min(timeSeries[i+1] - timeSeries[i], duration);
        return total + duration;
    }

    public static void main(String[] args) {
        TeemoAttacking sol = new TeemoAttacking();
        System.out.println(sol.solve(new int[]{1,4}, 2));    // 4
        System.out.println(sol.solve(new int[]{1,2}, 2));    // 3
    }

}
