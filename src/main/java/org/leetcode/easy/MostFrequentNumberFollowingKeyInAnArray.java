package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MostFrequentNumberFollowingKeyInAnArray solution. */
public class MostFrequentNumberFollowingKeyInAnArray {

    /**
     * In the integer array nums, after every occurrence of key, what number appears most often?
     * @param nums array of integers
     * @param key  the target key value
     * @return most frequent number that follows key
     * <p><b>Explanation:</b> HashMap to count values immediately after key; return arg max.</p>
     */
    public int solve(int[] nums, int key) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == key) count.merge(nums[i + 1], 1, Integer::sum);
        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static void main(String[] args) {
        MostFrequentNumberFollowingKeyInAnArray sol = new MostFrequentNumberFollowingKeyInAnArray();
        System.out.println(sol.solve(new int[]{1,100,200,1,100}, 1));     // 100
        System.out.println(sol.solve(new int[]{2,2,2,2,3}, 2));            // 2
    }

}
