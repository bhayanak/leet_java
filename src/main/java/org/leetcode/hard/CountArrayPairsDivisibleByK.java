package org.leetcode.hard;


/**
 * <b>#2183 - Count Array Pairs Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed integer array nums of length n and an integer k, return the number of pairs (i, j) such that:
 *
 *
 * 0 &lt;= i &lt; j &lt;= n - 1 and
 *
 * nums[i] * nums[j] is divisible by k.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5], k = 2
 * Output: 7
 * Explanation: 
 * The 7 pairs of indices whose corresponding products are divisible by 2 are
 * (0, 1), (0, 3), (1, 2), (1, 3), (1, 4), (2, 3), and (3, 4).
 * Their products are 2, 4, 6, 8, 10, 12, and 20 respectively.
 * Other pairs such as (0, 2) and (2, 4) have products 3 and 15 respectively, which are not divisible by 2.    
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4], k = 5
 * Output: 0
 * Explanation: There does not exist any pair of indices whose corresponding product is divisible by 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i], k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For any element in the array, what is the smallest number it should be multiplied with such that the product is divisible by k?
 * Hint 2: The smallest number which should be multiplied with nums[i] so that the product is divisible by k is k / gcd(k, nums[i]). Now think about how you can store and update the count of such numbers present in the array efficiently.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/count-array-pairs-divisible-by-k/">LeetCode #2183</a>
 */
public class CountArrayPairsDivisibleByK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Array Pairs Divisible by K");
    }

    public static void main(String[] args) {
        System.out.println("=== CountArrayPairsDivisibleByK ===");
        CountArrayPairsDivisibleByK sol = new CountArrayPairsDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
