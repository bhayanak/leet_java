package org.leetcode.easy;

/**
 * <b>#69 - Sqrt(x)</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * 
 * 
 * You must not use any built-in exponent function or operator.
 * 
 * 	
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * 
 * Example 2:
 * 
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= x &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Try exploring all integers. (Credits: @annujoshi)
 * - Use the sorted property of integers to reduced the search space. (Credits: @annujoshi)
 *
 * <h2>Approach</h2>
 * Binary search in [0, x]: find the largest integer whose square ≤ x.
 * Integer Newton's method converges faster but binary search is clearer.
 *
 * <h2>Complexity</h2>
* Time: O(log x)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/sqrtx/">LeetCode #69</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class SqrtX {

    /**
     * Computes the integer square root of x (floor of √x).
     *
     * @param x non-negative integer
     * @return  floor(√x)
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public int mySqrt(int x) {
        if (x < 2) return x;
        int lo = 1, hi = x / 2, ans = 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long sq = (long) mid * mid;
            if (sq == x) return mid;
            if (sq < x) { ans = mid; lo = mid + 1; }
            else hi = mid - 1;
        }
        return ans;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== SqrtX ===");
        System.out.println("See class methods for usage.");
    }
}
