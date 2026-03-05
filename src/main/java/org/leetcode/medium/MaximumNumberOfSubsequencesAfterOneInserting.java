package org.leetcode.medium;


/**
 * <b>#3628 - Maximum Number of Subsequences After One Inserting</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Greedy, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of uppercase English letters.
 *
 *
 * You are allowed to insert at most one uppercase English letter at any position (including the beginning or end) of the string.
 *
 *
 * Return the maximum number of "LCT" subsequences that can be formed in the resulting string after at most one insertion.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "LMCT"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can insert a "L" at the beginning of the string s to make "LLMCT", which has 2 subsequences, at indices [0, 3, 4] and [1, 3, 4].
 *
 * Example 2:
 *
 * Input: s = "LCCT"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * We can insert a "L" at the beginning of the string s to make "LLCCT", which has 4 subsequences, at indices [0, 2, 4], [0, 3, 4], [1, 2, 4] and [1, 3, 4].
 *
 * Example 3:
 *
 * Input: s = "L"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Since it is not possible to obtain the subsequence "LCT" by inserting a single letter, the result is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of uppercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Precompute <code>preL</code>, <code>preLC</code>, <code>sufT</code>, and <code>sufCT</code> arrays to count L’s, LC’s, T’s, and CT’s at each position.
 * Hint 2: Compute <code>base</code> as the sum over all i of <code>preLC[i] * sufT[i]</code>.
 * Hint 3: For each insert position i, compute gains <code>sufCT[i]</code> for ‘L’, <code>preL[i] * sufT[i]</code> for ‘C’, and <code>preLC[i]</code> for ‘T’, and take the maximum of <code>base</code> and <code>base + gain</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Greedy, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-subsequences-after-one-inserting/">LeetCode #3628</a>
 */
public class MaximumNumberOfSubsequencesAfterOneInserting {

    /**
     * Computes the minimum Min depth.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param n the n (int)
     * @param edges the edges (int[][])
     * @return the computed int result
     */
    public int minDepth(int n, int[][] edges) {
        // BFS from node 0 in undirected graph
        java.util.List<java.util.List<Integer>> adj=new java.util.ArrayList<>();
        for (int i=0;i<n;i++) adj.add(new java.util.ArrayList<>());
        for (int[] e:edges){adj.get(e[0]).add(e[1]);adj.get(e[1]).add(e[0]);}
        int[] depth=new int[n]; java.util.Arrays.fill(depth,-1); depth[0]=0;
        java.util.Queue<Integer> q=new java.util.LinkedList<>(); q.add(0);
        while(!q.isEmpty()){int u=q.poll();for(int v:adj.get(u)){if(depth[v]==-1){depth[v]=depth[u]+1;q.add(v);}}}
        return java.util.Arrays.stream(depth).max().getAsInt();
    }

    public static void main(String[] args) {
        MaximumNumberOfSubsequencesAfterOneInserting sol = new MaximumNumberOfSubsequencesAfterOneInserting();
        System.out.println(sol.minDepth(0, new int[][]{{1,2},{3,4}}));
    }
}
