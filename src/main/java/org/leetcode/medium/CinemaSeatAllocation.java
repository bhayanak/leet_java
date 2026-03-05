package org.leetcode.medium;


/**
 * <b>#1386 - Cinema Seat Allocation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A cinema has n rows of seats, numbered from 1 to n and there are ten seats in each row, labelled from 1 to 10 as shown in the figure above.
 *
 *
 * Given the array reservedSeats containing the numbers of seats already reserved, for example, reservedSeats[i] = [3,8] means the seat located in row 3 and labelled with 8 is already reserved.
 *
 *
 * Return the maximum number of four-person groups you can assign on the cinema seats. A four-person group occupies four adjacent seats in one single row. Seats across an aisle (such as [3,3] and [3,4]) are not considered to be adjacent, but there is an exceptional case on which an aisle split a four-person group, in that case, the aisle split a four-person group in the middle, which means to have two people on each side.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
 * Output: 4
 * Explanation: The figure above shows the optimal allocation for four groups, where seats mark with blue are already reserved and contiguous seats mark with orange are for one group.
 *
 * Example 2:
 *
 * Input: n = 2, reservedSeats = [[2,1],[1,8],[2,6]]
 * Output: 2
 *
 * Example 3:
 *
 * Input: n = 4, reservedSeats = [[4,3],[1,4],[4,6],[1,7]]
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 10^9
 *
 * 1 &lt;= reservedSeats.length &lt;= min(10*n, 10^4)
 *
 * reservedSeats[i].length == 2
 *
 * 1 &lt;= reservedSeats[i][0] &lt;= n
 *
 * 1 &lt;= reservedSeats[i][1] &lt;= 10
 *
 * All reservedSeats[i] are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note you can allocate at most two families in one row.
 * Hint 2: Greedily check if you can allocate seats for two families, one family or none.
 * Hint 3: Process only rows that appear in the input, for other rows you can always allocate seats for two families.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/cinema-seat-allocation/">LeetCode #1386</a>
 */
public class CinemaSeatAllocation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Cinema Seat Allocation");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CinemaSeatAllocation ===");
        CinemaSeatAllocation sol = new CinemaSeatAllocation();
        System.out.println(sol.solve(null));
    }
}
