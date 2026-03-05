package org.leetcode.hard;


/**
 * <b>#2983 - Palindrome Rearrangement Queries</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s having an even length n.
 *
 *
 * You are also given a 0-indexed 2D integer array, queries, where queries[i] = [ai, bi, ci, di].
 *
 *
 * For each query i, you are allowed to perform the following operations:
 *
 *
 * Rearrange the characters within the substring s[ai:bi], where 0 &lt;= ai &lt;= bi &lt; n / 2.
 *
 * Rearrange the characters within the substring s[ci:di], where n / 2 &lt;= ci &lt;= di &lt; n.
 *
 * For each query, your task is to determine whether it is possible to make s a palindrome by performing the operations.
 *
 *
 * Each query is answered independently of the others.
 *
 *
 * Return a 0-indexed array answer, where answer[i] == true if it is possible to make s a palindrome by performing operations specified by the ith query, and false otherwise.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * s[x:y] represents the substring consisting of characters from the index x to index y in s, both inclusive.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabc", queries = [[1,1,3,5],[0,2,5,5]]
 * Output: [true,true]
 * Explanation: In this example, there are two queries:
 * In the first query:
 * - a0 = 1, b0 = 1, c0 = 3, d0 = 5.
 * - So, you are allowed to rearrange s[1:1] =&gt; abcabc and s[3:5] =&gt; abcabc.
 * - To make s a palindrome, s[3:5] can be rearranged to become =&gt; abccba.
 * - Now, s is a palindrome. So, answer[0] = true.
 * In the second query:
 * - a1 = 0, b1 = 2, c1 = 5, d1 = 5.
 * - So, you are allowed to rearrange s[0:2] =&gt; abcabc and s[5:5] =&gt; abcabc.
 * - To make s a palindrome, s[0:2] can be rearranged to become =&gt; cbaabc.
 * - Now, s is a palindrome. So, answer[1] = true.
 *
 * Example 2:
 *
 * Input: s = "abbcdecbba", queries = [[0,2,7,9]]
 * Output: [false]
 * Explanation: In this example, there is only one query.
 * a0 = 0, b0 = 2, c0 = 7, d0 = 9.
 * So, you are allowed to rearrange s[0:2] =&gt; abbcdecbba and s[7:9] =&gt; abbcdecbba.
 * It is not possible to make s a palindrome by rearranging these substrings because s[3:6] is not a palindrome.
 * So, answer[0] = false.
 *
 * Example 3:
 *
 * Input: s = "acbcab", queries = [[1,2,4,5]]
 * Output: [true]
 * Explanation: In this example, there is only one query.
 * a0 = 1, b0 = 2, c0 = 4, d0 = 5.
 * So, you are allowed to rearrange s[1:2] =&gt; acbcab and s[4:5] =&gt; acbcab.
 * To make s a palindrome s[1:2] can be rearranged to become abccab.
 * Then, s[4:5] can be rearranged to become abccba.
 * Now, s is a palindrome. So, answer[0] = true.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == s.length &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i].length == 4
 *
 * ai == queries[i][0], bi == queries[i][1]
 *
 * ci == queries[i][2], di == queries[i][3]
 *
 * 0 &lt;= ai &lt;= bi &lt; n / 2
 *
 * n / 2 &lt;= ci &lt;= di &lt; n 
 *
 * n is even.
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider two indices, <code>x</code> on the left side and its symmetrical index <code>y</code> on the right side.
 * Hint 2: Store the frequencies of all of the letters in both intervals <code>[a<sub>i</sub>, b<sub>i</sub>]</code> and <code>[c<sub>i</sub>, d<sub>i</sub>]</code> in a query.
 * Hint 3: If <code>x</code> is not in <code>[a<sub>i</sub>, b<sub>i</sub>]</code> and <code>y</code> is not in <code>[c<sub>i</sub>, d<sub>i</sub>]</code>, they must be the same.
 * Hint 4: If <code>x</code> is in <code>[a<sub>i</sub>, b<sub>i</sub>]</code> and <code>y</code> is not in <code>[c<sub>i</sub>, d<sub>i</sub>]</code>, remove one occurrence of the character at index <code>y</code> from the frequency array on the left side.
 * Hint 5: Similarly, if <code>x</code> is not in <code>[a<sub>i</sub>, b<sub>i</sub>]</code> and <code>y</code> is in <code>[c<sub>i</sub>, d<sub>i</sub>]</code>, remove one occurrence of the character at index <code>x</code> from the frequency array on the right side.
 * Hint 6: Finally, check whether the two frequency arrays are the same, and the indices that don't fall into any of the intervals are the same as well.
 * Hint 7: Use prefix-sum + hashing to improve the time complexity.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/palindrome-rearrangement-queries/">LeetCode #2983</a>
 */
public class PalindromeRearrangementQueries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Palindrome Rearrangement Queries");
    }

    public static void main(String[] args) {
        System.out.println("=== PalindromeRearrangementQueries ===");
        PalindromeRearrangementQueries sol = new PalindromeRearrangementQueries();
        System.out.println(sol.solve(null));
    }
}
