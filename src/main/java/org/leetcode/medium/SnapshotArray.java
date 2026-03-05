package org.leetcode.medium;


/**
 * <b>#1146 - Snapshot Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Design</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Implement a SnapshotArray that supports the following interface:
 *
 *
 * SnapshotArray(int length) initializes an array-like data structure with the given length. Initially, each element equals 0.
 *
 * void set(index, val) sets the element at the given index to be equal to val.
 *
 * int snap() takes a snapshot of the array and returns the snap_id: the total number of times we called snap() minus 1.
 *
 * int get(index, snap_id) returns the value at the given index, at the time we took the snapshot with the given snap_id
 *
 *
 *
 * Example 1:
 *
 * Input: ["SnapshotArray","set","snap","set","get"]
 * [[3],[0,5],[],[0,6],[0,0]]
 * Output: [null,null,0,null,5]
 * Explanation: 
 * SnapshotArray snapshotArr = new SnapshotArray(3); // set the length to be 3
 * snapshotArr.set(0,5);  // Set array[0] = 5
 * snapshotArr.snap();  // Take a snapshot, return snap_id = 0
 * snapshotArr.set(0,6);
 * snapshotArr.get(0,0);  // Get the value of array[0] with snap_id = 0, return 5
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= length &lt;= 5 * 104
 *
 * 0 &lt;= index &lt; length
 *
 * 0 &lt;= val &lt;= 109
 *
 * 0 &lt;= snap_id &lt; (the total number of times we call snap())
 *
 * At most 5 * 104 calls will be made to set, snap, and get.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a list of lists, adding both the element and the snap_id to each index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Design).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/snapshot-array/">LeetCode #1146</a>
 */
public class SnapshotArray {

    /**
     * TODO: Implement "Snapshot Array".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Snapshot Array");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SnapshotArray.java &amp;&amp; java org.leetcode.medium.SnapshotArray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SnapshotArray ===");
        SnapshotArray sol = new SnapshotArray();
        System.out.println(sol.solve(null));
    }
}
