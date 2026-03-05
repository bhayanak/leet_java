package org.leetcode.hard;


/**
 * <b>#1157 - Online Majority Element In Subarray</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Design, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Design a data structure that efficiently finds the majority element of a given subarray.
 *
 *
 * The majority element of a subarray is an element that occurs threshold times or more in the subarray.
 *
 *
 * Implementing the MajorityChecker class:
 *
 *
 * MajorityChecker(int[] arr) Initializes the instance of the class with the given array arr.
 *
 * int query(int left, int right, int threshold) returns the element in the subarray arr[left...right] that occurs at least threshold times, or -1 if no such element exists.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["MajorityChecker", "query", "query", "query"]
 * [[[1, 1, 2, 2, 1, 1]], [0, 5, 4], [0, 3, 3], [2, 3, 2]]
 * Output
 * [null, 1, -1, 2]
 *
 * Explanation
 * MajorityChecker majorityChecker = new MajorityChecker([1, 1, 2, 2, 1, 1]);
 * majorityChecker.query(0, 5, 4); // return 1
 * majorityChecker.query(0, 3, 3); // return -1
 * majorityChecker.query(2, 3, 2); // return 2
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 2 * 104
 *
 * 1 &lt;= arr[i] &lt;= 2 * 104
 *
 * 0 &lt;= left &lt;= right &lt; arr.length
 *
 * threshold &lt;= right - left + 1
 *
 * 2 * threshold &gt; right - left + 1
 *
 * At most 104 calls will be made to query.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What's special about a majority element ?
 * Hint 2: A majority element appears more than half the length of the array number of times.
 * Hint 3: If we tried a random index of the array, what's the probability that this index has a majority element ?
 * Hint 4: It's more than 50% if that array has a majority element.
 * Hint 5: Try a random index for a proper number of times so that the probability of not finding the answer tends to zero.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Design, Binary Indexed Tree, Segment Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/online-majority-element-in-subarray/">LeetCode #1157</a>
 */
public class OnlineMajorityElementInSubarray {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Online Majority Element In Subarray".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Online Majority Element In Subarray");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac OnlineMajorityElementInSubarray.java &amp;&amp; java org.leetcode.hard.OnlineMajorityElementInSubarray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== OnlineMajorityElementInSubarray ===");
        OnlineMajorityElementInSubarray sol = new OnlineMajorityElementInSubarray();
        System.out.println(sol.solve(null));
    }
}
