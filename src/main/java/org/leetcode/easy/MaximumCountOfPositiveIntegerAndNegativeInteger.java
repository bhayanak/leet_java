package org.leetcode.easy;


/**
 * <b>#2529 - Maximum Count of Positive Integer and Negative Integer</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
 *
 *
 * In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
 *
 * Note that 0 is neither positive nor negative.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-2,-1,-1,1,2,3]
 * Output: 3
 * Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
 *
 * Example 2:
 *
 * Input: nums = [-3,-2,-1,0,0,1,2]
 * Output: 3
 * Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
 *
 * Example 3:
 *
 * Input: nums = [5,20,66,1314]
 * Output: 4
 * Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2000
 *
 * -2000 &lt;= nums[i] &lt;= 2000
 *
 * nums is sorted in a non-decreasing order.
 *
 *
 *
 * Follow up: Can you solve the problem in O(log(n)) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count how many positive integers and negative integers are in the array.
 * Hint 2: Since the array is sorted, can we use the binary search?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Counting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/">LeetCode #2529</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class MaximumCountOfPositiveIntegerAndNegativeInteger {

    /**
     * Solves the problem: Maximum count.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int maximumCount(int[] nums) {
        int neg=0, pos=0;
        for (int n:nums) { if (n<0) neg++; else if (n>0) pos++; }
        return Math.max(neg,pos);
    }

    public static void main(String[] args) {
        MaximumCountOfPositiveIntegerAndNegativeInteger sol = new MaximumCountOfPositiveIntegerAndNegativeInteger();
                System.out.println(sol.maximumCount(new int[]{-2,-1,-1,1,2,3})); // 3
                System.out.println(sol.maximumCount(new int[]{-3,-2,-1,0,0,1,2})); // 3
                System.out.println(sol.maximumCount(new int[]{5,20,66,1314})); // 4
    }
}
