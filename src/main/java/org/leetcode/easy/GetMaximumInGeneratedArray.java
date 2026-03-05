package org.leetcode.easy;


/**
 * <b>#1646 - Get Maximum in Generated Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n. A 0-indexed integer array nums of length n + 1 is generated in the following way:
 *
 *
 * nums[0] = 0
 *
 * nums[1] = 1
 *
 * nums[2 * i] = nums[i] when 2 &lt;= 2 * i &lt;= n
 *
 * nums[2 * i + 1] = nums[i] + nums[i + 1] when 2 &lt;= 2 * i + 1 &lt;= n
 *
 * Return the maximum integer in the array nums​​​.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7
 * Output: 3
 * Explanation: According to the given rules:
 *   nums[0] = 0
 *   nums[1] = 1
 *   nums[(1 * 2) = 2] = nums[1] = 1
 *   nums[(1 * 2) + 1 = 3] = nums[1] + nums[2] = 1 + 1 = 2
 *   nums[(2 * 2) = 4] = nums[2] = 1
 *   nums[(2 * 2) + 1 = 5] = nums[2] + nums[3] = 1 + 2 = 3
 *   nums[(3 * 2) = 6] = nums[3] = 2
 *   nums[(3 * 2) + 1 = 7] = nums[3] + nums[4] = 2 + 1 = 3
 * Hence, nums = [0,1,1,2,1,3,2,3], and the maximum is max(0,1,1,2,1,3,2,3) = 3.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 1
 * Explanation: According to the given rules, nums = [0,1,1]. The maximum is max(0,1,1) = 1.
 *
 * Example 3:
 *
 * Input: n = 3
 * Output: 2
 * Explanation: According to the given rules, nums = [0,1,1,2]. The maximum is max(0,1,1,2) = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try generating the array.
 * Hint 2: Make sure not to fall in the base case of 0.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/get-maximum-in-generated-array/">LeetCode #1646</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class GetMaximumInGeneratedArray {

    /**
     * Returns Get maximum generated.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int getMaximumGenerated(int n) {
        if (n==0) return 0;
        int[] nums = new int[n+1]; nums[1]=1;
        int max=1;
        for (int i=2;i<=n;i++) {
            nums[i] = (i%2==0) ? nums[i/2] : nums[i/2]+nums[i/2+1];
            max=Math.max(max,nums[i]);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        GetMaximumInGeneratedArray sol = new GetMaximumInGeneratedArray();
                System.out.println(sol.getMaximumGenerated(7));  // 3
                System.out.println(sol.getMaximumGenerated(2));  // 1
                System.out.println(sol.getMaximumGenerated(3));  // 2
    }
}
