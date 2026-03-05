package org.leetcode.medium;


/**
 * <b>#2560 - House Robber IV</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are several consecutive houses along a street, each of which has some money inside. There is also a robber, who wants to steal money from the homes, but he refuses to steal from adjacent homes.
 *
 *
 * The capability of the robber is the maximum amount of money he steals from one house of all the houses he robbed.
 *
 *
 * You are given an integer array nums representing how much money is stashed in each house. More formally, the ith house from the left has nums[i] dollars.
 *
 *
 * You are also given an integer k, representing the minimum number of houses the robber will steal from. It is always possible to steal at least k houses.
 *
 *
 * Return the minimum capability of the robber out of all the possible ways to steal at least k houses.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,5,9], k = 2
 * Output: 5
 * Explanation: 
 * There are three ways to rob at least 2 houses:
 * - Rob the houses at indices 0 and 2. Capability is max(nums[0], nums[2]) = 5.
 * - Rob the houses at indices 0 and 3. Capability is max(nums[0], nums[3]) = 9.
 * - Rob the houses at indices 1 and 3. Capability is max(nums[1], nums[3]) = 9.
 * Therefore, we return min(5, 9, 9) = 5.
 *
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1], k = 2
 * Output: 2
 * Explanation: There are 7 ways to rob the houses. The way which leads to minimum capability is to rob the house at index 0 and 4. Return max(nums[0], nums[4]) = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= (nums.length + 1)/2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use binary search to find the minimum value of a non-contiguous subsequence of a given size k?
 * Hint 2: Initialize the search range with the minimum and maximum elements of the input array.
 * Hint 3: Use a check function to determine if it is possible to select k non-consecutive elements that are less than or equal to the current "guess" value.
 * Hint 4: Adjust the search range based on the outcome of the check function, until the range converges and the minimum value is found.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/house-robber-iv/">LeetCode #2560</a>
 */
public class HouseRobberIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: House Robber IV");
    }

    public static void main(String[] args) {
        System.out.println("=== HouseRobberIv ===");
        HouseRobberIv sol = new HouseRobberIv();
        System.out.println(sol.solve(null));
    }
}
