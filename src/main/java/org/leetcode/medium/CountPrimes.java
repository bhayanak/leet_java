package org.leetcode.medium;

/**
 * <b>#204 - Count Primes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Enumeration, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * 
 * Example 2:
 * 
 * Input: n = 0
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: n = 1
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 5 * 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Checking all the integers in the range [1, n - 1] is not efficient. Think about a better approach.
 * Hint 2: Since most of the numbers are not primes, we need a fast approach to exclude the non-prime integers.
 * Hint 3: Use Sieve of Eratosthenes.
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
 * @see <a href="https://leetcode.com/problems/count-primes/">LeetCode #204</a>
 */
public class CountPrimes {

    /** TODO: implement solution for "Count Primes". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Primes");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== CountPrimes ===");
        CountPrimes sol = new CountPrimes();
        System.out.println(sol.solve(null));
    }
}
