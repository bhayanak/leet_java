package org.leetcode.hard;


/**
 * <b>#3414 - Maximum Score of Non-overlapping Intervals</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array intervals, where intervals[i] = [li, ri, weighti]. Interval i starts at position li and ends at ri, and has a weight of weighti. You can choose up to 4 non-overlapping intervals. The score of the chosen intervals is defined as the total sum of their weights.
 *
 *
 * Return the lexicographically smallest array of at most 4 indices from intervals with maximum score, representing your choice of non-overlapping intervals.
 *
 *
 * Two intervals are said to be non-overlapping if they do not share any points. In particular, intervals sharing a left or right boundary are considered overlapping.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[1,3,2],[4,5,2],[1,5,5],[6,9,3],[6,7,1],[8,9,1]]
 *
 *
 * Output: [2,3]
 *
 *
 * Explanation:
 *
 *
 * You can choose the intervals with indices 2, and 3 with respective weights of 5, and 3.
 *
 * Example 2:
 *
 * Input: intervals = [[5,8,1],[6,7,7],[4,7,3],[9,10,6],[7,8,2],[11,14,3],[3,5,5]]
 *
 *
 * Output: [1,3,5,6]
 *
 *
 * Explanation:
 *
 *
 * You can choose the intervals with indices 1, 3, 5, and 6 with respective weights of 7, 6, 3, and 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= intevals.length &lt;= 5 * 104
 *
 * intervals[i].length == 3
 *
 * intervals[i] = [li, ri, weighti]
 *
 * 1 &lt;= li &lt;= ri &lt;= 109
 *
 * 1 &lt;= weighti &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Dynamic Programming.
 * Hint 2: Sort <code>intervals</code> by right boundary.
 * Hint 3: Let <code>dp[r][i]</code> denote the maximum score having picked <code>r</code> intervals from the prefix of <code>intervals</code> ending at index <code>i</code>.
 * Hint 4: <code>dp[r][i] = max(dp[r][i - 1], intervals[i][2] + dp[r][j])</code> where <code>j</code> is the largest index such that <code>intervals[j][1] &lt; intervals[i][0]</code>.
 * Hint 5: Since <code>intervals</code> is sorted by right boundary, we can find index <code>j</code> using binary search.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-of-non-overlapping-intervals/">LeetCode #3414</a>
 */
public class MaximumScoreOfNonOverlappingIntervals {

    /**
     * Computes the maximum Max score2.
     *
     * @param scores the scores (int[])
     * @param k the k (int)
     * @return the computed int result
     */
    public int maxScore2(int[] scores, int k) {
        int n=scores.length, maxS=0;
        for (int i=0;i<n;i++) for (int j=i;j<n;j++) {
            if (j-i+1==k) { int s=0; for (int idx=i;idx<=j;idx++) s+=scores[idx]; maxS=Math.max(maxS,s); }
        }
        return maxS;
    }

    public static void main(String[] args) {
        MaximumScoreOfNonOverlappingIntervals sol = new MaximumScoreOfNonOverlappingIntervals();
                System.out.println(sol.maxScore2(new int[]{1,2,3,4,5},3)); // 12
    }
}
