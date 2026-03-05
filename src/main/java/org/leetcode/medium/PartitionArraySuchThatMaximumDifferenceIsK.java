package org.leetcode.medium;


/**
 * <b>#2294 - Partition Array Such That Maximum Difference Is K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k. You may partition nums into one or more subsequences such that each element in nums appears in exactly one of the subsequences.
 *
 *
 * Return the minimum number of subsequences needed such that the difference between the maximum and minimum values in each subsequence is at most k.
 *
 *
 * A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,6,1,2,5], k = 2
 * Output: 2
 * Explanation:
 * We can partition nums into the two subsequences [3,1,2] and [6,5].
 * The difference between the maximum and minimum value in the first subsequence is 3 - 1 = 2.
 * The difference between the maximum and minimum value in the second subsequence is 6 - 5 = 1.
 * Since two subsequences were created, we return 2. It can be shown that 2 is the minimum number of subsequences needed.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3], k = 1
 * Output: 2
 * Explanation:
 * We can partition nums into the two subsequences [1,2] and [3].
 * The difference between the maximum and minimum value in the first subsequence is 2 - 1 = 1.
 * The difference between the maximum and minimum value in the second subsequence is 3 - 3 = 0.
 * Since two subsequences were created, we return 2. Note that another optimal solution is to partition nums into the two subsequences [1] and [2,3].
 *
 * Example 3:
 *
 * Input: nums = [2,2,4,5], k = 0
 * Output: 3
 * Explanation:
 * We can partition nums into the three subsequences [2,2], [4], and [5].
 * The difference between the maximum and minimum value in the first subsequences is 2 - 2 = 0.
 * The difference between the maximum and minimum value in the second subsequences is 4 - 4 = 0.
 * The difference between the maximum and minimum value in the third subsequences is 5 - 5 = 0.
 * Since three subsequences were created, we return 3. It can be shown that 3 is the minimum number of subsequences needed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 *
 * 0 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Which values in each subsequence matter? The only values that matter are the maximum and minimum values.
 * Hint 2: Let the maximum and minimum values of a subsequence be Max and Min. It is optimal to place all values in between Max and Min in the original array in the same subsequence as Max and Min.
 * Hint 3: Sort the array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/">LeetCode #2294</a>
 */
public class PartitionArraySuchThatMaximumDifferenceIsK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Partition Array Such That Maximum Difference Is K");
    }

    public static void main(String[] args) {
        System.out.println("=== PartitionArraySuchThatMaximumDifferenceIsK ===");
        PartitionArraySuchThatMaximumDifferenceIsK sol = new PartitionArraySuchThatMaximumDifferenceIsK();
        System.out.println(sol.solve(null));
    }
}
