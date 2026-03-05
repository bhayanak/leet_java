package org.leetcode.easy;


/**
 * <b>#2619 - Array Prototype Last</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write code that enhances all arrays such that you can call the array.last() method on any array and it will return the last element. If there are no elements in the array, it should return -1.
 *
 *
 * You may assume the array is the output of JSON.parse.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [null, {}, 3]
 * Output: 3
 * Explanation: Calling nums.last() should return the last element: 3.
 *
 * Example 2:
 *
 * Input: nums = []
 * Output: -1
 * Explanation: Because there are no elements, return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * arr is a valid JSON array
 *
 * 0 &lt;= arr.length &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Inside the Array.prototype.last function body, you have access to the "this" keyword. "this" is equal to the contents of the array in this case.
 * Hint 2: You can access elements in the array via this[0], this[1], etc. You can also access properties and method like this.length, this.forEach, etc.
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/array-prototype-last/">LeetCode #2619</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class ArrayPrototypeLast {

    /**
     * Solves the problem: Number of arrays.
     *
     * @param differences the differences (int[])
     * @param lower the lower (int)
     * @param upper the upper (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min=0, max=0, cur=0;
        for (int d:differences) { cur+=d; min=Math.min(min,cur); max=Math.max(max,cur); }
        return (int)Math.max(0, (long)(upper-lower)-(max-min)+1);
    }

    public static void main(String[] args) {
        ArrayPrototypeLast sol = new ArrayPrototypeLast();
        System.out.println(sol.numberOfArrays(new int[]{1,2,3}, 0, 0));
    }
}
