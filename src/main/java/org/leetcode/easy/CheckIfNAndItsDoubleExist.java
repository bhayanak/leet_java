package org.leetcode.easy;


/**
 * <b>#1346 - Check If N and Its Double Exist</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr of integers, check if there exist two indices i and j such that :
 *
 *
 * i != j
 *
 * 0 &lt;= i, j &lt; arr.length
 *
 * arr[i] == 2 * arr[j]
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
 *
 * Example 2:
 *
 * Input: arr = [3,1,7,11]
 * Output: false
 * Explanation: There is no i and j that satisfy the conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr.length &lt;= 500
 *
 * -103 &lt;= arr[i] &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Loop from i = 0 to arr.length, maintaining in a hashTable the array elements from [0, i - 1].
 * Hint 2: On each step of the loop check if we have seen the element <code>2 * arr[i]</code> so far.
 * Hint 3: Also check if we have seen <code>arr[i] / 2</code> in case <code>arr[i] % 2 == 0</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist/">LeetCode #1346</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class CheckIfNAndItsDoubleExist {

    /**
     * Checks Check if exist.
     *
     * @param arr the arr (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean checkIfExist(int[] arr) {
        java.util.Set<Integer> seen = new java.util.HashSet<>();
        for (int n : arr) {
            if (seen.contains(2*n) || (n%2==0 && seen.contains(n/2))) return true;
            seen.add(n);
        }
        return false;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
        CheckIfNAndItsDoubleExist sol = new CheckIfNAndItsDoubleExist();
                System.out.println(sol.checkIfExist(new int[]{10,2,5,3}));     // true (2*5=10)
                System.out.println(sol.checkIfExist(new int[]{7,1,14,11}));    // true (1*2? no, 7*2=14)
                System.out.println(sol.checkIfExist(new int[]{3,1,7,11}));     // false
    }
}
