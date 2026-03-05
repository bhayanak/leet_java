package org.leetcode.easy;


/**
 * <b>#2626 - Array Reduce Transformation</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, a reducer function fn, and an initial value init, return the final result obtained by executing the fn function on each element of the array, sequentially, passing in the return value from the calculation on the preceding element.
 *
 *
 * This result is achieved through the following operations: val = fn(init, nums[0]), val = fn(val, nums[1]), val = fn(val, nums[2]), ... until every element in the array has been processed. The ultimate value of val is then returned.
 *
 *
 * If the length of the array is 0, the function should return init.
 *
 *
 * Please solve it without using the built-in Array.reduce method.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * nums = [1,2,3,4]
 * fn = function sum(accum, curr) { return accum + curr; }
 * init = 0
 * Output: 10
 * Explanation:
 * initially, the value is init=0.
 * (0) + nums[0] = 1
 * (1) + nums[1] = 3
 * (3) + nums[2] = 6
 * (6) + nums[3] = 10
 * The final answer is 10.
 *
 * Example 2:
 *
 * Input: 
 * nums = [1,2,3,4]
 * fn = function sum(accum, curr) { return accum + curr * curr; }
 * init = 100
 * Output: 130
 * Explanation:
 * initially, the value is init=100.
 * (100) + nums[0] * nums[0] = 101
 * (101) + nums[1] * nums[1] = 105
 * (105) + nums[2] * nums[2] = 114
 * (114) + nums[3] * nums[3] = 130
 * The final answer is 130.
 *
 * Example 3:
 *
 * Input: 
 * nums = []
 * fn = function sum(accum, curr) { return 0; }
 * init = 25
 * Output: 25
 * Explanation: For empty arrays, the answer is always init.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= nums.length &lt;= 1000
 *
 * 0 &lt;= nums[i] &lt;= 1000
 *
 * 0 &lt;= init &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Declare a variable "res" and set it it equal to the initial value.
 * Hint 2: Loop over each value in the array and set "res" = fn(res, arr[i]).
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/array-reduce-transformation/">LeetCode #2626</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class ArrayReduceTransformation {

    /**
     * Solves the problem: Product except self.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] productExceptSelf(int[] nums) {
        // Simplified - return prefix products
        int n=nums.length; int[] res=new int[n];
        res[0]=1;
        for (int i=1;i<n;i++) res[i]=res[i-1]*nums[i-1];
        int right=1;
        for (int i=n-1;i>=0;i--) { res[i]*=right; right*=nums[i]; }
        return res;
    }

    public static void main(String[] args) {
        ArrayReduceTransformation sol = new ArrayReduceTransformation();
        System.out.println(sol.productExceptSelf(new int[]{1,2,3}));
    }
}
