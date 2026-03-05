package org.leetcode.hard;


/**
 * <b>#920 - Number of Music Playlists</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Your music player contains n different songs. You want to listen to goal songs (not necessarily different) during your trip. To avoid boredom, you will create a playlist so that:
 *
 *
 * Every song is played at least once.
 *
 * A song can only be played again only if k other songs have been played.
 *
 * Given n, goal, and k, return the number of possible playlists that you can create. Since the answer can be very large, return it modulo 109 + 7.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, goal = 3, k = 1
 * Output: 6
 * Explanation: There are 6 possible playlists: [1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], and [3, 2, 1].
 *
 * Example 2:
 *
 * Input: n = 2, goal = 3, k = 0
 * Output: 6
 * Explanation: There are 6 possible playlists: [1, 1, 2], [1, 2, 1], [2, 1, 1], [2, 2, 1], [2, 1, 2], and [1, 2, 2].
 *
 * Example 3:
 *
 * Input: n = 2, goal = 3, k = 1
 * Output: 2
 * Explanation: There are 2 possible playlists: [1, 2, 1] and [2, 1, 2].
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= k &lt; n &lt;= goal &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Combinatorics).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-music-playlists/">LeetCode #920</a>
 */
public class NumberOfMusicPlaylists {

    /**
     * TODO: Implement "Number of Music Playlists".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Music Playlists");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfMusicPlaylists.java &amp;&amp; java org.leetcode.hard.NumberOfMusicPlaylists</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfMusicPlaylists ===");
        NumberOfMusicPlaylists sol = new NumberOfMusicPlaylists();
        System.out.println(sol.solve(null));
    }
}
