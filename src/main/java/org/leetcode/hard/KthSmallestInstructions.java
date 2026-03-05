package org.leetcode.hard;


/**
 * <b>#1643 - Kth Smallest Instructions</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Bob is standing at cell (0, 0), and he wants to reach destination: (row, column). He can only travel right and down. You are going to help Bob by providing instructions for him to reach destination.
 *
 *
 * The instructions are represented as a string, where each character is either:
 *
 *
 * 'H', meaning move horizontally (go right), or
 *
 * 'V', meaning move vertically (go down).
 *
 * Multiple instructions will lead Bob to destination. For example, if destination is (2, 3), both "HHHVV" and "HVHVH" are valid instructions.
 *
 *
 * However, Bob is very picky. Bob has a lucky number k, and he wants the kth lexicographically smallest instructions that will lead him to destination. k is 1-indexed.
 *
 *
 * Given an integer array destination and an integer k, return the kth lexicographically smallest instructions that will take Bob to destination.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: destination = [2,3], k = 1
 * Output: "HHHVV"
 * Explanation: All the instructions that reach (2, 3) in lexicographic order are as follows:
 * ["HHHVV", "HHVHV", "HHVVH", "HVHHV", "HVHVH", "HVVHH", "VHHHV", "VHHVH", "VHVHH", "VVHHH"].
 *
 * Example 2:
 *
 * Input: destination = [2,3], k = 2
 * Output: "HHVHV"
 *
 * Example 3:
 *
 * Input: destination = [2,3], k = 3
 * Output: "HHVVH"
 *
 *
 *
 * Constraints:
 *
 *
 * destination.length == 2
 *
 * 1 &lt;= row, column &lt;= 15
 *
 * 1 &lt;= k &lt;= nCr(row + column, row), where nCr(a, b) denotes a choose b​​​​​.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are nCr(row + column, row) possible instructions to reach (row, column).
 * Hint 2: Try building the instructions one step at a time. How many instructions start with "H", and how does this compare with k?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Combinatorics).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/kth-smallest-instructions/">LeetCode #1643</a>
 */
public class KthSmallestInstructions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Kth Smallest Instructions");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== KthSmallestInstructions ===");
        KthSmallestInstructions sol = new KthSmallestInstructions();
        System.out.println(sol.solve(null));
    }
}
