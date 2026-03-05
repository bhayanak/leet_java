package org.leetcode.hard;


/**
 * <b>#1520 - Maximum Number of Non-Overlapping Substrings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s of lowercase letters, you need to find the maximum number of non-empty substrings of s that meet the following conditions:
 *
 *
 * The substrings do not overlap, that is for any two substrings s[i..j] and s[x..y], either j &lt; x or i &gt; y is true.
 *
 * A substring that contains a certain character c must also contain all occurrences of c.
 *
 * Find the maximum number of substrings that meet the above conditions. If there are multiple solutions with the same number of substrings, return the one with minimum total length. It can be shown that there exists a unique solution of minimum total length.
 *
 *
 * Notice that you can return the substrings in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "adefaddaccc"
 * Output: ["e","f","ccc"]
 * Explanation: The following are all the possible substrings that meet the conditions:
 * [
 *   "adefaddaccc"
 *   "adefadda",
 *   "ef",
 *   "e",
 *   "f",
 *   "ccc",
 * ]
 * If we choose the first string, we cannot choose anything else and we'd get only 1. If we choose "adefadda", we are left with "ccc" which is the only one that doesn't overlap, thus obtaining 2 substrings. Notice also, that it's not optimal to choose "ef" since it can be split into two. Therefore, the optimal way is to choose ["e","f","ccc"] which gives us 3 substrings. No other solution of the same number of substrings exist.
 *
 * Example 2:
 *
 * Input: s = "abbaccd"
 * Output: ["d","bb","cc"]
 * Explanation: Notice that while the set of substrings ["d","abba","cc"] also has length 3, it's considered incorrect since it has larger total length.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that it's impossible for any two valid substrings to overlap unless one is inside another.
 * Hint 2: We can start by finding the starting and ending index for each character.
 * Hint 3: From these indices, we can form the substrings by expanding each character's range if necessary (if another character exists in the range with smaller/larger starting/ending index).
 * Hint 4: Sort the valid substrings by length and greedily take those with the smallest length, discarding the ones that overlap those we took.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-non-overlapping-substrings/">LeetCode #1520</a>
 */
public class MaximumNumberOfNonOverlappingSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Non-Overlapping Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfNonOverlappingSubstrings ===");
        MaximumNumberOfNonOverlappingSubstrings sol = new MaximumNumberOfNonOverlappingSubstrings();
        System.out.println(sol.solve(null));
    }
}
