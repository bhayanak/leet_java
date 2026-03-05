package org.leetcode.medium;


/**
 * <b>#2607 - Make K-Subarray Sums Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Greedy, Sorting, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array arr and an integer k. The array arr is circular. In other words, the first element of the array is the next element of the last element, and the last element of the array is the previous element of the first element.
 *
 *
 * You can do the following operation any number of times:
 *
 *
 * Pick any element from arr and increase or decrease it by 1.
 *
 * Return the minimum number of operations such that the sum of each subarray of length k is equal.
 *
 *
 * A subarray is a contiguous part of the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,4,1,3], k = 2
 * Output: 1
 * Explanation: we can do one operation on index 1 to make its value equal to 3.
 * The array after the operation is [1,3,1,3]
 * - Subarray starts at index 0 is [1, 3], and its sum is 4 
 * - Subarray starts at index 1 is [3, 1], and its sum is 4 
 * - Subarray starts at index 2 is [1, 3], and its sum is 4 
 * - Subarray starts at index 3 is [3, 1], and its sum is 4 
 *
 * Example 2:
 *
 * Input: arr = [2,5,5,7], k = 3
 * Output: 5
 * Explanation: we can do three operations on index 0 to make its value equal to 5 and two operations on index 3 to make its value equal to 5.
 * The array after the operations is [5,5,5,5]
 * - Subarray starts at index 0 is [5, 5, 5], and its sum is 15
 * - Subarray starts at index 1 is [5, 5, 5], and its sum is 15
 * - Subarray starts at index 2 is [5, 5, 5], and its sum is 15
 * - Subarray starts at index 3 is [5, 5, 5], and its sum is 15 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= arr.length &lt;= 105
 *
 * 1 &lt;= arr[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about gcd(n, k). How will it help to calculate the answer?
 * Hint 2: indices i and j are in the same group if gcd(n, k) mod i = gcd(n, k) mod j. Each group should have equal elements. Think about the minimum number of operations for each group
 * Hint 3: The minimum number of operations for each group equals the summation of differences between the elements and the median of elements inside the group.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Sorting, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/make-k-subarray-sums-equal/">LeetCode #2607</a>
 */
public class MakeKSubarraySumsEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Make K-Subarray Sums Equal");
    }

    public static void main(String[] args) {
        System.out.println("=== MakeKSubarraySumsEqual ===");
        MakeKSubarraySumsEqual sol = new MakeKSubarraySumsEqual();
        System.out.println(sol.solve(null));
    }
}
