package org.leetcode.medium;

/**
 * <b>#324 - Wiggle Sort II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Greedy, Sorting, Quickselect</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, reorder it such that nums[0] &lt; nums[1] &gt; nums[2] &lt; nums[3]....
 * 
 * 
 * You may assume the input array always has a valid answer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,5,1,1,6,4]
 * Output: [1,6,1,5,1,4]
 * Explanation: [1,4,1,5,1,6] is also accepted.
 * 
 * Example 2:
 * 
 * Input: nums = [1,3,2,2,3,1]
 * Output: [2,3,1,3,1,2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 5 * 104
 * 	
 * 0 &lt;= nums[i] &lt;= 5000
 * 	
 * It is guaranteed that there will be an answer for the given input nums.
 * 
 *  
 * Follow Up: Can you do it in O(n) time and/or in-place with O(1) extra space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/wiggle-sort-ii/">LeetCode #324</a>
 */
public class WiggleSortIi {

    /** TODO: implement solution for "Wiggle Sort II". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Wiggle Sort II");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== WiggleSortIi ===");
        WiggleSortIi sol = new WiggleSortIi();
        System.out.println(sol.solve(null));
    }
}
