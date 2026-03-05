package org.leetcode.easy;


/**
 * <b>#3375 - Minimum Operations to Make Array Values Equal to K</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * An integer h is called valid if all values in the array that are strictly greater than h are identical.
 *
 *
 * For example, if nums = [10, 8, 10, 8], a valid integer is h = 9 because all nums[i] &gt; 9 are equal to 10, but 5 is not a valid integer.
 *
 *
 * You are allowed to perform the following operation on nums:
 *
 *
 * Select an integer h that is valid for the current values in nums.
 *
 * For each index i where nums[i] &gt; h, set nums[i] to h.
 *
 * Return the minimum number of operations required to make every element in nums equal to k. If it is impossible to make all elements equal to k, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,2,5,4,5], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The operations can be performed in order using valid integers 4 and then 2.
 *
 * Example 2:
 *
 * Input: nums = [2,1,2], k = 2
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * It is impossible to make all the values equal to 2.
 *
 * Example 3:
 *
 * Input: nums = [9,7,5,3], k = 1
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The operations can be performed using valid integers in the order 7, 5, 3, and 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100 
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * 1 &lt;= k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Handle the case when the array contains an integer less than <code>k</code>
 * Hint 2: Start by performing operations on the highest integer
 * Hint 3: You can perform an operation on the highest integer using the second-highest, an operation on the second-highest using the third-highest, and so forth.
 * Hint 4: The answer is the number of distinct integers in the array that are larger than <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-array-values-equal-to-k/">LeetCode #3375</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MinimumOperationsToMakeArrayValuesEqualToK {

    /**
     * Computes the minimum Min operations to make median k.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int minOperationsToMakeMedianK(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int mid=nums.length/2, ops=0;
        if (nums[mid]<k) { for (int i=mid;i>=0&&nums[i]<k;i--) ops+=k-nums[i]; }
        else if (nums[mid]>k) { for (int i=mid;i<nums.length&&nums[i]>k;i++) ops+=nums[i]-k; }
        return ops;
    }

    public static void main(String[] args) {
        MinimumOperationsToMakeArrayValuesEqualToK sol = new MinimumOperationsToMakeArrayValuesEqualToK();
        System.out.println(sol.minOperationsToMakeMedianK(new int[]{1,2,3}, 0));
    }
}
