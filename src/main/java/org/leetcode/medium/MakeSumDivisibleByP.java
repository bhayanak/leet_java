package org.leetcode.medium;


/**
 * <b>#1590 - Make Sum Divisible by P</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers nums, remove the smallest subarray (possibly empty) such that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.
 *
 *
 * Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.
 *
 *
 * A subarray is defined as a contiguous block of elements in the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,4,2], p = 6
 * Output: 1
 * Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.
 *
 * Example 2:
 *
 * Input: nums = [6,3,5,2], p = 9
 * Output: 2
 * Explanation: We cannot remove a single element to get a sum divisible by 9. The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3], p = 3
 * Output: 0
 * Explanation: Here the sum is 6. which is already divisible by 3. Thus we do not need to remove anything.
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
 * 1 &lt;= p &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use prefix sums to calculate the subarray sums.
 * Hint 2: Suppose you know the remainder for the sum of the entire array. How does removing a subarray affect that remainder? What remainder does the subarray need to have in order to make the rest of the array sum up to be divisible by k?
 * Hint 3: Use a map to keep track of the rightmost index for every prefix sum % p.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/make-sum-divisible-by-p/">LeetCode #1590</a>
 */
public class MakeSumDivisibleByP {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Make Sum Divisible by P");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MakeSumDivisibleByP ===");
        MakeSumDivisibleByP sol = new MakeSumDivisibleByP();
        System.out.println(sol.solve(null));
    }
}
