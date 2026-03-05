package org.leetcode.hard;


/**
 * <b>#3785 - Minimum Swaps to Avoid Forbidden Values</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays, nums and forbidden, each of length n.
 *
 *
 * You may perform the following operation any number of times (including zero):
 *
 *
 * Choose two distinct indices i and j, and swap nums[i] with nums[j].
 *
 * Return the minimum number of swaps required such that, for every index i, the value of nums[i] is not equal to forbidden[i]. If no amount of swaps can ensure that every index avoids its forbidden value, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], forbidden = [3,2,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * One optimal set of swaps:
 *
 *
 * Select indices i = 0 and j = 1 in nums and swap them, resulting in nums = [2, 1, 3].
 *
 * After this swap, for every index i, nums[i] is not equal to forbidden[i].
 *
 * Example 2:
 *
 * Input: nums = [4,6,6,5], forbidden = [4,6,5,5]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 * One optimal set of swaps:
 *
 *
 * Select indices i = 0 and j = 2 in nums and swap them, resulting in nums = [6, 6, 4, 5].
 *
 * Select indices i = 1 and j = 3 in nums and swap them, resulting in nums = [6, 5, 4, 6].
 *
 * After these swaps, for every index i, nums[i] is not equal to forbidden[i].
 *
 * Example 3:
 *
 * Input: nums = [7,7], forbidden = [8,7]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 * It is not possible to make nums[i] different from forbidden[i] for all indices.
 *
 *
 * Example 4:
 *
 * Input: nums = [1,2], forbidden = [2,1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No swaps are required because nums[i] is already different from forbidden[i] for all indices, so the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length == forbidden.length &lt;= 105
 *
 * 1 &lt;= nums[i], forbidden[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve the problem greedily.
 * Hint 2: Count combined frequencies of values in <code>nums</code> and <code>forbidden</code> into a map <code>freq</code>.
 * Hint 3: If any <code>freq[val] &gt;= n + 1</code> return <code>-1</code> (impossible).
 * Hint 4: Collect bad positions (<code>nums[i] == forbidden[i]</code>) into a map <code>badPairs[val]</code> counts.
 * Hint 5: Let <code>badPairsSum</code> be the sum of all bad counts and <code>maxBadPairs</code> the maximum bad count for any single value.
 * Hint 6: The minimum swaps equals <code>max((badPairsSum + 1) / 2, maxBadPairs)</code> (i.e. ceil(badPairsSum/2) vs the largest same-value bad cluster).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-swaps-to-avoid-forbidden-values/">LeetCode #3785</a>
 */
public class MinimumSwapsToAvoidForbiddenValues {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Swaps to Avoid Forbidden Values");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumSwapsToAvoidForbiddenValues ===");
        MinimumSwapsToAvoidForbiddenValues sol = new MinimumSwapsToAvoidForbiddenValues();
        System.out.println(sol.solve(null));
    }
}
