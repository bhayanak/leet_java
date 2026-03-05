package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** Sleep solution. */
public class Sleep {

    /**
     * Java equivalent of JS sleep(millis): pauses execution for the given duration.
     * Returns the elapsed time in milliseconds (always &gt;= millis).
     * @param millis sleep duration
     * @return actual elapsed milliseconds
     * <p><b>Explanation:</b> Use Thread.sleep; catch InterruptedException; measure wall time.</p>
     */
    public long solve(long millis) {
        long start = System.currentTimeMillis();
        try { Thread.sleep(millis); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        return System.currentTimeMillis() - start;
    }

    public static void main(String[] args) {
        Sleep sol = new Sleep();
        long elapsed = sol.solve(50);
        System.out.println(elapsed >= 50); // true
    }

}
