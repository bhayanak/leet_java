package org.leetcode.easy;


/**
 * <b>#2057 - Smallest Index With Equal Value</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums, return the smallest index i of nums such that i mod 10 == nums[i], or -1 if such index does not exist.
 *
 *
 * x mod y denotes the remainder when x is divided by y.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,2]
 * Output: 0
 * Explanation: 
 * i=0: 0 mod 10 = 0 == nums[0].
 * i=1: 1 mod 10 = 1 == nums[1].
 * i=2: 2 mod 10 = 2 == nums[2].
 * All indices have i mod 10 == nums[i], so we return the smallest index 0.
 *
 * Example 2:
 *
 * Input: nums = [4,3,2,1]
 * Output: 2
 * Explanation: 
 * i=0: 0 mod 10 = 0 != nums[0].
 * i=1: 1 mod 10 = 1 != nums[1].
 * i=2: 2 mod 10 = 2 == nums[2].
 * i=3: 3 mod 10 = 3 != nums[3].
 * 2 is the only index which has i mod 10 == nums[i].
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4,5,6,7,8,9,0]
 * Output: -1
 * Explanation: No index satisfies i mod 10 == nums[i].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 0 &lt;= nums[i] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Starting with i=0, check the condition for each index. The first one you find to be true is the smallest index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/smallest-index-with-equal-value/">LeetCode #2057</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class SmallestIndexWithEqualValue {

    /**
     * Solves the problem: Smallest equal.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int smallestEqual(int[] nums) {
        for (int i=0;i<nums.length;i++) if (i%10==nums[i]) return i;
        return -1;
    }

    public static void main(String[] args) {
        SmallestIndexWithEqualValue sol = new SmallestIndexWithEqualValue();
                System.out.println(sol.smallestEqual(new int[]{0,1,2}));        // 0
                System.out.println(sol.smallestEqual(new int[]{4,3,2,1}));      // 2
                System.out.println(sol.smallestEqual(new int[]{1,2,3,4,5,6,7,8,9,0})); // 9
    }
}
