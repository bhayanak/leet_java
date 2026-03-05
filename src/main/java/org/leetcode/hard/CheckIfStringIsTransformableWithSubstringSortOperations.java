package org.leetcode.hard;


/**
 * <b>#1585 - Check If String Is Transformable With Substring Sort Operations</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, transform string s into string t using the following operation any number of times:
 *
 *
 * Choose a non-empty substring in s and sort it in place so the characters are in ascending order.
 *
 *
 *
 *
 * For example, applying the operation on the underlined substring in "14234" results in "12344".
 *
 *
 *
 * Return true if it is possible to transform s into t. Otherwise, return false.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "84532", t = "34852"
 * Output: true
 * Explanation: You can transform s into t using the following sort operations:
 * "84532" (from index 2 to 3) -&gt; "84352"
 * "84352" (from index 0 to 2) -&gt; "34852"
 *
 * Example 2:
 *
 * Input: s = "34521", t = "23415"
 * Output: true
 * Explanation: You can transform s into t using the following sort operations:
 * "34521" -&gt; "23451"
 * "23451" -&gt; "23415"
 *
 * Example 3:
 *
 * Input: s = "12345", t = "12435"
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * s.length == t.length
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s and t consist of only digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Suppose the first digit you need is 'd'. How can you determine if it's possible to get that digit there?
 * Hint 2: Consider swapping adjacent characters to maintain relative ordering.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-string-is-transformable-with-substring-sort-operations/">LeetCode #1585</a>
 */
public class CheckIfStringIsTransformableWithSubstringSortOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check If String Is Transformable With Substring Sort Operations");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfStringIsTransformableWithSubstringSortOperations ===");
        CheckIfStringIsTransformableWithSubstringSortOperations sol = new CheckIfStringIsTransformableWithSubstringSortOperations();
        System.out.println(sol.solve(null));
    }
}
