package org.leetcode.medium;


/**
 * <b>#1980 - Find Unique Binary String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = ["01","10"]
 * Output: "11"
 * Explanation: "11" does not appear in nums. "00" would also be correct.
 *
 * Example 2:
 *
 * Input: nums = ["00","01"]
 * Output: "11"
 * Explanation: "11" does not appear in nums. "10" would also be correct.
 *
 * Example 3:
 *
 * Input: nums = ["111","011","001"]
 * Output: "101"
 * Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= n &lt;= 16
 *
 * nums[i].length == n
 *
 * nums[i] is either '0' or '1'.
 *
 * All the strings of nums are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can convert the given strings into base 10 integers.
 * Hint 2: Can we use recursion to generate all possible strings?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-unique-binary-string/">LeetCode #1980</a>
 */
public class FindUniqueBinaryString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Unique Binary String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindUniqueBinaryString ===");
        FindUniqueBinaryString sol = new FindUniqueBinaryString();
        System.out.println(sol.solve(null));
    }
}
