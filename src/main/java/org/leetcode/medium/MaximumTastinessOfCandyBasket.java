package org.leetcode.medium;


/**
 * <b>#2517 - Maximum Tastiness of Candy Basket</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers price where price[i] denotes the price of the ith candy and a positive integer k.
 *
 *
 * The store sells baskets of k distinct candies. The tastiness of a candy basket is the smallest absolute difference of the prices of any two candies in the basket.
 *
 *
 * Return the maximum tastiness of a candy basket.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: price = [13,5,1,8,21,2], k = 3
 * Output: 8
 * Explanation: Choose the candies with the prices [13,5,21].
 * The tastiness of the candy basket is: min(|13 - 5|, |13 - 21|, |5 - 21|) = min(8, 8, 16) = 8.
 * It can be proven that 8 is the maximum tastiness that can be achieved.
 *
 * Example 2:
 *
 * Input: price = [1,3,1], k = 2
 * Output: 2
 * Explanation: Choose the candies with the prices [1,3].
 * The tastiness of the candy basket is: min(|1 - 3|) = min(2) = 2.
 * It can be proven that 2 is the maximum tastiness that can be achieved.
 *
 * Example 3:
 *
 * Input: price = [7,7,7,7], k = 2
 * Output: 0
 * Explanation: Choosing any two distinct candies from the candies we have will result in a tastiness of 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= k &lt;= price.length &lt;= 105
 *
 * 1 &lt;= price[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The answer is binary searchable.
 * Hint 2: For some x, we can use a greedy strategy to check if it is possible to pick k distinct candies with tastiness being at least x.
 * Hint 3: Sort prices and iterate from left to right. For some price[i] check if the price difference between the last taken candy and price[i] is at least x. If so, add the candy i to the basket.
 * Hint 4: So, a candy basket with tastiness x can be achieved if the basket size is bigger than or equal to k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-tastiness-of-candy-basket/">LeetCode #2517</a>
 */
public class MaximumTastinessOfCandyBasket {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Tastiness of Candy Basket");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumTastinessOfCandyBasket ===");
        MaximumTastinessOfCandyBasket sol = new MaximumTastinessOfCandyBasket();
        System.out.println(sol.solve(null));
    }
}
