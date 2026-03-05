package org.leetcode.medium;


/**
 * <b>#2649 - Nested Array Generator</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a multi-dimensional array of integers, return a generator object which yields integers in the same order as inorder traversal.
 *
 *
 * A multi-dimensional array is a recursive data structure that contains both integers and other multi-dimensional arrays.
 *
 *
 * inorder traversal iterates over each array from left to right, yielding any integers it encounters or applying inorder traversal to any arrays it encounters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [[[6]],[1,3],[]]
 * Output: [6,1,3]
 * Explanation:
 * const generator = inorderTraversal(arr);
 * generator.next().value; // 6
 * generator.next().value; // 1
 * generator.next().value; // 3
 * generator.next().done; // true
 *
 * Example 2:
 *
 * Input: arr = []
 * Output: []
 * Explanation: There are no integers so the generator doesn't yield anything.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= arr.flat().length &lt;= 105
 *
 * 0 &lt;= arr.flat()[i] &lt;= 105
 *
 * maxNestingDepth &lt;= 105
 *
 *
 * Can you solve this without creating a new flattened version of the array?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Generator functions can pass control to another generator function with "yield*" syntax.
 * Hint 2: Generator functions can recursively yield control to themselves.
 * Hint 3: You don't need to worry about recursion depth for this problem.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/nested-array-generator/">LeetCode #2649</a>
 */
public class NestedArrayGenerator {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Nested Array Generator");
    }

    public static void main(String[] args) {
        System.out.println("=== NestedArrayGenerator ===");
        NestedArrayGenerator sol = new NestedArrayGenerator();
        System.out.println(sol.solve(null));
    }
}
