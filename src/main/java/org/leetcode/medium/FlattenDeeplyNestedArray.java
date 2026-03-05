package org.leetcode.medium;


/**
 * <b>#2625 - Flatten Deeply Nested Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a multi-dimensional array arr and a depth n, return a flattened version of that array.
 *
 *
 * A multi-dimensional array is a recursive data structure that contains integers or other multi-dimensional arrays.
 *
 *
 * A flattened array is a version of that array with some or all of the sub-arrays removed and replaced with the actual elements in that sub-array. This flattening operation should only be done if the current depth of nesting is less than n. The depth of the elements in the first array are considered to be 0.
 *
 *
 * Please solve it without the built-in Array.flat method.
 *
 *
 *
 *
 * Example 1:
 *
 * Input
 * arr = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
 * n = 0
 * Output
 * [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
 *
 * Explanation
 * Passing a depth of n=0 will always result in the original array. This is because the smallest possible depth of a subarray (0) is not less than n=0. Thus, no subarray should be flattened. 
 *
 * Example 2:
 *
 * Input
 * arr = [1, 2, 3, [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
 * n = 1
 * Output
 * [1, 2, 3, 4, 5, 6, 7, 8, [9, 10, 11], 12, 13, 14, 15]
 *
 * Explanation
 * The subarrays starting with 4, 7, and 13 are all flattened. This is because their depth of 0 is less than 1. However [9, 10, 11] remains unflattened because its depth is 1.
 *
 * Example 3:
 *
 * Input
 * arr = [[1, 2, 3], [4, 5, 6], [7, 8, [9, 10, 11], 12], [13, 14, 15]]
 * n = 2
 * Output
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
 *
 * Explanation
 * The maximum depth of any subarray is 1. Thus, all of them are flattened.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= count of numbers in arr &lt;= 105
 *
 * 0 &lt;= count of subarrays in arr &lt;= 105
 *
 * maxDepth &lt;= 1000
 *
 * -1000 &lt;= each number &lt;= 1000
 *
 * 0 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Write a recursive function that keeps track of the current depth.
 * Hint 2: if the current depth &gt;= the maximum depth, always just push the value to the returned array. Otherwise recursively call flat on the array.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/flatten-deeply-nested-array/">LeetCode #2625</a>
 */
public class FlattenDeeplyNestedArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Flatten Deeply Nested Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FlattenDeeplyNestedArray ===");
        FlattenDeeplyNestedArray sol = new FlattenDeeplyNestedArray();
        System.out.println(sol.solve(null));
    }
}
