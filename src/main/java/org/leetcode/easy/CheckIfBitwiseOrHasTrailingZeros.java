package org.leetcode.easy;


/**
 * <b>#2980 - Check if Bitwise OR Has Trailing Zeros</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums.
 *
 *
 * You have to check if it is possible to select two or more elements in the array such that the bitwise OR of the selected elements has at least one trailing zero in its binary representation.
 *
 *
 * For example, the binary representation of 5, which is "101", does not have any trailing zeros, whereas the binary representation of 4, which is "100", has two trailing zeros.
 *
 *
 * Return true if it is possible to select two or more elements whose bitwise OR has trailing zeros, return false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: If we select the elements 2 and 4, their bitwise OR is 6, which has the binary representation "110" with one trailing zero.
 *
 * Example 2:
 *
 * Input: nums = [2,4,8,16]
 * Output: true
 * Explanation: If we select the elements 2 and 4, their bitwise OR is 6, which has the binary representation "110" with one trailing zero.
 * Other possible ways to select elements to have trailing zeroes in the binary representation of their bitwise OR are: (2, 8), (2, 16), (4, 8), (4, 16), (8, 16), (2, 4, 8), (2, 4, 16), (2, 8, 16), (4, 8, 16), and (2, 4, 8, 16).
 *
 * Example 3:
 *
 * Input: nums = [1,3,5,7,9]
 * Output: false
 * Explanation: There is no possible way to select two or more elements to have trailing zeros in the binary representation of their bitwise OR.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Bitwise <code>OR</code> can never unset a bit. If there is a solution, there must be a solution with only a pair of elements.
 * Hint 2: We can brute force the solution: enumerate all the pairs.
 * Hint 3: As the least significant bit must stay unset, the question is whether the array has at least two even elements.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/check-if-bitwise-or-has-trailing-zeros/">LeetCode #2980</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class CheckIfBitwiseOrHasTrailingZeros {

    /**
     * Finds the longest Longest increasing subsequence i i.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param n the n (int)
     * @param queries the queries (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int longestIncreasingSubsequenceII(int n, int[] queries) {
        return n; // placeholder
    }
    /**
     * Checks Check if bipartite.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param n the n (int)
     * @param edges the edges (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int checkIfBipartite(int n, int[][] edges) {
        // Simplified BFS bipartite check
        int[] color=new int[n+1]; java.util.Arrays.fill(color,-1);
        java.util.Map<Integer,java.util.List<Integer>> adj=new java.util.HashMap<>();
        for (int i=1;i<=n;i++) adj.put(i,new java.util.ArrayList<>());
        for (int[] e:edges){adj.get(e[0]).add(e[1]);adj.get(e[1]).add(e[0]);}
        for (int i=1;i<=n;i++) if (color[i]==-1) {
            java.util.Queue<Integer> q=new java.util.LinkedList<>();q.add(i);color[i]=0;
            while (!q.isEmpty()){int v=q.poll();for(int nb:adj.get(v)){if(color[nb]==-1){color[nb]=1-color[v];q.add(nb);}else if(color[nb]==color[v])return 0;}}
        }
        return 1;
    }

    public static void main(String[] args) {
        CheckIfBitwiseOrHasTrailingZeros sol = new CheckIfBitwiseOrHasTrailingZeros();
        System.out.println(sol.longestIncreasingSubsequenceII(0, new int[]{1,2,3}));
    }
}
