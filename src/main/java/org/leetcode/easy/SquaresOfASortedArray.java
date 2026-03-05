package org.leetcode.easy;


/**
 * <b>#977 - Squares of a Sorted Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 *
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 104
 *
 * -104 &lt;= nums[i] &lt;= 104
 *
 * nums is sorted in non-decreasing order.
 *
 *
 * Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">LeetCode #977</a>
  *
  * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
  */
public class SquaresOfASortedArray {

    /**
     * Solves the problem: Sorted squares.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
      */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int l = 0, r = n-1, pos = n-1;
        while (l <= r) {
            int lsq = nums[l]*nums[l], rsq = nums[r]*nums[r];
            if (lsq > rsq) { res[pos--] = lsq; l++; }
            else           { res[pos--] = rsq; r--; }
        }
        return res;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SquaresOfASortedArray.java &amp;&amp; java org.leetcode.easy.SquaresOfASortedArray</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        SquaresOfASortedArray sol = new SquaresOfASortedArray();
                System.out.println(java.util.Arrays.toString(sol.sortedSquares(new int[]{-4,-1,0,3,10})));
                // [0,1,9,16,100]
                System.out.println(java.util.Arrays.toString(sol.sortedSquares(new int[]{-7,-3,2,3,11})));
                // [4,9,9,49,121]
    }
}
