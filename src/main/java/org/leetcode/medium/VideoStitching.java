package org.leetcode.medium;


/**
 * <b>#1024 - Video Stitching</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a series of video clips from a sporting event that lasted time seconds. These video clips can be overlapping with each other and have varying lengths.
 *
 *
 * Each video clip is described by an array clips where clips[i] = [starti, endi] indicates that the ith clip started at starti and ended at endi.
 *
 *
 * We can cut these clips into segments freely.
 *
 *
 * For example, a clip [0, 7] can be cut into segments [0, 1] + [1, 3] + [3, 7].
 *
 * Return the minimum number of clips needed so that we can cut the clips into segments that cover the entire sporting event [0, time]. If the task is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: clips = [[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]], time = 10
 * Output: 3
 * Explanation: We take the clips [0,2], [8,10], [1,9]; a total of 3 clips.
 * Then, we can reconstruct the sporting event as follows:
 * We cut [1,9] into segments [1,2] + [2,8] + [8,9].
 * Now we have segments [0,2] + [2,8] + [8,10] which cover the sporting event [0, 10].
 *
 * Example 2:
 *
 * Input: clips = [[0,1],[1,2]], time = 5
 * Output: -1
 * Explanation: We cannot cover [0,5] with only [0,1] and [1,2].
 *
 * Example 3:
 *
 * Input: clips = [[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]], time = 9
 * Output: 3
 * Explanation: We can take clips [0,4], [4,7], and [6,9].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= clips.length &lt;= 100
 *
 * 0 &lt;= starti &lt;= endi &lt;= 100
 *
 * 1 &lt;= time &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What if we sort the intervals?  Considering the sorted intervals, how can we solve the problem with dynamic programming?
 * Hint 2: Let's consider a DP(pos, limit) where pos represents the position of the current interval we are gonna take the decision and limit is the current covered area from [0 - limit]. This DP returns the minimum number of taken intervals or infinite if it's not possible to cover the [0 - T] section.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/video-stitching/">LeetCode #1024</a>
 */
public class VideoStitching {

    /**
     * TODO: Implement "Video Stitching".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Video Stitching");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac VideoStitching.java &amp;&amp; java org.leetcode.medium.VideoStitching</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== VideoStitching ===");
        VideoStitching sol = new VideoStitching();
        System.out.println(sol.solve(null));
    }
}
