package org.leetcode.easy;


/**
 * <b>#1502 - Can Make Arithmetic Progression From Sequence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
 *
 *
 * Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,5,1]
 * Output: true
 * Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
 *
 * Example 2:
 *
 * Input: arr = [1,2,4]
 * Output: false
 * Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 1000
 *
 * -106 &lt;= arr[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider that any valid arithmetic progression will be in sorted order.
 * Hint 2: Sort the array, then check if the differences of all consecutive elements are equal.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/">LeetCode #1502</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class CanMakeArithmeticProgressionFromSequence {

    /**
     * Returns true if the input can Can make arithmetic progression.
     * Sorts the input first to enable efficient processing.
     *
     * @param arr the arr (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public boolean canMakeArithmeticProgression(int[] arr) {
        java.util.Arrays.sort(arr);
        int d = arr[1]-arr[0];
        for (int i=2;i<arr.length;i++) if (arr[i]-arr[i-1]!=d) return false;
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        CanMakeArithmeticProgressionFromSequence sol = new CanMakeArithmeticProgressionFromSequence();
                System.out.println(sol.canMakeArithmeticProgression(new int[]{3,5,1}));   // true
                System.out.println(sol.canMakeArithmeticProgression(new int[]{1,2,4}));   // false
    }
}
