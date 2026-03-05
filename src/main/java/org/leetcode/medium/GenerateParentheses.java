package org.leetcode.medium;

/**
 * <b>#22 - Generate Parentheses</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * 
 * 
 * Example 2:
 * 
 * Input: n = 1
 * Output: ["()"]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 8
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Backtracking: track open and close counts.
 * Add '(' when open &lt; n; add ')' when close &lt; open.
 * A valid combination is complete when both counts == n.
 *
 * <h2>Complexity</h2>
* Time: O(4ⁿ/√n) Catalan number  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">LeetCode #22</a>
 */
public class GenerateParentheses {

    /**
     * Generates all combinations of n pairs of well-formed parentheses.
     *
     * @param n number of pairs
     * @return  list of all valid combinations
     */
    public java.util.List<String> generateParenthesis(int n) {
        java.util.List<String> result = new java.util.ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void backtrack(java.util.List<String> res, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) { res.add(cur.toString()); return; }
        if (open < max)  { cur.append('('); backtrack(res, cur, open+1, close, max); cur.deleteCharAt(cur.length()-1); }
        if (close < open){ cur.append(')'); backtrack(res, cur, open, close+1, max); cur.deleteCharAt(cur.length()-1); }
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        GenerateParentheses sol = new GenerateParentheses();
        System.out.println("No method available");
    }
}
