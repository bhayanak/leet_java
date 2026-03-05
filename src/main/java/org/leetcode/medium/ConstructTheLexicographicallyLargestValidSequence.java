package org.leetcode.medium;


/**
 * <b>#1718 - Construct the Lexicographically Largest Valid Sequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, find a sequence with elements in the range [1, n] that satisfies all of the following:
 *
 *
 * The integer 1 occurs once in the sequence.
 *
 * Each integer between 2 and n occurs twice in the sequence.
 *
 * For every integer i between 2 and n, the distance between the two occurrences of i is exactly i.
 *
 * The distance between two numbers on the sequence, a[i] and a[j], is the absolute difference of their indices, |j - i|.
 *
 *
 * Return the lexicographically largest sequence. It is guaranteed that under the given constraints, there is always a solution. 
 *
 *
 * A sequence a is lexicographically larger than a sequence b (of the same length) if in the first position where a and b differ, sequence a has a number greater than the corresponding number in b. For example, [0,1,9,0] is lexicographically larger than [0,1,5,6] because the first position they differ is at the third number, and 9 is greater than 5.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 * Output: [3,1,2,3,2]
 * Explanation: [2,3,2,1,3] is also a valid sequence, but [3,1,2,3,2] is the lexicographically largest valid sequence.
 *
 * Example 2:
 *
 * Input: n = 5
 * Output: [5,3,1,4,3,5,2,4,2]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 20
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Heuristic algorithm may work.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence/">LeetCode #1718</a>
 */
public class ConstructTheLexicographicallyLargestValidSequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Construct the Lexicographically Largest Valid Sequence");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ConstructTheLexicographicallyLargestValidSequence ===");
        ConstructTheLexicographicallyLargestValidSequence sol = new ConstructTheLexicographicallyLargestValidSequence();
        System.out.println(sol.solve(null));
    }
}
