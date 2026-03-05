package org.leetcode.medium;

/**
 * <b>#89 - Gray Code</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Backtracking, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An n-bit gray code sequence is a sequence of 2n integers where:
 * 
 * 	
 * Every integer is in the inclusive range [0, 2n - 1],
 * 	
 * The first integer is 0,
 * 	
 * An integer appears no more than once in the sequence,
 * 	
 * The binary representation of every pair of adjacent integers differs by exactly one bit, and
 * 	
 * The binary representation of the first and last integers differs by exactly one bit.
 * 
 * Given an integer n, return any valid n-bit gray code sequence.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: [0,1,3,2]
 * Explanation:
 * The binary representation of [0,1,3,2] is [00,01,11,10].
 * - 00 and 01 differ by one bit
 * - 01 and 11 differ by one bit
 * - 11 and 10 differ by one bit
 * - 10 and 00 differ by one bit
 * [0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
 * - 00 and 10 differ by one bit
 * - 10 and 11 differ by one bit
 * - 11 and 01 differ by one bit
 * - 01 and 00 differ by one bit
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: [0,1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 16
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/gray-code/">LeetCode #89</a>
 */
public class GrayCode {

    /**
     * TODO: Implement solution for "Gray Code".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Gray Code");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        GrayCode sol = new GrayCode();
        System.out.println(sol.solve(null));
    }
}
