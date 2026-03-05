package org.leetcode.easy;


/**
 * <b>#1089 - Duplicate Zeros</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
 *
 *
 * Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 *
 * Example 2:
 *
 * Input: arr = [1,2,3]
 * Output: [1,2,3]
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 104
 *
 * 0 &lt;= arr[i] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: This is a great introductory problem for understanding and working with the concept of in-place operations. The problem statement clearly states that we are to modify the array in-place. That does not mean we cannot use another array. We just don't have to return anything.
 * Hint 2: A better way to solve this would be without using additional space. The only reason the problem statement allows you to make modifications in place is that it hints at avoiding any additional memory.
 * Hint 3: The main problem with not using additional memory is that we might override elements due to the zero duplication requirement of the problem statement. How do we get around that?
 * Hint 4: If we had enough space available, we would be able to accommodate all the elements properly. The new length would be the original length of the array plus the number of zeros. Can we use this information somehow to solve the problem?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/duplicate-zeros/">LeetCode #1089</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class DuplicateZeros {

    /**
     * Solves the problem: Duplicate zeros.
     *
     * @param arr the arr (int[])
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                // shift right
                for (int j = n-1; j > i+1; j--) arr[j] = arr[j-1];
                if (i+1 < n) arr[i+1] = 0;
                i++; // skip the inserted zero
            }
        }
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DuplicateZeros.java &amp;&amp; java org.leetcode.easy.DuplicateZeros</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        DuplicateZeros sol = new DuplicateZeros();
                int[] a1 = {1,0,2,3,0,4,5,0};
                sol.duplicateZeros(a1);
                System.out.println(java.util.Arrays.toString(a1)); // [1,0,0,2,3,0,0,4]
                int[] a2 = {1,2,3};
                sol.duplicateZeros(a2);
                System.out.println(java.util.Arrays.toString(a2)); // [1,2,3]
    }
}
