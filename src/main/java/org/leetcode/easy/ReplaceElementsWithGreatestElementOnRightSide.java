package org.leetcode.easy;


/**
 * <b>#1299 - Replace Elements with Greatest Element on Right Side</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 *
 * After doing so, return the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation: 
 * - index 0 --&gt; the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --&gt; the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --&gt; the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --&gt; the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --&gt; the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --&gt; there are no elements to the right of index 5, so we put -1.
 *
 * Example 2:
 *
 * Input: arr = [400]
 * Output: [-1]
 * Explanation: There are no elements to the right of index 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 104
 *
 * 1 &lt;= arr[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Loop through the array starting from the end.
 * Hint 2: Keep the maximum value seen so far.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/">LeetCode #1299</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class ReplaceElementsWithGreatestElementOnRightSide {

    /**
     * Solves the problem: Replace elements.
     *
     * @param arr the arr (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] replaceElements(int[] arr) {
        int maxRight = -1;
        for (int i=arr.length-1;i>=0;i--) {
            int cur = arr[i]; arr[i] = maxRight; maxRight = Math.max(maxRight, cur);
        }
        return arr;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ReplaceElementsWithGreatestElementOnRightSide sol = new ReplaceElementsWithGreatestElementOnRightSide();
                System.out.println(java.util.Arrays.toString(sol.replaceElements(new int[]{17,18,5,4,6,1})));
                // [18,6,6,6,1,-1]
    }
}
