package org.leetcode.hard;


/**
 * <b>#3093 - Longest Common Suffix Queries</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays of strings wordsContainer and wordsQuery.
 *
 *
 * For each wordsQuery[i], you need to find a string from wordsContainer that has the longest common suffix with wordsQuery[i]. If there are two or more strings in wordsContainer that share the longest common suffix, find the string that is the smallest in length. If there are two or more such strings that have the same smallest length, find the one that occurred earlier in wordsContainer.
 *
 *
 * Return an array of integers ans, where ans[i] is the index of the string in wordsContainer that has the longest common suffix with wordsQuery[i].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: wordsContainer = ["abcd","bcd","xbcd"], wordsQuery = ["cd","bcd","xyz"]
 *
 *
 * Output: [1,1,1]
 *
 *
 * Explanation:
 *
 *
 * Let's look at each wordsQuery[i] separately:
 *
 *
 * For wordsQuery[0] = "cd", strings from wordsContainer that share the longest common suffix "cd" are at indices 0, 1, and 2. Among these, the answer is the string at index 1 because it has the shortest length of 3.
 *
 * For wordsQuery[1] = "bcd", strings from wordsContainer that share the longest common suffix "bcd" are at indices 0, 1, and 2. Among these, the answer is the string at index 1 because it has the shortest length of 3.
 *
 * For wordsQuery[2] = "xyz", there is no string from wordsContainer that shares a common suffix. Hence the longest common suffix is "", that is shared with strings at index 0, 1, and 2. Among these, the answer is the string at index 1 because it has the shortest length of 3.
 *
 * Example 2:
 *
 * Input: wordsContainer = ["abcdefgh","poiuygh","ghghgh"], wordsQuery = ["gh","acbfgh","acbfegh"]
 *
 *
 * Output: [2,0,2]
 *
 *
 * Explanation:
 *
 *
 * Let's look at each wordsQuery[i] separately:
 *
 *
 * For wordsQuery[0] = "gh", strings from wordsContainer that share the longest common suffix "gh" are at indices 0, 1, and 2. Among these, the answer is the string at index 2 because it has the shortest length of 6.
 *
 * For wordsQuery[1] = "acbfgh", only the string at index 0 shares the longest common suffix "fgh". Hence it is the answer, even though the string at index 2 is shorter.
 *
 * For wordsQuery[2] = "acbfegh", strings from wordsContainer that share the longest common suffix "gh" are at indices 0, 1, and 2. Among these, the answer is the string at index 2 because it has the shortest length of 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= wordsContainer.length, wordsQuery.length &lt;= 104
 *
 * 1 &lt;= wordsContainer[i].length &lt;= 5 * 103
 *
 * 1 &lt;= wordsQuery[i].length &lt;= 5 * 103
 *
 * wordsContainer[i] consists only of lowercase English letters.
 *
 * wordsQuery[i] consists only of lowercase English letters.
 *
 * Sum of wordsContainer[i].length is at most 5 * 105.
 *
 * Sum of wordsQuery[i].length is at most 5 * 105.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we reverse the strings, the problem changes to finding the longest common prefix.
 * Hint 2: Build a Trie, each node is a letter and only saves the best word’s index in each node, based on the criteria.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Trie).
 *
 * @see <a href="https://leetcode.com/problems/longest-common-suffix-queries/">LeetCode #3093</a>
 */
public class LongestCommonSuffixQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Common Suffix Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestCommonSuffixQueries ===");
        LongestCommonSuffixQueries sol = new LongestCommonSuffixQueries();
        System.out.println(sol.solve(null));
    }
}
