package org.leetcode.easy;


/**
 * <b>#3038 - Maximum Number of Operations With the Same Score I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums. Consider the following operation:
 *
 *
 * Delete the first two elements nums and define the score of the operation as the sum of these two elements.
 *
 * You can perform this operation until nums contains fewer than two elements. Additionally, the same score must be achieved in all operations.
 *
 *
 * Return the maximum number of operations you can perform.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,2,1,4,5]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can perform the first operation with the score 3 + 2 = 5. After this operation, nums = [1,4,5].
 *
 * We can perform the second operation as its score is 4 + 1 = 5, the same as the previous operation. After this operation, nums = [5].
 *
 * As there are fewer than two elements, we can't perform more operations.
 *
 * Example 2:
 *
 * Input: nums = [1,5,3,3,4,1,3,2,2,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can perform the first operation with the score 1 + 5 = 6. After this operation, nums = [3,3,4,1,3,2,2,3].
 *
 * We can perform the second operation as its score is 3 + 3 = 6, the same as the previous operation. After this operation, nums = [4,1,3,2,2,3].
 *
 * We cannot perform the next operation as its score is 4 + 1 = 5, which is different from the previous scores.
 *
 * Example 3:
 *
 * Input: nums = [5,3]
 *
 *
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i/">LeetCode #3038</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumNumberOfOperationsWithTheSameScoreI {

    /**
     * Computes the maximum Max operations.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxOperations(int[] nums) {
        int target=nums[0]+nums[1], ops=1;
        for (int i=2;i<nums.length-1;i+=2) {
            if (nums[i]+nums[i+1]==target) ops++;
            else break;
        }
        return ops;
    }

    public static void main(String[] args) {
        MaximumNumberOfOperationsWithTheSameScoreI sol = new MaximumNumberOfOperationsWithTheSameScoreI();
                System.out.println(sol.maxOperations(new int[]{3,2,1,4,5})); // 2
                System.out.println(sol.maxOperations(new int[]{1,5,3,3,4,1,3,2,2,3})); // 2
                System.out.println(sol.maxOperations(new int[]{6,1,2,5,3,4})); // 3
    }
}
