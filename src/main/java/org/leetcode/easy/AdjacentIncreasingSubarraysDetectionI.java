package org.leetcode.easy;


/**
 * <b>#3349 - Adjacent Increasing Subarrays Detection I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of n integers and an integer k, determine whether there exist two adjacent subarrays of length k such that both subarrays are strictly increasing. Specifically, check if there are two subarrays starting at indices a and b (a &lt; b), where:
 *
 *
 * Both subarrays nums[a..a + k - 1] and nums[b..b + k - 1] are strictly increasing.
 *
 * The subarrays must be adjacent, meaning b = a + k.
 *
 * Return true if it is possible to find two such subarrays, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,7,8,9,2,3,4,3,1], k = 3
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The subarray starting at index 2 is [7, 8, 9], which is strictly increasing.
 *
 * The subarray starting at index 5 is [2, 3, 4], which is also strictly increasing.
 *
 * These two subarrays are adjacent, so the result is true.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,4,4,4,5,6,7], k = 5
 *
 *
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt; 2 * k &lt;= nums.length
 *
 * -1000 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store the longest decreasing subarray starting and ending at an index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/adjacent-increasing-subarrays-detection-i/">LeetCode #3349</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class AdjacentIncreasingSubarraysDetectionI {

    /**
     * Returns true if Is adjacent to each other.
     *
     * @param adjacent the adjacent (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isAdjacentToEachOther(int[][] adjacent) {
        // adjacent matrix: check for valid tournament
        int n=adjacent.length;
        for (int i=0;i<n;i++) for (int j=i+1;j<n;j++)
            if (adjacent[i][j]+adjacent[j][i]!=1) return false;
        return true;
    }

    public static void main(String[] args) {
        AdjacentIncreasingSubarraysDetectionI sol = new AdjacentIncreasingSubarraysDetectionI();
        System.out.println(sol.isAdjacentToEachOther(new int[][]{{1,2},{3,4}}));
    }
}
