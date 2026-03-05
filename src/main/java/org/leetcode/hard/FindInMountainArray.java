package org.leetcode.hard;


/**
 * <b>#1095 - Find in Mountain Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Interactive</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * (This problem is an interactive problem.)
 *
 *
 * You may recall that an array arr is a mountain array if and only if:
 *
 *
 * arr.length &gt;= 3
 *
 * There exists some i with 0 &lt; i &lt; arr.length - 1 such that:
 *
 *
 *
 * arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i]
 *
 * arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]
 *
 *
 *
 * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
 *
 *
 * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
 *
 *
 * MountainArray.get(k) returns the element of the array at index k (0-indexed).
 *
 * MountainArray.length() returns the length of the array.
 *
 * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mountainArr = [1,2,3,4,5,3,1], target = 3
 * Output: 2
 * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
 *
 * Example 2:
 *
 * Input: mountainArr = [0,1,2,4,2,1], target = 3
 * Output: -1
 * Explanation: 3 does not exist in the array, so we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= mountainArr.length() &lt;= 104
 *
 * 0 &lt;= target &lt;= 109
 *
 * 0 &lt;= mountainArr.get(index) &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Based on whether A[i-1] &lt; A[i] &lt; A[i+1], A[i-1] &lt; A[i] &gt; A[i+1], or A[i-1] &gt; A[i] &gt; A[i+1], we are either at the left side, peak, or right side of the mountain.  We can binary search to find the peak.
After finding the peak, we can binary search two more times to find whether the value occurs on either side of the peak.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Interactive).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-in-mountain-array/">LeetCode #1095</a>
 */
public class FindInMountainArray {

    /**
     * TODO: Implement "Find in Mountain Array".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find in Mountain Array");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindInMountainArray.java &amp;&amp; java org.leetcode.hard.FindInMountainArray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FindInMountainArray ===");
        FindInMountainArray sol = new FindInMountainArray();
        System.out.println(sol.solve(null));
    }
}
