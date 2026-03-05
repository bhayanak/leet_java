package org.leetcode.easy;


/**
 * <b>#1672 - Richest Customer Wealth</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
 *
 *
 * A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 *
 * Example 2:
 *
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation: 
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10 
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 *
 * Example 3:
 *
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 *
 *
 *
 * Constraints:
 *
 *
 * m == accounts.length
 *
 * n == accounts[i].length
 *
 * 1 &lt;= m, n &lt;= 50
 *
 * 1 &lt;= accounts[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the wealth of each customer
 * Hint 2: Find the maximum element in array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/richest-customer-wealth/">LeetCode #1672</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class RichestCustomerWealth {

    /**
     * Solves the problem: Maximum wealth.
     *
     * @param accounts the accounts (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for (int[] row : accounts) {
            int sum=0; for (int v:row) sum+=v;
            max=Math.max(max,sum);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        RichestCustomerWealth sol = new RichestCustomerWealth();
                System.out.println(sol.maximumWealth(new int[][]{{1,2,3},{3,2,1}})); // 6
                System.out.println(sol.maximumWealth(new int[][]{{1,5},{7,3},{3,5}})); // 10
                System.out.println(sol.maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}})); // 17
    }
}
