package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MinimumCostToReachEveryPosition solution. */
public class MinimumCostToReachEveryPosition {

    /**
     * Returns an array where ans[i] = minimum cost to reach position i.
     * cost[i] is the cost to pass through position i.
     * The minimum cost to reach i from the start is min(cost[0..i]).
     * @param cost array of costs
     * @return array of minimum prefix costs
     * <p><b>Explanation:</b> Running prefix minimum: ans[i] = min(cost[0], ..., cost[i]).</p>
     */
    public int[] solve(int[] cost) {
        int[] ans = new int[cost.length];
        int minSoFar = Integer.MAX_VALUE;
        for (int i = 0; i < cost.length; i++) {
            minSoFar = Math.min(minSoFar, cost[i]);
            ans[i] = minSoFar;
        }
        return ans;
    }

    public static void main(String[] args) {
        MinimumCostToReachEveryPosition sol = new MinimumCostToReachEveryPosition();
        System.out.println(Arrays.toString(sol.solve(new int[]{5,3,4,1,2}))); // [5,3,3,1,1]
    }

}
