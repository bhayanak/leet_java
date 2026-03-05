package org.leetcode.easy;


/**
 * <b>#2032 - Two Out of Three</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given three integer arrays nums1, nums2, and nums3, return a distinct array containing all the values that are present in at least two out of the three arrays. You may return the values in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
 * Output: [3,2]
 * Explanation: The values that are present in at least two arrays are:
 * - 3, in all three arrays.
 * - 2, in nums1 and nums2.
 *
 * Example 2:
 *
 * Input: nums1 = [3,1], nums2 = [2,3], nums3 = [1,2]
 * Output: [2,3,1]
 * Explanation: The values that are present in at least two arrays are:
 * - 2, in nums2 and nums3.
 * - 3, in nums1 and nums2.
 * - 1, in nums1 and nums3.
 *
 * Example 3:
 *
 * Input: nums1 = [1,2,2], nums2 = [4,3,3], nums3 = [5]
 * Output: []
 * Explanation: No value is present in at least two arrays.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length, nums3.length &lt;= 100
 *
 * 1 &lt;= nums1[i], nums2[j], nums3[k] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What data structure can we use to help us quickly find whether an element belongs in an array?
 * Hint 2: Can we count the frequencies of the elements in each array?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/two-out-of-three/">LeetCode #2032</a>
 */
public class TwoOutOfThree {


    /**
     * Returns all values that appear in at least two of the three arrays.
     *
     * @param nums1 first integer array
     * @param nums2 second integer array
     * @param nums3 third integer array
     * @return list of integers appearing in at least two arrays
     *
     * <p><b>Explanation:</b> Uses a frequency map, counting each distinct value per array</p>
     *   (using a set per array), then returns values with frequency &gt;= 2.
     *   Time O(n1 + n2 + n3), Space O(n1 + n2 + n3).
     */
    public java.util.List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        for (int n:new java.util.HashSet<>(intList(nums1))) cnt.merge(n,1,Integer::sum);
        for (int n:new java.util.HashSet<>(intList(nums2))) cnt.merge(n,1,Integer::sum);
        for (int n:new java.util.HashSet<>(intList(nums3))) cnt.merge(n,1,Integer::sum);
        java.util.List<Integer> res = new java.util.ArrayList<>();
        for (var e:cnt.entrySet()) if (e.getValue()>=2) res.add(e.getKey());
        return res;
    }
    private java.util.List<Integer> intList(int[] a) {
        java.util.List<Integer> l=new java.util.ArrayList<>();
        for (int v:a) l.add(v); return l;
    }

    public static void main(String[] args) {
        TwoOutOfThree sol = new TwoOutOfThree();
        System.out.println(sol.twoOutOfThree(new int[]{1,1,3,2}, new int[]{2,3}, new int[]{3}));
    }
}
