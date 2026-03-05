package org.leetcode.medium;

/**
 * <b>#39 - Combination Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * 
 * 
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * 
 * 
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 * 
 * Example 2:
 * 
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * 
 * Example 3:
 * 
 * Input: candidates = [2], target = 1
 * Output: []
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= candidates.length &lt;= 30
 * 	
 * 2 &lt;= candidates[i] &lt;= 40
 * 	
 * All elements of candidates are distinct.
 * 	
 * 1 &lt;= target &lt;= 40
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking: at each step choose a candidate (can reuse), recurse,
 * then undo. Sort candidates first to prune when sum exceeds target.
 *
 * <h2>Complexity</h2>
* Time: O(n^(target/min))  |  Space: O(target/min) stack depth
 *
 * @see <a href="https://leetcode.com/problems/combination-sum/">LeetCode #39</a>
 */
public class CombinationSum {

    /**
     * Finds all unique combinations where chosen numbers sum to target.
     * Candidates may be reused unlimited times.
     *
     * @param candidates distinct positive integers
     * @param target     required sum
     * @return           all unique combinations summing to target
     */
    public java.util.List<java.util.List<Integer>> combinationSum(int[] candidates, int target) {
        java.util.Arrays.sort(candidates);
        java.util.List<java.util.List<Integer>> result = new java.util.ArrayList<>();
        backtrack(result, new java.util.ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(java.util.List<java.util.List<Integer>> res, java.util.List<Integer> cur,
                            int[] cands, int remaining, int start) {
        if (remaining == 0) { res.add(new java.util.ArrayList<>(cur)); return; }
        for (int i = start; i < cands.length && cands[i] <= remaining; i++) {
            cur.add(cands[i]);
            backtrack(res, cur, cands, remaining - cands[i], i); // i, not i+1 — can reuse
            cur.remove(cur.size() - 1);
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        CombinationSum sol = new CombinationSum();
        System.out.println("No method available");
    }
}
