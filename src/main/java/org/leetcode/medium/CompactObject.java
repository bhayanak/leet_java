package org.leetcode.medium;


/**
 * <b>#2705 - Compact Object</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an object or array obj, return a compact object.
 *
 *
 * A compact object is the same as the original object, except with keys containing falsy values removed. This operation applies to the object and any nested objects. Arrays are considered objects where the indices are keys. A value is considered falsy when Boolean(value) returns false.
 *
 *
 * You may assume the obj is the output of JSON.parse. In other words, it is valid JSON.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: obj = [null, 0, false, 1]
 * Output: [1]
 * Explanation: All falsy values have been removed from the array.
 *
 * Example 2:
 *
 * Input: obj = {"a": null, "b": [false, 1]}
 * Output: {"b": [1]}
 * Explanation: obj["a"] and obj["b"][0] had falsy values and were removed.
 *
 * Example 3:
 *
 * Input: obj = [null, 0, 5, [0], [false, 16]]
 * Output: [5, [], [16]]
 * Explanation: obj[0], obj[1], obj[3][0], and obj[4][0] were falsy and removed.
 *
 *
 *
 * Constraints:
 *
 *
 * obj is a valid JSON object
 *
 * 2 &lt;= JSON.stringify(obj).length &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/compact-object/">LeetCode #2705</a>
 */
public class CompactObject {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Compact Object");
    }

    public static void main(String[] args) {
        System.out.println("=== CompactObject ===");
        CompactObject sol = new CompactObject();
        System.out.println(sol.solve(null));
    }
}
