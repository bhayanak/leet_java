package org.leetcode.medium;


/**
 * <b>#3479 - Fruits Into Baskets III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Segment Tree, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays of integers, fruits and baskets, each of length n, where fruits[i] represents the quantity of the ith type of fruit, and baskets[j] represents the capacity of the jth basket.
 *
 *
 * From left to right, place the fruits according to these rules:
 *
 *
 * Each fruit type must be placed in the leftmost available basket with a capacity greater than or equal to the quantity of that fruit type.
 *
 * Each basket can hold only one type of fruit.
 *
 * If a fruit type cannot be placed in any basket, it remains unplaced.
 *
 * Return the number of fruit types that remain unplaced after all possible allocations are made.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: fruits = [4,2,5], baskets = [3,5,4]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * fruits[0] = 4 is placed in baskets[1] = 5.
 *
 * fruits[1] = 2 is placed in baskets[0] = 3.
 *
 * fruits[2] = 5 cannot be placed in baskets[2] = 4.
 *
 * Since one fruit type remains unplaced, we return 1.
 *
 * Example 2:
 *
 * Input: fruits = [3,6,1], baskets = [6,4,7]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * fruits[0] = 3 is placed in baskets[0] = 6.
 *
 * fruits[1] = 6 cannot be placed in baskets[1] = 4 (insufficient capacity) but can be placed in the next available basket, baskets[2] = 7.
 *
 * fruits[2] = 1 is placed in baskets[1] = 4.
 *
 * Since all fruits are successfully placed, we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == fruits.length == baskets.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= fruits[i], baskets[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the baskets by the pair of <code>(basket[i], i)</code> in the array.
 * Hint 2: For each fruit from left to right, use binary search to find the first index in the sorted array such that <code>basket[i] &gt;= fruit</code>.
 * Hint 3: Use a segment tree to maintain the smallest original indices where <code>basket[i] &gt;= fruit</code>.
 * Hint 4: When a valid index is found, set the corresponding point to infinity to mark it as used.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Segment Tree, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/fruits-into-baskets-iii/">LeetCode #3479</a>
 */
public class FruitsIntoBasketsIii {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Fruits Into Baskets III");
    }

    public static void main(String[] args) {
        System.out.println("=== FruitsIntoBasketsIii ===");
        FruitsIntoBasketsIii sol = new FruitsIntoBasketsIii();
        System.out.println(sol.solve(null));
    }
}
