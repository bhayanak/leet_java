package org.leetcode.medium;

/**
 * <b>#46 - Permutations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * 
 * 
 * Example 3:
 * 
 * Input: nums = [1]
 * Output: [[1]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 6
 * 	
 * -10 &lt;= nums[i] &lt;= 10
 * 	
 * All the integers of nums are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking: swap element at index start with each element from start to end.
 * Recurse with start+1. Undo by swapping back.
 *
 * <h2>Complexity</h2>
* Time: O(n · n!)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/permutations/">LeetCode #46</a>
 */
public class Permutations {

    /**
     * Returns all permutations of a distinct integer array.
     *
     * @param nums array of distinct integers
     * @return     list of all n! permutations
     */
    public java.util.List<java.util.List<Integer>> permute(int[] nums) {
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(result, nums, 0);
        return result;
    }

    private void backtrack(java.util.List<java.util.List<Integer>> res, int[] nums, int start) {
        if (start == nums.length) {
            java.util.List<Integer> perm = new java.util.ArrayList<>();
            for (int n : nums) perm.add(n);
            res.add(perm);
            return;
        }
        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(res, nums, start + 1);
            swap(nums, start, i); // undo
        }
    }

    private void swap(int[] a, int i, int j){ int t=a[i]; a[i]=a[j]; a[j]=t; }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        Permutations sol = new Permutations();
        System.out.println("No method available");
    }
}
