package org.leetcode.medium;


/**
 * <b>#3254 - Find the Power of K-Size Subarrays I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums of length n and a positive integer k.
 *
 *
 * The power of an array is defined as:
 *
 *
 * Its maximum element if all of its elements are consecutive and sorted in ascending order.
 *
 * -1 otherwise.
 *
 * You need to find the power of all subarrays of nums of size k.
 *
 *
 * Return an integer array results of size n - k + 1, where results[i] is the power of nums[i..(i + k - 1)].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,3,2,5], k = 3
 *
 *
 * Output: [3,4,-1,-1,-1]
 *
 *
 * Explanation:
 *
 *
 * There are 5 subarrays of nums of size 3:
 *
 *
 * [1, 2, 3] with the maximum element 3.
 *
 * [2, 3, 4] with the maximum element 4.
 *
 * [3, 4, 3] whose elements are not consecutive.
 *
 * [4, 3, 2] whose elements are not sorted.
 *
 * [3, 2, 5] whose elements are not consecutive.
 *
 * Example 2:
 *
 * Input: nums = [2,2,2,2,2], k = 4
 *
 *
 * Output: [-1,-1]
 *
 * Example 3:
 *
 * Input: nums = [3,2,3,2,3,2], k = 2
 *
 *
 * Output: [-1,3,-1,3,-1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 500
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use a brute force solution with nested loops and HashSet?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/">LeetCode #3254</a>
 */
public class FindThePowerOfKSizeSubarraysI {

    /**
     * Solves the problem: Results array.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int[] result
     */
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        for (int i=0;i<=n-k;i++) {
            boolean ok=true;
            for (int j=i+1;j<i+k;j++) if (nums[j]!=nums[j-1]+1) { ok=false; break; }
            res[i]=ok?nums[i+k-1]:-1;
        }
        return res;
    }

    public static void main(String[] args) {
        FindThePowerOfKSizeSubarraysI sol = new FindThePowerOfKSizeSubarraysI();
        System.out.println(sol.resultsArray(new int[]{1,2,3}, 0));
    }
}
