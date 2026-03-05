package org.leetcode.medium;


/**
 * <b>#1838 - Frequency of the Most Frequent Element</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sliding Window, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The frequency of an element is the number of times it occurs in an array.
 *
 *
 * You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and increment the element at that index by 1.
 *
 *
 * Return the maximum possible frequency of an element after performing at most k operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4], k = 5
 * Output: 3
 * Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
 * 4 has a frequency of 3.
 *
 * Example 2:
 *
 * Input: nums = [1,4,8,13], k = 5
 * Output: 2
 * Explanation: There are multiple optimal solutions:
 * - Increment the first element three times to make nums = [4,4,8,13]. 4 has a frequency of 2.
 * - Increment the second element four times to make nums = [1,8,8,13]. 8 has a frequency of 2.
 * - Increment the third element five times to make nums = [1,4,13,13]. 13 has a frequency of 2.
 *
 * Example 3:
 *
 * Input: nums = [3,9,6], k = 2
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that you can try all values in a brute force manner and find the maximum frequency of that value.
 * Hint 2: To find the maximum frequency of a value consider the biggest elements smaller than or equal to this value
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sliding Window, Sorting, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/frequency-of-the-most-frequent-element/">LeetCode #1838</a>
 */
public class FrequencyOfTheMostFrequentElement {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Frequency of the Most Frequent Element");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FrequencyOfTheMostFrequentElement ===");
        FrequencyOfTheMostFrequentElement sol = new FrequencyOfTheMostFrequentElement();
        System.out.println(sol.solve(null));
    }
}
