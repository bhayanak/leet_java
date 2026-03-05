package org.leetcode.easy;


/**
 * <b>#2248 - Intersection of Multiple Arrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers, return the list of integers that are present in each array of nums sorted in ascending order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [[3,1,2,4,5],[1,2,3,4],[3,4,5,6]]
 * Output: [3,4]
 * Explanation: 
 * The only integers present in each of nums[0] = [3,1,2,4,5], nums[1] = [1,2,3,4], and nums[2] = [3,4,5,6] are 3 and 4, so we return [3,4].
 *
 * Example 2:
 *
 * Input: nums = [[1,2,3],[4,5,6]]
 * Output: []
 * Explanation: 
 * There does not exist any integer present both in nums[0] and nums[1], so we return an empty list [].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= sum(nums[i].length) &lt;= 1000
 *
 * 1 &lt;= nums[i][j] &lt;= 1000
 *
 * All the values of nums[i] are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep a count of the number of times each integer occurs in nums.
 * Hint 2: Since all integers of nums[i] are distinct, if an integer is present in each array, its count will be equal to the total number of arrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Counting).
 *
 * @see <a href="https://leetcode.com/problems/intersection-of-multiple-arrays/">LeetCode #2248</a>
 */
public class IntersectionOfMultipleArrays {


    /**
     * Returns the sorted list of integers present in every sub-array.
     *
     * @param nums 2D array of integer arrays
     * @return sorted list of common integers across all arrays
     *
     * <p><b>Explanation:</b> Counts how many arrays contain each number using a frequency</p>
     *   map; numbers with frequency == nums.length appear in all arrays.
     *   Time O(n * m), Space O(max_val).
     */
    public java.util.List<Integer> intersection(int[][] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        for (int[] arr:nums) for (int n:new java.util.HashSet<>(intList(arr))) cnt.merge(n,1,Integer::sum);
        java.util.List<Integer> res=new java.util.ArrayList<>();
        for (var e:cnt.entrySet()) if (e.getValue()==nums.length) res.add(e.getKey());
        java.util.Collections.sort(res); return res;
    }
    private java.util.List<Integer> intList(int[]a){java.util.List<Integer>l=new java.util.ArrayList<>();for(int v:a)l.add(v);return l;}

    public static void main(String[] args) {
        IntersectionOfMultipleArrays sol = new IntersectionOfMultipleArrays();
        System.out.println(sol.intersection(new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
    }
}
