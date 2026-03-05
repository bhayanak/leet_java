package org.leetcode.medium;

/**
 * <b>#78 - Subsets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
 * 
 * 
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [[],[0]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 10
 * 	
 * -10 &lt;= nums[i] &lt;= 10
 * 	
 * All the numbers of nums are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking: at each index either include or skip the element.
 * Alternatively, iterate mask from 0 to 2ⁿ-1 for a bit-manipulation approach.
 *
 * <h2>Complexity</h2>
* Time: O(2ⁿ·n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/subsets/">LeetCode #78</a>
 */
public class Subsets {

    /**
     * Returns all possible subsets (the power set) of a distinct integer array.
     *
     * @param nums distinct integers
     * @return     list of all 2ⁿ subsets
     */
    public java.util.List<java.util.List<Integer>> subsets(int[] nums) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        backtrack(res, new java.util.ArrayList<>(), nums, 0);
        return res;
    }

    private void backtrack(java.util.List<java.util.List<Integer>> res,
                            java.util.List<Integer> cur, int[] nums, int start) {
        res.add(new java.util.ArrayList<>(cur)); // every node is a valid subset
        for (int i = start; i < nums.length; i++) {
            cur.add(nums[i]);
            backtrack(res, cur, nums, i + 1);
            cur.remove(cur.size() - 1);
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        Subsets sol = new Subsets();
        System.out.println("No method available");
    }
}
