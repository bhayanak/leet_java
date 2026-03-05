package org.leetcode.medium;

/**
 * <b>#189 - Rotate Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * 
 * Example 2:
 * 
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation: 
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * -231 &lt;= nums[i] &lt;= 231 - 1
 * 	
 * 0 &lt;= k &lt;= 105
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
 * 	
 * Could you do it in-place with O(1) extra space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The easiest solution would use additional memory and that is perfectly fine.
 * Hint 2: The actual trick comes when trying to solve this problem without using any additional memory. This means you need to use the original array somehow to move the elements around. Now, we can place each element in its original location and shift all the elements around it to adjust as that would be too costly and most likely will time out on larger input arrays.
 * Hint 3: One line of thought is based on reversing the array (or parts of it) to obtain the desired result. Think about how reversal might potentially help us out by using an example.
 * Hint 4: The other line of thought is a tad bit complicated but essentially it builds on the idea of placing each element in its original position while keeping track of the element originally in that position. Basically, at every step, we place an element in its rightful position and keep track of the element already there or the one being overwritten in an additional variable. We can't do this in one linear pass and the idea here is based on <b>cyclic-dependencies</b> between elements.
 *
 * <h2>Approach</h2>
 * Three-reversal trick: reverse entire array, reverse first k, reverse rest.
 * k must be taken mod n to handle k &gt;= n.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/rotate-array/">LeetCode #189</a>
 */
public class RotateArray {

    /**
     * Rotates an array to the right by k steps in-place.
     * @param nums integer array
     * @param k    rotation steps
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] a, int l, int r) {
        while (l < r) { int t = a[l]; a[l++] = a[r]; a[r--] = t; }
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac RotateArray.java &amp;&amp; java org.leetcode.medium.RotateArray
     *
     * @param args not used
     */
    public static void main(String[] args) {
        RotateArray sol = new RotateArray();
        int[] a1 = {1,2,3,4,5,6,7}; sol.rotate(a1, 3);
        System.out.println(java.util.Arrays.toString(a1)); // [5,6,7,1,2,3,4]
        int[] a2 = {-1,-100,3,99};  sol.rotate(a2, 2);
        System.out.println(java.util.Arrays.toString(a2)); // [3,99,-1,-100]
    }
}
