package org.leetcode.medium;


/**
 * <b>#911 - Online Election</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Design</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays persons and times. In an election, the ith vote was cast for persons[i] at time times[i].
 *
 *
 * For each query at a time t, find the person that was leading the election at time t. Votes cast at time t will count towards our query. In the case of a tie, the most recent vote (among tied candidates) wins.
 *
 *
 * Implement the TopVotedCandidate class:
 *
 *
 * TopVotedCandidate(int[] persons, int[] times) Initializes the object with the persons and times arrays.
 *
 * int q(int t) Returns the number of the person that was leading the election at time t according to the mentioned rules.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["TopVotedCandidate", "q", "q", "q", "q", "q", "q"]
 * [[[0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]], [3], [12], [25], [15], [24], [8]]
 * Output
 * [null, 0, 1, 1, 0, 0, 1]
 *
 * Explanation
 * TopVotedCandidate topVotedCandidate = new TopVotedCandidate([0, 1, 1, 0, 0, 1, 0], [0, 5, 10, 15, 20, 25, 30]);
 * topVotedCandidate.q(3); // return 0, At time 3, the votes are [0], and 0 is leading.
 * topVotedCandidate.q(12); // return 1, At time 12, the votes are [0,1,1], and 1 is leading.
 * topVotedCandidate.q(25); // return 1, At time 25, the votes are [0,1,1,0,0,1], and 1 is leading (as ties go to the most recent vote.)
 * topVotedCandidate.q(15); // return 0
 * topVotedCandidate.q(24); // return 0
 * topVotedCandidate.q(8); // return 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= persons.length &lt;= 5000
 *
 * times.length == persons.length
 *
 * 0 &lt;= persons[i] &lt; persons.length
 *
 * 0 &lt;= times[i] &lt;= 109
 *
 * times is sorted in a strictly increasing order.
 *
 * times[0] &lt;= t &lt;= 109
 *
 * At most 104 calls will be made to q.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Design).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/online-election/">LeetCode #911</a>
 */
public class OnlineElection {

    /**
     * TODO: Implement "Online Election".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Online Election");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac OnlineElection.java &amp;&amp; java org.leetcode.medium.OnlineElection</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== OnlineElection ===");
        OnlineElection sol = new OnlineElection();
        System.out.println(sol.solve(null));
    }
}
