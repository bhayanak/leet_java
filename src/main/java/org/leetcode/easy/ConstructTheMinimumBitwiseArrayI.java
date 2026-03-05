package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ConstructTheMinimumBitwiseArrayI solution. */
public class ConstructTheMinimumBitwiseArrayI {

    /**
     * For each nums[i] (prime), finds the minimum x such that x | (x+1) == nums[i].
     * Returns -1 if no such x exists.
     * @param nums array of prime numbers
     * @return array where ans[i] is min x with x|(x+1)==nums[i], or -1
     * <p><b>Explanation:</b> For prime p, x|(x+1)==p iff x==p with its lowest unset bit cleared.</p>
     */
    public int[] solve(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int a = nums[i];
            ans[i] = -1;
            for (int bit = 0; bit < 30; bit++) {
                if (((a >> bit) & 1) == 0) {
                    int x = a ^ (1 << bit);
                    if ((x | (x + 1)) == a) { ans[i] = x; break; }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ConstructTheMinimumBitwiseArrayI sol = new ConstructTheMinimumBitwiseArrayI();
        System.out.println(Arrays.toString(sol.solve(new int[]{2, 3, 5, 7}))); // [-1, 1, 4, 3]
    }

}
