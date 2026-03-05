package org.leetcode.medium;

/**
 * <b>#397 - Integer Replacement</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Greedy, Bit Manipulation, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, you can apply one of the following operations:
 * 
 * 	
 * If n is even, replace n with n / 2.
 * 	
 * If n is odd, replace n with either n + 1 or n - 1.
 * 
 * Return the minimum number of operations needed for n to become 1.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 8
 * Output: 3
 * Explanation: 8 -&gt; 4 -&gt; 2 -&gt; 1
 * 
 * Example 2:
 * 
 * Input: n = 7
 * Output: 4
 * Explanation: 7 -&gt; 8 -&gt; 4 -&gt; 2 -&gt; 1
 * or 7 -&gt; 6 -&gt; 3 -&gt; 2 -&gt; 1
 * 
 * Example 3:
 * 
 * Input: n = 4
 * Output: 2
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/integer-replacement/">LeetCode #397</a>
 */
public class IntegerReplacement {

    /** TODO: implement solution for "Integer Replacement". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Integer Replacement");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== IntegerReplacement ===");
        IntegerReplacement sol = new IntegerReplacement();
        System.out.println(sol.solve(null));
    }
}
