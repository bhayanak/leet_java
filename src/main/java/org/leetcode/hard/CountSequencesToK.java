package org.leetcode.hard;


/**
 * <b>#3850 - Count Sequences to K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Memoization, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums, and an integer k.
 *
 *
 * Start with an initial value val = 1 and process nums from left to right. At each index i, you must choose exactly one of the following actions:
 *
 *
 * Multiply val by nums[i].
 *
 * Divide val by nums[i].
 *
 * Leave val unchanged.
 *
 * After processing all elements, val is considered equal to k only if its final rational value exactly equals k.
 *
 *
 * Return the count of distinct sequences of choices that result in val == k.
 *
 *
 * Note: Division is rational (exact), not integer division. For example, 2 / 4 = 1 / 2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,2], k = 6
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The following 2 distinct sequences of choices result in val == k:
 *
 *
 *
 *
 *
 * 			Sequence
 * 			Operation on nums[0]
 * 			Operation on nums[1]
 * 			Operation on nums[2]
 * 			Final val
 *
 *
 *
 *
 *
 *
 * 			1
 * 			Multiply: val = 1 * 2 = 2
 * 			Multiply: val = 2 * 3 = 6
 * 			Leave val unchanged
 * 			6
 *
 *
 *
 *
 * 			2
 * 			Leave val unchanged
 * 			Multiply: val = 1 * 3 = 3
 * 			Multiply: val = 3 * 2 = 6
 * 			6
 *
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [4,6,3], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The following 2 distinct sequences of choices result in val == k:
 *
 *
 *
 *
 *
 * 			Sequence
 * 			Operation on nums[0]
 * 			Operation on nums[1]
 * 			Operation on nums[2]
 * 			Final val
 *
 *
 *
 *
 *
 *
 * 			1
 * 			Multiply: val = 1 * 4 = 4
 * 			Divide: val = 4 / 6 = 2 / 3
 * 			Multiply: val = (2 / 3) * 3 = 2
 * 			2
 *
 *
 *
 *
 * 			2
 * 			Leave val unchanged
 * 			Multiply: val = 1 * 6 = 6
 * 			Divide: val = 6 / 3 = 2
 * 			2
 *
 *
 *
 *
 * Example 3:
 *
 * Input: nums = [1,5], k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The following 3 distinct sequences of choices result in val == k:
 *
 *
 *
 *
 *
 * 			Sequence
 * 			Operation on nums[0]
 * 			Operation on nums[1]
 * 			Final val
 *
 *
 *
 *
 *
 *
 * 			1
 * 			Multiply: val = 1 * 1 = 1
 * 			Leave val unchanged
 * 			1
 *
 *
 *
 *
 * 			2
 * 			Divide: val = 1 / 1 = 1
 * 			Leave val unchanged
 * 			1
 *
 *
 *
 *
 * 			3
 * 			Leave val unchanged
 * 			Leave val unchanged
 * 			1
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 19
 *
 * 1 &lt;= nums[i] &lt;= 6
 *
 * 1 &lt;= k &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Represent numbers by their prime exponents as <code>(2^x, 3^y, 5^z)</code>.
 * Hint 2: Use Dynamic Programming on the prime exponents: let <code>dp(idx, x, y, z)</code> be the number of ways to reach exponents <code>(x,y,z)</code> after processing index <code>idx</code>.
 * Hint 3: When <code>idx == nums.length</code>, compare <code>(x, y, z)</code> to the prime exponent decomposition of <code>k</code> and count matches.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Memoization, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/count-sequences-to-k/">LeetCode #3850</a>
 */
public class CountSequencesToK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Sequences to K");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSequencesToK ===");
        CountSequencesToK sol = new CountSequencesToK();
        System.out.println(sol.solve(null));
    }
}
