package org.leetcode.hard;


/**
 * <b>#1655 - Distribute Repeating Integers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming, Backtracking, Bit Manipulation, Counting, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of n integers, nums, where there are at most 50 unique values in the array. You are also given an array of m customer order quantities, quantity, where quantity[i] is the amount of integers the ith customer ordered. Determine if it is possible to distribute nums such that:
 *
 *
 * The ith customer gets exactly quantity[i] integers,
 *
 * The integers the ith customer gets are all equal, and
 *
 * Every customer is satisfied.
 *
 * Return true if it is possible to distribute nums according to the above conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4], quantity = [2]
 * Output: false
 * Explanation: The 0th customer cannot be given two different integers.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,3], quantity = [2]
 * Output: true
 * Explanation: The 0th customer is given [3,3]. The integers [1,2] are not used.
 *
 * Example 3:
 *
 * Input: nums = [1,1,2,2], quantity = [2,2]
 * Output: true
 * Explanation: The 0th customer is given [1,1], and the 1st customer is given [2,2].
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 1000
 *
 * m == quantity.length
 *
 * 1 &lt;= m &lt;= 10
 *
 * 1 &lt;= quantity[i] &lt;= 105
 *
 * There are at most 50 unique values in nums.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequencies of each number. For example, if nums = [4,4,5,5,5], frequencies = [2,3].
 * Hint 2: Each customer wants all of their numbers to be the same. This means that each customer will be assigned to one number.
 * Hint 3: Use dynamic programming. Iterate through the numbers' frequencies, and choose some subset of customers to be assigned to this number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming, Backtracking, Bit Manipulation, Counting, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/distribute-repeating-integers/">LeetCode #1655</a>
 */
public class DistributeRepeatingIntegers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distribute Repeating Integers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DistributeRepeatingIntegers ===");
        DistributeRepeatingIntegers sol = new DistributeRepeatingIntegers();
        System.out.println(sol.solve(null));
    }
}
