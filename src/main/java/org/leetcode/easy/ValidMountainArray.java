package org.leetcode.easy;


/**
 * <b>#941 - Valid Mountain Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 *
 * Recall that arr is a mountain array if and only if:
 *
 *
 * arr.length &gt;= 3
 *
 * There exists some i with 0 &lt; i &lt; arr.length - 1 such that:
 *
 *
 *
 * arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i] 
 *
 * arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]
 *
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,1]
 * Output: false
 *
 *
 * Example 2:
 *
 * Input: arr = [3,5,5]
 * Output: false
 *
 *
 * Example 3:
 *
 * Input: arr = [0,3,2,1]
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 104
 *
 * 0 &lt;= arr[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It's very easy to keep track of a monotonically increasing or decreasing ordering of elements. You just need to be able to determine the start of the valley in the mountain and from that point onwards, it should be a valley i.e. no mini-hills after that. Use this information in regards to the values in the array and you will be able to come up with a straightforward solution.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/valid-mountain-array/">LeetCode #941</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class ValidMountainArray {

    /**
     * Solves the problem: Valid mountain array.
     *
     * @param arr the arr (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean validMountainArray(int[] arr) {
        int n = arr.length, i = 0;
        while (i+1 < n && arr[i] < arr[i+1]) i++;
        if (i == 0 || i == n-1) return false;
        while (i+1 < n && arr[i] > arr[i+1]) i++;
        return i == n-1;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ValidMountainArray.java &amp;&amp; java org.leetcode.easy.ValidMountainArray</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ValidMountainArray sol = new ValidMountainArray();
                System.out.println(sol.validMountainArray(new int[]{2,1}));       // false
                System.out.println(sol.validMountainArray(new int[]{3,5,5}));     // false
                System.out.println(sol.validMountainArray(new int[]{0,3,2,1}));   // true
    }
}
