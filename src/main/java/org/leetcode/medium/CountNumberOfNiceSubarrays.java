package org.leetcode.medium;


/**
 * <b>#1248 - Count Number of Nice Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.
 *
 *
 * Return the number of nice sub-arrays.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,1,1], k = 3
 * Output: 2
 * Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
 *
 * Example 2:
 *
 * Input: nums = [2,4,6], k = 1
 * Output: 0
 * Explanation: There are no odd numbers in the array.
 *
 * Example 3:
 *
 * Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
 * Output: 16
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 50000
 *
 * 1 &lt;= nums[i] &lt;= 10^5
 *
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: After replacing each even by zero and every odd by one can we use prefix sum to find answer ?
 * Hint 2: Can we use two pointers to count number of sub-arrays ?
 * Hint 3: Can we store the indices of odd numbers and for each k indices count the number of sub-arrays that contains them ?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-nice-subarrays/">LeetCode #1248</a>
 */
public class CountNumberOfNiceSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Nice Subarrays");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountNumberOfNiceSubarrays ===");
        CountNumberOfNiceSubarrays sol = new CountNumberOfNiceSubarrays();
        System.out.println(sol.solve(null));
    }
}
