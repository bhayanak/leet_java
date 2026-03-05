package org.leetcode.easy;


/**
 * <b>#1560 - Most Visited Sector in  a Circular Track</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n and an integer array rounds. We have a circular track which consists of n sectors labeled from 1 to n. A marathon will be held on this track, the marathon consists of m rounds. The ith round starts at sector rounds[i - 1] and ends at sector rounds[i]. For example, round 1 starts at sector rounds[0] and ends at sector rounds[1]
 *
 *
 * Return an array of the most visited sectors sorted in ascending order.
 *
 *
 * Notice that you circulate the track in ascending order of sector numbers in the counter-clockwise direction (See the first example).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, rounds = [1,3,1,2]
 * Output: [1,2]
 * Explanation: The marathon starts at sector 1. The order of the visited sectors is as follows:
 * 1 --&gt; 2 --&gt; 3 (end of round 1) --&gt; 4 --&gt; 1 (end of round 2) --&gt; 2 (end of round 3 and the marathon)
 * We can see that both sectors 1 and 2 are visited twice and they are the most visited sectors. Sectors 3 and 4 are visited only once.
 *
 * Example 2:
 *
 * Input: n = 2, rounds = [2,1,2,1,2,1,2,1,2]
 * Output: [2]
 *
 * Example 3:
 *
 * Input: n = 7, rounds = [1,3,5,7]
 * Output: [1,2,3,4,5,6,7]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 100
 *
 * 1 &lt;= m &lt;= 100
 *
 * rounds.length == m + 1
 *
 * 1 &lt;= rounds[i] &lt;= n
 *
 * rounds[i] != rounds[i + 1] for 0 &lt;= i &lt; m
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each round increment the visits of the sectors visited during the marathon with 1.
 * Hint 2: Determine the max number of visits, and return any sector visited the max number of visits.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/most-visited-sector-in-a-circular-track/">LeetCode #1560</a>
 */
public class MostVisitedSectorInACircularTrack {

    public java.util.List<Integer> mostVisited(int n, int[] rounds) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        int start=rounds[0], end=rounds[rounds.length-1];
        if (start<=end) {
            for (int i=start;i<=end;i++) res.add(i);
        } else {
            for (int i=1;i<=end;i++) res.add(i);
            for (int i=start;i<=n;i++) res.add(i);
        }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MostVisitedSectorInACircularTrack sol = new MostVisitedSectorInACircularTrack();
        System.out.println("No method available");
    }
}
