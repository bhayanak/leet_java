package org.leetcode.medium;


/**
 * <b>#969 - Pancake Sorting</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, sort the array by performing a series of pancake flips.
 *
 *
 * In one pancake flip we do the following steps:
 *
 *
 * Choose an integer k where 1 &lt;= k &lt;= arr.length.
 *
 * Reverse the sub-array arr[0...k-1] (0-indexed).
 *
 * For example, if arr = [3,2,1,4] and we performed a pancake flip choosing k = 3, we reverse the sub-array [3,2,1], so arr = [1,2,3,4] after the pancake flip at k = 3.
 *
 *
 * Return an array of the k-values corresponding to a sequence of pancake flips that sort arr. Any valid answer that sorts the array within 10 * arr.length flips will be judged as correct.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,2,4,1]
 * Output: [4,2,4,3]
 * Explanation: 
 * We perform 4 pancake flips, with k values 4, 2, 4, and 3.
 * Starting state: arr = [3, 2, 4, 1]
 * After 1st flip (k = 4): arr = [1, 4, 2, 3]
 * After 2nd flip (k = 2): arr = [4, 1, 2, 3]
 * After 3rd flip (k = 4): arr = [3, 2, 1, 4]
 * After 4th flip (k = 3): arr = [1, 2, 3, 4], which is sorted.
 *
 * Example 2:
 *
 * Input: arr = [1,2,3]
 * Output: []
 * Explanation: The input is already sorted, so there is no need to flip anything.
 * Note that other answers, such as [3, 3], would also be accepted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 100
 *
 * 1 &lt;= arr[i] &lt;= arr.length
 *
 * All integers in arr are unique (i.e. arr is a permutation of the integers from 1 to arr.length).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/pancake-sorting/">LeetCode #969</a>
 */
public class PancakeSorting {

    /**
     * TODO: Implement "Pancake Sorting".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Pancake Sorting");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PancakeSorting.java &amp;&amp; java org.leetcode.medium.PancakeSorting</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PancakeSorting ===");
        PancakeSorting sol = new PancakeSorting();
        System.out.println(sol.solve(null));
    }
}
