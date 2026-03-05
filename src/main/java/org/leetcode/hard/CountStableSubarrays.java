package org.leetcode.hard;


/**
 * <b>#3748 - Count Stable Subarrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * A subarray of nums is called stable if it contains no inversions, i.e., there is no pair of indices i &lt; j such that nums[i] &gt; nums[j].
 *
 *
 * You are also given a 2D integer array queries of length q, where each queries[i] = [li, ri] represents a query. For each query [li, ri], compute the number of stable subarrays that lie entirely within the segment nums[li..ri].
 *
 *
 * Return an integer array ans of length q, where ans[i] is the answer to the ith query.​​​​​​​​​​​​​​
 *
 *
 * Note:
 *
 *
 * A single element subarray is considered stable.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2], queries = [[0,1],[1,2],[0,2]]
 *
 *
 * Output: [2,3,4]
 *
 *
 * Explanation:​​​​​
 *
 *
 * For queries[0] = [0, 1], the subarray is [nums[0], nums[1]] = [3, 1].
 *
 *
 *
 *
 * The stable subarrays are [3] and [1]. The total number of stable subarrays is 2.
 *
 *
 *
 * For queries[1] = [1, 2], the subarray is [nums[1], nums[2]] = [1, 2].
 *
 *
 *
 * The stable subarrays are [1], [2], and [1, 2]. The total number of stable subarrays is 3.
 *
 *
 *
 * For queries[2] = [0, 2], the subarray is [nums[0], nums[1], nums[2]] = [3, 1, 2].
 *
 *
 *
 * The stable subarrays are [3], [1], [2], and [1, 2]. The total number of stable subarrays is 4.
 *
 *
 *
 * Thus, ans = [2, 3, 4].
 *
 * Example 2:
 *
 * Input: nums = [2,2], queries = [[0,1],[0,0]]
 *
 *
 * Output: [3,1]
 *
 *
 * Explanation:
 *
 *
 * For queries[0] = [0, 1], the subarray is [nums[0], nums[1]] = [2, 2].
 *
 *
 *
 *
 * The stable subarrays are [2], [2], and [2, 2]. The total number of stable subarrays is 3.
 *
 *
 *
 * For queries[1] = [0, 0], the subarray is [nums[0]] = [2].
 *
 *
 *
 * The stable subarray is [2]. The total number of stable subarrays is 1.
 *
 *
 *
 * Thus, ans = [3, 1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i] = [li, ri]
 *
 * 0 &lt;= li &lt;= ri &lt;= nums.length - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Identify maximal non-decreasing segments. Each segment of length <code>L</code> contributes <code>L * (L + 1) / 2</code> stable subarrays.
 * Hint 2: Build a prefix array of total stable subarrays ending at each index.
 * Hint 3: For query <code>[l, r]</code>, compute the prefix sum in the range and adjust for the left segment crossing <code>l</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-stable-subarrays/">LeetCode #3748</a>
 */
public class CountStableSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Stable Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== CountStableSubarrays ===");
        CountStableSubarrays sol = new CountStableSubarrays();
        System.out.println(sol.solve(null));
    }
}
