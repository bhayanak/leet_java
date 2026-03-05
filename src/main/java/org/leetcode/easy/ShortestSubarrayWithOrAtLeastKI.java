package org.leetcode.easy;


/**
 * <b>#3095 - Shortest Subarray With OR at Least K I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of non-negative integers and an integer k.
 *
 *
 * An array is called special if the bitwise OR of all of its elements is at least k.
 *
 *
 * Return the length of the shortest special non-empty subarray of nums, or return -1 if no special subarray exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], k = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The subarray [3] has OR value of 3. Hence, we return 1.
 *
 *
 * Note that [2] is also a special subarray.
 *
 * Example 2:
 *
 * Input: nums = [2,1,8], k = 10
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The subarray [2,1,8] has OR value of 11. Hence, we return 3.
 *
 * Example 3:
 *
 * Input: nums = [1,2], k = 0
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The subarray [1] has OR value of 1. Hence, we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50
 *
 * 0 &lt;= nums[i] &lt;= 50
 *
 * 0 &lt;= k &lt; 64
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small. Brute force checking all the subarrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i/">LeetCode #3095</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class ShortestSubarrayWithOrAtLeastKI {

    /**
     * Solves the problem: Minimum subarray length.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        for (int len=1;len<=n;len++) {
            for (int i=0;i+len<=n;i++) {
                int or=0; for (int j=i;j<i+len;j++) or|=nums[j];
                if (or>=k) return len;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ShortestSubarrayWithOrAtLeastKI sol = new ShortestSubarrayWithOrAtLeastKI();
        System.out.println(sol.minimumSubarrayLength(new int[]{1,2,3}, 0));
    }
}
