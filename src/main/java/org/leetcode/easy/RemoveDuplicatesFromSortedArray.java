package org.leetcode.easy;

/**
 * <b>#26 - Remove Duplicates from Sorted Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 * 
 * 
 * Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.
 * 
 * 
 * The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
 * 
 * 
 * Custom Judge:
 * 
 * 
 * The judge will test your solution with the following code:
 * 
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * 
 * int k = removeDuplicates(nums); // Calls your implementation
 * 
 * assert k == expectedNums.length;
 * for (int i = 0; i &lt; k; i++) {
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
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 * Example 2:
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 3 * 104
 * 	
 * -100 &lt;= nums[i] &lt;= 100
 * 	
 * nums is sorted in non-decreasing order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - In this problem, the key point to focus on is the input array being sorted. As far as duplicate elements are concerned, what is their positioning in the array when the given array is sorted? Look at the image below for the answer. If we know the position of one of the elements, do we also know the positioning of all the duplicate elements?

<br>
<img src="https://assets.leetcode.com/uploads/2019/10/20/hint_rem_dup.png" width="500" alt=""/>
 * - We need to modify the array in-place and the size of the final array would potentially be smaller than the size of the input array. So, we ought to use a two-pointer approach here. One, that would keep track of the current element in the original array and another one for just the unique elements.
 * - Essentially, once an element is encountered, you simply need to <b>bypass</b> its duplicates and move on to the next unique element.
 *
 * <h2>Approach</h2>
 * Two pointers: slow marks the position for the next unique element.
 * Fast scans ahead; whenever nums[fast] != nums[slow], copy it forward.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">LeetCode #26</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class RemoveDuplicatesFromSortedArray {

    /**
     * Removes duplicates from a sorted array in-place, returning the new length.
     *
     * @param nums sorted integer array (modified in-place)
     * @return     count of unique elements (first k elements of nums)
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast]; // place next unique
            }
        }
        return slow + 1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== RemoveDuplicatesFromSortedArray ===");
        System.out.println("See class methods for usage.");
    }
}
