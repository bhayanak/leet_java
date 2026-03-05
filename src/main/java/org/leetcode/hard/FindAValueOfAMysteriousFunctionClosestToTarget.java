package org.leetcode.hard;


/**
 * <b>#1521 - Find a Value of a Mysterious Function Closest to Target</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Bit Manipulation, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Winston was given the above mysterious function func. He has an integer array arr and an integer target and he wants to find the values l and r that make the value |func(arr, l, r) - target| minimum possible.
 *
 *
 * Return the minimum possible value of |func(arr, l, r) - target|.
 *
 *
 * Notice that func should be called with the values l and r where 0 &lt;= l, r &lt; arr.length.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [9,12,3,7,15], target = 5
 * Output: 2
 * Explanation: Calling func with all the pairs of [l,r] = [[0,0],[1,1],[2,2],[3,3],[4,4],[0,1],[1,2],[2,3],[3,4],[0,2],[1,3],[2,4],[0,3],[1,4],[0,4]], Winston got the following results [9,12,3,7,15,8,0,3,7,0,0,3,0,0,0]. The value closest to 5 is 7 and 3, thus the minimum difference is 2.
 *
 * Example 2:
 *
 * Input: arr = [1000000,1000000,1000000], target = 1
 * Output: 999999
 * Explanation: Winston called the func with all possible values of [l,r] and he always got 1000000, thus the min difference is 999999.
 *
 * Example 3:
 *
 * Input: arr = [1,2,4,8,16], target = 0
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * 1 &lt;= arr[i] &lt;= 106
 *
 * 0 &lt;= target &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the and value of sub-array arr[i...j] is ≥ the and value of the sub-array arr[i...j+1].
 * Hint 2: For each index i using binary search or ternary search find the index j where |target - AND(arr[i...j])| is minimum, minimize this value with the global answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Bit Manipulation, Segment Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-a-value-of-a-mysterious-function-closest-to-target/">LeetCode #1521</a>
 */
public class FindAValueOfAMysteriousFunctionClosestToTarget {

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
        throw new UnsupportedOperationException("Not yet implemented: Find a Value of a Mysterious Function Closest to Target");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindAValueOfAMysteriousFunctionClosestToTarget ===");
        FindAValueOfAMysteriousFunctionClosestToTarget sol = new FindAValueOfAMysteriousFunctionClosestToTarget();
        System.out.println(sol.solve(null));
    }
}
