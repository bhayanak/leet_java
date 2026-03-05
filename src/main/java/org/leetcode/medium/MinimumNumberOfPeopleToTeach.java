package org.leetcode.medium;


/**
 * <b>#1733 - Minimum Number of People to Teach</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * On a social network consisting of m users and some friendships between users, two users can communicate with each other if they know a common language.
 *
 *
 * You are given an integer n, an array languages, and an array friendships where:
 *
 *
 * There are n languages numbered 1 through n,
 *
 * languages[i] is the set of languages the i​​​​​​th​​​​ user knows, and
 *
 * friendships[i] = [u​​​​​​i​​​, v​​​​​​i] denotes a friendship between the users u​​​​​​​​​​​i​​​​​ and vi.
 *
 * You can choose one language and teach it to some users so that all friends can communicate with each other. Return the minimum number of users you need to teach.
 * Note that friendships are not transitive, meaning if x is a friend of y and y is a friend of z, this doesn't guarantee that x is a friend of z.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, languages = [[1],[2],[1,2]], friendships = [[1,2],[1,3],[2,3]]
 * Output: 1
 * Explanation: You can either teach user 1 the second language or user 2 the first language.
 *
 * Example 2:
 *
 * Input: n = 3, languages = [[2],[1,3],[1,2],[3]], friendships = [[1,4],[1,2],[3,4],[2,3]]
 * Output: 2
 * Explanation: Teach the third language to users 1 and 3, yielding two users to teach.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 500
 *
 * languages.length == m
 *
 * 1 &lt;= m &lt;= 500
 *
 * 1 &lt;= languages[i].length &lt;= n
 *
 * 1 &lt;= languages[i][j] &lt;= n
 *
 * 1 &lt;= u​​​​​​i &lt; v​​​​​​i &lt;= languages.length
 *
 * 1 &lt;= friendships.length &lt;= 500
 *
 * All tuples (u​​​​​i, v​​​​​​i) are unique
 *
 * languages[i] contains only unique values
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can just use brute force and find out for each language the number of users you need to teach
 * Hint 2: Note that a user can appear in multiple friendships but you need to teach that user only once
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-people-to-teach/">LeetCode #1733</a>
 */
public class MinimumNumberOfPeopleToTeach {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of People to Teach");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfPeopleToTeach ===");
        MinimumNumberOfPeopleToTeach sol = new MinimumNumberOfPeopleToTeach();
        System.out.println(sol.solve(null));
    }
}
