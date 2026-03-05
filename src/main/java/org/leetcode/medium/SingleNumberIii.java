package org.leetcode.medium;

/**
 * <b>#260 - Single Number III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
 * 
 * 
 * You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,1,3,2,5]
 * Output: [3,5]
 * Explanation:  [5, 3] is also a valid answer.
 * 
 * Example 2:
 * 
 * Input: nums = [-1,0]
 * Output: [-1,0]
 * 
 * Example 3:
 * 
 * Input: nums = [0,1]
 * Output: [1,0]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 2 &lt;= nums.length &lt;= 3 * 104
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * 	
 * Each integer in nums will appear twice, only two integers will appear once.
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
 * @see <a href="https://leetcode.com/problems/single-number-iii/">LeetCode #260</a>
 */
public class SingleNumberIii {

    /** TODO: implement solution for "Single Number III". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Single Number III");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== SingleNumberIii ===");
        SingleNumberIii sol = new SingleNumberIii();
        System.out.println(sol.solve(null));
    }
}
