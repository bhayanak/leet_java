package org.leetcode.medium;


/**
 * <b>#2568 - Minimum Impossible OR</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Brainteaser</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * We say that an integer x is expressible from nums if there exist some integers 0 &lt;= index1 &lt; index2 &lt; ... &lt; indexk &lt; nums.length for which nums[index1] | nums[index2] | ... | nums[indexk] = x. In other words, an integer is expressible if it can be written as the bitwise OR of some subsequence of nums.
 *
 *
 * Return the minimum positive non-zero integer that is not expressible from nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1]
 * Output: 4
 * Explanation: 1 and 2 are already present in the array. We know that 3 is expressible, since nums[0] | nums[1] = 2 | 1 = 3. Since 4 is not expressible, we return 4.
 *
 * Example 2:
 *
 * Input: nums = [5,3,2]
 * Output: 1
 * Explanation: We can show that 1 is the smallest number that is not expressible.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about forming numbers in the powers of 2 using their bit representation.
 * Hint 2: The minimum power of 2 not present in the array will be the first number that could not be expressed using the given operation.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Brainteaser).
 *
 * @see <a href="https://leetcode.com/problems/minimum-impossible-or/">LeetCode #2568</a>
 */
public class MinimumImpossibleOr {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Impossible OR");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumImpossibleOr ===");
        MinimumImpossibleOr sol = new MinimumImpossibleOr();
        System.out.println(sol.solve(null));
    }
}
