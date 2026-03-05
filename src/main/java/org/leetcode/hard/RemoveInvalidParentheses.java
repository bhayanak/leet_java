package org.leetcode.hard;

/**
 * <b>#301 - Remove Invalid Parentheses</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Backtracking, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.
 * 
 * 
 * Return a list of unique strings that are valid with the minimum number of removals. You may return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "()())()"
 * Output: ["(())()","()()()"]
 * 
 * Example 2:
 * 
 * Input: s = "(a)())()"
 * Output: ["(a())()","(a)()()"]
 * 
 * Example 3:
 * 
 * Input: s = ")("
 * Output: [""]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 25
 * 	
 * s consists of lowercase English letters and parentheses '(' and ')'.
 * 	
 * There will be at most 20 parentheses in s.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since we do not know which brackets can be removed, we try all the options! We can use recursion.
 * Hint 2: In the recursion, for each bracket, we can either use it or remove it.
 * Hint 3: Recursion will generate all the valid parentheses strings but we want the ones with the least number of parentheses deleted.
 * Hint 4: We can count the number of invalid brackets to be deleted and only generate the valid strings in the recusrion.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/remove-invalid-parentheses/">LeetCode #301</a>
 */
public class RemoveInvalidParentheses {

    /** TODO: implement solution for "Remove Invalid Parentheses". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove Invalid Parentheses");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== RemoveInvalidParentheses ===");
        RemoveInvalidParentheses sol = new RemoveInvalidParentheses();
        System.out.println(sol.solve(null));
    }
}
