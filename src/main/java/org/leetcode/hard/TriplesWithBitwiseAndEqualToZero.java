package org.leetcode.hard;


/**
 * <b>#982 - Triples with Bitwise AND Equal To Zero</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the number of AND triples.
 *
 *
 * An AND triple is a triple of indices (i, j, k) such that:
 *
 *
 * 0 &lt;= i &lt; nums.length
 *
 * 0 &lt;= j &lt; nums.length
 *
 * 0 &lt;= k &lt; nums.length
 *
 * nums[i] &amp; nums[j] &amp; nums[k] == 0, where &amp; represents the bitwise-AND operator.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3]
 * Output: 12
 * Explanation: We could choose the following i, j, k triples:
 * (i=0, j=0, k=1) : 2 &amp; 2 &amp; 1
 * (i=0, j=1, k=0) : 2 &amp; 1 &amp; 2
 * (i=0, j=1, k=1) : 2 &amp; 1 &amp; 1
 * (i=0, j=1, k=2) : 2 &amp; 1 &amp; 3
 * (i=0, j=2, k=1) : 2 &amp; 3 &amp; 1
 * (i=1, j=0, k=0) : 1 &amp; 2 &amp; 2
 * (i=1, j=0, k=1) : 1 &amp; 2 &amp; 1
 * (i=1, j=0, k=2) : 1 &amp; 2 &amp; 3
 * (i=1, j=1, k=0) : 1 &amp; 1 &amp; 2
 * (i=1, j=2, k=0) : 1 &amp; 3 &amp; 2
 * (i=2, j=0, k=1) : 3 &amp; 2 &amp; 1
 * (i=2, j=1, k=0) : 3 &amp; 1 &amp; 2
 *
 * Example 2:
 *
 * Input: nums = [0,0,0]
 * Output: 27
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 0 &lt;= nums[i] &lt; 216
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/triples-with-bitwise-and-equal-to-zero/">LeetCode #982</a>
 */
public class TriplesWithBitwiseAndEqualToZero {

    /**
     * TODO: Implement "Triples with Bitwise AND Equal To Zero".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Triples with Bitwise AND Equal To Zero");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac TriplesWithBitwiseAndEqualToZero.java &amp;&amp; java org.leetcode.hard.TriplesWithBitwiseAndEqualToZero</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== TriplesWithBitwiseAndEqualToZero ===");
        TriplesWithBitwiseAndEqualToZero sol = new TriplesWithBitwiseAndEqualToZero();
        System.out.println(sol.solve(null));
    }
}
