package org.leetcode.easy;


/**
 * <b>#3206 - Alternating Groups I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a circle of red and blue tiles. You are given an array of integers colors. The color of tile i is represented by colors[i]:
 *
 *
 * colors[i] == 0 means that tile i is red.
 *
 * colors[i] == 1 means that tile i is blue.
 *
 * Every 3 contiguous tiles in the circle with alternating colors (the middle tile has a different color from its left and right tiles) is called an alternating group.
 *
 *
 * Return the number of alternating groups.
 *
 *
 * Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: colors = [1,1,1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * Example 2:
 *
 * Input: colors = [0,1,0,0,1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * Alternating groups:
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= colors.length &lt;= 100
 *
 * 0 &lt;= colors[i] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each tile, check that the previous and the next tile have different colors from that tile or not.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/alternating-groups-i/">LeetCode #3206</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class AlternatingGroupsI {

    /**
     * Solves the problem: Number of alternating groups.
     *
     * @param colors the colors (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int numberOfAlternatingGroups(int[] colors) {
        int cnt=0, n=colors.length;
        for (int i=0;i<n;i++) if (colors[i]!=colors[(i+1)%n]&&colors[(i+1)%n]!=colors[(i+2)%n]) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        AlternatingGroupsI sol = new AlternatingGroupsI();
        System.out.println(sol.numberOfAlternatingGroups(new int[]{1,2,3}));
    }
}
