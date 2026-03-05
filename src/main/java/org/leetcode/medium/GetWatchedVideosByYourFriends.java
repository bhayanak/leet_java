package org.leetcode.medium;


/**
 * <b>#1311 - Get Watched Videos by Your Friends</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Breadth-First Search, Graph Theory, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n people, each person has a unique id between 0 and n-1. Given the arrays watchedVideos and friends, where watchedVideos[i] and friends[i] contain the list of watched videos and the list of friends respectively for the person with id = i.
 *
 *
 * Level 1 of videos are all watched videos by your friends, level 2 of videos are all watched videos by the friends of your friends and so on. In general, the level k of videos are all watched videos by people with the shortest path exactly equal to k with you. Given your id and the level of videos, return the list of videos ordered by their frequencies (increasing). For videos with the same frequency order them alphabetically from least to greatest. 
 *
 *
 *
 *
 * Example 1:
 *
 * Input: watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 1
 * Output: ["B","C"] 
 * Explanation: 
 * You have id = 0 (green color in the figure) and your friends are (yellow color in the figure):
 * Person with id = 1 -&gt; watchedVideos = ["C"] 
 * Person with id = 2 -&gt; watchedVideos = ["B","C"] 
 * The frequencies of watchedVideos by your friends are: 
 * B -&gt; 1 
 * C -&gt; 2
 *
 * Example 2:
 *
 * Input: watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 2
 * Output: ["D"]
 * Explanation: 
 * You have id = 0 (green color in the figure) and the only friend of your friends is the person with id = 3 (yellow color in the figure).
 *
 *
 *
 * Constraints:
 *
 *
 * n == watchedVideos.length == friends.length
 *
 * 2 &lt;= n &lt;= 100
 *
 * 1 &lt;= watchedVideos[i].length &lt;= 100
 *
 * 1 &lt;= watchedVideos[i][j].length &lt;= 8
 *
 * 0 &lt;= friends[i].length &lt; n
 *
 * 0 &lt;= friends[i][j] &lt; n
 *
 * 0 &lt;= id &lt; n
 *
 * 1 &lt;= level &lt; n
 *
 * if friends[i] contains j, then friends[j] contains i
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do BFS to find the kth level friends.
 * Hint 2: Then collect movies saw by kth level friends and sort them accordingly.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Breadth-First Search, Graph Theory, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/get-watched-videos-by-your-friends/">LeetCode #1311</a>
 */
public class GetWatchedVideosByYourFriends {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Get Watched Videos by Your Friends");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== GetWatchedVideosByYourFriends ===");
        GetWatchedVideosByYourFriends sol = new GetWatchedVideosByYourFriends();
        System.out.println(sol.solve(null));
    }
}
