package org.leetcode.medium;


/**
 * <b>#3132 - Find the Integer Added to Array II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2.
 *
 *
 * From nums1 two elements have been removed, and all other elements have been increased (or decreased in the case of negative) by an integer, represented by the variable x.
 *
 *
 * As a result, nums1 becomes equal to nums2. Two arrays are considered equal when they contain the same integers with the same frequencies.
 *
 *
 * Return the minimum possible integer x that achieves this equivalence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [4,20,16,12,8], nums2 = [14,18,10]
 *
 *
 * Output: -2
 *
 *
 * Explanation:
 *
 *
 * After removing elements at indices [0,4] and adding -2, nums1 becomes [18,14,10].
 *
 * Example 2:
 *
 * Input: nums1 = [3,5,5,3], nums2 = [7,7]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * After removing elements at indices [0,3] and adding 2, nums1 becomes [7,7].
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums1.length &lt;= 200
 *
 * nums2.length == nums1.length - 2
 *
 * 0 &lt;= nums1[i], nums2[i] &lt;= 1000
 *
 * The test cases are generated in a way that there is an integer x such that nums1 can become equal to nums2 by removing two elements and adding x to each element of nums1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try all possibilities to remove 2 elements from <code>nums1</code>.
 * Hint 2: <code>x</code> should be equal to <code>min(nums2) - min(nums1)</code>, check it naively.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-integer-added-to-array-ii/">LeetCode #3132</a>
 */
public class FindTheIntegerAddedToArrayIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Integer Added to Array II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheIntegerAddedToArrayIi ===");
        FindTheIntegerAddedToArrayIi sol = new FindTheIntegerAddedToArrayIi();
        System.out.println(sol.solve(null));
    }
}
