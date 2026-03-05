package org.leetcode.easy;


/**
 * <b>#2395 - Find Subarrays With Equal Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums, determine whether there exist two subarrays of length 2 with equal sum. Note that the two subarrays must begin at different indices.
 *
 *
 * Return true if these subarrays exist, and false otherwise.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,4]
 * Output: true
 * Explanation: The subarrays with elements [4,2] and [2,4] have the same sum of 6.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: false
 * Explanation: No two subarrays of size 2 have the same sum.
 *
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: true
 * Explanation: The subarrays [nums[0],nums[1]] and [nums[1],nums[2]] have the same sum of 0. 
 * Note that even though the subarrays have the same content, the two subarrays are considered different because they are in different positions in the original array.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 1000
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a counter to keep track of the subarray sums.
 * Hint 2: Use a hashset to check if any two sums are equal.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/find-subarrays-with-equal-sum/">LeetCode #2395</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class FindSubarraysWithEqualSum {

    /**
     * Finds Find subarrays.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean findSubarrays(int[] nums) {
        java.util.Set<Integer> seen=new java.util.HashSet<>();
        for (int i=0;i<nums.length-1;i++) {
            int s=nums[i]+nums[i+1];
            if (!seen.add(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        FindSubarraysWithEqualSum sol = new FindSubarraysWithEqualSum();
                System.out.println(sol.findSubarrays(new int[]{4,2,4}));    // true (4+2==2+4)
                System.out.println(sol.findSubarrays(new int[]{1,2,3,4,5})); // false
                System.out.println(sol.findSubarrays(new int[]{0,0,0}));     // true
    }
}
