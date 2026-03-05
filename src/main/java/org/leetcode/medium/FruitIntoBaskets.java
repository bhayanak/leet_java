package org.leetcode.medium;


/**
 * <b>#904 - Fruit Into Baskets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 *
 *
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 *
 *
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 *
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 *
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 *
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: fruits = [1,2,1]
 * Output: 3
 * Explanation: We can pick from all 3 trees.
 *
 * Example 2:
 *
 * Input: fruits = [0,1,2,2]
 * Output: 3
 * Explanation: We can pick from trees [1,2,2].
 * If we had started at the first tree, we would only pick from trees [0,1].
 *
 * Example 3:
 *
 * Input: fruits = [1,2,3,2,2]
 * Output: 4
 * Explanation: We can pick from trees [2,3,2,2].
 * If we had started at the first tree, we would only pick from trees [1,2].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= fruits.length &lt;= 105
 *
 * 0 &lt;= fruits[i] &lt; fruits.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/fruit-into-baskets/">LeetCode #904</a>
 */
public class FruitIntoBaskets {

    /**
     * TODO: Implement "Fruit Into Baskets".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Fruit Into Baskets");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FruitIntoBaskets.java &amp;&amp; java org.leetcode.medium.FruitIntoBaskets</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FruitIntoBaskets ===");
        FruitIntoBaskets sol = new FruitIntoBaskets();
        System.out.println(sol.solve(null));
    }
}
