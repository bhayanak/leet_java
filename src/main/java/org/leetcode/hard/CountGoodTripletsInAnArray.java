package org.leetcode.hard;


/**
 * <b>#2179 - Count Good Triplets in an Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed arrays nums1 and nums2 of length n, both of which are permutations of [0, 1, ..., n - 1].
 *
 *
 * A good triplet is a set of 3 distinct values which are present in increasing order by position both in nums1 and nums2. In other words, if we consider pos1v as the index of the value v in nums1 and pos2v as the index of the value v in nums2, then a good triplet will be a set (x, y, z) where 0 &lt;= x, y, z &lt;= n - 1, such that pos1x &lt; pos1y &lt; pos1z and pos2x &lt; pos2y &lt; pos2z.
 *
 *
 * Return the total number of good triplets.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,0,1,3], nums2 = [0,1,2,3]
 * Output: 1
 * Explanation: 
 * There are 4 triplets (x,y,z) such that pos1x &lt; pos1y &lt; pos1z. They are (2,0,1), (2,0,3), (2,1,3), and (0,1,3). 
 * Out of those triplets, only the triplet (0,1,3) satisfies pos2x &lt; pos2y &lt; pos2z. Hence, there is only 1 good triplet.
 *
 * Example 2:
 *
 * Input: nums1 = [4,0,1,3,2], nums2 = [4,1,0,2,3]
 * Output: 4
 * Explanation: The 4 good triplets are (4,0,3), (4,0,2), (4,1,3), and (4,1,2).
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length == nums2.length
 *
 * 3 &lt;= n &lt;= 105
 *
 * 0 &lt;= nums1[i], nums2[i] &lt;= n - 1
 *
 * nums1 and nums2 are permutations of [0, 1, ..., n - 1].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For every value y, how can you find the number of values x  (0 ≤ x, y ≤ n - 1) such that x appears before y in both of the arrays?
 * Hint 2: Similarly, for every value y, try finding the number of values z (0 ≤ y, z ≤ n - 1) such that z appears after y in both of the arrays.
 * Hint 3: Now, for every value y, count the number of good triplets that can be formed if y is considered as the middle element.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Divide and Conquer, Binary Indexed Tree, Segment Tree, Merge Sort, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/count-good-triplets-in-an-array/">LeetCode #2179</a>
 */
public class CountGoodTripletsInAnArray {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Good Triplets in an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== CountGoodTripletsInAnArray ===");
        CountGoodTripletsInAnArray sol = new CountGoodTripletsInAnArray();
        System.out.println(sol.solve(null));
    }
}
