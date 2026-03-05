package org.leetcode.medium;


/**
 * <b>#1552 - Magnetic Force Between Two Balls</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.
 *
 *
 * Rick stated that magnetic force between two different balls at positions x and y is |x - y|.
 *
 *
 * Given the integer array position and the integer m. Return the required force.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: position = [1,2,3,4,7], m = 3
 * Output: 3
 * Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
 *
 * Example 2:
 *
 * Input: position = [5,4,3,2,1,1000000000], m = 2
 * Output: 999999999
 * Explanation: We can use baskets 1 and 1000000000.
 *
 *
 *
 * Constraints:
 *
 *
 * n == position.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= position[i] &lt;= 109
 *
 * All integers in position are distinct.
 *
 * 2 &lt;= m &lt;= position.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If you can place balls such that the answer is x then you can do it for y where y &lt; x.
 * Hint 2: Similarly if you cannot place balls such that the answer is x then you can do it for y where y &gt; x.
 * Hint 3: Binary search on the answer and greedily see if it is possible.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/magnetic-force-between-two-balls/">LeetCode #1552</a>
 */
public class MagneticForceBetweenTwoBalls {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Magnetic Force Between Two Balls");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MagneticForceBetweenTwoBalls ===");
        MagneticForceBetweenTwoBalls sol = new MagneticForceBetweenTwoBalls();
        System.out.println(sol.solve(null));
    }
}
