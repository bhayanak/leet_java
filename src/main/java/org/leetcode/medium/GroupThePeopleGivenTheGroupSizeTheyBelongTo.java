package org.leetcode.medium;


/**
 * <b>#1282 - Group the People Given the Group Size They Belong To</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.
 *
 *
 * You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
 *
 *
 * Return a list of groups such that each person i is in a group of size groupSizes[i].
 *
 *
 * Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers, return any of them. It is guaranteed that there will be at least one valid solution for the given input.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: groupSizes = [3,3,3,3,3,1,3]
 * Output: [[5],[0,1,2],[3,4,6]]
 * Explanation: 
 * The first group is [5]. The size is 1, and groupSizes[5] = 1.
 * The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
 * The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
 * Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
 *
 * Example 2:
 *
 * Input: groupSizes = [2,1,3,3,3,2]
 * Output: [[1],[0,5],[2,3,4]]
 *
 *
 *
 * Constraints:
 *
 *
 * groupSizes.length == n
 *
 * 1 &lt;= n &lt;= 500
 *
 * 1 &lt;= groupSizes[i] &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Put people's IDs with same groupSize into buckets, then split each bucket into groups.
 * Hint 2: Greedy fill until you need a new group.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/">LeetCode #1282</a>
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Group the People Given the Group Size They Belong To");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== GroupThePeopleGivenTheGroupSizeTheyBelongTo ===");
        GroupThePeopleGivenTheGroupSizeTheyBelongTo sol = new GroupThePeopleGivenTheGroupSizeTheyBelongTo();
        System.out.println(sol.solve(null));
    }
}
