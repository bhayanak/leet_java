package org.leetcode.medium;

/**
 * <b>#77 - Combinations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
 * 
 * 
 * You may return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 4, k = 2
 * Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
 * Explanation: There are 4 choose 2 = 6 total combinations.
 * Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.
 * 
 * Example 2:
 * 
 * Input: n = 1, k = 1
 * Output: [[1]]
 * Explanation: There is 1 choose 1 = 1 total combination.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 20
 * 	
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking: choose elements from start..n, recurse, undo.
 * Stop when the current combination has exactly k elements.
 *
 * <h2>Complexity</h2>
* Time: O(C(n,k)·k)  |  Space: O(k)
 *
 * @see <a href="https://leetcode.com/problems/combinations/">LeetCode #77</a>
 */
public class Combinations {

    /**
     * Returns all combinations of k numbers chosen from [1, n].
     *
     * @param n upper bound (inclusive)
     * @param k combination size
     * @return  list of all k-combinations
     */
    public java.util.List<java.util.List<Integer>> combine(int n, int k) {
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        backtrack(res, new java.util.ArrayList<>(), n, k, 1);
        return res;
    }

    private void backtrack(java.util.List<java.util.List<Integer>> res,
                            java.util.List<Integer> cur, int n, int k, int start) {
        if (cur.size() == k) { res.add(new java.util.ArrayList<>(cur)); return; }
        // Prune: not enough elements left
        for (int i = start; i <= n - (k - cur.size()) + 1; i++) {
            cur.add(i);
            backtrack(res, cur, n, k, i + 1);
            cur.remove(cur.size() - 1);
        }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== Combinations ===");
        System.out.println("See class methods for usage.");
    }
}
