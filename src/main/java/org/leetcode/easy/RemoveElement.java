package org.leetcode.easy;

/**
 * <b>#27 - Remove Element</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * 
 * 
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 * 
 * 	
 * Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
 * 	
 * Return k.
 * 
 * Custom Judge:
 * 
 * 
 * The judge will test your solution with the following code:
 * 
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 * 
 * int k = removeElement(nums, val); // Calls your implementation
 * 
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i &lt; actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * 
 * If all assertions pass, then your solution will be accepted.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * Example 2:
 * 
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= nums.length &lt;= 100
 * 	
 * 0 &lt;= nums[i] &lt;= 50
 * 	
 * 0 &lt;= val &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - The problem statement clearly asks us to modify the array in-place and it also says that the element beyond the new length of the array can be anything. Given an element, we need to remove all the occurrences of it from the array. We don't technically need to <b>remove</b> that element per se, right?
 * - We can move all the occurrences of this element to the end of the array. Use two pointers!
<br><img src="https://assets.leetcode.com/uploads/2019/10/20/hint_remove_element.png" width="500" alt=""/>
 * - Yet another direction of thought is to consider the elements to be removed as non-existent. In a single pass, if we keep copying the visible elements in-place, that should also solve this problem for us.
 *
 * <h2>Approach</h2>
 * Two pointers: k tracks the write position.
 * Copy each element that is not equal to val to position k, then increment k.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/remove-element/">LeetCode #27</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class RemoveElement {

    /**
     * Removes all occurrences of val from nums in-place and returns the new length.
     *
     * @param nums array of integers (modified in-place)
     * @param val  value to remove
     * @return     count of elements != val
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int n : nums) {
            if (n != val) nums[k++] = n;
        }
        return k;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== RemoveElement ===");
        System.out.println("See class methods for usage.");
    }
}
