package org.leetcode.easy;


/**
 * <b>#3731 - Find Missing Elements</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums consisting of unique integers.
 *
 *
 * Originally, nums contained every integer within a certain range. However, some integers might have gone missing from the array.
 *
 *
 * The smallest and largest integers of the original range are still present in nums.
 *
 *
 * Return a sorted list of all the missing integers in this range. If no integers are missing, return an empty list.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,2,5]
 *
 *
 * Output: [3]
 *
 *
 * Explanation:
 *
 *
 * The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5]. Among these, only 3 is missing.
 *
 * Example 2:
 *
 * Input: nums = [7,8,6,9]
 *
 *
 * Output: []
 *
 *
 * Explanation:
 *
 *
 * The smallest integer is 6 and the largest is 9, so the full range is [6,7,8,9]. All integers are already present, so no integer is missing.
 *
 * Example 3:
 *
 * Input: nums = [5,1]
 *
 *
 * Output: [2,3,4]
 *
 *
 * Explanation:
 *
 *
 * The smallest integer is 1 and the largest is 5, so the full range should be [1,2,3,4,5]. The missing integers are 2, 3, and 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First, find the maximum and minimum elements in the array.
 * Hint 2: Then, iterate over all the integers in the range <code>[min, max]</code> and check if they are in the array.
 * Hint 3: If not, add them to the array, and return the sorted array at the end.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-missing-elements/">LeetCode #3731</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class FindMissingElements {

    /**
     * Counts Count pairs in array.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int countPairsInArray(int[] nums) {
        java.util.Map<Integer,Integer> cnt=new java.util.HashMap<>();
        int pairs=0;
        for (int n:nums) { pairs+=cnt.getOrDefault(n,0); cnt.merge(n,1,Integer::sum); }
        return pairs;
    }

    public static void main(String[] args) {
        FindMissingElements sol = new FindMissingElements();
        System.out.println(sol.countPairsInArray(new int[]{1,2,3}));
    }
}
