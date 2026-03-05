package org.leetcode.hard;


/**
 * <b>#3691 - Maximum Total Subarray Value II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Segment Tree, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and an integer k.
 *
 *
 * You must select exactly k distinct non-empty subarrays nums[l..r] of nums. Subarrays may overlap, but the exact same subarray (same l and r) cannot be chosen more than once.
 *
 *
 * The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).
 *
 *
 * The total value is the sum of the values of all chosen subarrays.
 *
 *
 * Return the maximum possible total value you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2], k = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * One optimal approach is:
 *
 *
 * Choose nums[0..1] = [1, 3]. The maximum is 3 and the minimum is 1, giving a value of 3 - 1 = 2.
 *
 * Choose nums[0..2] = [1, 3, 2]. The maximum is still 3 and the minimum is still 1, so the value is also 3 - 1 = 2.
 *
 * Adding these gives 2 + 2 = 4.
 *
 * Example 2:
 *
 * Input: nums = [4,2,5,1], k = 3
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * One optimal approach is:
 *
 *
 * Choose nums[0..3] = [4, 2, 5, 1]. The maximum is 5 and the minimum is 1, giving a value of 5 - 1 = 4.
 *
 * Choose nums[1..3] = [2, 5, 1]. The maximum is 5 and the minimum is 1, so the value is also 4.
 *
 * Choose nums[2..3] = [5, 1]. The maximum is 5 and the minimum is 1, so the value is again 4.
 *
 * Adding these gives 4 + 4 + 4 = 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 5 * 10​​​​​​​4
 *
 * 0 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= min(105, n * (n + 1) / 2)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For fixed <code>l</code>, the sequence <code>v(l,r)=max(nums[l..r])−min(nums[l..r])</code> is non-increasing as <code>r</code> moves left.
 * Hint 2: Build RMQs (sparse tables) for range max/min so each <code>v(l,r)</code> is queryable in <code>O(1)</code>.
 * Hint 3: Use a max-heap with <code>v(l,n-1)</code> for all <code>l</code>; pop the largest <code>k</code> times, and after popping an entry from <code>(l,r)</code> push <code>(l,r-1)</code> if <code>r&gt;l</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Segment Tree, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximum-total-subarray-value-ii/">LeetCode #3691</a>
 */
public class MaximumTotalSubarrayValueIi {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem: Maximum beauty.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param items the items (int[][])
     * @param queries the queries (int[])
     * @return the computed int[] result
     */
    public int[] maximumBeauty(int[][] items, int[] queries) {
        java.util.Arrays.sort(items,(a,b)->a[0]-b[0]);
        int[] sortedQ=queries.clone(); java.util.Arrays.sort(sortedQ);
        int[] ans=new int[queries.length];
        java.util.Map<Integer,Integer> map=new java.util.HashMap<>();
        int best=0, j=0;
        for (int q:sortedQ) {
            while (j<items.length&&items[j][0]<=q) { best=Math.max(best,items[j][1]); j++; }
            map.put(q,best);
        }
        for (int i=0;i<queries.length;i++) ans[i]=map.get(queries[i]);
        return ans;
    }

    public static void main(String[] args) {
        MaximumTotalSubarrayValueIi sol = new MaximumTotalSubarrayValueIi();
        System.out.println(sol.maximumBeauty(new int[][]{{1,2},{3,4}}, new int[]{1,2,3}));
    }
}
