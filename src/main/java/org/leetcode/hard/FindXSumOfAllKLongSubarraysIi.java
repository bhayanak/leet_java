package org.leetcode.hard;


/**
 * <b>#3321 - Find X-Sum of All K-Long Subarrays II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of n integers and two integers k and x.
 *
 *
 * The x-sum of an array is calculated by the following procedure:
 *
 *
 * Count the occurrences of all elements in the array.
 *
 * Keep only the occurrences of the top x most frequent elements. If two elements have the same number of occurrences, the element with the bigger value is considered more frequent.
 *
 * Calculate the sum of the resulting array.
 *
 * Note that if an array has less than x distinct elements, its x-sum is the sum of the array.
 *
 *
 * Return an integer array answer of length n - k + 1 where answer[i] is the x-sum of the subarray nums[i..i + k - 1].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,2,2,3,4,2,3], k = 6, x = 2
 *
 *
 * Output: [6,10,12]
 *
 *
 * Explanation:
 *
 *
 * For subarray [1, 1, 2, 2, 3, 4], only elements 1 and 2 will be kept in the resulting array. Hence, answer[0] = 1 + 1 + 2 + 2.
 *
 * For subarray [1, 2, 2, 3, 4, 2], only elements 2 and 4 will be kept in the resulting array. Hence, answer[1] = 2 + 2 + 2 + 4. Note that 4 is kept in the array since it is bigger than 3 and 1 which occur the same number of times.
 *
 * For subarray [2, 2, 3, 4, 2, 3], only elements 2 and 3 are kept in the resulting array. Hence, answer[2] = 2 + 2 + 2 + 3 + 3.
 *
 * Example 2:
 *
 * Input: nums = [3,8,7,8,7,5], k = 2, x = 2
 *
 *
 * Output: [11,15,15,15,12]
 *
 *
 * Explanation:
 *
 *
 * Since k == x, answer[i] is equal to the sum of the subarray nums[i..i + k - 1].
 *
 *
 *
 * Constraints:
 *
 *
 * nums.length == n
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= x &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use sliding window.
 * Hint 2: Use two sets ordered by frequency. One of the sets will only contain the top <code>x</code> frequent elements, and the second will contain all other elements.
 * Hint 3: Update the two sets whenever you slide the window, and maintain a sum of the elements in the set with <code>x</code> elements
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-ii/">LeetCode #3321</a>
 */
public class FindXSumOfAllKLongSubarraysIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find X-Sum of All K-Long Subarrays II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindXSumOfAllKLongSubarraysIi ===");
        FindXSumOfAllKLongSubarraysIi sol = new FindXSumOfAllKLongSubarraysIi();
        System.out.println(sol.solve(null));
    }
}
