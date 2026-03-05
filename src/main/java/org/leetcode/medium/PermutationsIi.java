package org.leetcode.medium;

/**
 * <b>#47 - Permutations II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,2]
 * Output:
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 * 
 * Example 2:
 * 
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 8
 * 	
 * -10 &lt;= nums[i] &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking with a boolean[] used array. Skip a duplicate if its predecessor
 * at the same level hasn't been picked yet (used[i-1] == false): this prevents
 * generating the same permutation twice.
 *
 * <h2>Complexity</h2>
* Time: O(n · n!)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/permutations-ii/">LeetCode #47</a>
 */
public class PermutationsIi {

    /**
     * Returns all unique permutations of an array that may contain duplicates.
     *
     * @param nums integer array (may have duplicates)
     * @return     list of all distinct permutations
     */
    public java.util.List<java.util.List<Integer>> permuteUnique(int[] nums) {
        java.util.Arrays.sort(nums);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(result, new java.util.ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> cur,
                            int[] nums, boolean[] used) {
        if (cur.size() == nums.length) { res.add(new java.util.ArrayList<>(cur)); return; }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            // Skip duplicate at same recursion level
            if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            used[i] = true;
            cur.add(nums[i]);
            backtrack(res, cur, nums, used);
            cur.remove(cur.size()-1);
            used[i] = false;
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        PermutationsIi sol = new PermutationsIi();
        System.out.println("No method available");
    }
}
