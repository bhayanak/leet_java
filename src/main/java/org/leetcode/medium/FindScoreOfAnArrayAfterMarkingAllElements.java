package org.leetcode.medium;


/**
 * <b>#2593 - Find Score of an Array After Marking All Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Heap (Priority Queue), Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * Starting with score = 0, apply the following algorithm:
 *
 *
 * Choose the smallest integer of the array that is not marked. If there is a tie, choose the one with the smallest index.
 *
 * Add the value of the chosen integer to score.
 *
 * Mark the chosen element and its two adjacent elements if they exist.
 *
 * Repeat until all the array elements are marked.
 *
 * Return the score you get after applying the above algorithm.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3,4,5,2]
 * Output: 7
 * Explanation: We mark the elements as follows:
 * - 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,1,3,4,5,2].
 * - 2 is the smallest unmarked element, so we mark it and its left adjacent element: [2,1,3,4,5,2].
 * - 4 is the only remaining unmarked element, so we mark it: [2,1,3,4,5,2].
 * Our score is 1 + 2 + 4 = 7.
 *
 * Example 2:
 *
 * Input: nums = [2,3,5,1,3,2]
 * Output: 5
 * Explanation: We mark the elements as follows:
 * - 1 is the smallest unmarked element, so we mark it and its two adjacent elements: [2,3,5,1,3,2].
 * - 2 is the smallest unmarked element, since there are two of them, we choose the left-most one, so we mark the one at index 0 and its right adjacent element: [2,3,5,1,3,2].
 * - 2 is the only remaining unmarked element, so we mark it: [2,3,5,1,3,2].
 * Our score is 1 + 2 + 2 = 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try simulating the process of marking the elements and their adjacent.
 * Hint 2: If there is an element that was already marked, then you skip it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Heap (Priority Queue), Simulation).
 *
 * @see <a href="https://leetcode.com/problems/find-score-of-an-array-after-marking-all-elements/">LeetCode #2593</a>
 */
public class FindScoreOfAnArrayAfterMarkingAllElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Score of an Array After Marking All Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== FindScoreOfAnArrayAfterMarkingAllElements ===");
        FindScoreOfAnArrayAfterMarkingAllElements sol = new FindScoreOfAnArrayAfterMarkingAllElements();
        System.out.println(sol.solve(null));
    }
}
