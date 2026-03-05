package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FruitsIntoBasketsIi solution. */
public class FruitsIntoBasketsIi {

    /**
     * Returns the length of the longest subarray containing at most 2 distinct fruit types.
     * @param fruits array where fruits[i] is the fruit type at position i
     * @return length of the longest valid subarray
     * <p><b>Explanation:</b> Sliding window: expand right; shrink left when more than 2 distinct types.</p>
     */
    public int solve(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, maxLen = 0;
        for (int right = 0; right < fruits.length; right++) {
            basket.merge(fruits[right], 1, Integer::sum);
            while (basket.size() > 2) {
                basket.merge(fruits[left], -1, Integer::sum);
                if (basket.get(fruits[left]) == 0) basket.remove(fruits[left]);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        FruitsIntoBasketsIi sol = new FruitsIntoBasketsIi();
        System.out.println(sol.solve(new int[]{1, 2, 1}));       // 3
        System.out.println(sol.solve(new int[]{0, 1, 2, 2}));    // 3
        System.out.println(sol.solve(new int[]{1, 2, 3, 2, 2})); // 4
    }

}
