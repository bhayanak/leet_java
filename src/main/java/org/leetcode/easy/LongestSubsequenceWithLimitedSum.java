package org.leetcode.easy;


/**
 * <b>#2389 - Longest Subsequence With Limited Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n, and an integer array queries of length m.
 *
 *
 * Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,2,1], queries = [3,10,21]
 * Output: [2,3,4]
 * Explanation: We answer the queries as follows:
 * - The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
 * - The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
 * - The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
 *
 * Example 2:
 *
 * Input: nums = [2,3,4,5], queries = [1]
 * Output: [0]
 * Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * m == queries.length
 *
 * 1 &lt;= n, m &lt;= 1000
 *
 * 1 &lt;= nums[i], queries[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve each query independently.
 * Hint 2: When solving a query, which elements of nums should you choose to make the subsequence as long as possible?
 * Hint 3: Choose the smallest elements in nums that add up to a sum less than the query.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/longest-subsequence-with-limited-sum/">LeetCode #2389</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps. Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class LongestSubsequenceWithLimitedSum {

    /**
     * Solves the problem: Answer queries.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @param queries the queries (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps. Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int[] answerQueries(int[] nums, int[] queries) {
        java.util.Arrays.sort(nums);
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for (int i=1;i<nums.length;i++) prefix[i]=prefix[i-1]+nums[i];
        int[] res=new int[queries.length];
        for (int q=0;q<queries.length;q++) {
            int lo=0,hi=nums.length;
            while (lo<hi){int mid=lo+(hi-lo)/2;if(prefix[mid]<=queries[q])lo=mid+1;else hi=mid;}
            res[q]=lo;
        }
        return res;
    }

    public static void main(String[] args) {
        LongestSubsequenceWithLimitedSum sol = new LongestSubsequenceWithLimitedSum();
                System.out.println(java.util.Arrays.toString(sol.answerQueries(new int[]{4,5,2,1},new int[]{3,10,21}))); // [2,3,4]
                System.out.println(java.util.Arrays.toString(sol.answerQueries(new int[]{2,3,4,5},new int[]{1}))); // [0]
    }
}
