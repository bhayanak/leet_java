package org.leetcode.hard;


/**
 * <b>#3017 - Count the Number of Houses at a Certain Distance II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Graph Theory, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three positive integers n, x, and y.
 *
 *
 * In a city, there exist houses numbered 1 to n connected by n streets. There is a street connecting the house numbered i with the house numbered i + 1 for all 1 &lt;= i &lt;= n - 1 . An additional street connects the house numbered x with the house numbered y.
 *
 *
 * For each k, such that 1 &lt;= k &lt;= n, you need to find the number of pairs of houses (house1, house2) such that the minimum number of streets that need to be traveled to reach house2 from house1 is k.
 *
 *
 * Return a 1-indexed array result of length n where result[k] represents the total number of pairs of houses such that the minimum streets required to reach one house from the other is k.
 *
 *
 * Note that x and y can be equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, x = 1, y = 3
 * Output: [6,0,0]
 * Explanation: Let's look at each pair of houses:
 * - For the pair (1, 2), we can go from house 1 to house 2 directly.
 * - For the pair (2, 1), we can go from house 2 to house 1 directly.
 * - For the pair (1, 3), we can go from house 1 to house 3 directly.
 * - For the pair (3, 1), we can go from house 3 to house 1 directly.
 * - For the pair (2, 3), we can go from house 2 to house 3 directly.
 * - For the pair (3, 2), we can go from house 3 to house 2 directly.
 *
 * Example 2:
 *
 * Input: n = 5, x = 2, y = 4
 * Output: [10,8,2,0,0]
 * Explanation: For each distance k the pairs are:
 * - For k == 1, the pairs are (1, 2), (2, 1), (2, 3), (3, 2), (2, 4), (4, 2), (3, 4), (4, 3), (4, 5), and (5, 4).
 * - For k == 2, the pairs are (1, 3), (3, 1), (1, 4), (4, 1), (2, 5), (5, 2), (3, 5), and (5, 3).
 * - For k == 3, the pairs are (1, 5), and (5, 1).
 * - For k == 4 and k == 5, there are no pairs.
 *
 * Example 3:
 *
 * Input: n = 4, x = 1, y = 1
 * Output: [6,4,2,0]
 * Explanation: For each distance k the pairs are:
 * - For k == 1, the pairs are (1, 2), (2, 1), (2, 3), (3, 2), (3, 4), and (4, 3).
 * - For k == 2, the pairs are (1, 3), (3, 1), (2, 4), and (4, 2).
 * - For k == 3, the pairs are (1, 4), and (4, 1).
 * - For k == 4, there are no pairs.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= x, y &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If there were no additional street connecting house <code>x</code> to house <code>y</code>, there would be <code>2 * (n - i)</code> pairs of houses at distance <code>i</code>.
 * Hint 2: The shortest distance between house <code>i</code> and house <code>j</code> (<code>j &lt; i</code>) is along one of these paths:
- <code>i -> j</code>
- <code>i -> y---x -> j</code>
 * Hint 3: Try to change the distances calculated by path <code>i -&gt;j</code> to the other path.
 * Hint 4: Can we use prefix sums to compute the answer?
 *
 * <h2>Approach</h2>
 * Think about the category (Graph Theory, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-houses-at-a-certain-distance-ii/">LeetCode #3017</a>
 */
public class CountTheNumberOfHousesAtACertainDistanceIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Houses at a Certain Distance II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfHousesAtACertainDistanceIi ===");
        CountTheNumberOfHousesAtACertainDistanceIi sol = new CountTheNumberOfHousesAtACertainDistanceIi();
        System.out.println(sol.solve(null));
    }
}
