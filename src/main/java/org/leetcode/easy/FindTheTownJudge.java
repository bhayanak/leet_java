package org.leetcode.easy;


/**
 * <b>#997 - Find the Town Judge</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
 *
 *
 * If the town judge exists, then:
 *
 *
 * The town judge trusts nobody.
 *
 * Everybody (except for the town judge) trusts the town judge.
 *
 * There is exactly one person that satisfies properties 1 and 2.
 *
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi. If a trust relationship does not exist in trust array, then such a trust relationship does not exist.
 *
 *
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, trust = [[1,2]]
 * Output: 2
 *
 * Example 2:
 *
 * Input: n = 3, trust = [[1,3],[2,3]]
 * Output: 3
 *
 * Example 3:
 *
 * Input: n = 3, trust = [[1,3],[2,3],[3,1]]
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 0 &lt;= trust.length &lt;= 104
 *
 * trust[i].length == 2
 *
 * All the pairs of trust are unique.
 *
 * ai != bi
 *
 * 1 &lt;= ai, bi &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-town-judge/">LeetCode #997</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindTheTownJudge {

    /**
     * Finds Find judge.
     *
     * @param n the n (int)
     * @param trust the trust (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n+1]; // net trust: trusted-by minus trusts
        for (int[] t : trust) { trustCount[t[0]]--; trustCount[t[1]]++; }
        for (int i = 1; i <= n; i++) if (trustCount[i] == n-1) return i;
        return -1;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindTheTownJudge.java &amp;&amp; java org.leetcode.easy.FindTheTownJudge</pre>
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        FindTheTownJudge sol = new FindTheTownJudge();
                System.out.println(sol.findJudge(2, new int[][]{{1,2}}));           // 2
                System.out.println(sol.findJudge(3, new int[][]{{1,3},{2,3}}));     // 3
                System.out.println(sol.findJudge(3, new int[][]{{1,3},{2,3},{3,1}})); // -1
    }
}
