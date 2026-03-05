package org.leetcode.medium;

/**
 * <b>#307 - Range Sum Query - Mutable</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Design, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, handle multiple queries of the following types:
 * 
 * 	
 * Update the value of an element in nums.
 * 	
 * Calculate the sum of the elements of nums between indices left and right inclusive where left &lt;= right.
 * 
 * Implement the NumArray class:
 * 
 * 	
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * 	
 * void update(int index, int val) Updates the value of nums[index] to be val.
 * 	
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 * 
 *  
 * 
 * Example 1:
 * 
 * Input
 * ["NumArray", "sumRange", "update", "sumRange"]
 * [[[1, 3, 5]], [0, 2], [1, 2], [0, 2]]
 * Output
 * [null, 9, null, 8]
 * 
 * Explanation
 * NumArray numArray = new NumArray([1, 3, 5]);
 * numArray.sumRange(0, 2); // return 1 + 3 + 5 = 9
 * numArray.update(1, 2);   // nums = [1, 2, 5]
 * numArray.sumRange(0, 2); // return 1 + 2 + 5 = 8
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 3 * 104
 * 	
 * -100 &lt;= nums[i] &lt;= 100
 * 	
 * 0 &lt;= index &lt; nums.length
 * 	
 * -100 &lt;= val &lt;= 100
 * 	
 * 0 &lt;= left &lt;= right &lt; nums.length
 * 	
 * At most 3 * 104 calls will be made to update and sumRange.
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
 * @see <a href="https://leetcode.com/problems/range-sum-query-mutable/">LeetCode #307</a>
 */
public class RangeSumQueryMutable {

    /** TODO: implement solution for "Range Sum Query - Mutable". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Range Sum Query - Mutable");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== RangeSumQueryMutable ===");
        RangeSumQueryMutable sol = new RangeSumQueryMutable();
        System.out.println(sol.solve(null));
    }
}
