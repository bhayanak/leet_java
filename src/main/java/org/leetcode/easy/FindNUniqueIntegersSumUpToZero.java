package org.leetcode.easy;


/**
 * <b>#1304 - Find N Unique Integers Sum up to Zero</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return any array containing n unique integers such that they add up to 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: [-7,-1,1,3,4]
 * Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: [-1,0,1]
 *
 * Example 3:
 *
 * Input: n = 1
 * Output: [0]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Return an array where the values are symmetric. (+x , -x).
 * Hint 2: If n is odd, append value 0 in your returned array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/">LeetCode #1304</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class FindNUniqueIntegersSumUpToZero {

    /**
     * Computes the sum of Sum zero.
     *
     * @param n the n (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i=0;i<n-1;i++) res[i] = i+1;
        // last element = -sum of previous
        int sum=0; for (int i=0;i<n-1;i++) sum+=res[i];
        res[n-1] = -sum;
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        FindNUniqueIntegersSumUpToZero sol = new FindNUniqueIntegersSumUpToZero();
                System.out.println(java.util.Arrays.toString(sol.sumZero(5))); // e.g. [1,2,3,4,-10]
                System.out.println(java.util.Arrays.toString(sol.sumZero(3))); // e.g. [1,2,-3]
                System.out.println(java.util.Arrays.toString(sol.sumZero(1))); // [0]
    }
}
