package org.leetcode.easy;


/**
 * <b>#933 - Number of Recent Calls</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Design, Queue, Data Stream</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have a RecentCounter class which counts the number of recent requests within a certain time frame.
 *
 *
 * Implement the RecentCounter class:
 *
 *
 * RecentCounter() Initializes the counter with zero recent requests.
 *
 * int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
 *
 * It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 *
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["RecentCounter", "ping", "ping", "ping", "ping"]
 * [[], [1], [100], [3001], [3002]]
 * Output
 * [null, 1, 2, 3, 3]
 *
 * Explanation
 * RecentCounter recentCounter = new RecentCounter();
 * recentCounter.ping(1);     // requests = [1], range is [-2999,1], return 1
 * recentCounter.ping(100);   // requests = [1, 100], range is [-2900,100], return 2
 * recentCounter.ping(3001);  // requests = [1, 100, 3001], range is [1,3001], return 3
 * recentCounter.ping(3002);  // requests = [1, 100, 3001, 3002], range is [2,3002], return 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= t &lt;= 109
 *
 * Each test case will call ping with strictly increasing values of t.
 *
 * At most 104 calls will be made to ping.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Design, Queue, Data Stream).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-recent-calls/">LeetCode #933</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class NumberOfRecentCalls {

    private java.util.Queue<Integer> q = new java.util.LinkedList<>();

    /**
     * Solves the problem: Ping.
     *
     * @param t the t (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000) q.poll();
        return q.size();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfRecentCalls.java &amp;&amp; java org.leetcode.easy.NumberOfRecentCalls</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        NumberOfRecentCalls sol = new NumberOfRecentCalls();
                System.out.println(sol.ping(1));    // 1
                System.out.println(sol.ping(100));  // 2
                System.out.println(sol.ping(3001)); // 3
                System.out.println(sol.ping(3002)); // 3
    }
}
