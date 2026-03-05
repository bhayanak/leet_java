package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountDistinctNumbersOnBoard solution. */
public class CountDistinctNumbersOnBoard {

    /**
     * Counts distinct numbers on the board after n days.
     * Starts with {n}; each day adds all x in 2..n where n % x == 0.
     * For n &gt; 1 the result always equals n-1.
     * @param n starting number
     * @return count of distinct numbers on board after n days
     * <p><b>Explanation:</b> Mathematical insight: after enough days every integer 2..n appears.</p>
     */
    public int solve(int n) {
        return n == 1 ? 1 : n - 1;
    }

    public static void main(String[] args) {
        CountDistinctNumbersOnBoard sol = new CountDistinctNumbersOnBoard();
        System.out.println(sol.solve(5)); // 4
        System.out.println(sol.solve(3)); // 2
        System.out.println(sol.solve(1)); // 1
    }

}
