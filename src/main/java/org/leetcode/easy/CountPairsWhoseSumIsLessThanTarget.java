package org.leetcode.easy;


/**
 * <b>#2824 - Count Pairs Whose Sum is Less than Target</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 &lt;= i &lt; j &lt; n and nums[i] + nums[j] &lt; target.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,1,2,3,1], target = 2
 * Output: 3
 * Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
 * - (0, 1) since 0 &lt; 1 and nums[0] + nums[1] = 0 &lt; target
 * - (0, 2) since 0 &lt; 2 and nums[0] + nums[2] = 1 &lt; target 
 * - (0, 4) since 0 &lt; 4 and nums[0] + nums[4] = 0 &lt; target
 * Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
 *
 * Example 2:
 *
 * Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
 * Output: 10
 * Explanation: There are 10 pairs of indices that satisfy the conditions in the statement:
 * - (0, 1) since 0 &lt; 1 and nums[0] + nums[1] = -4 &lt; target
 * - (0, 3) since 0 &lt; 3 and nums[0] + nums[3] = -8 &lt; target
 * - (0, 4) since 0 &lt; 4 and nums[0] + nums[4] = -13 &lt; target
 * - (0, 5) since 0 &lt; 5 and nums[0] + nums[5] = -7 &lt; target
 * - (0, 6) since 0 &lt; 6 and nums[0] + nums[6] = -3 &lt; target
 * - (1, 4) since 1 &lt; 4 and nums[1] + nums[4] = -5 &lt; target
 * - (3, 4) since 3 &lt; 4 and nums[3] + nums[4] = -9 &lt; target
 * - (3, 5) since 3 &lt; 5 and nums[3] + nums[5] = -3 &lt; target
 * - (4, 5) since 4 &lt; 5 and nums[4] + nums[5] = -8 &lt; target
 * - (4, 6) since 4 &lt; 6 and nums[4] + nums[6] = -4 &lt; target
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length == n &lt;= 50
 *
 * -50 &lt;= nums[i], target &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small enough for a brute-force solution to pass
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/">LeetCode #2824</a>
  *
  * <p><b>Explanation:</b> Uses two pointers moving towards each other to process pairs in O(n) time.</p>
  */
public class CountPairsWhoseSumIsLessThanTarget {

    /**
     * Counts Count pairs.
     *
     * @param nums the nums (java.util.List&lt;Integer&gt;)
     * @param target the target (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses two pointers moving towards each other to process pairs in O(n) time.</p>
      */
    public int countPairs(java.util.List<Integer> nums, int target) {
        int cnt=0;
        for (int i=0;i<nums.size()-1;i++) for (int j=i+1;j<nums.size();j++)
            if (nums.get(i)+nums.get(j)<target) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        CountPairsWhoseSumIsLessThanTarget sol = new CountPairsWhoseSumIsLessThanTarget();
                System.out.println(sol.countPairs(java.util.Arrays.asList(-1,1,2,3,1),2)); // 3
                System.out.println(sol.countPairs(java.util.Arrays.asList(-6,2,5,-2,-7,-1,3),-2)); // 10
    }
}
