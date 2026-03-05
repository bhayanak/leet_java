package org.leetcode.medium;


/**
 * <b>#1004 - Max Consecutive Ones III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
 * Output: 6
 * Explanation: [1,1,1,0,0,1,1,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 * Example 2:
 *
 * Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
 * Output: 10
 * Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
 * Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * nums[i] is either 0 or 1.
 *
 * 0 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: One thing's for sure, we will only flip a zero if it extends an existing window of 1s. Otherwise, there's no point in doing it, right? Think Sliding Window!
 * Hint 2: Since we know this problem can be solved using the sliding window construct, we might as well focus in that direction for hints. Basically, in a given window, we can never have &gt; K zeros, right?
 * Hint 3: We don't have a fixed size window in this case. The window size can grow and shrink depending upon the number of zeros we have (we don't actually have to flip the zeros here!).
 * Hint 4: The way to shrink or expand a window would be based on the number of zeros that can still be flipped and so on.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/max-consecutive-ones-iii/">LeetCode #1004</a>
 */
public class MaxConsecutiveOnesIii {

    /**
     * TODO: Implement "Max Consecutive Ones III".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Consecutive Ones III");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaxConsecutiveOnesIii.java &amp;&amp; java org.leetcode.medium.MaxConsecutiveOnesIii</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaxConsecutiveOnesIii ===");
        MaxConsecutiveOnesIii sol = new MaxConsecutiveOnesIii();
        System.out.println(sol.solve(null));
    }
}
