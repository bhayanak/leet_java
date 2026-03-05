package org.leetcode.easy;


/**
 * <b>#1991 - Find the Middle Index in Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).
 *
 *
 * A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].
 *
 *
 * If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.
 *
 *
 * Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,-1,8,4]
 * Output: 3
 * Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
 * The sum of the numbers after index 3 is: 4 = 4
 *
 * Example 2:
 *
 * Input: nums = [1,-1,4]
 * Output: 2
 * Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
 * The sum of the numbers after index 2 is: 0
 *
 * Example 3:
 *
 * Input: nums = [2,5]
 * Output: -1
 * Explanation: There is no valid middleIndex.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * -1000 &lt;= nums[i] &lt;= 1000
 *
 *
 *
 * Note: This question is the same as 724: https://leetcode.com/problems/find-pivot-index/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Could we go from left to right and check to see if an index is a middle index?
 * Hint 2: Do we need to sum every number to the left and right of an index each time?
 * Hint 3: Use a prefix sum array where prefix[i] = nums[0] + nums[1] + ... + nums[i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-middle-index-in-array/">LeetCode #1991</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindTheMiddleIndexInArray {

    /**
     * Finds Find middle index.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findMiddleIndex(int[] nums) {
        int total=0; for (int n:nums) total+=n;
        int left=0;
        for (int i=0;i<nums.length;i++) {
            if (left==total-left-nums[i]) return i;
            left+=nums[i];
        }
        return -1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FindTheMiddleIndexInArray sol = new FindTheMiddleIndexInArray();
                System.out.println(sol.findMiddleIndex(new int[]{2,3,-1,8,4}));   // 3
                System.out.println(sol.findMiddleIndex(new int[]{1,-1,4}));        // 2
                System.out.println(sol.findMiddleIndex(new int[]{2,5}));           // -1
    }
}
