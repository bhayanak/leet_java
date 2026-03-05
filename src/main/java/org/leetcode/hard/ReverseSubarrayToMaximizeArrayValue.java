package org.leetcode.hard;


/**
 * <b>#1330 - Reverse Subarray To Maximize Array Value</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. The value of this array is defined as the sum of |nums[i] - nums[i + 1]| for all 0 &lt;= i &lt; nums.length - 1.
 *
 *
 * You are allowed to select any subarray of the given array and reverse it. You can perform this operation only once.
 *
 *
 * Find maximum possible value of the final array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,1,5,4]
 * Output: 10
 * Explanation: By reversing the subarray [3,1,5] the array becomes [2,5,1,3,4] whose value is 10.
 *
 * Example 2:
 *
 * Input: nums = [2,4,9,24,2,1,10]
 * Output: 68
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 3 * 104
 *
 * -105 &lt;= nums[i] &lt;= 105
 *
 * The answer is guaranteed to fit in a 32-bit integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What's the score after reversing a sub-array [L, R] ?
 * Hint 2: It's the score without reversing it + abs(a[R] - a[L-1]) + abs(a[L] - a[R+1]) - abs(a[L] - a[L-1]) - abs(a[R] - a[R+1])
 * Hint 3: How to maximize that formula given that abs(x - y) = max(x - y, y - x) ?
 * Hint 4: This can be written as max(max(a[R] - a[L - 1], a[L - 1] - a[R]) + max(a[R + 1] - a[L], a[L] - a[R + 1]) - value(L) - value(R + 1)) over all L &lt; R where value(i) = abs(a[i] - a[i-1])
 * Hint 5: This can be divided into 4 cases.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reverse-subarray-to-maximize-array-value/">LeetCode #1330</a>
 */
public class ReverseSubarrayToMaximizeArrayValue {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reverse Subarray To Maximize Array Value");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReverseSubarrayToMaximizeArrayValue ===");
        ReverseSubarrayToMaximizeArrayValue sol = new ReverseSubarrayToMaximizeArrayValue();
        System.out.println(sol.solve(null));
    }
}
