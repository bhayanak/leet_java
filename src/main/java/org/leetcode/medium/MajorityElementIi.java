package org.leetcode.medium;

/**
 * <b>#229 - Majority Element II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,3]
 * Output: [3]
 * 
 * Example 2:
 * 
 * Input: nums = [1]
 * Output: [1]
 * 
 * Example 3:
 * 
 * Input: nums = [1,2]
 * Output: [1,2]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 5 * 104
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * 
 *  
 * 
 * Follow up: Could you solve the problem in linear time and in O(1) space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about the possible number of elements that can appear more than ⌊ n/3 ⌋ times in the array.
 * Hint 2: It can be at most two. Why?
 * Hint 3: Consider using Boyer-Moore Voting Algorithm, which is efficient for finding elements that appear more than a certain threshold.
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
 * @see <a href="https://leetcode.com/problems/majority-element-ii/">LeetCode #229</a>
 */
public class MajorityElementIi {

    /** TODO: implement solution for "Majority Element II". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Majority Element II");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== MajorityElementIi ===");
        MajorityElementIi sol = new MajorityElementIi();
        System.out.println(sol.solve(null));
    }
}
