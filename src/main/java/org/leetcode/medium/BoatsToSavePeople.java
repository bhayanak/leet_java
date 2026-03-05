package org.leetcode.medium;


/**
 * <b>#881 - Boats to Save People</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.
 *
 *
 * Return the minimum number of boats to carry every given person.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: people = [1,2], limit = 3
 * Output: 1
 * Explanation: 1 boat (1, 2)
 *
 * Example 2:
 *
 * Input: people = [3,2,2,1], limit = 3
 * Output: 3
 * Explanation: 3 boats (1, 2), (2) and (3)
 *
 * Example 3:
 *
 * Input: people = [3,5,3,4], limit = 5
 * Output: 4
 * Explanation: 4 boats (3), (3), (4), (5)
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= people.length &lt;= 5 * 104
 *
 * 1 &lt;= people[i] &lt;= limit &lt;= 3 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/boats-to-save-people/">LeetCode #881</a>
 */
public class BoatsToSavePeople {

    /**
     * Solves the problem: Num rescue boats.
     * Sorts the input first to enable efficient processing.
     *
     * @param people the people (int[])
     * @param limit the limit (int)
     * @return the computed int result
     */
    public int numRescueBoats(int[] people, int limit) {
        java.util.Arrays.sort(people);
        int lo = 0, hi = people.length - 1, boats = 0;
        while (lo <= hi) {
            if (people[lo] + people[hi] <= limit) lo++;
            hi--; boats++;
        }
        return boats;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BoatsToSavePeople.java &amp;&amp; java org.leetcode.medium.BoatsToSavePeople</pre>
     */
    public static void main(String[] args) {
        BoatsToSavePeople sol = new BoatsToSavePeople();
                System.out.println(sol.numRescueBoats(new int[]{1,2}, 3));       // 1
                System.out.println(sol.numRescueBoats(new int[]{3,2,2,1}, 3));  // 3
                System.out.println(sol.numRescueBoats(new int[]{3,5,3,4}, 5));  // 4
    }
}
