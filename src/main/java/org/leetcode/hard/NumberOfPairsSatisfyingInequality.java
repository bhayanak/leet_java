package org.leetcode.hard;


/**
 * <b>#2426 - Number of Pairs Satisfying Inequality</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed integer arrays nums1 and nums2, each of size n, and an integer diff. Find the number of pairs (i, j) such that:
 *
 *
 * 0 &lt;= i &lt; j &lt;= n - 1 and
 *
 * nums1[i] - nums1[j] &lt;= nums2[i] - nums2[j] + diff.
 *
 * Return the number of pairs that satisfy the conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [3,2,5], nums2 = [2,2,1], diff = 1
 * Output: 3
 * Explanation:
 * There are 3 pairs that satisfy the conditions:
 * 1. i = 0, j = 1: 3 - 2 &lt;= 2 - 2 + 1. Since i &lt; j and 1 &lt;= 1, this pair satisfies the conditions.
 * 2. i = 0, j = 2: 3 - 5 &lt;= 2 - 1 + 1. Since i &lt; j and -2 &lt;= 2, this pair satisfies the conditions.
 * 3. i = 1, j = 2: 2 - 5 &lt;= 2 - 1 + 1. Since i &lt; j and -3 &lt;= 2, this pair satisfies the conditions.
 * Therefore, we return 3.
 *
 * Example 2:
 *
 * Input: nums1 = [3,-1], nums2 = [-2,2], diff = -1
 * Output: 0
 * Explanation:
 * Since there does not exist any pair that satisfies the conditions, we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length == nums2.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * -104 &lt;= nums1[i], nums2[i] &lt;= 104
 *
 * -104 &lt;= diff &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try rearranging the equation.
 * Hint 2: Once the equation is rearranged properly, think how a segment tree or a Fenwick tree can be used to solve the rearranged equation.
 * Hint 3: Iterate through the array backwards.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/number-of-pairs-satisfying-inequality/">LeetCode #2426</a>
 */
public class NumberOfPairsSatisfyingInequality {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Pairs Satisfying Inequality");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfPairsSatisfyingInequality ===");
        NumberOfPairsSatisfyingInequality sol = new NumberOfPairsSatisfyingInequality();
        System.out.println(sol.solve(null));
    }
}
