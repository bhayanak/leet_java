package org.leetcode.medium;


/**
 * <b>#2405 - Optimal Partition of String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, partition the string into one or more substrings such that the characters in each substring are unique. That is, no letter appears in a single substring more than once.
 *
 *
 * Return the minimum number of substrings in such a partition.
 *
 *
 * Note that each character should belong to exactly one substring in a partition.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abacaba"
 * Output: 4
 * Explanation:
 * Two possible partitions are ("a","ba","cab","a") and ("ab","a","ca","ba").
 * It can be shown that 4 is the minimum number of substrings needed.
 *
 * Example 2:
 *
 * Input: s = "ssssss"
 * Output: 6
 * Explanation:
 * The only valid partition is ("s","s","s","s","s","s").
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of only English lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to come up with a greedy approach.
 * Hint 2: From left to right, extend every substring in the partition as much as possible.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/optimal-partition-of-string/">LeetCode #2405</a>
 */
public class OptimalPartitionOfString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Optimal Partition of String");
    }

    public static void main(String[] args) {
        System.out.println("=== OptimalPartitionOfString ===");
        OptimalPartitionOfString sol = new OptimalPartitionOfString();
        System.out.println(sol.solve(null));
    }
}
