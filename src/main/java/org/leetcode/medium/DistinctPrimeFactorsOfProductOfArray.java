package org.leetcode.medium;


/**
 * <b>#2521 - Distinct Prime Factors of Product of Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers nums, return the number of distinct prime factors in the product of the elements of nums.
 *
 *
 * Note that:
 *
 *
 * A number greater than 1 is called prime if it is divisible by only 1 and itself.
 *
 * An integer val1 is a factor of another integer val2 if val2 / val1 is an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,3,7,10,6]
 * Output: 4
 * Explanation:
 * The product of all the elements in nums is: 2 * 4 * 3 * 7 * 10 * 6 = 10080 = 25 * 32 * 5 * 7.
 * There are 4 distinct prime factors so we return 4.
 *
 * Example 2:
 *
 * Input: nums = [2,4,8,16]
 * Output: 1
 * Explanation:
 * The product of all the elements in nums is: 2 * 4 * 8 * 16 = 1024 = 210.
 * There is 1 distinct prime factor so we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 104
 *
 * 2 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do not multiply all the numbers together, as the product is too big to store.
 * Hint 2: Think about how each individual number's prime factors contribute to the prime factors of the product of the entire array.
 * Hint 3: Find the prime factors of each element in nums, and store all of them in a set to avoid duplicates.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/distinct-prime-factors-of-product-of-array/">LeetCode #2521</a>
 */
public class DistinctPrimeFactorsOfProductOfArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distinct Prime Factors of Product of Array");
    }

    public static void main(String[] args) {
        System.out.println("=== DistinctPrimeFactorsOfProductOfArray ===");
        DistinctPrimeFactorsOfProductOfArray sol = new DistinctPrimeFactorsOfProductOfArray();
        System.out.println(sol.solve(null));
    }
}
