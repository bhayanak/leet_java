package org.leetcode.medium;


/**
 * <b>#3648 - Minimum Sensors to Cover Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given n × m grid and an integer k.
 *
 *
 * A sensor placed on cell (r, c) covers all cells whose Chebyshev distance from (r, c) is at most k.
 *
 *
 * The Chebyshev distance between two cells (r1, c1) and (r2, c2) is max(|r1 − r2|,|c1 − c2|).
 *
 *
 * Your task is to return the minimum number of sensors required to cover every cell of the grid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, m = 5, k = 1
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Placing sensors at positions (0, 3), (1, 0), (3, 3), and (4, 1) ensures every cell in the grid is covered. Thus, the answer is 4.
 *
 * Example 2:
 *
 * Input: n = 2, m = 2, k = 2
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * With k = 2, a single sensor can cover the entire 2 * 2 grid regardless of its position. Thus, the answer is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 103
 *
 * 1 &lt;= m &lt;= 103
 *
 * 0 &lt;= k &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>s = 2*k + 1</code>, the side length each sensor covers.
 * Hint 2: The minimum number is <code>ceil(n / s) * ceil(m / s)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/minimum-sensors-to-cover-grid/">LeetCode #3648</a>
 */
public class MinimumSensorsToCoverGrid {

    /**
     * Solves the problem: Product except self.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
     */
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n]; res[0]=1;
        for (int i=1;i<n;i++) res[i]=res[i-1]*nums[i-1];
        int right=1;
        for (int i=n-1;i>=0;i--) { res[i]*=right; right*=nums[i]; }
        return res;
    }

    public static void main(String[] args) {
        MinimumSensorsToCoverGrid sol = new MinimumSensorsToCoverGrid();
        System.out.println(sol.productExceptSelf(new int[]{1,2,3}));
    }
}
