package org.leetcode.hard;


/**
 * <b>#2561 - Rearranging Fruits</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have two fruit baskets containing n fruits each. You are given two 0-indexed integer arrays basket1 and basket2 representing the cost of fruit in each basket. You want to make both baskets equal. To do so, you can use the following operation as many times as you want:
 *
 *
 * Choose two indices i and j, and swap the ith fruit of basket1 with the jth fruit of basket2.
 *
 * The cost of the swap is min(basket1[i], basket2[j]).
 *
 * Two baskets are considered equal if sorting them according to the fruit cost makes them exactly the same baskets.
 *
 *
 * Return the minimum cost to make both the baskets equal or -1 if impossible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: basket1 = [4,2,2,2], basket2 = [1,4,1,2]
 * Output: 1
 * Explanation: Swap index 1 of basket1 with index 0 of basket2, which has cost 1. Now basket1 = [4,1,2,2] and basket2 = [2,4,1,2]. Rearranging both the arrays makes them equal.
 *
 * Example 2:
 *
 * Input: basket1 = [2,3,4,1], basket2 = [3,2,5,1]
 * Output: -1
 * Explanation: It can be shown that it is impossible to make both the baskets equal.
 *
 *
 *
 * Constraints:
 *
 *
 * basket1.length == basket2.length
 *
 * 1 &lt;= basket1.length &lt;= 105
 *
 * 1 &lt;= basket1[i], basket2[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create two frequency maps for both arrays, and find the minimum element among all elements of both arrays.
 * Hint 2: Check if the sum of frequencies of an element in both arrays is odd, if so return -1
 * Hint 3: Store the elements that need to be swapped in a vector, and sort it.
 * Hint 4: Can we reduce swapping cost with the help of minimum element?
 * Hint 5: Calculate the minimum cost of swapping.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sort).
 *
 * @see <a href="https://leetcode.com/problems/rearranging-fruits/">LeetCode #2561</a>
 */
public class RearrangingFruits {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rearranging Fruits");
    }

    public static void main(String[] args) {
        System.out.println("=== RearrangingFruits ===");
        RearrangingFruits sol = new RearrangingFruits();
        System.out.println(sol.solve(null));
    }
}
