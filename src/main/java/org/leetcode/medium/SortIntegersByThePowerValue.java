package org.leetcode.medium;


/**
 * <b>#1387 - Sort Integers by The Power Value</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Memoization, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The power of an integer x is defined as the number of steps needed to transform x into 1 using the following steps:
 *
 *
 * if x is even then x = x / 2
 *
 * if x is odd then x = 3 * x + 1
 *
 * For example, the power of x = 3 is 7 because 3 needs 7 steps to become 1 (3 --&gt; 10 --&gt; 5 --&gt; 16 --&gt; 8 --&gt; 4 --&gt; 2 --&gt; 1).
 *
 *
 * Given three integers lo, hi and k. The task is to sort all integers in the interval [lo, hi] by the power value in ascending order, if two or more integers have the same power value sort them by ascending order.
 *
 *
 * Return the kth integer in the range [lo, hi] sorted by the power value.
 *
 *
 * Notice that for any integer x (lo &lt;= x &lt;= hi) it is guaranteed that x will transform into 1 using these steps and that the power of x is will fit in a 32-bit signed integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: lo = 12, hi = 15, k = 2
 * Output: 13
 * Explanation: The power of 12 is 9 (12 --&gt; 6 --&gt; 3 --&gt; 10 --&gt; 5 --&gt; 16 --&gt; 8 --&gt; 4 --&gt; 2 --&gt; 1)
 * The power of 13 is 9
 * The power of 14 is 17
 * The power of 15 is 17
 * The interval sorted by the power value [12,13,14,15]. For k = 2 answer is the second element which is 13.
 * Notice that 12 and 13 have the same power value and we sorted them in ascending order. Same for 14 and 15.
 *
 * Example 2:
 *
 * Input: lo = 7, hi = 11, k = 4
 * Output: 7
 * Explanation: The power array corresponding to the interval [7, 8, 9, 10, 11] is [16, 3, 19, 6, 14].
 * The interval sorted by power is [8, 10, 11, 7, 9].
 * The fourth number in the sorted array is 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= lo &lt;= hi &lt;= 1000
 *
 * 1 &lt;= k &lt;= hi - lo + 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming to get the power of each integer of the intervals.
 * Hint 2: Sort all the integers of the interval by the power value and return the k-th in the sorted list.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Memoization, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-integers-by-the-power-value/">LeetCode #1387</a>
 */
public class SortIntegersByThePowerValue {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sort Integers by The Power Value");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SortIntegersByThePowerValue ===");
        SortIntegersByThePowerValue sol = new SortIntegersByThePowerValue();
        System.out.println(sol.solve(null));
    }
}
