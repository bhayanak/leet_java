package org.leetcode.medium;


/**
 * <b>#3020 - Find the Maximum Number of Elements in Subset</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums.
 *
 *
 * You need to select a subset of nums which satisfies the following condition:
 *
 *
 * You can place the selected elements in a 0-indexed array such that it follows the pattern: [x, x2, x4, ..., xk/2, xk, xk/2, ..., x4, x2, x] (Note that k can be be any non-negative power of 2). For example, [2, 4, 16, 4, 2] and [3, 9, 3] follow the pattern while [2, 4, 8, 4, 2] does not.
 *
 * Return the maximum number of elements in a subset that satisfies these conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,4,1,2,2]
 * Output: 3
 * Explanation: We can select the subset {4,2,2}, which can be placed in the array as [2,4,2] which follows the pattern and 22 == 4. Hence the answer is 3.
 *
 * Example 2:
 *
 * Input: nums = [1,3,2,4]
 * Output: 1
 * Explanation: We can select the subset {1}, which can be placed in the array as [1] which follows the pattern. Hence the answer is 1. Note that we could have also selected the subsets {2}, {3}, or {4}, there may be multiple subsets which provide the same answer. 
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can select an odd number of <code>1</code>’s.
 * Hint 2: Put all the values into a HashSet. We can start from each <code>x &gt; 1</code> as the smallest chosen value and we can find the longest subset by checking the new values (which are the square of the previous value) in the set by brute force.
 * Hint 3: Note when <code>x &gt; 1</code>, <code>x<sup>2</sup></code>, <code>x<sup>4</sup></code>, <code>x<sup>8</sup></code>, … increases very fast, the longest subset with smallest value x cannot be very long. (The length is <code>O(log(log(10<sup>9</sup>)))</code>.
 * Hint 4: Hence we can directly check all lengths less than <code>10</code> for all values of <code>x</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset/">LeetCode #3020</a>
 */
public class FindTheMaximumNumberOfElementsInSubset {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Maximum Number of Elements in Subset");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMaximumNumberOfElementsInSubset ===");
        FindTheMaximumNumberOfElementsInSubset sol = new FindTheMaximumNumberOfElementsInSubset();
        System.out.println(sol.solve(null));
    }
}
