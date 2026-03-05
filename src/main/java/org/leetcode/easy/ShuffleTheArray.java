package org.leetcode.easy;


/**
 * <b>#1470 - Shuffle the Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 *
 *
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7] 
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: nums = [1,2,3,4,4,3,2,1], n = 4
 * Output: [1,4,2,3,3,2,4,1]
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: nums = [1,1,2,2], n = 2
 * Output: [1,2,1,2]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= n &lt;= 500
 *
 * nums.length == 2n
 *
 * 1 &lt;= nums[i] &lt;= 10^3
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two pointers to create the new array of 2n elements. The first starting at the beginning and the other starting at (n+1)th position. Alternate between them and create the new array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shuffle-the-array/">LeetCode #1470</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class ShuffleTheArray {

    /**
     * Solves the problem: Shuffle.
     *
     * @param nums the nums (int[])
     * @param n the n (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        for (int i=0;i<n;i++) { res[2*i]=nums[i]; res[2*i+1]=nums[i+n]; }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ShuffleTheArray sol = new ShuffleTheArray();
                System.out.println(java.util.Arrays.toString(sol.shuffle(new int[]{2,5,1,3,4,7}, 3))); // [2,3,5,4,1,7]
                System.out.println(java.util.Arrays.toString(sol.shuffle(new int[]{1,2,3,4,4,3,2,1}, 4))); // [1,4,2,3,3,2,4,1]
    }
}
