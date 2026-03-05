package org.leetcode.easy;


/**
 * <b>#1848 - Minimum Distance to the Target Element</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums (0-indexed) and two integers target and start, find an index i such that nums[i] == target and abs(i - start) is minimized. Note that abs(x) is the absolute value of x.
 *
 *
 * Return abs(i - start).
 *
 *
 * It is guaranteed that target exists in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5], target = 5, start = 3
 * Output: 1
 * Explanation: nums[4] = 5 is the only value equal to target, so the answer is abs(4 - 3) = 1.
 *
 * Example 2:
 *
 * Input: nums = [1], target = 1, start = 0
 * Output: 0
 * Explanation: nums[0] = 1 is the only value equal to target, so the answer is abs(0 - 0) = 0.
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,1,1,1,1,1,1,1], target = 1, start = 0
 * Output: 0
 * Explanation: Every value of nums is 1, but nums[0] minimizes abs(i - start), which is abs(0 - 0) = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 104
 *
 * 0 &lt;= start &lt; nums.length
 *
 * target is in nums.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Loop in both directions until you find the target element.
 * Hint 2: For each index i such that nums[i] == target calculate abs(i - start).
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-distance-to-the-target-element/">LeetCode #1848</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumDistanceToTheTargetElement {

    /**
     * Returns Get min distance.
     *
     * @param nums the nums (int[])
     * @param target the target (int)
     * @param start the start (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int getMinDistance(int[] nums, int target, int start) {
        int min=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++)
            if (nums[i]==target) min=Math.min(min,Math.abs(i-start));
        return min;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MinimumDistanceToTheTargetElement sol = new MinimumDistanceToTheTargetElement();
                System.out.println(sol.getMinDistance(new int[]{1,2,3,4,5},5,3)); // 1
                System.out.println(sol.getMinDistance(new int[]{1},1,0));          // 0
                System.out.println(sol.getMinDistance(new int[]{1,1,1,1,1,1,1,1,1,1},1,0)); // 0
    }
}
