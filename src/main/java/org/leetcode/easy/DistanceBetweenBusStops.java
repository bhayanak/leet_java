package org.leetcode.easy;

/** DistanceBetweenBusStops solution. */
public class DistanceBetweenBusStops {
    /**
     * Computes the minimum distance between two stops on a circular bus route.
     *
     * @param distance array of distances between consecutive stops
     * @param start    starting stop index
     * @param destination target stop index
     * @return minimum distance (clockwise or counter-clockwise)
     *
     * <p><b>Explanation:</b> Computes the clockwise arc from start to destination then takes</p>
     *   the minimum with the counter-clockwise arc (total - clockwise). Time O(n), Space O(1).
     */
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) { int t = start; start = destination; destination = t; }
        int total = 0, partial = 0;
        for (int i = 0; i < distance.length; i++) {
            total += distance[i];
            if (i >= start && i < destination) partial += distance[i];
        }
        return Math.min(partial, total - partial);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DistanceBetweenBusStops.java &amp;&amp; java org.leetcode.easy.DistanceBetweenBusStops</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== DistanceBetweenBusStops ===");
        DistanceBetweenBusStops sol = new DistanceBetweenBusStops();
        System.out.println(sol.distanceBetweenBusStops(new int[]{1,2,3}, 3, 3));
    }
}
