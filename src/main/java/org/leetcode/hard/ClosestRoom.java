package org.leetcode.hard;


/**
 * <b>#1847 - Closest Room</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a hotel with n rooms. The rooms are represented by a 2D integer array rooms where rooms[i] = [roomIdi, sizei] denotes that there is a room with room number roomIdi and size equal to sizei. Each roomIdi is guaranteed to be unique.
 *
 *
 * You are also given k queries in a 2D array queries where queries[j] = [preferredj, minSizej]. The answer to the jth query is the room number id of a room such that:
 *
 *
 * The room has a size of at least minSizej, and
 *
 * abs(id - preferredj) is minimized, where abs(x) is the absolute value of x.
 *
 * If there is a tie in the absolute difference, then use the room with the smallest such id. If there is no such room, the answer is -1.
 *
 *
 * Return an array answer of length k where answer[j] contains the answer to the jth query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rooms = [[2,2],[1,2],[3,2]], queries = [[3,1],[3,3],[5,2]]
 * Output: [3,-1,3]
 * Explanation: The answers to the queries are as follows:
 * Query = [3,1]: Room number 3 is the closest as abs(3 - 3) = 0, and its size of 2 is at least 1. The answer is 3.
 * Query = [3,3]: There are no rooms with a size of at least 3, so the answer is -1.
 * Query = [5,2]: Room number 3 is the closest as abs(3 - 5) = 2, and its size of 2 is at least 2. The answer is 3.
 *
 * Example 2:
 *
 * Input: rooms = [[1,4],[2,3],[3,5],[4,1],[5,2]], queries = [[2,3],[2,4],[2,5]]
 * Output: [2,1,3]
 * Explanation: The answers to the queries are as follows:
 * Query = [2,3]: Room number 2 is the closest as abs(2 - 2) = 0, and its size of 3 is at least 3. The answer is 2.
 * Query = [2,4]: Room numbers 1 and 3 both have sizes of at least 4. The answer is 1 since it is smaller.
 * Query = [2,5]: Room number 3 is the only room with a size of at least 5. The answer is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * n == rooms.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * k == queries.length
 *
 * 1 &lt;= k &lt;= 104
 *
 * 1 &lt;= roomIdi, preferredj &lt;= 107
 *
 * 1 &lt;= sizei, minSizej &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is there a way to sort the queries so it's easier to search the closest room larger than the size?
 * Hint 2: Use binary search to speed up the search time.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting, Ordered Set).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/closest-room/">LeetCode #1847</a>
 */
public class ClosestRoom {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Closest Room");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ClosestRoom ===");
        ClosestRoom sol = new ClosestRoom();
        System.out.println(sol.solve(null));
    }
}
