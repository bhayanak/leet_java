package org.leetcode.medium;


/**
 * <b>#3824 - Minimum K to Reduce Array Within Limit</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer array nums.
 *
 *
 * For a positive integer k, define nonPositive(nums, k) as the minimum number of operations needed to make every element of nums non-positive. In one operation, you can choose an index i and reduce nums[i] by k.
 *
 *
 * Return an integer denoting the minimum value of k such that nonPositive(nums, k) &lt;= k2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,7,5]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * When k = 3, nonPositive(nums, k) = 6 &lt;= k2.
 *
 *
 * Reduce nums[0] = 3 one time. nums[0] becomes 3 - 3 = 0.
 *
 * Reduce nums[1] = 7 three times. nums[1] becomes 7 - 3 - 3 - 3 = -2.
 *
 * Reduce nums[2] = 5 two times. nums[2] becomes 5 - 3 - 3 = -1.
 *
 * Example 2:
 *
 * Input: nums = [1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * When k = 1, nonPositive(nums, k) = 1 &lt;= k2.
 *
 *
 * Reduce nums[0] = 1 one time. nums[0] becomes 1 - 1 = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use binary search
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-k-to-reduce-array-within-limit/">LeetCode #3824</a>
 */
public class MinimumKToReduceArrayWithinLimit {

    /**
     * Counts Count k divisible components.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param n the n (int)
     * @param edges the edges (int[][])
     * @param values the values (int[])
     * @param k the k (int)
     * @return the computed int result
     */
    public int countKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        int[] parent=new int[n]; for(int i=0;i<n;i++) parent[i]=i;
        for(int[] e:edges){
            int a=find(parent,e[0]),b=find(parent,e[1]);
            if(a!=b) parent[a]=b;
        }
        java.util.Map<Integer,Long> comp=new java.util.HashMap<>();
        for(int i=0;i<n;i++) comp.merge(find(parent,i),(long)values[i],Long::sum);
        int cnt=0; for(long v:comp.values()) if(v%k==0) cnt++;
        return cnt;
    }
    private int find(int[] p,int i){return p[i]==i?i:(p[i]=find(p,p[i]));}

    public static void main(String[] args) {
        MinimumKToReduceArrayWithinLimit sol = new MinimumKToReduceArrayWithinLimit();
        System.out.println(sol.countKDivisibleComponents(0, new int[][]{{1,2},{3,4}}, new int[]{1,2,3}, 0));
    }
}
