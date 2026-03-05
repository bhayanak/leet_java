package org.leetcode.medium;


/**
 * <b>#1227 - Airplane Seat Assignment Probability</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Brainteaser, Probability and Statistics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * n passengers board an airplane with exactly n seats. The first passenger has lost the ticket and picks a seat randomly. But after that, the rest of the passengers will:
 *
 *
 * Take their own seat if it is still available, and
 *
 * Pick other seats randomly when they find their seat occupied
 *
 * Return the probability that the nth person gets his own seat.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 1.00000
 * Explanation: The first person can only get the first seat.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 0.50000
 * Explanation: The second person has a probability of 0.5 to get the second seat (when first person gets the first seat).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let f(n) denote the probability of the n-th person getting correct seat in n-person case, then:

f(1) = 1 (base case, trivial)
f(2) = 1/2 (also trivial)
 * Hint 2: Try to calculate f(3), f(4), and f(5) using the base cases. What is the value of them?
f(i) for i >= 2 will also be 1/2.
 * Hint 3: Try to proof why f(i) = 1/2 for i &gt;= 2.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Brainteaser, Probability and Statistics).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/airplane-seat-assignment-probability/">LeetCode #1227</a>
 */
public class AirplaneSeatAssignmentProbability {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Airplane Seat Assignment Probability");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== AirplaneSeatAssignmentProbability ===");
        AirplaneSeatAssignmentProbability sol = new AirplaneSeatAssignmentProbability();
        System.out.println(sol.solve(null));
    }
}
