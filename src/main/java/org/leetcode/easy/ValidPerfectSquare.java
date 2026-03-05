package org.leetcode.easy;

/**
 * <b>#367 - Valid Perfect Square</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * 
 * 
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * 
 * 
 * You must not use any built-in library function, such as sqrt.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: num = 16
 * Output: true
 * Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 * 
 * Example 2:
 * 
 * Input: num = 14
 * Output: false
 * Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= num &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Binary search for x such that x*x==num. Avoid overflow by comparing mid to num/mid.
 *
 * <h2>Complexity</h2>
* Time: O(log n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/valid-perfect-square/">LeetCode #367</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class ValidPerfectSquare {

    /**
     * Returns true if Is perfect square.
     * Uses binary search for O(log n) lookup.
     *
     * @param num the num (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public boolean isPerfectSquare(int num) {
        long lo=1,hi=num;
        while(lo<=hi){long mid=lo+(hi-lo)/2,sq=mid*mid;
            if(sq==num)return true;else if(sq<num)lo=mid+1;else hi=mid-1;}
        return false;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        ValidPerfectSquare sol = new ValidPerfectSquare();
        System.out.println(sol.isPerfectSquare(16)); // true
        System.out.println(sol.isPerfectSquare(14)); // false
    }
}
