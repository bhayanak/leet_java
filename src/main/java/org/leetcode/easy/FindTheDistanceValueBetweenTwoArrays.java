package org.leetcode.easy;


/**
 * <b>#1385 - Find the Distance Value Between Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
 *
 *
 * The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| &lt;= d.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
 * Output: 2
 * Explanation: 
 * For arr1[0]=4 we have: 
 * |4-10|=6 &gt; d=2 
 * |4-9|=5 &gt; d=2 
 * |4-1|=3 &gt; d=2 
 * |4-8|=4 &gt; d=2 
 * For arr1[1]=5 we have: 
 * |5-10|=5 &gt; d=2 
 * |5-9|=4 &gt; d=2 
 * |5-1|=4 &gt; d=2 
 * |5-8|=3 &gt; d=2
 * For arr1[2]=8 we have:
 * |8-10|=2 &lt;= d=2
 * |8-9|=1 &lt;= d=2
 * |8-1|=7 &gt; d=2
 * |8-8|=0 &lt;= d=2
 *
 * Example 2:
 *
 * Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
 * Output: 2
 *
 * Example 3:
 *
 * Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr1.length, arr2.length &lt;= 500
 *
 * -1000 &lt;= arr1[i], arr2[j] &lt;= 1000
 *
 * 0 &lt;= d &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort 'arr2' and use binary search to get the closest element for each 'arr1[i]', it gives a time complexity of O(nlogn).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-distance-value-between-two-arrays/">LeetCode #1385</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class FindTheDistanceValueBetweenTwoArrays {

    /**
     * Finds Find the distance value.
     * Sorts the input first to enable efficient processing.
     *
     * @param arr1 the arr1 (int[])
     * @param arr2 the arr2 (int[])
     * @param d the d (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        java.util.Arrays.sort(arr2);
        int count=0;
        outer:
        for (int a : arr1) {
            for (int b : arr2) if (Math.abs(a-b)<=d) continue outer;
            count++;
        }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FindTheDistanceValueBetweenTwoArrays sol = new FindTheDistanceValueBetweenTwoArrays();
                System.out.println(sol.findTheDistanceValue(new int[]{4,5,8}, new int[]{10,9,1,8}, 2)); // 2
                System.out.println(sol.findTheDistanceValue(new int[]{1,4,2,3}, new int[]{-4,-3,6,10,20,30}, 3)); // 2
                System.out.println(sol.findTheDistanceValue(new int[]{2,1,100,3}, new int[]{-5,-2,10,-3,7}, 6)); // 1
    }
}
