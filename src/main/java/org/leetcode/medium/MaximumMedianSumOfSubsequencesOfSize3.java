package org.leetcode.medium;


/**
 * <b>#3627 - Maximum Median Sum of Subsequences of Size 3</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Greedy, Sorting, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums with a length divisible by 3.
 *
 *
 * You want to make the array empty in steps. In each step, you can select any three elements from the array, compute their median, and remove the selected elements from the array.
 *
 *
 * The median of an odd-length sequence is defined as the middle element of the sequence when it is sorted in non-decreasing order.
 *
 *
 * Return the maximum possible sum of the medians computed from the selected elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,2,1,3]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * In the first step, select elements at indices 2, 4, and 5, which have a median 3. After removing these elements, nums becomes [2, 1, 2].
 *
 * In the second step, select elements at indices 0, 1, and 2, which have a median 2. After removing these elements, nums becomes empty.
 *
 * Hence, the sum of the medians is 3 + 2 = 5.
 *
 * Example 2:
 *
 * Input: nums = [1,1,10,10,10,10]
 *
 *
 * Output: 20
 *
 *
 * Explanation:
 *
 *
 * In the first step, select elements at indices 0, 2, and 3, which have a median 10. After removing these elements, nums becomes [1, 10, 10].
 *
 * In the second step, select elements at indices 0, 1, and 2, which have a median 10. After removing these elements, nums becomes empty.
 *
 * Hence, the sum of the medians is 10 + 10 = 20.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5 * 105
 *
 * nums.length % 3 == 0
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the values in <code>nums</code>.
 * Hint 2: Repeatedly pick the largest 2 values and the minimum value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Sorting, Game Theory).
 *
 * @see <a href="https://leetcode.com/problems/maximum-median-sum-of-subsequences-of-size-3/">LeetCode #3627</a>
 */
public class MaximumMedianSumOfSubsequencesOfSize3 {

    /**
     * Returns true if the input can Can change.
     *
     * @param start the start (String)
     * @param target the target (String)
     * @return the computed boolean result
     */
    public boolean canChange(String start, String target) {
        int n=start.length(), i=0, j=0;
        while (i<n||j<n) {
            while (i<n&&start.charAt(i)=='_') i++;
            while (j<n&&target.charAt(j)=='_') j++;
            if (i==n&&j==n) return true;
            if (i==n||j==n) return false;
            if (start.charAt(i)!=target.charAt(j)) return false;
            if (start.charAt(i)=='L'&&i<j) return false;
            if (start.charAt(i)=='R'&&i>j) return false;
            i++; j++;
        }
        return true;
    }

    public static void main(String[] args) {
        MaximumMedianSumOfSubsequencesOfSize3 sol = new MaximumMedianSumOfSubsequencesOfSize3();
        System.out.println(sol.canChange("hello", "hello"));
    }
}
