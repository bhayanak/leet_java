package org.leetcode.medium;


/**
 * <b>#825 - Friends Of Appropriate Ages</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n persons on a social media website. You are given an integer array ages where ages[i] is the age of the ith person.
 *
 *
 * A Person x will not send a friend request to a person y (x != y) if any of the following conditions is true:
 *
 *
 * age[y] &lt;= 0.5 * age[x] + 7
 *
 * age[y] &gt; age[x]
 *
 * age[y] &gt; 100 &amp;&amp; age[x] &lt; 100
 *
 * Otherwise, x will send a friend request to y.
 *
 *
 * Note that if x sends a request to y, y will not necessarily send a request to x. Also, a person will not send a friend request to themself.
 *
 *
 * Return the total number of friend requests made.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: ages = [16,16]
 * Output: 2
 * Explanation: 2 people friend request each other.
 *
 * Example 2:
 *
 * Input: ages = [16,17,18]
 * Output: 2
 * Explanation: Friend requests are made 17 -&gt; 16, 18 -&gt; 17.
 *
 * Example 3:
 *
 * Input: ages = [20,30,100,110,120]
 * Output: 3
 * Explanation: Friend requests are made 110 -&gt; 100, 120 -&gt; 110, 120 -&gt; 100.
 *
 *
 *
 * Constraints:
 *
 *
 * n == ages.length
 *
 * 1 &lt;= n &lt;= 2 * 104
 *
 * 1 &lt;= ages[i] &lt;= 120
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/friends-of-appropriate-ages/">LeetCode #825</a>
 */
public class FriendsOfAppropriateAges {

    /**
     * TODO: Implement "Friends Of Appropriate Ages".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Friends Of Appropriate Ages");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FriendsOfAppropriateAges.java &amp;&amp; java org.leetcode.medium.FriendsOfAppropriateAges</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FriendsOfAppropriateAges ===");
        FriendsOfAppropriateAges sol = new FriendsOfAppropriateAges();
        System.out.println(sol.solve(null));
    }
}
