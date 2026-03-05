package org.leetcode.hard;


/**
 * <b>#3801 - Minimum Cost to Merge Sorted Lists</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array lists, where each lists[i] is a non-empty array of integers sorted in non-decreasing order.
 *
 *
 * You may repeatedly choose two lists a = lists[i] and b = lists[j], where i != j, and merge them. The cost to merge a and b is:
 *
 *
 * len(a) + len(b) + abs(median(a) - median(b)), where len and median denote the list length and median, respectively.
 *
 *
 * After merging a and b, remove both a and b from lists and insert the new merged sorted list in any position. Repeat merges until only one list remains.
 *
 *
 * Return an integer denoting the minimum total cost required to merge all lists into one single sorted list.
 *
 *
 * The median of an array is the middle element after sorting it in non-decreasing order. If the array has an even number of elements, the median is the left middle element.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: lists = [[1,3,5],[2,4],[6,7,8]]
 *
 *
 * Output: 18
 *
 *
 * Explanation:
 *
 *
 * Merge a = [1, 3, 5] and b = [2, 4]:
 *
 *
 * len(a) = 3 and len(b) = 2
 *
 * median(a) = 3 and median(b) = 2
 *
 * cost = len(a) + len(b) + abs(median(a) - median(b)) = 3 + 2 + abs(3 - 2) = 6
 *
 * So lists becomes [[1, 2, 3, 4, 5], [6, 7, 8]].
 *
 *
 * Merge a = [1, 2, 3, 4, 5] and b = [6, 7, 8]:
 *
 *
 * len(a) = 5 and len(b) = 3
 *
 * median(a) = 3 and median(b) = 7
 *
 * cost = len(a) + len(b) + abs(median(a) - median(b)) = 5 + 3 + abs(3 - 7) = 12
 *
 * So lists becomes [[1, 2, 3, 4, 5, 6, 7, 8]], and total cost is 6 + 12 = 18.
 *
 * Example 2:
 *
 * Input: lists = [[1,1,5],[1,4,7,8]]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * Merge a = [1, 1, 5] and b = [1, 4, 7, 8]:
 *
 *
 * len(a) = 3 and len(b) = 4
 *
 * median(a) = 1 and median(b) = 4
 *
 * cost = len(a) + len(b) + abs(median(a) - median(b)) = 3 + 4 + abs(1 - 4) = 10
 *
 * So lists becomes [[1, 1, 1, 4, 5, 7, 8]], and total cost is 10.
 *
 * Example 3:
 *
 * Input: lists = [[1],[3]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Merge a = [1] and b = [3]:
 *
 *
 * len(a) = 1 and len(b) = 1
 *
 * median(a) = 1 and median(b) = 3
 *
 * cost = len(a) + len(b) + abs(median(a) - median(b)) = 1 + 1 + abs(1 - 3) = 4
 *
 * So lists becomes [[1, 3]], and total cost is 4.
 *
 * Example 4:
 *
 * Input: lists = [[1],[1]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The total cost is len(a) + len(b) + abs(median(a) - median(b)) = 1 + 1 + abs(1 - 1) = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= lists.length &lt;= 12
 *
 * 1 &lt;= lists[i].length &lt;= 500
 *
 * -109 &lt;= lists[i][j] &lt;= 109
 *
 * lists[i] is sorted in non-decreasing order.
 *
 * The sum of lists[i].length will not exceed 2000.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming and bitmasks
 * Hint 2: Precompute the medians for every mask
 * Hint 3: Let <code>dp[mask]</code> represent the minimum cost to merge all lists in <code>mask</code>
 * Hint 4: <code>dp[mask] = min(dp[s] + dp[mask ^ s] + cost(s, mask ^ s))</code>, where <code>s</code> and <code>mask ^ s</code> are nonempty disjoint submasks whose union is <code>mask</code>
 * Hint 5: Use the precomputed medians to compute costs efficiently
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Dynamic Programming, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-merge-sorted-lists/">LeetCode #3801</a>
 */
public class MinimumCostToMergeSortedLists {

    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Merge Sorted Lists");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostToMergeSortedLists ===");
        MinimumCostToMergeSortedLists sol = new MinimumCostToMergeSortedLists();
        System.out.println(sol.solve(null));
    }
}
