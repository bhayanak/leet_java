package org.leetcode.medium;

/**
 * <b>#31 - Next Permutation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
 * 
 * 	
 * For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
 * 
 * The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).
 * 
 * 	
 * For example, the next permutation of arr = [1,2,3] is [1,3,2].
 * 	
 * Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
 * 	
 * While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
 * 
 * Given an array of integers nums, find the next permutation of nums.
 * 
 * 
 * The replacement must be in place and use only constant extra memory.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [1,3,2]
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,1]
 * Output: [1,2,3]
 * 
 * Example 3:
 * 
 * Input: nums = [1,1,5]
 * Output: [1,5,1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 100
 * 	
 * 0 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Standard algorithm (Narayana Pandita):
 * 1. Find the rightmost index i where nums[i] &lt; nums[i+1].
 * 2. Find the rightmost index j &gt; i where nums[j] &gt; nums[i].
 * 3. Swap i and j.
 * 4. Reverse the suffix from i+1 to end.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/next-permutation/">LeetCode #31</a>
 */
public class NextPermutation {

    /**
     * Rearranges nums into the next lexicographically greater permutation in-place.
     *
     * @param nums integer array (modified in-place)
     */
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;
        // Step 1: find first descending element from the right
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;
        if (i >= 0) {
            // Step 2: find the next greater element
            int j = n - 1;
            while (nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        // Step 4: reverse the suffix
        int l = i + 1, r = n - 1;
        while (l < r) swap(nums, l++, r--);
    }

    private void swap(int[] a, int i, int j) { int t = a[i]; a[i] = a[j]; a[j] = t; }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NextPermutation ===");
        System.out.println("See class methods for usage.");
    }
}
