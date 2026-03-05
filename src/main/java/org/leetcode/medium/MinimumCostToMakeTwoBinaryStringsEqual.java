package org.leetcode.medium;


/**
 * <b>#3800 - Minimum Cost to Make Two Binary Strings Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two binary strings s and t, both of length n, and three positive integers flipCost, swapCost, and crossCost.
 *
 *
 * You are allowed to apply the following operations any number of times (in any order) to the strings s and t:
 *
 *
 * Choose any index i and flip s[i] or t[i] (change '0' to '1' or '1' to '0'). The cost of this operation is flipCost.
 *
 * Choose two distinct indices i and j, and swap either s[i] and s[j] or t[i] and t[j]. The cost of this operation is swapCost.
 *
 * Choose an index i and swap s[i] with t[i]. The cost of this operation is crossCost.
 *
 * Return an integer denoting the minimum total cost needed to make the strings s and t equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "01000", t = "10111", flipCost = 10, swapCost = 2, crossCost = 2
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * We can perform the following operations:
 *
 *
 * Swap s[0] and s[1] (swapCost = 2). After this operation, s = "10000" and t = "10111".
 *
 * Cross swap s[2] and t[2] (crossCost = 2). After this operation, s = "10100" and t = "10011".
 *
 * Swap s[2] and s[3] (swapCost = 2). After this operation, s = "10010" and t = "10011".
 *
 * Flip s[4] (flipCost = 10). After this operation, s = t = "10011".
 *
 * The total cost is 2 + 2 + 2 + 10 = 16.
 *
 * Example 2:
 *
 * Input: s = "001", t = "110", flipCost = 2, swapCost = 100, crossCost = 100
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Flipping all the bits of s makes the strings equal, and the total cost is 3 * flipCost = 3 * 2 = 6.
 *
 * Example 3:
 *
 * Input: s = "1010", t = "1010", flipCost = 5, swapCost = 5, crossCost = 5
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The strings are already equal, so no operations are required.
 *
 *
 *
 * Constraints:
 *
 *
 * n == s.length == t.length
 *
 * 1 &lt;= n &lt;= 105​​​​​​​
 *
 * 1 &lt;= flipCost, swapCost, crossCost &lt;= 109
 *
 * s and t consist only of the characters '0' and '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count mismatches: <code>a</code> = #(s = '0' , t = '1' ) <code>, b</code> = #(s = '1' , t = '0').
 * Hint 2: Pair opposite mismatches: <code>p = min( a , b)</code>. Fix each pair with cost <code>min(swapCost , 2 * flipCost)</code>.
 * Hint 3: Update counts: <code>a = a - p</code>, <code>b = b - p</code>. Let <code>r = abs( a - b)</code>.
 * Hint 4: Fix remaining mismatches in pairs: each pair costs <code>min(crossCost + swapCost , 2 * flipCost)</code>.
 * Hint 5: If one mismatch remains (<code>r % 2 == 1</code>), pay <code>flipCost</code>.
 * Hint 6: Sum all costs for the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-make-two-binary-strings-equal/">LeetCode #3800</a>
 */
public class MinimumCostToMakeTwoBinaryStringsEqual {

    /**
     * Solves the problem: Maximum sum of components.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param k the k (int)
     * @return the computed long result
     */
    public long maximumSumOfComponents(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        long sum=0, n=nums.length;
        for (int i=(int)(n-k);i<n;i++) sum+=nums[i];
        return sum;
    }

    public static void main(String[] args) {
        MinimumCostToMakeTwoBinaryStringsEqual sol = new MinimumCostToMakeTwoBinaryStringsEqual();
        System.out.println(sol.maximumSumOfComponents(new int[]{1,2,3}, 0));
    }
}
