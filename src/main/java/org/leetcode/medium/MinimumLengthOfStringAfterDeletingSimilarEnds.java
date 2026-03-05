package org.leetcode.medium;


/**
 * <b>#1750 - Minimum Length of String After Deleting Similar Ends</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:
 *
 *
 * Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
 *
 * Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
 *
 * The prefix and the suffix should not intersect at any index.
 *
 * The characters from the prefix and suffix must be the same.
 *
 * Delete both the prefix and the suffix.
 *
 * Return the minimum length of s after performing the above operation any number of times (possibly zero times).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ca"
 * Output: 2
 * Explanation: You can't remove any characters, so the string stays as is.
 *
 * Example 2:
 *
 * Input: s = "cabaabac"
 * Output: 0
 * Explanation: An optimal sequence of operations is:
 * - Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
 * - Take prefix = "a" and suffix = "a" and remove them, s = "baab".
 * - Take prefix = "b" and suffix = "b" and remove them, s = "aa".
 * - Take prefix = "a" and suffix = "a" and remove them, s = "".
 *
 * Example 3:
 *
 * Input: s = "aabccabba"
 * Output: 3
 * Explanation: An optimal sequence of operations is:
 * - Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
 * - Take prefix = "b" and suffix = "bb" and remove them, s = "cca".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s only consists of characters 'a', 'b', and 'c'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If both ends have distinct characters, no more operations can be made. Otherwise, the only operation is to remove all of the same characters from both ends. We will do this as many times as we can.
 * Hint 2: Note that if the length is equal 1 the answer is 1
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/">LeetCode #1750</a>
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Length of String After Deleting Similar Ends");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumLengthOfStringAfterDeletingSimilarEnds ===");
        MinimumLengthOfStringAfterDeletingSimilarEnds sol = new MinimumLengthOfStringAfterDeletingSimilarEnds();
        System.out.println(sol.solve(null));
    }
}
