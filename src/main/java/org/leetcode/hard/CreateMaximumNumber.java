package org.leetcode.hard;

/**
 * <b>#321 - Create Maximum Number</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2 of lengths m and n respectively. nums1 and nums2 represent the digits of two numbers. You are also given an integer k.
 * 
 * 
 * Create the maximum number of length k &lt;= m + n from digits of the two numbers. The relative order of the digits from the same array must be preserved.
 * 
 * 
 * Return an array of the k digits representing the answer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums1 = [3,4,6,5], nums2 = [9,1,2,5,8,3], k = 5
 * Output: [9,8,6,5,3]
 * 
 * Example 2:
 * 
 * Input: nums1 = [6,7], nums2 = [6,0,4], k = 5
 * Output: [6,7,6,0,4]
 * 
 * Example 3:
 * 
 * Input: nums1 = [3,9], nums2 = [8,9], k = 3
 * Output: [9,8,9]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * m == nums1.length
 * 	
 * n == nums2.length
 * 	
 * 1 &lt;= m, n &lt;= 500
 * 	
 * 0 &lt;= nums1[i], nums2[i] &lt;= 9
 * 	
 * 1 &lt;= k &lt;= m + n
 * 	
 * nums1 and nums2 do not have leading zeros.
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
 * @see <a href="https://leetcode.com/problems/create-maximum-number/">LeetCode #321</a>
 */
public class CreateMaximumNumber {

    /** TODO: implement solution for "Create Maximum Number". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Create Maximum Number");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== CreateMaximumNumber ===");
        CreateMaximumNumber sol = new CreateMaximumNumber();
        System.out.println(sol.solve(null));
    }
}
