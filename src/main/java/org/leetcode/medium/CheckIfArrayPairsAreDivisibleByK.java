package org.leetcode.medium;


/**
 * <b>#1497 - Check If Array Pairs Are Divisible by k</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr of even length n and an integer k.
 *
 *
 * We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.
 *
 *
 * Return true If you can find a way to do that or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4,5,10,6,7,8,9], k = 5
 * Output: true
 * Explanation: Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).
 *
 * Example 2:
 *
 * Input: arr = [1,2,3,4,5,6], k = 7
 * Output: true
 * Explanation: Pairs are (1,6),(2,5) and(3,4).
 *
 * Example 3:
 *
 * Input: arr = [1,2,3,4,5,6], k = 10
 * Output: false
 * Explanation: You can try all possible pairs to see that there is no way to divide arr into 3 pairs each with sum divisible by 10.
 *
 *
 *
 * Constraints:
 *
 *
 * arr.length == n
 *
 * 1 &lt;= n &lt;= 105
 *
 * n is even.
 *
 * -109 &lt;= arr[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep an array of the frequencies of ((x % k) + k) % k for each x in arr.
 * Hint 2: for each i in [0, k - 1] we need to check if freq[i] == freq[k - i]
 * Hint 3: Take care of the case when i == k - i and when i == 0
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/">LeetCode #1497</a>
 */
public class CheckIfArrayPairsAreDivisibleByK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check If Array Pairs Are Divisible by k");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfArrayPairsAreDivisibleByK ===");
        CheckIfArrayPairsAreDivisibleByK sol = new CheckIfArrayPairsAreDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
