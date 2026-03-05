package org.leetcode.medium;


/**
 * <b>#1968 - Array With Elements Not Equal to Average of Neighbors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums of distinct integers. You want to rearrange the elements in the array such that every element in the rearranged array is not equal to the average of its neighbors.
 *
 *
 * More formally, the rearranged array should have the property such that for every i in the range 1 &lt;= i &lt; nums.length - 1, (nums[i-1] + nums[i+1]) / 2 is not equal to nums[i].
 *
 *
 * Return any rearrangement of nums that meets the requirements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: [1,2,4,5,3]
 * Explanation:
 * When i=1, nums[i] = 2, and the average of its neighbors is (1+4) / 2 = 2.5.
 * When i=2, nums[i] = 4, and the average of its neighbors is (2+5) / 2 = 3.5.
 * When i=3, nums[i] = 5, and the average of its neighbors is (4+3) / 2 = 3.5.
 *
 * Example 2:
 *
 * Input: nums = [6,2,0,9,7]
 * Output: [9,7,6,2,0]
 * Explanation:
 * When i=1, nums[i] = 7, and the average of its neighbors is (9+6) / 2 = 7.5.
 * When i=2, nums[i] = 6, and the average of its neighbors is (7+2) / 2 = 4.5.
 * When i=3, nums[i] = 2, and the average of its neighbors is (6+0) / 2 = 3.
 * Note that the original array [6,2,0,9,7] also satisfies the conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A number can be the average of its neighbors if one neighbor is smaller than the number and the other is greater than the number.
 * Hint 2: We can put numbers smaller than the median on odd indices and the rest on even indices.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/">LeetCode #1968</a>
 */
public class ArrayWithElementsNotEqualToAverageOfNeighbors {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Array With Elements Not Equal to Average of Neighbors");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ArrayWithElementsNotEqualToAverageOfNeighbors ===");
        ArrayWithElementsNotEqualToAverageOfNeighbors sol = new ArrayWithElementsNotEqualToAverageOfNeighbors();
        System.out.println(sol.solve(null));
    }
}
