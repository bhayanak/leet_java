package org.leetcode.easy;


/**
 * <b>#2574 - Left and Right Sum Differences</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums of size n.
 *
 *
 * Define two arrays leftSum and rightSum where:
 *
 *
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 *
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 *
 * Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,4,8,3]
 * Output: [15,1,11,22]
 * Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
 * The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 *
 * Example 2:
 *
 * Input: nums = [1]
 * Output: [0]
 * Explanation: The array leftSum is [0] and the array rightSum is [0].
 * The array answer is [|0 - 0|] = [0].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index i, maintain two variables leftSum and rightSum.
 * Hint 2: Iterate on the range j: [0 … i - 1] and add nums[j] to the leftSum and similarly iterate on the range j: [i + 1 … nums.length - 1] and add nums[j] to the rightSum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/left-and-right-sum-differences/">LeetCode #2574</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class LeftAndRightSumDifferences {

    /**
     * Solves the problem: Left right difference.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] leftSum=new int[n], rightSum=new int[n];
        for (int i=1;i<n;i++) leftSum[i]=leftSum[i-1]+nums[i-1];
        for (int i=n-2;i>=0;i--) rightSum[i]=rightSum[i+1]+nums[i+1];
        int[] res=new int[n];
        for (int i=0;i<n;i++) res[i]=Math.abs(leftSum[i]-rightSum[i]);
        return res;
    }

    public static void main(String[] args) {
        LeftAndRightSumDifferences sol = new LeftAndRightSumDifferences();
                System.out.println(java.util.Arrays.toString(sol.leftRightDifference(new int[]{10,4,8,3}))); // [15,1,11,22]
                System.out.println(java.util.Arrays.toString(sol.leftRightDifference(new int[]{1}))); // [0]
    }
}
