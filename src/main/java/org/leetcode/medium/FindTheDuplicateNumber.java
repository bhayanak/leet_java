package org.leetcode.medium;

/**
 * <b>#287 - Find the Duplicate Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * 
 * 
 * There is only one repeated number in nums, return this repeated number.
 * 
 * 
 * You must solve the problem without modifying the array nums and using only constant extra space.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 * 
 * Example 2:
 * 
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 * 
 * Example 3:
 * 
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 105
 * 	
 * nums.length == n + 1
 * 	
 * 1 &lt;= nums[i] &lt;= n
 * 	
 * All the integers in nums appear only once except for precisely one integer which appears two or more times.
 * 
 *  
 * 
 * Follow up:
 * 
 * 	
 * How can we prove that at least one duplicate number must exist in nums?
 * 	
 * Can you solve the problem in linear runtime complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Floyd's cycle detection on the implicit linked list where nums[i] is the next node.
 * Phase 1: find meeting point. Phase 2: find cycle entry (the duplicate).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/find-the-duplicate-number/">LeetCode #287</a>
 */
public class FindTheDuplicateNumber {

    /**
     * Finds Find duplicate.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int findDuplicate(int[] nums) {
        int slow=nums[0], fast=nums[0];
        do{slow=nums[slow];fast=nums[nums[fast]];}while(slow!=fast);
        slow=nums[0];
        while(slow!=fast){slow=nums[slow];fast=nums[fast];}
        return slow;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        FindTheDuplicateNumber sol = new FindTheDuplicateNumber();
        System.out.println(sol.findDuplicate(new int[]{1,3,4,2,2})); // 2
        System.out.println(sol.findDuplicate(new int[]{3,1,3,4,2})); // 3
    }
}
