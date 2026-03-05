package org.leetcode.easy;


/**
 * <b>#1200 - Minimum Absolute Difference</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
 *
 *
 * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
 *
 *
 * a, b are from arr
 *
 * a &lt; b
 *
 * b - a equals to the minimum absolute difference of any two elements in arr
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [4,2,1,3]
 * Output: [[1,2],[2,3],[3,4]]
 * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
 *
 * Example 2:
 *
 * Input: arr = [1,3,6,10,15]
 * Output: [[1,3]]
 *
 * Example 3:
 *
 * Input: arr = [3,8,-10,23,19,-4,-14,27]
 * Output: [[-14,-10],[19,23],[23,27]]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 105
 *
 * -106 &lt;= arr[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the minimum absolute difference between two elements in the array.
 * Hint 2: The minimum absolute difference must be a difference between two consecutive elements in the sorted array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-absolute-difference/">LeetCode #1200</a>
 */
public class MinimumAbsoluteDifference {

    public java.util.List<java.util.List<Integer>> minimumAbsDifference(int[] arr) {
        java.util.Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) minDiff = Math.min(minDiff, arr[i]-arr[i-1]);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        for (int i = 1; i < arr.length; i++)
            if (arr[i]-arr[i-1] == minDiff)
                result.add(java.util.Arrays.asList(arr[i-1], arr[i]));
        return result;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumAbsoluteDifference.java &amp;&amp; java org.leetcode.easy.MinimumAbsoluteDifference</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MinimumAbsoluteDifference sol = new MinimumAbsoluteDifference();
        System.out.println("No method available");
    }
}
