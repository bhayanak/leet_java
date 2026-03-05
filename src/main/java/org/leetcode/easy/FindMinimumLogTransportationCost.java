package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FindMinimumLogTransportationCost solution. */
public class FindMinimumLogTransportationCost {

    /**
     * Finds the minimum cost to transport a log of length m on a truck of length n.
     * If m &lt;= n/2, no cutting needed (cost 0). Otherwise cost = m - n/2.
     * @param n truck length
     * @param m log length
     * @return minimum transportation cost
     * <p><b>Explanation:</b> Direct formula: max(0, m - n/2).</p>
     */
    public long solve(long n, long m) {
        return Math.max(0L, m - n / 2);
    }

    public static void main(String[] args) {
        FindMinimumLogTransportationCost sol = new FindMinimumLogTransportationCost();
        System.out.println(sol.solve(10, 3)); // 0  (3 <= 5)
        System.out.println(sol.solve(10, 6)); // 1  (6 - 5)
    }

}
