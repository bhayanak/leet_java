package org.leetcode.medium;


/**
 * <b>#1817 - Finding the Users Active Minutes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the logs for users' actions on LeetCode, and an integer k. The logs are represented by a 2D integer array logs where each logs[i] = [IDi, timei] indicates that the user with IDi performed an action at the minute timei.
 *
 *
 * Multiple users can perform actions simultaneously, and a single user can perform multiple actions in the same minute.
 *
 *
 * The user active minutes (UAM) for a given user is defined as the number of unique minutes in which the user performed an action on LeetCode. A minute can only be counted once, even if multiple actions occur during it.
 *
 *
 * You are to calculate a 1-indexed array answer of size k such that, for each j (1 &lt;= j &lt;= k), answer[j] is the number of users whose UAM equals j.
 *
 *
 * Return the array answer as described above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
 * Output: [0,2,0,0,0]
 * Explanation:
 * The user with ID=0 performed actions at minutes 5, 2, and 5 again. Hence, they have a UAM of 2 (minute 5 is only counted once).
 * The user with ID=1 performed actions at minutes 2 and 3. Hence, they have a UAM of 2.
 * Since both users have a UAM of 2, answer[2] is 2, and the remaining answer[j] values are 0.
 *
 * Example 2:
 *
 * Input: logs = [[1,1],[2,2],[2,3]], k = 4
 * Output: [1,1,0,0]
 * Explanation:
 * The user with ID=1 performed a single action at minute 1. Hence, they have a UAM of 1.
 * The user with ID=2 performed actions at minutes 2 and 3. Hence, they have a UAM of 2.
 * There is one user with a UAM of 1 and one with a UAM of 2.
 * Hence, answer[1] = 1, answer[2] = 1, and the remaining values are 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= logs.length &lt;= 104
 *
 * 0 &lt;= IDi &lt;= 109
 *
 * 1 &lt;= timei &lt;= 105
 *
 * k is in the range [The maximum UAM for a user, 105].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to find the number of different minutes when action happened for each user.
 * Hint 2: For each user increase the value of the answer array index which matches the UAM for this user.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/finding-the-users-active-minutes/">LeetCode #1817</a>
 */
public class FindingTheUsersActiveMinutes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Finding the Users Active Minutes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindingTheUsersActiveMinutes ===");
        FindingTheUsersActiveMinutes sol = new FindingTheUsersActiveMinutes();
        System.out.println(sol.solve(null));
    }
}
