package org.leetcode.easy;


/**
 * <b>#1394 - Find Lucky Integer in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
 *
 *
 * Return the largest lucky integer in the array. If there is no lucky integer return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,2,3,4]
 * Output: 2
 * Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
 *
 * Example 2:
 *
 * Input: arr = [1,2,2,3,3,3]
 * Output: 3
 * Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
 *
 * Example 3:
 *
 * Input: arr = [2,2,2,3,3]
 * Output: -1
 * Explanation: There are no lucky numbers in the array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 500
 *
 * 1 &lt;= arr[i] &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each integer in the array.
 * Hint 2: Get all lucky numbers and return the largest of them.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-lucky-integer-in-an-array/">LeetCode #1394</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class FindLuckyIntegerInAnArray {

    /**
     * Finds Find lucky.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param arr the arr (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int findLucky(int[] arr) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        for (int n : arr) cnt.merge(n,1,Integer::sum);
        int lucky=-1;
        for (var e : cnt.entrySet()) if (e.getKey().equals(e.getValue())) lucky=Math.max(lucky,e.getKey());
        return lucky;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        FindLuckyIntegerInAnArray sol = new FindLuckyIntegerInAnArray();
                System.out.println(sol.findLucky(new int[]{2,2,3,4}));         // 2
                System.out.println(sol.findLucky(new int[]{1,2,2,3,3,3}));    // 3
                System.out.println(sol.findLucky(new int[]{2,2,2,3,3}));      // -1
    }
}
