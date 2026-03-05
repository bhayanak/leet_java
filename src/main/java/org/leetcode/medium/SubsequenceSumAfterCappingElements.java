package org.leetcode.medium;


/**
 * <b>#3685 - Subsequence Sum After Capping Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of size n and a positive integer k.
 *
 *
 * An array capped by value x is obtained by replacing every element nums[i] with min(nums[i], x).
 *
 *
 * For each integer x from 1 to n, determine whether it is possible to choose a subsequence from the array capped by x such that the sum of the chosen elements is exactly k.
 *
 *
 * Return a 0-indexed boolean array answer of size n, where answer[i] is true if it is possible when using x = i + 1, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,4], k = 5
 *
 *
 * Output: [false,false,true,true]
 *
 *
 * Explanation:
 *
 *
 * For x = 1, the capped array is [1, 1, 1, 1]. Possible sums are 1, 2, 3, 4, so it is impossible to form a sum of 5.
 *
 * For x = 2, the capped array is [2, 2, 2, 2]. Possible sums are 2, 4, 6, 8, so it is impossible to form a sum of 5.
 *
 * For x = 3, the capped array is [3, 3, 2, 3]. A subsequence [2, 3] sums to 5, so it is possible.
 *
 * For x = 4, the capped array is [4, 3, 2, 4]. A subsequence [3, 2] sums to 5, so it is possible.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5], k = 3
 *
 *
 * Output: [true,true,true,true,true]
 *
 *
 * Explanation:
 *
 *
 * For every value of x, it is always possible to select a subsequence from the capped array that sums exactly to 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 4000
 *
 * 1 &lt;= nums[i] &lt;= n
 *
 * 1 &lt;= k &lt;= 4000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array <code>nums</code> in descending order.
 * Hint 2: Build a knapsack DP table <code>dp[idx][sum]</code> where <code>dp[idx][sum] == true</code> if and only if there exists a subsequence of <code>nums[idx]</code> through the end that sums exactly to <code>sum</code>.
 * Hint 3: Observe that capping all values above <code>x</code> to <code>x</code> in a sorted array is equivalent to taking the first <code>t</code> elements (those originally &gt; <code>x</code>) and treating each as <code>x</code>. Precompute which multiples of <code>x</code> up to <code>t * x</code> are selectable.
 * Hint 4: For each cap value <code>x</code> from 1 to <code>n</code>, let <code>t</code> be the number of elements in nums originally greater than <code>x</code>. Then iterate over all sums <code>s</code> with <code>dp[t][s] == true</code> and all counts <code>m</code> from 0 to <code>t</code>; if there exists an <code>m</code> such that <code>s + m * x == k</code>, set <code>answer[x-1]</code> to true. Otherwise, it remains false.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Dynamic Programming, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/subsequence-sum-after-capping-elements/">LeetCode #3685</a>
 */
public class SubsequenceSumAfterCappingElements {

    /**
     * Solves the problem: Equal pairs.
     *
     * @param grid the grid (int[][])
     * @return the computed int result
     */
    public int equalPairs(int[][] grid) {
        int cnt=0, n=grid.length;
        for (int r=0;r<n;r++) for (int c=0;c<n;c++) {
            boolean eq=true;
            for (int k=0;k<n;k++) if (grid[r][k]!=grid[k][c]){eq=false;break;}
            if (eq) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        SubsequenceSumAfterCappingElements sol = new SubsequenceSumAfterCappingElements();
        System.out.println(sol.equalPairs(new int[][]{{1,2},{3,4}}));
    }
}
