package org.leetcode.medium;


/**
 * <b>#2975 - Maximum Square Area by Removing Fences From a Field</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a large (m - 1) x (n - 1) rectangular field with corners at (1, 1) and (m, n) containing some horizontal and vertical fences given in arrays hFences and vFences respectively.
 *
 *
 * Horizontal fences are from the coordinates (hFences[i], 1) to (hFences[i], n) and vertical fences are from the coordinates (1, vFences[i]) to (m, vFences[i]).
 *
 *
 * Return the maximum area of a square field that can be formed by removing some fences (possibly none) or -1 if it is impossible to make a square field.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * Note: The field is surrounded by two horizontal fences from the coordinates (1, 1) to (1, n) and (m, 1) to (m, n) and two vertical fences from the coordinates (1, 1) to (m, 1) and (1, n) to (m, n). These fences cannot be removed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: m = 4, n = 3, hFences = [2,3], vFences = [2]
 * Output: 4
 * Explanation: Removing the horizontal fence at 2 and the vertical fence at 2 will give a square field of area 4.
 *
 * Example 2:
 *
 * Input: m = 6, n = 7, hFences = [2], vFences = [4]
 * Output: -1
 * Explanation: It can be proved that there is no way to create a square field by removing fences.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= m, n &lt;= 109
 *
 * 1 &lt;= hFences.length, vFences.length &lt;= 600
 *
 * 1 &lt; hFences[i] &lt; m
 *
 * 1 &lt; vFences[i] &lt; n
 *
 * hFences and vFences are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Put <code>1</code> and <code>m</code> into <code>hFences</code>. The differences of any two values in the new <code>hFences</code> can be a horizontal edge of a rectangle.
 * Hint 2: Similarly put <code>1</code> and <code>n</code> into <code>vFences</code>. The differences of any two values in the new <code>vFences</code> can be a vertical edge of a rectangle.
 * Hint 3: Our goal is to find the maximum common value in both parts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximum-square-area-by-removing-fences-from-a-field/">LeetCode #2975</a>
 */
public class MaximumSquareAreaByRemovingFencesFromAField {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Square Area by Removing Fences From a Field");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSquareAreaByRemovingFencesFromAField ===");
        MaximumSquareAreaByRemovingFencesFromAField sol = new MaximumSquareAreaByRemovingFencesFromAField();
        System.out.println(sol.solve(null));
    }
}
