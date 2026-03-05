package org.leetcode.easy;


/**
 * <b>#1128 - Number of Equivalent Domino Pairs</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
 *
 *
 * Return the number of pairs (i, j) for which 0 &lt;= i &lt; j &lt; dominoes.length, and dominoes[i] is equivalent to dominoes[j].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * Output: 1
 *
 * Example 2:
 *
 * Input: dominoes = [[1,2],[1,2],[1,1],[1,2],[2,2]]
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= dominoes.length &lt;= 4 * 104
 *
 * dominoes[i].length == 2
 *
 * 1 &lt;= dominoes[i][j] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each domino j, find the number of dominoes you've already seen (dominoes i with i &lt; j) that are equivalent.
 * Hint 2: You can keep track of what you've seen using a hashmap.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-equivalent-domino-pairs/">LeetCode #1128</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class NumberOfEquivalentDominoPairs {

    /**
     * Solves the problem: Num equiv domino pairs.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param dominoes the dominoes (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int numEquivDominoPairs(int[][] dominoes) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        int ans = 0;
        for (int[] d : dominoes) {
            int key = Math.min(d[0],d[1]) * 10 + Math.max(d[0],d[1]);
            int prev = cnt.getOrDefault(key, 0);
            ans += prev; cnt.put(key, prev+1);
        }
        return ans;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfEquivalentDominoPairs.java &amp;&amp; java org.leetcode.easy.NumberOfEquivalentDominoPairs</pre>
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        NumberOfEquivalentDominoPairs sol = new NumberOfEquivalentDominoPairs();
                System.out.println(sol.numEquivDominoPairs(new int[][]{{1,2},{2,1},{3,4},{5,6}})); // 1
                System.out.println(sol.numEquivDominoPairs(new int[][]{{1,2},{1,2},{1,1},{1,2},{2,2}})); // 3
    }
}
