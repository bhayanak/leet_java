package org.leetcode.medium;


/**
 * <b>#1887 - Reduction Operations to Make the Array Elements Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, your goal is to make all elements in nums equal. To complete one operation, follow these steps:
 *
 *
 * Find the largest value in nums. Let its index be i (0-indexed) and its value be largest. If there are multiple elements with the largest value, pick the smallest i.
 *
 * Find the next largest value in nums strictly smaller than largest. Let its value be nextLargest.
 *
 * Reduce nums[i] to nextLargest.
 *
 * Return the number of operations to make all elements in nums equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,1,3]
 * Output: 3
 * Explanation: It takes 3 operations to make all elements in nums equal:
 * 1. largest = 5 at index 0. nextLargest = 3. Reduce nums[0] to 3. nums = [3,1,3].
 * 2. largest = 3 at index 0. nextLargest = 1. Reduce nums[0] to 1. nums = [1,1,3].
 * 3. largest = 3 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1].
 *
 * Example 2:
 *
 * Input: nums = [1,1,1]
 * Output: 0
 * Explanation: All elements in nums are already equal.
 *
 * Example 3:
 *
 * Input: nums = [1,1,2,2,3]
 * Output: 4
 * Explanation: It takes 4 operations to make all elements in nums equal:
 * 1. largest = 3 at index 4. nextLargest = 2. Reduce nums[4] to 2. nums = [1,1,2,2,2].
 * 2. largest = 2 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1,2,2].
 * 3. largest = 2 at index 3. nextLargest = 1. Reduce nums[3] to 1. nums = [1,1,1,1,2].
 * 4. largest = 2 at index 4. nextLargest = 1. Reduce nums[4] to 1. nums = [1,1,1,1,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5 * 104
 *
 * 1 &lt;= nums[i] &lt;= 5 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array.
 * Hint 2: Try to reduce all elements with maximum value to the next maximum value in one operation.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/">LeetCode #1887</a>
 */
public class ReductionOperationsToMakeTheArrayElementsEqual {

    /**
     * Returns the number of operations to make all elements in nums equal.
     *
     * @param nums input array
     * @return number of reduction operations
     *
     * <p><b>Explanation:</b> Sorts the array and counts the number of reductions needed by summing the number of times a new value is encountered. Time O(n log n), Space O(1).</p>
     */
    public int reductionOperations(int[] nums) {
        throw new UnsupportedOperationException("Not yet implemented: Reduction Operations to Make the Array Elements Equal");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReductionOperationsToMakeTheArrayElementsEqual ===");
        ReductionOperationsToMakeTheArrayElementsEqual sol = new ReductionOperationsToMakeTheArrayElementsEqual();
        System.out.println(sol.reductionOperations(null));
    }
}
