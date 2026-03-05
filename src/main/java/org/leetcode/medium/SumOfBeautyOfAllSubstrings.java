package org.leetcode.medium;


/**
 * <b>#1781 - Sum of Beauty of All Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.
 *
 *
 * For example, the beauty of "abaacc" is 3 - 1 = 2.
 *
 * Given a string s, return the sum of beauty of all of its substrings.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aabcb"
 * Output: 5
 * Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
 *
 * Example 2:
 *
 * Input: s = "aabcbaa"
 * Output: 17
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain a prefix sum for the frequencies of characters.
 * Hint 2: You can iterate over all substring then iterate over the alphabet and find which character appears most and which appears least using the prefix sum array
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-beauty-of-all-substrings/">LeetCode #1781</a>
 */
public class SumOfBeautyOfAllSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Beauty of All Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfBeautyOfAllSubstrings ===");
        SumOfBeautyOfAllSubstrings sol = new SumOfBeautyOfAllSubstrings();
        System.out.println(sol.solve(null));
    }
}
