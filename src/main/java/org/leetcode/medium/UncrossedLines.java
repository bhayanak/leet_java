package org.leetcode.medium;


/**
 * <b>#1035 - Uncrossed Lines</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2. We write the integers of nums1 and nums2 (in the order they are given) on two separate horizontal lines.
 *
 *
 * We may draw connecting lines: a straight line connecting two numbers nums1[i] and nums2[j] such that:
 *
 *
 * nums1[i] == nums2[j], and
 *
 * the line we draw does not intersect any other connecting (non-horizontal) line.
 *
 * Note that a connecting line cannot intersect even at the endpoints (i.e., each number can only belong to one connecting line).
 *
 *
 * Return the maximum number of connecting lines we can draw in this way.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,4,2], nums2 = [1,2,4]
 * Output: 2
 * Explanation: We can draw 2 uncrossed lines as in the diagram.
 * We cannot draw 3 uncrossed lines, because the line from nums1[1] = 4 to nums2[2] = 4 will intersect the line from nums1[2]=2 to nums2[1]=2.
 *
 * Example 2:
 *
 * Input: nums1 = [2,5,1,2,5], nums2 = [10,5,2,1,5,2]
 * Output: 3
 *
 * Example 3:
 *
 * Input: nums1 = [1,3,7,1,7,5], nums2 = [1,9,2,5,1]
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 500
 *
 * 1 &lt;= nums1[i], nums2[j] &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think dynamic programming.  Given an oracle dp(i,j) that tells us how many lines A[i:], B[j:]  [the sequence A[i], A[i+1], ... and B[j], B[j+1], ...] are uncrossed, can we write this as a recursion?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/uncrossed-lines/">LeetCode #1035</a>
 */
public class UncrossedLines {

    /**
     * TODO: Implement "Uncrossed Lines".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Uncrossed Lines");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac UncrossedLines.java &amp;&amp; java org.leetcode.medium.UncrossedLines</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== UncrossedLines ===");
        UncrossedLines sol = new UncrossedLines();
        System.out.println(sol.solve(null));
    }
}
