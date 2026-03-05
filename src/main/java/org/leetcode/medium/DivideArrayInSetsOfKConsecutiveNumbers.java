package org.leetcode.medium;


/**
 * <b>#1296 - Divide Array in Sets of K Consecutive Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and a positive integer k, check whether it is possible to divide this array into sets of k consecutive numbers.
 *
 *
 * Return true if it is possible. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,3,4,4,5,6], k = 4
 * Output: true
 * Explanation: Array can be divided into [1,2,3,4] and [3,4,5,6].
 *
 * Example 2:
 *
 * Input: nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
 * Output: true
 * Explanation: Array can be divided into [1,2,3] , [2,3,4] , [3,4,5] and [9,10,11].
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4], k = 3
 * Output: false
 * Explanation: Each array should be divided in subarrays of size 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 *
 * Note: This question is the same as 846: https://leetcode.com/problems/hand-of-straights/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the smallest number in the possible-to-split array is V, then numbers V+1, V+2, ... V+k-1 must contain there as well.
 * Hint 2: You can iteratively find k sets and remove them from array until it becomes empty.
 * Hint 3: Failure to do so would mean that array is unsplittable.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/">LeetCode #1296</a>
 */
public class DivideArrayInSetsOfKConsecutiveNumbers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Divide Array in Sets of K Consecutive Numbers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DivideArrayInSetsOfKConsecutiveNumbers ===");
        DivideArrayInSetsOfKConsecutiveNumbers sol = new DivideArrayInSetsOfKConsecutiveNumbers();
        System.out.println(sol.solve(null));
    }
}
