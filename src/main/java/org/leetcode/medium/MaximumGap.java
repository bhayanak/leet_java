package org.leetcode.medium;

/**
 * <b>#164 - Maximum Gap</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Bucket Sort, Radix Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the maximum difference between two successive elements in its sorted form. If the array contains less than two elements, return 0.
 * 
 * 
 * You must write an algorithm that runs in linear time and uses linear extra space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,6,9,1]
 * Output: 3
 * Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
 * 
 * Example 2:
 * 
 * Input: nums = [10]
 * Output: 0
 * Explanation: The array contains less than 2 elements, therefore return 0.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/maximum-gap/">LeetCode #164</a>
 */
public class MaximumGap {

    /**
     * TODO: Implement solution for "Maximum Gap".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Gap");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac MaximumGap.java &amp;&amp; java org.leetcode.medium.MaximumGap
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumGap ===");
        MaximumGap sol = new MaximumGap();
        System.out.println(sol.solve(null));
    }
}
