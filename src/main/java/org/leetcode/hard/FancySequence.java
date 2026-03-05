package org.leetcode.hard;


/**
 * <b>#1622 - Fancy Sequence</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Design, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write an API that generates fancy sequences using the append, addAll, and multAll operations.
 *
 *
 * Implement the Fancy class:
 *
 *
 * Fancy() Initializes the object with an empty sequence.
 *
 * void append(val) Appends an integer val to the end of the sequence.
 *
 * void addAll(inc) Increments all existing values in the sequence by an integer inc.
 *
 * void multAll(m) Multiplies all existing values in the sequence by an integer m.
 *
 * int getIndex(idx) Gets the current value at index idx (0-indexed) of the sequence modulo 109 + 7. If the index is greater or equal than the length of the sequence, return -1.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["Fancy", "append", "addAll", "append", "multAll", "getIndex", "addAll", "append", "multAll", "getIndex", "getIndex", "getIndex"]
 * [[], [2], [3], [7], [2], [0], [3], [10], [2], [0], [1], [2]]
 * Output
 * [null, null, null, null, null, 10, null, null, null, 26, 34, 20]
 *
 * Explanation
 * Fancy fancy = new Fancy();
 * fancy.append(2);   // fancy sequence: [2]
 * fancy.addAll(3);   // fancy sequence: [2+3] -&gt; [5]
 * fancy.append(7);   // fancy sequence: [5, 7]
 * fancy.multAll(2);  // fancy sequence: [5*2, 7*2] -&gt; [10, 14]
 * fancy.getIndex(0); // return 10
 * fancy.addAll(3);   // fancy sequence: [10+3, 14+3] -&gt; [13, 17]
 * fancy.append(10);  // fancy sequence: [13, 17, 10]
 * fancy.multAll(2);  // fancy sequence: [13*2, 17*2, 10*2] -&gt; [26, 34, 20]
 * fancy.getIndex(0); // return 26
 * fancy.getIndex(1); // return 34
 * fancy.getIndex(2); // return 20
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= val, inc, m &lt;= 100
 *
 * 0 &lt;= idx &lt;= 105
 *
 * At most 105 calls total will be made to append, addAll, multAll, and getIndex.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two arrays to save the cumulative multipliers at each time point and cumulative sums adjusted by the current multiplier.
 * Hint 2: The function getIndex(idx) ask to the current value modulo 10^9+7. Use modular inverse and both arrays to calculate this value.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Design, Segment Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/fancy-sequence/">LeetCode #1622</a>
 */
public class FancySequence {

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
        throw new UnsupportedOperationException("Not yet implemented: Fancy Sequence");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FancySequence ===");
        FancySequence sol = new FancySequence();
        System.out.println(sol.solve(null));
    }
}
