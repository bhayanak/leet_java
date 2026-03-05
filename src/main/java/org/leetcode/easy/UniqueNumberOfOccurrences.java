package org.leetcode.easy;


/**
 * <b>#1207 - Unique Number of Occurrences</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,2,1,1,3]
 * Output: true
 * Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 *
 * Example 2:
 *
 * Input: arr = [1,2]
 * Output: false
 *
 * Example 3:
 *
 * Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 1000
 *
 * -1000 &lt;= arr[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the number of occurrences of each element in the array using a hash map.
 * Hint 2: Iterate through the hash map and check if there is a repeated value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/unique-number-of-occurrences/">LeetCode #1207</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class UniqueNumberOfOccurrences {

    /**
     * Solves the problem: Unique occurrences.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param arr the arr (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts. Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean uniqueOccurrences(int[] arr) {
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        for (int n : arr) cnt.merge(n, 1, Integer::sum);
        java.util.Set<Integer> freqs = new java.util.HashSet<>(cnt.values());
        return freqs.size() == cnt.size();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        UniqueNumberOfOccurrences sol = new UniqueNumberOfOccurrences();
                System.out.println(sol.uniqueOccurrences(new int[]{1,2,2,1,1,3})); // true
                System.out.println(sol.uniqueOccurrences(new int[]{1,2}));         // false
    }
}
