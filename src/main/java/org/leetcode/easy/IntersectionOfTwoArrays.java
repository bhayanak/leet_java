package org.leetcode.easy;

/**
 * <b>#349 - Intersection of Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * Example 2:
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums1.length, nums2.length &lt;= 1000
 * 	
 * 0 &lt;= nums1[i], nums2[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Put nums1 in a set, iterate nums2 checking membership; add to result set.
 *
 * <h2>Complexity</h2>
* Time: O(n+m)  |  Space: O(min(n,m))
 *
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays/">LeetCode #349</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class IntersectionOfTwoArrays {

    /**
     * Solves the problem: Intersection.
     *
     * @param nums1 the nums1 (int[])
     * @param nums2 the nums2 (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int[] intersection(int[] nums1, int[] nums2) {
        java.util.Set<Integer> s=new java.util.HashSet<>();
        for(int n:nums1) s.add(n);
        java.util.Set<Integer> res=new java.util.HashSet<>();
        for(int n:nums2) if(s.contains(n)) res.add(n);
        return res.stream().mapToInt(i->i).toArray();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        IntersectionOfTwoArrays sol = new IntersectionOfTwoArrays();
        System.out.println(java.util.Arrays.toString(sol.intersection(new int[]{1,2,2,1},new int[]{2,2}))); // [2]
        System.out.println(java.util.Arrays.toString(sol.intersection(new int[]{4,9,5},new int[]{9,4,9,8,4}))); // [9,4]
    }
}
