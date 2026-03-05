package org.leetcode.hard;

/**
 * <b>#330 - Patching Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a sorted integer array nums and an integer n, add/patch elements to the array such that any number in the range [1, n] inclusive can be formed by the sum of some elements in the array.
 * 
 * 
 * Return the minimum number of patches required.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,3], n = 6
 * Output: 1
 * Explanation:
 * Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
 * Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
 * Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
 * So we only need 1 patch.
 * 
 * Example 2:
 * 
 * Input: nums = [1,5,10], n = 20
 * Output: 2
 * Explanation: The two patches can be [2, 4].
 * 
 * Example 3:
 * 
 * Input: nums = [1,2,2], n = 5
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 1000
 * 	
 * 1 &lt;= nums[i] &lt;= 104
 * 	
 * nums is sorted in ascending order.
 * 	
 * 1 &lt;= n &lt;= 231 - 1
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
 * @see <a href="https://leetcode.com/problems/patching-array/">LeetCode #330</a>
 */
public class PatchingArray {

    /** TODO: implement solution for "Patching Array". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Patching Array");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== PatchingArray ===");
        PatchingArray sol = new PatchingArray();
        System.out.println(sol.solve(null));
    }
}
