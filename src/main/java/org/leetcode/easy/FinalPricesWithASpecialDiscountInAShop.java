package org.leetcode.easy;


/**
 * <b>#1475 - Final Prices With a Special Discount in a Shop</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array prices where prices[i] is the price of the ith item in a shop.
 *
 *
 * There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j &gt; i and prices[j] &lt;= prices[i]. Otherwise, you will not receive any discount at all.
 *
 *
 * Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop, considering the special discount.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [8,4,6,2,3]
 * Output: [4,2,4,2,3]
 * Explanation: 
 * For item 0 with price[0]=8 you will receive a discount equivalent to prices[1]=4, therefore, the final price you will pay is 8 - 4 = 4.
 * For item 1 with price[1]=4 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 4 - 2 = 2.
 * For item 2 with price[2]=6 you will receive a discount equivalent to prices[3]=2, therefore, the final price you will pay is 6 - 2 = 4.
 * For items 3 and 4 you will not receive any discount at all.
 *
 * Example 2:
 *
 * Input: prices = [1,2,3,4,5]
 * Output: [1,2,3,4,5]
 * Explanation: In this case, for all items, you will not receive any discount at all.
 *
 * Example 3:
 *
 * Input: prices = [10,1,1,6]
 * Output: [9,0,1,6]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= prices.length &lt;= 500
 *
 * 1 &lt;= prices[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use brute force: For the ith item in the shop with a loop find the first position j satisfying the conditions and apply the discount, otherwise, the discount is 0.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/">LeetCode #1475</a>
  *
  * <p><b>Explanation:</b> Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
  */
public class FinalPricesWithASpecialDiscountInAShop {

    /**
     * Solves the problem: Final prices.
     *
     * @param prices the prices (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
      */
    public int[] finalPrices(int[] prices) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        int[] res = prices.clone();
        for (int i=0;i<prices.length;i++) {
            while (!stack.isEmpty() && prices[stack.peek()]>=prices[i]) {
                res[stack.pop()]-=prices[i];
            }
            stack.push(i);
        }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FinalPricesWithASpecialDiscountInAShop sol = new FinalPricesWithASpecialDiscountInAShop();
                System.out.println(java.util.Arrays.toString(sol.finalPrices(new int[]{8,4,6,2,3}))); // [4,2,4,2,3]
                System.out.println(java.util.Arrays.toString(sol.finalPrices(new int[]{1,2,3,4,5}))); // [1,2,3,4,5]
                System.out.println(java.util.Arrays.toString(sol.finalPrices(new int[]{10,1,1,6})));   // [9,0,1,6]
    }
}
