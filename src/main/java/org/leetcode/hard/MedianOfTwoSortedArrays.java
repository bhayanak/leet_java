package org.leetcode.hard;

/**
 * <b>#4 - Median of Two Sorted Arrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Divide and Conquer</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * 
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * 
 * Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * nums1.length == m
 * 	
 * nums2.length == n
 * 	
 * 0 &lt;= m &lt;= 1000
 * 	
 * 0 &lt;= n &lt;= 1000
 * 	
 * 1 &lt;= m + n &lt;= 2000
 * 	
 * -106 &lt;= nums1[i], nums2[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Binary search on the shorter array to find the correct partition point.
 * The idea: partition both arrays so the left halves together form the
 * lower half of the merged array. Adjust partition until max(left) ≤ min(right).
 * This runs in O(log(min(m,n))) — far better than merging first.
 *
 * <h2>Complexity</h2>
* Time: O(log(min(m,n)))  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">LeetCode #4</a>
 */
public class MedianOfTwoSortedArrays {

    /**
     * Finds the median of two sorted arrays without merging them.
     *
     * @param nums1 first sorted array
     * @param nums2 second sorted array
     * @return      median value as a double
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the shorter array for binary search efficiency
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length, n = nums2.length;
        int lo = 0, hi = m;

        while (lo <= hi) {
            int partA = (lo + hi) / 2;
            int partB = (m + n + 1) / 2 - partA;

            int maxLeftA  = (partA == 0) ? Integer.MIN_VALUE : nums1[partA - 1];
            int minRightA = (partA == m) ? Integer.MAX_VALUE : nums1[partA];
            int maxLeftB  = (partB == 0) ? Integer.MIN_VALUE : nums2[partB - 1];
            int minRightB = (partB == n) ? Integer.MAX_VALUE : nums2[partB];

            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // Correct partition found
                if ((m + n) % 2 == 1) return Math.max(maxLeftA, maxLeftB);
                return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
            } else if (maxLeftA > minRightB) {
                hi = partA - 1; // move left in nums1
            } else {
                lo = partA + 1; // move right in nums1
            }
        }
        return 0.0;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                MedianOfTwoSortedArrays sol = new MedianOfTwoSortedArrays();
                System.out.println(sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));     // 2.0
                System.out.println(sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));  // 2.5
    }
}
