package org.leetcode.easy;


/**
 * <b>#2215 - Find the Difference of Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 *
 *
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 *
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 *
 * Note that the integers in the lists may be returned in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3], nums2 = [2,4,6]
 * Output: [[1,3],[4,6]]
 * Explanation:
 * For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
 * For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums1. Therefore, answer[1] = [4,6].
 *
 * Example 2:
 *
 * Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
 * Output: [[3],[]]
 * Explanation:
 * For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
 * Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 1000
 *
 * -1000 &lt;= nums1[i], nums2[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each integer in nums1, check if it exists in nums2.
 * Hint 2: Do the same for each integer in nums2.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 *
 * @see <a href="https://leetcode.com/problems/find-the-difference-of-two-arrays/">LeetCode #2215</a>
 */
public class FindTheDifferenceOfTwoArrays {


    /**
     * Returns two lists: integers in nums1 not in nums2, and vice versa.
     *
     * @param nums1 first integer array
     * @param nums2 second integer array
     * @return list of two lists of distinct-only integers
     *
     * <p><b>Explanation:</b> Stores each array's elements in a HashSet, then removes</p>
     *   the intersection from each set. The two resulting sets are the answers.
     *   Time O(n + m), Space O(n + m).
     */
    public java.util.List<java.util.List<Integer>> findDifference(int[] nums1, int[] nums2) {
        java.util.Set<Integer> s1=new java.util.HashSet<>(), s2=new java.util.HashSet<>();
        for (int n:nums1) s1.add(n); for (int n:nums2) s2.add(n);
        java.util.Set<Integer> r1=new java.util.HashSet<>(s1), r2=new java.util.HashSet<>(s2);
        r1.removeAll(s2); r2.removeAll(s1);
        return java.util.Arrays.asList(new java.util.ArrayList<>(r1), new java.util.ArrayList<>(r2));
    }

    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays sol = new FindTheDifferenceOfTwoArrays();
        System.out.println(sol.findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
    }
}
