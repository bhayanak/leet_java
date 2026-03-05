package org.leetcode.medium;


/**
 * <b>#3039 - Apply Operations to Make String Empty</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s.
 *
 *
 * Consider performing the following operation until s becomes empty:
 *
 *
 * For every alphabet character from 'a' to 'z', remove the first occurrence of that character in s (if it exists).
 *
 * For example, let initially s = "aabcbbca". We do the following operations:
 *
 *
 * Remove the underlined characters s = "aabcbbca". The resulting string is s = "abbca".
 *
 * Remove the underlined characters s = "abbca". The resulting string is s = "ba".
 *
 * Remove the underlined characters s = "ba". The resulting string is s = "".
 *
 * Return the value of the string s right before applying the last operation. In the example above, answer is "ba".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aabcbbca"
 * Output: "ba"
 * Explanation: Explained in the statement.
 *
 * Example 2:
 *
 * Input: s = "abcd"
 * Output: "abcd"
 * Explanation: We do the following operation:
 * - Remove the underlined characters s = "abcd". The resulting string is s = "".
 * The string just before the last operation is "abcd".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 5 * 105
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Before the last operation, only the most frequent characters in the original string will remain.
 * Hint 2: Keep only the last occurence of each of the most frequent characters.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Counting).
 *
 * @see <a href="https://leetcode.com/problems/apply-operations-to-make-string-empty/">LeetCode #3039</a>
 */
public class ApplyOperationsToMakeStringEmpty {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Apply Operations to Make String Empty");
    }

    public static void main(String[] args) {
        System.out.println("=== ApplyOperationsToMakeStringEmpty ===");
        ApplyOperationsToMakeStringEmpty sol = new ApplyOperationsToMakeStringEmpty();
        System.out.println(sol.solve(null));
    }
}
