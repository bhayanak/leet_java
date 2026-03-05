package org.leetcode.easy;

/**
 * <b>#350 - Intersection of Two Arrays II</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * 
 * Example 2:
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums1.length, nums2.length &lt;= 1000
 * 	
 * 0 &lt;= nums1[i], nums2[i] &lt;= 1000
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * What if the given array is already sorted? How would you optimize your algorithm?
 * 	
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * 	
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Count frequencies from nums1 in a HashMap; for each nums2 element, consume one count.
 *
 * <h2>Complexity</h2>
* Time: O(n+m)  |  Space: O(min(n,m))
 *
 * @see <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">LeetCode #350</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class IntersectionOfTwoArraysIi {

    /**
     * Solves the problem: Intersect.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums1 the nums1 (int[])
     * @param nums2 the nums2 (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int[] intersect(int[] nums1, int[] nums2) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for(int n:nums1) cnt.merge(n,1,Integer::sum);
        java.util.List<Integer> res=new java.util.ArrayList<>();
        for(int n:nums2) if(cnt.getOrDefault(n,0)>0){res.add(n);cnt.merge(n,-1,Integer::sum);}
        return res.stream().mapToInt(i->i).toArray();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        IntersectionOfTwoArraysIi sol = new IntersectionOfTwoArraysIi();
        System.out.println(java.util.Arrays.toString(sol.intersect(new int[]{1,2,2,1},new int[]{2,2}))); // [2,2]
        System.out.println(java.util.Arrays.toString(sol.intersect(new int[]{4,9,5},new int[]{9,4,9,8,4}))); // [4,9]
    }
}
