package org.leetcode.medium;

/**
 * <b>#264 - Ugly Number II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Math, Dynamic Programming, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
 * 
 * 
 * Given an integer n, return the nth ugly number.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 10
 * Output: 12
 * Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: 1
 * Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 1690
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The naive approach is to call <code>isUgly</code> for every number until you reach the n<sup>th</sup> one. Most numbers are <i>not</i> ugly. Try to focus your effort on generating only the ugly ones.
 * Hint 2: An ugly number must be multiplied by either 2, 3, or 5 from a smaller ugly number.
 * Hint 3: The key is how to maintain the order of the ugly numbers. Try a similar approach of merging from three sorted lists: L<sub>1</sub>, L<sub>2</sub>, and L<sub>3</sub>.
 * Hint 4: Assume you have U<sub>k</sub>, the k<sup>th</sup> ugly number. Then U<sub>k+1</sub> must be Min(L<sub>1</sub> * 2, L<sub>2</sub> * 3, L<sub>3</sub> * 5).
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
 * @see <a href="https://leetcode.com/problems/ugly-number-ii/">LeetCode #264</a>
 */
public class UglyNumberIi {

    /** TODO: implement solution for "Ugly Number II". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Ugly Number II");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== UglyNumberIi ===");
        UglyNumberIi sol = new UglyNumberIi();
        System.out.println(sol.solve(null));
    }
}
