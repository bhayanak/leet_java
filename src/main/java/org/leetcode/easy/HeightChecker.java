package org.leetcode.easy;


/**
 * <b>#1051 - Height Checker</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A school is trying to take an annual photo of all the students. The students are asked to stand in a single file line in non-decreasing order by height. Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.
 *
 *
 * You are given an integer array heights representing the current order that the students are standing in. Each heights[i] is the height of the ith student in line (0-indexed).
 *
 *
 * Return the number of indices where heights[i] != expected[i].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation: 
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 *
 * Example 2:
 *
 * Input: heights = [5,1,2,3,4]
 * Output: 5
 * Explanation:
 * heights:  [5,1,2,3,4]
 * expected: [1,2,3,4,5]
 * All indices do not match.
 *
 * Example 3:
 *
 * Input: heights = [1,2,3,4,5]
 * Output: 0
 * Explanation:
 * heights:  [1,2,3,4,5]
 * expected: [1,2,3,4,5]
 * All indices match.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= heights.length &lt;= 100
 *
 * 1 &lt;= heights[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build the correct order of heights by sorting another array, then compare the two arrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Counting Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/height-checker/">LeetCode #1051</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class HeightChecker {

    /**
     * Solves the problem: Height checker.
     * Sorts the input first to enable efficient processing.
     *
     * @param heights the heights (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        java.util.Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) if (heights[i] != expected[i]) count++;
        return count;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac HeightChecker.java &amp;&amp; java org.leetcode.easy.HeightChecker</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        HeightChecker sol = new HeightChecker();
                System.out.println(sol.heightChecker(new int[]{1,1,4,2,1,3})); // 3
                System.out.println(sol.heightChecker(new int[]{5,1,2,3,4}));   // 5
                System.out.println(sol.heightChecker(new int[]{1,2,3,4,5}));   // 0
    }
}
