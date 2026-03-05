package org.leetcode.hard;


/**
 * <b>#2344 - Minimum Deletions to Make Array Divisible</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Sorting, Heap (Priority Queue), Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integer arrays nums and numsDivide. You can delete any number of elements from nums.
 *
 *
 * Return the minimum number of deletions such that the smallest element in nums divides all the elements of numsDivide. If this is not possible, return -1.
 *
 *
 * Note that an integer x divides y if y % x == 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,2,4,3], numsDivide = [9,6,9,3,15]
 * Output: 2
 * Explanation: 
 * The smallest element in [2,3,2,4,3] is 2, which does not divide all the elements of numsDivide.
 * We use 2 deletions to delete the elements in nums that are equal to 2 which makes nums = [3,4,3].
 * The smallest element in [3,4,3] is 3, which divides all the elements of numsDivide.
 * It can be shown that 2 is the minimum number of deletions needed.
 *
 * Example 2:
 *
 * Input: nums = [4,3,6], numsDivide = [8,2,6,10]
 * Output: -1
 * Explanation: 
 * We want the smallest element in nums to divide all the elements of numsDivide.
 * There is no way to delete elements from nums to allow this.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length, numsDivide.length &lt;= 105
 *
 * 1 &lt;= nums[i], numsDivide[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can we find an integer x that divides all the elements of numsDivide?
 * Hint 2: Will finding GCD (Greatest Common Divisor) help here?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Sorting, Heap (Priority Queue), Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-array-divisible/">LeetCode #2344</a>
 */
public class MinimumDeletionsToMakeArrayDivisible {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Deletions to Make Array Divisible");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumDeletionsToMakeArrayDivisible ===");
        MinimumDeletionsToMakeArrayDivisible sol = new MinimumDeletionsToMakeArrayDivisible();
        System.out.println(sol.solve(null));
    }
}
