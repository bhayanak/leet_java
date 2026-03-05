package org.leetcode.easy;


/**
 * <b>#1403 - Minimum Subsequence in Non-Increasing Order</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array nums, obtain a subsequence of the array whose sum of elements is strictly greater than the sum of the non included elements in such subsequence. 
 *
 *
 * If there are multiple solutions, return the subsequence with minimum size and if there still exist multiple solutions, return the subsequence with the maximum total sum of all its elements. A subsequence of an array can be obtained by erasing some (possibly zero) elements from the array. 
 *
 *
 * Note that the solution with the given constraints is guaranteed to be unique. Also return the answer sorted in non-increasing order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,10,9,8]
 * Output: [10,9] 
 * Explanation: The subsequences [10,9] and [10,8] are minimal such that the sum of their elements is strictly greater than the sum of elements not included. However, the subsequence [10,9] has the maximum total sum of its elements. 
 *
 * Example 2:
 *
 * Input: nums = [4,4,7,6,7]
 * Output: [7,7,6] 
 * Explanation: The subsequence [7,7] has the sum of its elements equal to 14 which is not strictly greater than the sum of elements not included (14 = 4 + 4 + 6). Therefore, the subsequence [7,6,7] is the minimal satisfying the conditions. Note the subsequence has to be returned in non-increasing order.  
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 500
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort elements and take each element from the largest until accomplish the conditions.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-subsequence-in-non-increasing-order/">LeetCode #1403</a>
 */
public class MinimumSubsequenceInNonIncreasingOrder {

    public java.util.List<Integer> minSubsequence(int[] nums) {
        java.util.Arrays.sort(nums);
        int total=0; for (int n:nums) total+=n;
        java.util.List<Integer> res = new java.util.ArrayList<>();
        int sub=0;
        for (int i=nums.length-1;i>=0;i--) {
            sub+=nums[i]; res.add(nums[i]);
            if (sub>total-sub) break;
        }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MinimumSubsequenceInNonIncreasingOrder sol = new MinimumSubsequenceInNonIncreasingOrder();
        System.out.println("No method available");
    }
}
