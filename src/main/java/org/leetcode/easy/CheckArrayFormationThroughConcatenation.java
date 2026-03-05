package org.leetcode.easy;


/**
 * <b>#1640 - Check Array Formation Through Concatenation</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of distinct integers arr and an array of integer arrays pieces, where the integers in pieces are distinct. Your goal is to form arr by concatenating the arrays in pieces in any order. However, you are not allowed to reorder the integers in each array pieces[i].
 *
 *
 * Return true if it is possible to form the array arr from pieces. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [15,88], pieces = [[88],[15]]
 * Output: true
 * Explanation: Concatenate [15] then [88]
 *
 * Example 2:
 *
 * Input: arr = [49,18,16], pieces = [[16,18,49]]
 * Output: false
 * Explanation: Even though the numbers match, we cannot reorder pieces[0].
 *
 * Example 3:
 *
 * Input: arr = [91,4,64,78], pieces = [[78],[4,64],[91]]
 * Output: true
 * Explanation: Concatenate [91] then [4,64] then [78]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= pieces.length &lt;= arr.length &lt;= 100
 *
 * sum(pieces[i].length) == arr.length
 *
 * 1 &lt;= pieces[i].length &lt;= arr.length
 *
 * 1 &lt;= arr[i], pieces[i][j] &lt;= 100
 *
 * The integers in arr are distinct.
 *
 * The integers in pieces are distinct (i.e., If we flatten pieces in a 1D array, all the integers in this array are distinct).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that the distinct part means that every position in the array belongs to only one piece
 * Hint 2: Note that you can get the piece every position belongs to naively
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-array-formation-through-concatenation/">LeetCode #1640</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class CheckArrayFormationThroughConcatenation {

    /**
     * Returns true if the input can Can form array.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param arr the arr (int[])
     * @param pieces the pieces (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public boolean canFormArray(int[] arr, int[][] pieces) {
        java.util.Map<Integer,int[]> map = new java.util.HashMap<>();
        for (int[] p : pieces) map.put(p[0], p);
        int i=0;
        while (i<arr.length) {
            if (!map.containsKey(arr[i])) return false;
            int[] p = map.get(arr[i]);
            for (int v : p) { if (i>=arr.length || arr[i]!=v) return false; i++; }
        }
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        CheckArrayFormationThroughConcatenation sol = new CheckArrayFormationThroughConcatenation();
                System.out.println(sol.canFormArray(new int[]{85}, new int[][]{{85}})); // true
                System.out.println(sol.canFormArray(new int[]{15,88}, new int[][]{{88},{15}})); // true
                System.out.println(sol.canFormArray(new int[]{49,18,16}, new int[][]{{16,18,49}})); // false
    }
}
