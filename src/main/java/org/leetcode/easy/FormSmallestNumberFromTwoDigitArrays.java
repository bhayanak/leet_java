package org.leetcode.easy;


/**
 * <b>#2605 - Form Smallest Number From Two Digit Arrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [4,1,3], nums2 = [5,7]
 * Output: 15
 * Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
 *
 * Example 2:
 *
 * Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
 * Output: 3
 * Explanation: The number 3 contains the digit 3 which exists in both arrays.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 9
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= 9
 *
 * All digits in each array are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many digits will the resulting number have at most?
 * Hint 2: The resulting number will have either one or two digits. Try to find when each case is possible.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/form-smallest-number-from-two-digit-arrays/">LeetCode #2605</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class FormSmallestNumberFromTwoDigitArrays {

    /**
     * Solves the problem: Minimum average difference.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minimumAverageDifference(int[] nums) {
        // Find index with minimum avg difference
        long total=0; for (int n:nums) total+=n;
        long leftSum=0; int n=nums.length, minDiff=Integer.MAX_VALUE, res=0;
        for (int i=0;i<n;i++) {
            leftSum+=nums[i];
            long leftAvg=leftSum/(i+1);
            long rightAvg=(i==n-1)?0:(total-leftSum)/(n-i-1);
            int diff=(int)Math.abs(leftAvg-rightAvg);
            if (diff<minDiff) { minDiff=diff; res=i; }
        }
        return res;
    }

    public static void main(String[] args) {
        FormSmallestNumberFromTwoDigitArrays sol = new FormSmallestNumberFromTwoDigitArrays();
        System.out.println(sol.minimumAverageDifference(new int[]{1,2,3}));
    }
}
