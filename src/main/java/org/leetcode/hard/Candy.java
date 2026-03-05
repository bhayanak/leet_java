package org.leetcode.hard;

/**
 * <b>#135 - Candy</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * 
 * 
 * You are giving candies to these children subjected to the following requirements:
 * 
 * 	
 * Each child must have at least one candy.
 * 	
 * Children with a higher rating get more candies than their neighbors.
 * 
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: ratings = [1,0,2]
 * Output: 5
 * Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
 * 
 * Example 2:
 * 
 * Input: ratings = [1,2,2]
 * Output: 4
 * Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
 * The third child gets 1 candy because it satisfies the above two conditions.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * n == ratings.length
 * 	
 * 1 &lt;= n &lt;= 2 * 104
 * 	
 * 0 &lt;= ratings[i] &lt;= 2 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/candy/">LeetCode #135</a>
 */
public class Candy {

    /**
     * TODO: Implement solution for "Candy".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Candy");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac Candy.java &amp;&amp; java org.leetcode.hard.Candy
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== Candy ===");
        Candy sol = new Candy();
        System.out.println(sol.solve(null));
    }
}
