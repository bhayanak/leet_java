package org.leetcode.easy;


/**
 * <b>#1566 - Detect Pattern of Length M Repeated K or More Times</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers arr, find a pattern of length m that is repeated k or more times.
 *
 *
 * A pattern is a subarray (consecutive sub-sequence) that consists of one or more values, repeated multiple times consecutively without overlapping. A pattern is defined by its length and the number of repetitions.
 *
 *
 * Return true if there exists a pattern of length m that is repeated k or more times, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,4,4,4,4], m = 1, k = 3
 * Output: true
 * Explanation: The pattern (4) of length 1 is repeated 4 consecutive times. Notice that pattern can be repeated k or more times but not less.
 *
 * Example 2:
 *
 * Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
 * Output: true
 * Explanation: The pattern (1,2) of length 2 is repeated 2 consecutive times. Another valid pattern (2,1) is also repeated 2 times.
 *
 * Example 3:
 *
 * Input: arr = [1,2,1,2,1,3], m = 2, k = 3
 * Output: false
 * Explanation: The pattern (1,2) is of length 2 but is repeated only 2 times. There is no pattern of length 2 that is repeated 3 or more times.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 100
 *
 * 1 &lt;= arr[i] &lt;= 100
 *
 * 1 &lt;= m &lt;= 100
 *
 * 2 &lt;= k &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a three-layer loop to check all possible patterns by iterating through all possible starting positions, all indexes less than m, and if the character at the index is repeated k times.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/detect-pattern-of-length-m-repeated-k-or-more-times/">LeetCode #1566</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class DetectPatternOfLengthMRepeatedKOrMoreTimes {

    /**
     * Solves the problem: Contains pattern.
     *
     * @param arr the arr (int[])
     * @param m the m (int)
     * @param k the k (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean containsPattern(int[] arr, int m, int k) {
        int count=0, n=arr.length;
        for (int i=0;i+m<n;i++) {
            if (arr[i]==arr[i+m]) count++;
            else count=0;
            if (count==(k-1)*m) return true;
        }
        return false;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        DetectPatternOfLengthMRepeatedKOrMoreTimes sol = new DetectPatternOfLengthMRepeatedKOrMoreTimes();
                System.out.println(sol.containsPattern(new int[]{1,2,4,4,4,4},1,3)); // true
                System.out.println(sol.containsPattern(new int[]{1,2,1,2,1,1,1,3},2,2)); // true
                System.out.println(sol.containsPattern(new int[]{1,2,1,2,1,3},2,3)); // false
    }
}
