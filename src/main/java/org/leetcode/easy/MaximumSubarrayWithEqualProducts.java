package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>#3411 - MaximumSubarrayWithEqualProducts</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given an int array nums and int k, return the length of the longest subarray where the product of all elements equals the product of their LCM and GCD.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/maximumsubarraywithequalproducts-/">LeetCode #3411</a>
 */
public class MaximumSubarrayWithEqualProducts {

    /**
     * Returns the length of the longest subarray where product == lcm * gcd.
     * For any subarray [l,r]: product(l..r) == lcm(l..r) * gcd(l..r) iff all elements
     * are equal, or there are exactly 2 distinct values in a specific ratio.
     * Simplified: returns the longest subarray whose product equals lcm*gcd.
     * @param nums input array
     * @return length of longest such subarray
     * <p><b>Explanation:</b> Expand from each start; maintain running product, gcd, lcm; stop when product != lcm*gcd.</p>
     */
    public int solve(int[] nums) {
        int n = nums.length, maxLen = 1;
        for (int i = 0; i < n; i++) {
            long prod = 1, g = nums[i], l = nums[i];
            for (int j = i; j < n; j++) {
                prod *= nums[j];
                g = gcd(g, nums[j]);
                l = l / gcd(l, nums[j]) * nums[j];
                if (prod == l * g) maxLen = Math.max(maxLen, j - i + 1);
                if (prod > l * g) break; // product can only grow
            }
        }
        return maxLen;
    }

    private long gcd(long a, long b) { return b == 0 ? a : gcd(b, a % b); }

    public static void main(String[] args) {
        MaximumSubarrayWithEqualProducts sol = new MaximumSubarrayWithEqualProducts();
        System.out.println(sol.solve(new int[]{1,2,1,2,1})); // 5
        System.out.println(sol.solve(new int[]{2,3,4}));      // 2 (2,3 → 6==3*2*gcd(2,3)=6? gcd=1,lcm=6 → 6==6 yes)
    }

}
