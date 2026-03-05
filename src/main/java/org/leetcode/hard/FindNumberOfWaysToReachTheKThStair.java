package org.leetcode.hard;


/**
 * <b>#3154 - Find Number of Ways to Reach the K-th Stair</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Bit Manipulation, Memoization, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a non-negative integer k. There exists a staircase with an infinite number of stairs, with the lowest stair numbered 0.
 *
 *
 * Alice has an integer jump, with an initial value of 0. She starts on stair 1 and wants to reach stair k using any number of operations. If she is on stair i, in one operation she can:
 *
 *
 * Go down to stair i - 1. This operation cannot be used consecutively or on stair 0.
 *
 * Go up to stair i + 2jump. And then, jump becomes jump + 1.
 *
 * Return the total number of ways Alice can reach stair k.
 *
 *
 * Note that it is possible that Alice reaches the stair k, and performs some operations to reach the stair k again.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: k = 0
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The 2 possible ways of reaching stair 0 are:
 *
 *
 * Alice starts at stair 1.
 *
 *
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 0.
 *
 *
 *
 * Alice starts at stair 1.
 *
 *
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 0.
 *
 * Using an operation of the second type, she goes up 20 stairs to reach stair 1.
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 0.
 *
 *
 *
 * Example 2:
 *
 * Input: k = 1
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The 4 possible ways of reaching stair 1 are:
 *
 *
 * Alice starts at stair 1. Alice is at stair 1.
 *
 * Alice starts at stair 1.
 *
 *
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 0.
 *
 * Using an operation of the second type, she goes up 20 stairs to reach stair 1.
 *
 *
 *
 * Alice starts at stair 1.
 *
 *
 *
 * Using an operation of the second type, she goes up 20 stairs to reach stair 2.
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 1.
 *
 *
 *
 * Alice starts at stair 1.
 *
 *
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 0.
 *
 * Using an operation of the second type, she goes up 20 stairs to reach stair 1.
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 0.
 *
 * Using an operation of the second type, she goes up 21 stairs to reach stair 2.
 *
 * Using an operation of the first type, she goes down 1 stair to reach stair 1.
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: On using <code>x</code> operations of the second type and <code>y</code> operations of the first type, the stair <code>2<sup>x</sup> - y</code> is reached.
 * Hint 2: Since first operations cannot be consecutive, there are exactly <code>x + 1</code> positions (before and after each power of 2) to perform the second operation.
 * Hint 3: Using combinatorics, we have <sup>x + 1</sup>C<sub>y</sub> number of ways to select the positions of second operations.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Bit Manipulation, Memoization, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/find-number-of-ways-to-reach-the-k-th-stair/">LeetCode #3154</a>
 */
public class FindNumberOfWaysToReachTheKThStair {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Number of Ways to Reach the K-th Stair");
    }

    public static void main(String[] args) {
        System.out.println("=== FindNumberOfWaysToReachTheKThStair ===");
        FindNumberOfWaysToReachTheKThStair sol = new FindNumberOfWaysToReachTheKThStair();
        System.out.println(sol.solve(null));
    }
}
