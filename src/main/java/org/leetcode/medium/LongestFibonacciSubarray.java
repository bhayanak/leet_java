package org.leetcode.medium;


/**
 * <b>#3708 - Longest Fibonacci Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums.
 *
 *
 * A Fibonacci array is a contiguous sequence whose third and subsequent terms each equal the sum of the two preceding terms.
 *
 *
 * Return the length of the longest Fibonacci subarray in nums.
 *
 *
 * Note: Subarrays of length 1 or 2 are always Fibonacci.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,1,2,3,5,1]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The longest Fibonacci subarray is nums[2..6] = [1, 1, 2, 3, 5].
 *
 *
 * [1, 1, 2, 3, 5] is Fibonacci because 1 + 1 = 2, 1 + 2 = 3, and 2 + 3 = 5.
 *
 * Example 2:
 *
 * Input: nums = [5,2,7,9,16]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The longest Fibonacci subarray is nums[0..4] = [5, 2, 7, 9, 16].
 *
 *
 * [5, 2, 7, 9, 16] is Fibonacci because 5 + 2 = 7, 2 + 7 = 9, and 7 + 9 = 16.
 *
 * Example 3:
 *
 * Input: nums = [1000000000,1000000000,1000000000]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The longest Fibonacci subarray is nums[1..2] = [1000000000, 1000000000].
 *
 *
 * [1000000000, 1000000000] is Fibonacci because its length is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Any subarray of <code>length &lt;= 2</code> is valid. Start with length 2.
 * Hint 2: If <code>a[i] == a[i - 1] + a[i - 2]</code>, extend; otherwise reset length to 2.
 * Hint 3: Track the maximum length during one pass.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/longest-fibonacci-subarray/">LeetCode #3708</a>
 */
public class LongestFibonacciSubarray {

    /**
     * Returns true if Is winner.
     *
     * @param player1 the player1 (int[])
     * @param player2 the player2 (int[])
     * @return the computed boolean result
     */
    public boolean isWinner(int[] player1, int[] player2) {
        int s1=0, s2=0, n=player1.length;
        for (int i=0;i<n;i++) {
            int v1=player1[i]; if (i>0&&player1[i-1]==10||i>1&&player1[i-2]==10) v1*=2;
            int v2=player2[i]; if (i>0&&player2[i-1]==10||i>1&&player2[i-2]==10) v2*=2;
            s1+=v1; s2+=v2;
        }
        return s1>s2;
    }

    public static void main(String[] args) {
        LongestFibonacciSubarray sol = new LongestFibonacciSubarray();
        System.out.println(sol.isWinner(new int[]{1,2,3}, new int[]{1,2,3}));
    }
}
