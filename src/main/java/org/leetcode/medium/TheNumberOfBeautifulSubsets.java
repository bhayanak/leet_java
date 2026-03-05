package org.leetcode.medium;


/**
 * <b>#2597 - The Number of Beautiful Subsets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Dynamic Programming, Backtracking, Sorting, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums of positive integers and a positive integer k.
 *
 *
 * A subset of nums is beautiful if it does not contain two integers with an absolute difference equal to k.
 *
 *
 * Return the number of non-empty beautiful subsets of the array nums.
 *
 *
 * A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums. Two subsets are different if and only if the chosen indices to delete are different.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,6], k = 2
 * Output: 4
 * Explanation: The beautiful subsets of the array nums are: [2], [4], [6], [2, 6].
 * It can be proved that there are only 4 beautiful subsets in the array [2,4,6].
 *
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: 1
 * Explanation: The beautiful subset of the array nums is [1].
 * It can be proved that there is only 1 beautiful subset in the array [1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 18
 *
 * 1 &lt;= nums[i], k &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array nums and create another array cnt of size nums[i].
 * Hint 2: Use backtracking to generate all the beautiful subsets. If cnt[nums[i] - k] is positive, then it is impossible to add nums[i] in the subset, and we just move to the next index. Otherwise, it is also possible to add nums[i] in the subset, in this case, increase cnt[nums[i]], and move to the next index.
 * Hint 3: Bonus: Can you solve the problem in O(n log n)?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Dynamic Programming, Backtracking, Sorting, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/the-number-of-beautiful-subsets/">LeetCode #2597</a>
 */
public class TheNumberOfBeautifulSubsets {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: The Number of Beautiful Subsets");
    }

    public static void main(String[] args) {
        System.out.println("=== TheNumberOfBeautifulSubsets ===");
        TheNumberOfBeautifulSubsets sol = new TheNumberOfBeautifulSubsets();
        System.out.println(sol.solve(null));
    }
}
