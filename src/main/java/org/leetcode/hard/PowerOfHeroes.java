package org.leetcode.hard;


/**
 * <b>#2681 - Power of Heroes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums representing the strength of some heroes. The power of a group of heroes is defined as follows:
 *
 *
 * Let i0, i1, ... ,ik be the indices of the heroes in a group. Then, the power of this group is max(nums[i0], nums[i1], ... ,nums[ik])2 * min(nums[i0], nums[i1], ... ,nums[ik]).
 *
 * Return the sum of the power of all non-empty groups of heroes possible. Since the sum could be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,4]
 * Output: 141
 * Explanation: 
 * 1st group: [2] has power = 22 * 2 = 8.
 * 2nd group: [1] has power = 12 * 1 = 1. 
 * 3rd group: [4] has power = 42 * 4 = 64. 
 * 4th group: [2,1] has power = 22 * 1 = 4. 
 * 5th group: [2,4] has power = 42 * 2 = 32. 
 * 6th group: [1,4] has power = 42 * 1 = 16. 
 * ​​​​​​​7th group: [2,1,4] has power = 42​​​​​​​ * 1 = 16. 
 * The sum of powers of all groups is 8 + 1 + 64 + 4 + 32 + 16 + 16 = 141.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1]
 * Output: 7
 * Explanation: A total of 7 groups are possible, and the power of each group will be 1. Therefore, the sum of the powers of all groups is 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try something with sorting the array.
 * Hint 2: For a pair of array elements nums[i] and nums[j] (i &lt; j), the power would be nums[i]*nums[j]^2 regardless of how many elements in between are included.
 * Hint 3: The number of subsets with the above as power will correspond to 2^(j-i-1).
 * Hint 4: Try collecting the terms for nums[0], nums[1], …, nums[j-1] when computing the power of heroes ending at index j to get the power in a single pass.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/power-of-heroes/">LeetCode #2681</a>
 */
public class PowerOfHeroes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Power of Heroes");
    }

    public static void main(String[] args) {
        System.out.println("=== PowerOfHeroes ===");
        PowerOfHeroes sol = new PowerOfHeroes();
        System.out.println(sol.solve(null));
    }
}
