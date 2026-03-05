package org.leetcode.easy;


/**
 * <b>#1995 - Count Special Quadruplets</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:
 *
 *
 * nums[a] + nums[b] + nums[c] == nums[d], and
 *
 * a &lt; b &lt; c &lt; d
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,6]
 * Output: 1
 * Explanation: The only quadruplet that satisfies the requirement is (0, 1, 2, 3) because 1 + 2 + 3 == 6.
 *
 * Example 2:
 *
 * Input: nums = [3,3,6,4,5]
 * Output: 0
 * Explanation: There are no such quadruplets in [3,3,6,4,5].
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,3,5]
 * Output: 4
 * Explanation: The 4 quadruplets that satisfy the requirement are:
 * - (0, 1, 2, 3): 1 + 1 + 1 == 3
 * - (0, 1, 3, 4): 1 + 1 + 3 == 5
 * - (0, 2, 3, 4): 1 + 1 + 3 == 5
 * - (1, 2, 3, 4): 1 + 1 + 3 == 5
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= nums.length &lt;= 50
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: N is very small, how can we use that?
 * Hint 2: Can we check every possible quadruplet?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-special-quadruplets/">LeetCode #1995</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountSpecialQuadruplets {

    /**
     * Counts Count quadruplets.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countQuadruplets(int[] nums) {
        int n=nums.length, count=0;
        for (int a=0;a<n-3;a++)
            for (int b=a+1;b<n-2;b++)
                for (int c=b+1;c<n-1;c++)
                    for (int d=c+1;d<n;d++)
                        if (nums[a]+nums[b]+nums[c]==nums[d]) count++;
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        CountSpecialQuadruplets sol = new CountSpecialQuadruplets();
                System.out.println(sol.countQuadruplets(new int[]{1,2,3,6}));     // 1
                System.out.println(sol.countQuadruplets(new int[]{3,3,6,4,5}));   // 0
                System.out.println(sol.countQuadruplets(new int[]{1,1,1,3,5}));   // 4
    }
}
