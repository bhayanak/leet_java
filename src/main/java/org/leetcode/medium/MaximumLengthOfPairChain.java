package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #646: Maximum Length of Pair Chain
 * @see <a href="https://leetcode.com/problems/maximum-length-of-pair-chain/">Problem</a>
 */
public class MaximumLengthOfPairChain {

    /**
     * LeetCode #646 – Maximum Length of Pair Chain
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Greedy, Sorting
     *
     * You are given an array of n pairs pairs where pairs[i] = [lefti, righti]
     * and lefti &lt; righti.
     * 
     * 
     * A pair p2 = [c, d] follows a pair p1 = [a, b] if b &lt; c. A chain of pairs
     * can be formed in this fashion.
     * 
     * 
     * Return the length longest chain which can be formed.
     * 
     * 
     * You do not need to use up all the given intervals. You can select pairs in
     * any order.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: pairs = [[1,2],[2,3],[3,4]]
     * Output: 2
     * Explanation: The longest chain is [1,2] -&gt; [3,4].
     * 
     * Example 2:
     * 
     * Input: pairs = [[1,2],[7,8],[4,5]]
     * Output: 3
     * Explanation: The longest chain is [1,2] -&gt; [4,5] -&gt; [7,8].
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == pairs.length
     * 
     * 1 &lt;= n &lt;= 1000
     * 
     * -1000 &lt;= lefti &lt; righti &lt;= 1000
     */
    // Greedy: sort by end; greedily take earliest-ending pairs
    /**
     * Finds Find longest chain.
     * Sorts the input first to enable efficient processing.
     *
     * @param pairs the pairs (int[][])
     * @return the computed int result
     */
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a,b) -> a[1] - b[1]);
        int count = 0, end = Integer.MIN_VALUE;
        for (int[] p : pairs) {
            if (p[0] > end) { count++; end = p[1]; }
        }
        return count;
    }

    public static void main(String[] args) {
        MaximumLengthOfPairChain sol = new MaximumLengthOfPairChain();
        System.out.println(sol.findLongestChain(new int[][]{{1,2},{3,4}}));
    }
}
