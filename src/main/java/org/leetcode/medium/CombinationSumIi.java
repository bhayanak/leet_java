package org.leetcode.medium;

/**
 * <b>#40 - Combination Sum II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
 * 
 * 
 * Each number in candidates may only be used once in the combination.
 * 
 * 
 * Note: The solution set must not contain duplicate combinations.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: candidates = [10,1,2,7,6,1,5], target = 8
 * Output: 
 * [
 * [1,1,6],
 * [1,2,5],
 * [1,7],
 * [2,6]
 * ]
 * 
 * Example 2:
 * 
 * Input: candidates = [2,5,2,1,2], target = 5
 * Output: 
 * [
 * [1,2,2],
 * [5]
 * ]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= candidates.length &lt;= 100
 * 	
 * 1 &lt;= candidates[i] &lt;= 50
 * 	
 * 1 &lt;= target &lt;= 30
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking, but each candidate may only be used once.
 * Sort first. Skip duplicate candidates at the same depth level to avoid duplicate results.
 *
 * <h2>Complexity</h2>
* Time: O(2ⁿ)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/combination-sum-ii/">LeetCode #40</a>
 */
public class CombinationSumIi {

    /**
     * Finds all unique combinations where each number is used at most once and sum == target.
     *
     * @param candidates integers (may include duplicates)
     * @param target     required sum
     * @return           list of unique combinations
     */
    public java.util.List<java.util.List<Integer>> combinationSum2(int[] candidates, int target) {
        java.util.Arrays.sort(candidates);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(result, new java.util.ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> cur,
                            int[] cands, int remaining, int start) {
        if (remaining == 0) { res.add(new java.util.ArrayList<>(cur)); return; }
        for (int i = start; i < cands.length && cands[i] <= remaining; i++) {
            if (i > start && cands[i] == cands[i - 1]) continue; // skip duplicate
            cur.add(cands[i]);
            backtrack(res, cur, cands, remaining - cands[i], i + 1); // i+1 — no reuse
            cur.remove(cur.size() - 1);
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        CombinationSumIi sol = new CombinationSumIi();
        System.out.println("No method available");
    }
}
