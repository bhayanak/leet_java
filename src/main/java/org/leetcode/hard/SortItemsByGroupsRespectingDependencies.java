package org.leetcode.hard;


/**
 * <b>#1203 - Sort Items by Groups Respecting Dependencies</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n items each belonging to zero or one of m groups where group[i] is the group that the i-th item belongs to and it's equal to -1 if the i-th item belongs to no group. The items and the groups are zero indexed. A group can have no item belonging to it.
 *
 *
 * Return a sorted list of the items such that:
 *
 *
 * The items that belong to the same group are next to each other in the sorted list.
 *
 * There are some relations between these items where beforeItems[i] is a list containing all the items that should come before the i-th item in the sorted array (to the left of the i-th item).
 *
 * Return any solution if there is more than one solution and return an empty list if there is no solution.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3,6],[],[],[]]
 * Output: [6,3,4,1,5,2,0,7]
 *
 * Example 2:
 *
 * Input: n = 8, m = 2, group = [-1,-1,1,0,0,1,0,-1], beforeItems = [[],[6],[5],[6],[3],[],[4],[]]
 * Output: []
 * Explanation: This is the same as example 1 except that 4 needs to be before 6 in the sorted list.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m &lt;= n &lt;= 3 * 104
 *
 * group.length == beforeItems.length == n
 *
 * -1 &lt;= group[i] &lt;= m - 1
 *
 * 0 &lt;= beforeItems[i].length &lt;= n - 1
 *
 * 0 &lt;= beforeItems[i][j] &lt;= n - 1
 *
 * i != beforeItems[i][j]
 *
 * beforeItems[i] does not contain duplicates elements.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of it as a graph problem.
 * Hint 2: We need to find a topological order on the dependency graph.
 * Hint 3: Build two graphs, one for the groups and another for the items.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Graph Theory, Topological Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-items-by-groups-respecting-dependencies/">LeetCode #1203</a>
 */
public class SortItemsByGroupsRespectingDependencies {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sort Items by Groups Respecting Dependencies");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SortItemsByGroupsRespectingDependencies ===");
        SortItemsByGroupsRespectingDependencies sol = new SortItemsByGroupsRespectingDependencies();
        System.out.println(sol.solve(null));
    }
}
