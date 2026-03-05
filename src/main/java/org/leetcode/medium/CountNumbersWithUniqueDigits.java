package org.leetcode.medium;

/**
 * <b>#357 - Count Numbers with Unique Digits</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the count of all numbers with unique digits, x, where 0 &lt;= x &lt; 10n.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: 91
 * Explanation: The answer should be the total numbers in the range of 0 ≤ x &lt; 100, excluding 11,22,33,44,55,66,77,88,99
 * 
 * Example 2:
 * 
 * Input: n = 0
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= n &lt;= 8
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A direct way is to use the backtracking approach.
 * Hint 2: Backtracking should contains three states which are (the current number, number of steps to get that number and a bitmask which represent which number is marked as visited so far in the current number). Start with state (0,0,0) and count all valid number till we reach number of steps equals to 10<sup>n</sup>.
 * Hint 3: This problem can also be solved using a dynamic programming approach and some knowledge of combinatorics.
 * Hint 4: Let f(k) = count of numbers with unique digits with length equals k.
 * Hint 5: f(1) = 10, ..., f(k) = 9 * 9 * 8 * ... (9 - k + 2) [The first factor is 9 because a number cannot start with 0].
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
 * @see <a href="https://leetcode.com/problems/count-numbers-with-unique-digits/">LeetCode #357</a>
 */
public class CountNumbersWithUniqueDigits {

    /** TODO: implement solution for "Count Numbers with Unique Digits". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Numbers with Unique Digits");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== CountNumbersWithUniqueDigits ===");
        CountNumbersWithUniqueDigits sol = new CountNumbersWithUniqueDigits();
        System.out.println(sol.solve(null));
    }
}
