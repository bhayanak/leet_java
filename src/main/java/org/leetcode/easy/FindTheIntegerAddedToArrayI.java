package org.leetcode.easy;


/**
 * <b>#3131 - Find the Integer Added to Array I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays of equal length, nums1 and nums2.
 *
 *
 * Each element in nums1 has been increased (or decreased in the case of negative) by an integer, represented by the variable x.
 *
 *
 * As a result, nums1 becomes equal to nums2. Two arrays are considered equal when they contain the same integers with the same frequencies.
 *
 *
 * Return the integer x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,6,4], nums2 = [9,7,5]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The integer added to each element of nums1 is 3.
 *
 * Example 2:
 *
 * Input: nums1 = [10], nums2 = [5]
 *
 *
 * Output: -5
 *
 *
 * Explanation:
 *
 *
 * The integer added to each element of nums1 is -5.
 *
 * Example 3:
 *
 * Input: nums1 = [1,1,1,1], nums2 = [1,1,1,1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The integer added to each element of nums1 is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length == nums2.length &lt;= 100
 *
 * 0 &lt;= nums1[i], nums2[i] &lt;= 1000
 *
 * The test cases are generated in a way that there is an integer x such that nums1 can become equal to nums2 by adding x to each element of nums1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that, after sorting both arrays, there should be a one-to-one correspondence between every element.
 * Hint 2: Thus <code>x = min(nums2) - min(nums1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/find-the-integer-added-to-array-i/">LeetCode #3131</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class FindTheIntegerAddedToArrayI {

    /**
     * Solves the problem: Added integer.
     *
     * @param nums1 the nums1 (int[])
     * @param nums2 the nums2 (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public long addedInteger(int[] nums1, int[] nums2) {
        int min1=nums1[0], min2=nums2[0];
        for (int n:nums1) min1=Math.min(min1,n);
        for (int n:nums2) min2=Math.min(min2,n);
        return min2-min1;
    }

    public static void main(String[] args) {
        FindTheIntegerAddedToArrayI sol = new FindTheIntegerAddedToArrayI();
        System.out.println(sol.addedInteger(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
