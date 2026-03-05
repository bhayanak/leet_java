package org.leetcode.easy;


/**
 * <b>#1854 - Maximum Population Year</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Counting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
 *
 *
 * The population of some year x is the number of people alive during that year. The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. Note that the person is not counted in the year that they die.
 *
 *
 * Return the earliest year with the maximum population.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: logs = [[1993,1999],[2000,2010]]
 * Output: 1993
 * Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
 *
 * Example 2:
 *
 * Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
 * Output: 1960
 * Explanation: 
 * The maximum population is 2, and it had happened in years 1960 and 1970.
 * The earlier year between them is 1960.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= logs.length &lt;= 100
 *
 * 1950 &lt;= birthi &lt; deathi &lt;= 2050
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each year find the number of people whose birth_i ≤ year and death_i &gt; year.
 * Hint 2: Find the maximum value between all years.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Counting, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-population-year/">LeetCode #1854</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumPopulationYear {

    /**
     * Solves the problem: Maximum population.
     *
     * @param logs the logs (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for (int[] l:logs) { years[l[0]-1950]++; years[l[1]-1950]--; }
        int maxPop=0, bestYear=1950, cur=0;
        for (int i=0;i<101;i++) {
            cur+=years[i];
            if (cur>maxPop) { maxPop=cur; bestYear=1950+i; }
        }
        return bestYear;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MaximumPopulationYear sol = new MaximumPopulationYear();
                System.out.println(sol.maximumPopulation(new int[][]{{1993,1999},{2000,2010}})); // 1993
                System.out.println(sol.maximumPopulation(new int[][]{{1950,1961},{1960,1971},{1970,1981}})); // 1960
    }
}
