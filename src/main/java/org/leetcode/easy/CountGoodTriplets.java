package org.leetcode.easy;


/**
 * <b>#1534 - Count Good Triplets</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, and three integers a, b and c. You need to find the number of good triplets.
 *
 *
 * A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:
 *
 *
 *
 *
 * 0 &lt;= i &lt; j &lt; k &lt; arr.length
 *
 * |arr[i] - arr[j]| &lt;= a
 *
 * |arr[j] - arr[k]| &lt;= b
 *
 * |arr[i] - arr[k]| &lt;= c
 *
 *
 *
 * Where |x| denotes the absolute value of x.
 *
 *
 * Return the number of good triplets.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * Output: 4
 * Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
 * Output: 0
 * Explanation: No triplet satisfies all conditions.
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 3 &lt;= arr.length &lt;= 100
 *
 * 0 &lt;= arr[i] &lt;= 1000
 *
 * 0 &lt;= a, b, c &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that the constraints are small enough for a brute force solution to pass.
 * Hint 2: Loop through all triplets, and count the ones that are good.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-good-triplets/">LeetCode #1534</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountGoodTriplets {

    /**
     * Counts Count good triplets.
     *
     * @param arr the arr (int[])
     * @param a the a (int)
     * @param b the b (int)
     * @param c the c (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length, count=0;
        for (int i=0;i<n-2;i++)
            for (int j=i+1;j<n-1;j++) {
                if (Math.abs(arr[i]-arr[j])>a) continue;
                for (int k=j+1;k<n;k++)
                    if (Math.abs(arr[j]-arr[k])<=b && Math.abs(arr[i]-arr[k])<=c) count++;
            }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        CountGoodTriplets sol = new CountGoodTriplets();
                System.out.println(sol.countGoodTriplets(new int[]{3,0,1,1,9,7}, 7,2,3)); // 4
                System.out.println(sol.countGoodTriplets(new int[]{1,1,2,2,3}, 0,0,1));   // 0
    }
}
