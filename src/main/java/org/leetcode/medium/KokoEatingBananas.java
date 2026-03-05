package org.leetcode.medium;


/**
 * <b>#875 - Koko Eating Bananas</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
 *
 *
 * Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
 *
 *
 * Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
 *
 *
 * Return the minimum integer k such that she can eat all the bananas within h hours.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [3,6,7,11], h = 8
 * Output: 4
 *
 * Example 2:
 *
 * Input: piles = [30,11,23,4,20], h = 5
 * Output: 30
 *
 * Example 3:
 *
 * Input: piles = [30,11,23,4,20], h = 6
 * Output: 23
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= piles.length &lt;= 104
 *
 * piles.length &lt;= h &lt;= 109
 *
 * 1 &lt;= piles[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/koko-eating-bananas/">LeetCode #875</a>
 */
public class KokoEatingBananas {

    /**
     * TODO: Implement "Koko Eating Bananas".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Koko Eating Bananas");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac KokoEatingBananas.java &amp;&amp; java org.leetcode.medium.KokoEatingBananas</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== KokoEatingBananas ===");
        KokoEatingBananas sol = new KokoEatingBananas();
        System.out.println(sol.solve(null));
    }
}
