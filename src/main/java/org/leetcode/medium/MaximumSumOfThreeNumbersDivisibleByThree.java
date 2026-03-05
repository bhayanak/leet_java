package org.leetcode.medium;


/**
 * <b>#3780 - Maximum Sum of Three Numbers Divisible by Three</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Your task is to choose exactly three integers from nums such that their sum is divisible by three.
 *
 *
 * Return the maximum possible sum of such a triplet. If no such triplet exists, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,3,1]
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * The valid triplets whose sum is divisible by 3 are:
 *
 *
 * (4, 2, 3) with a sum of 4 + 2 + 3 = 9.
 *
 * (2, 3, 1) with a sum of 2 + 3 + 1 = 6.
 *
 * Thus, the answer is 9.
 *
 * Example 2:
 *
 * Input: nums = [2,1,5]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No triplet forms a sum divisible by 3, so the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Split numbers into groups by <code>x % 3</code>.
 * Hint 2: Only four valid combinations for <code>sum % 3 == 0</code>.
 * Hint 3: Possible combinations are <code>0 + 0 + 0</code>, <code>1 + 1 + 1</code>, <code>2 + 2 + 2</code>, <code>0 + 1 + 2</code>.
 * Hint 4: Sort groups descending, try each combo using top values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-of-three-numbers-divisible-by-three/">LeetCode #3780</a>
 */
public class MaximumSumOfThreeNumbersDivisibleByThree {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum of Three Numbers Divisible by Three");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSumOfThreeNumbersDivisibleByThree ===");
        MaximumSumOfThreeNumbersDivisibleByThree sol = new MaximumSumOfThreeNumbersDivisibleByThree();
        System.out.println(sol.solve(null));
    }
}
