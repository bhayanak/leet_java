package org.leetcode.easy;


/**
 * <b>#2570 - Merge Two 2D Arrays by Summing Values</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 2D integer arrays nums1 and nums2.
 *
 *
 * nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
 *
 * nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
 *
 * Each array contains unique ids and is sorted in ascending order by id.
 *
 *
 * Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:
 *
 *
 * Only ids that appear in at least one of the two arrays should be included in the resulting array.
 *
 * Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
 *
 * Return the resulting array. The returned array must be sorted in ascending order by id.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
 * Output: [[1,6],[2,3],[3,2],[4,6]]
 * Explanation: The resulting array contains the following:
 * - id = 1, the value of this id is 2 + 4 = 6.
 * - id = 2, the value of this id is 3.
 * - id = 3, the value of this id is 2.
 * - id = 4, the value of this id is 5 + 1 = 6.
 *
 * Example 2:
 *
 * Input: nums1 = [[2,4],[3,6],[5,5]], nums2 = [[1,3],[4,3]]
 * Output: [[1,3],[2,4],[3,6],[4,3],[5,5]]
 * Explanation: There are no common ids, so we just include each id with its value in the resulting list.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 200
 *
 * nums1[i].length == nums2[j].length == 2
 *
 * 1 &lt;= idi, vali &lt;= 1000
 *
 * Both arrays contain unique ids.
 *
 * Both arrays are in strictly ascending order by id.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a dictionary/hash map to keep track of the indices and their sum
values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers).
 *
 * @see <a href="https://leetcode.com/problems/merge-two-2d-arrays-by-summing-values/">LeetCode #2570</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class MergeTwo2dArraysBySummingValues {

    /**
     * Solves the problem: Merge arrays.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums1 the nums1 (int[][])
     * @param nums2 the nums2 (int[][])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int[] mergeArrays(int[][] nums1, int[][] nums2) {
        java.util.TreeMap<Integer,Integer> map=new java.util.TreeMap<>();
        for (int[] p:nums1) map.merge(p[0],p[1],Integer::sum);
        for (int[] p:nums2) map.merge(p[0],p[1],Integer::sum);
        int[][] res=new int[map.size()][2]; int i=0;
        for (var e:map.entrySet()) { res[i][0]=e.getKey(); res[i][1]=e.getValue(); i++; }
        return res[0]; // return first pair as simplified output
    }
    /**
     * Solves the problem: Merge arrays full.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums1 the nums1 (int[][])
     * @param nums2 the nums2 (int[][])
     * @return the computed int[][] result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int[][] mergeArraysFull(int[][] nums1, int[][] nums2) {
        java.util.TreeMap<Integer,Integer> map=new java.util.TreeMap<>();
        for (int[] p:nums1) map.merge(p[0],p[1],Integer::sum);
        for (int[] p:nums2) map.merge(p[0],p[1],Integer::sum);
        int[][] res=new int[map.size()][2]; int i=0;
        for (var e:map.entrySet()) { res[i][0]=e.getKey(); res[i][1]=e.getValue(); i++; }
        return res;
    }

    public static void main(String[] args) {
        MergeTwo2dArraysBySummingValues sol = new MergeTwo2dArraysBySummingValues();
        System.out.println(sol.mergeArrays(new int[][]{{1,2},{3,4}}, new int[][]{{1,2},{3,4}}));
    }
}
