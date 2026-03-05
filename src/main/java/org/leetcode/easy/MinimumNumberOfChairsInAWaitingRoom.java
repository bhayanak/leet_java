package org.leetcode.easy;

/** MinimumNumberOfChairsInAWaitingRoom solution. */
public class MinimumNumberOfChairsInAWaitingRoom {
    /**
     * Returns the minimum number of chairs needed so no arrival has to stand.
     *
     * @param s arrival/departure log ("E" = enter, "L" = leave)
     * @return minimum number of chairs required
     *
     * <p><b>Explanation:</b> Simulates the log: increment a counter on 'E', decrement on 'L'.</p>
     *   The running maximum is the answer. Time O(n), Space O(1).
     */
    public int minimumChairs(String s) {
        int chairs = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == 'E') chairs++;
            else chairs--;
            max = Math.max(max, chairs);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfChairsInAWaitingRoom ===");
        MinimumNumberOfChairsInAWaitingRoom sol = new MinimumNumberOfChairsInAWaitingRoom();
        System.out.println(sol.minimumChairs("hello"));
    }
}
