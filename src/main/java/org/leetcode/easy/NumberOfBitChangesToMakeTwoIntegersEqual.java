package org.leetcode.easy;


/**
 * <b>#3226 - Number of Bit Changes to Make Two Integers Equal</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and k.
 *
 *
 * You can choose any bit in the binary representation of n that is equal to 1 and change it to 0.
 *
 *
 * Return the number of changes needed to make n equal to k. If it is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 13, k = 4
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * Initially, the binary representations of n and k are n = (1101)2 and k = (0100)2.
 *
 * We can change the first and fourth bits of n. The resulting integer is n = (0100)2 = k.
 *
 * Example 2:
 *
 * Input: n = 21, k = 21
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * n and k are already equal, so no changes are needed.
 *
 * Example 3:
 *
 * Input: n = 14, k = 13
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 * It is not possible to make n equal to k.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, k &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the binary representations of <code>n</code> and <code>k</code>.
 * Hint 2: Any bit that is equal to 1 in <code>n</code> and equal to 0 in <code>k</code> needs to be changed.
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/number-of-bit-changes-to-make-two-integers-equal/">LeetCode #3226</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class NumberOfBitChangesToMakeTwoIntegersEqual {

    /**
     * Finds the longest Longest cycle.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param edges the edges (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int longestCycle(int[] edges) {
        int n=edges.length, ans=-1;
        int[] visited=new int[n]; java.util.Arrays.fill(visited,-1);
        for (int i=0;i<n;i++) {
            if (visited[i]>=0) continue;
            java.util.Map<Integer,Integer> seen=new java.util.HashMap<>();
            int cur=i, step=0;
            while (cur!=-1&&!seen.containsKey(cur)&&visited[cur]<0) {
                seen.put(cur,step++); cur=edges[cur];
            }
            if (cur!=-1&&seen.containsKey(cur)) ans=Math.max(ans,step-seen.get(cur));
            for (int node:seen.keySet()) visited[node]=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        NumberOfBitChangesToMakeTwoIntegersEqual sol = new NumberOfBitChangesToMakeTwoIntegersEqual();
        System.out.println(sol.longestCycle(new int[]{1,2,3}));
    }
}
