package org.leetcode.medium;


/**
 * <b>#1471 - The k Strongest Values in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr and an integer k.
 *
 *
 * A value arr[i] is said to be stronger than a value arr[j] if |arr[i] - m| &gt; |arr[j] - m| where m is the centre of the array.
 *
 * If |arr[i] - m| == |arr[j] - m|, then arr[i] is said to be stronger than arr[j] if arr[i] &gt; arr[j].
 *
 *
 * Return a list of the strongest k values in the array. return the answer in any arbitrary order.
 *
 *
 * The centre is the middle value in an ordered integer list. More formally, if the length of the list is n, the centre is the element in position ((n - 1) / 2) in the sorted list (0-indexed).
 *
 *
 * For arr = [6, -3, 7, 2, 11], n = 5 and the centre is obtained by sorting the array arr = [-3, 2, 6, 7, 11] and the centre is arr[m] where m = ((5 - 1) / 2) = 2. The centre is 6.
 *
 * For arr = [-7, 22, 17, 3], n = 4 and the centre is obtained by sorting the array arr = [-7, 3, 17, 22] and the centre is arr[m] where m = ((4 - 1) / 2) = 1. The centre is 3.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4,5], k = 2
 * Output: [5,1]
 * Explanation: Centre is 3, the elements of the array sorted by the strongest are [5,1,4,2,3]. The strongest 2 elements are [5, 1]. [1, 5] is also accepted answer.
 * Please note that although |5 - 3| == |1 - 3| but 5 is stronger than 1 because 5 &gt; 1.
 *
 * Example 2:
 *
 * Input: arr = [1,1,3,5,5], k = 2
 * Output: [5,5]
 * Explanation: Centre is 3, the elements of the array sorted by the strongest are [5,5,1,1,3]. The strongest 2 elements are [5, 5].
 *
 * Example 3:
 *
 * Input: arr = [6,7,11,7,6,8], k = 5
 * Output: [11,8,6,6,7]
 * Explanation: Centre is 7, the elements of the array sorted by the strongest are [11,8,6,6,7,7].
 * Any permutation of [11,8,6,6,7] is accepted.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * -105 &lt;= arr[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= arr.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the centre of the array as defined in the statement.
 * Hint 2: Use custom sort function to sort values (Strongest first), then slice the first k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/the-k-strongest-values-in-an-array/">LeetCode #1471</a>
 */
public class TheKStrongestValuesInAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: The k Strongest Values in an Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TheKStrongestValuesInAnArray ===");
        TheKStrongestValuesInAnArray sol = new TheKStrongestValuesInAnArray();
        System.out.println(sol.solve(null));
    }
}
