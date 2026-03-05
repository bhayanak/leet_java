package org.leetcode.easy;

/** ButtonWithLongestPushTime solution. */
public class ButtonWithLongestPushTime {
    /**
     * Returns the key with the longest push duration across all events.
     *
     * @param events array of [time, key] events sorted by time
     * @return the key with the maximum individual press duration
     *
     * <p><b>Explanation:</b> For each event, duration = time[i] - time[i-1] (first event uses time[0]).</p>
     *   Tracks the maximum duration and its associated key. Time O(n), Space O(1).
     */
    public int hardestWorker(int n, int[][] events) {
        int maxDur = 0, result = 0;
        for (int i = 0; i < events.length; i++) {
            int dur = events[i][0] - (i > 0 ? events[i-1][0] : 0);
            if (dur > maxDur || (dur == maxDur && events[i][1] < result)) {
                maxDur = dur; result = events[i][1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("=== ButtonWithLongestPushTime ===");
        ButtonWithLongestPushTime sol = new ButtonWithLongestPushTime();
        System.out.println(sol.hardestWorker(3, new int[][]{{1,2},{3,4}}));
    }
}
