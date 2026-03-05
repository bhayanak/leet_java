package org.leetcode.hard;


/**
 * <b>#3841 - Palindromic Path Queries in a Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Divide and Conquer, Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an undirected tree with n nodes labeled 0 to n - 1. This is represented by a 2D array edges of length n - 1, where edges[i] = [ui, vi] indicates an undirected edge between nodes ui and vi.
 *
 *
 * You are also given a string s of length n consisting of lowercase English letters, where s[i] represents the character assigned to node i.
 *
 *
 * You are also given a string array queries, where each queries[i] is either:
 *
 *
 * "update ui c": Change the character at node ui to c. Formally, update s[ui] = c.
 *
 * "query ui vi": Determine whether the string formed by the characters on the unique path from ui to vi (inclusive) can be rearranged into a palindrome.
 *
 * Return a boolean array answer, where answer[j] is true if the jth query of type "query ui vi"​​​​​​​ can be rearranged into a palindrome, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1],[1,2]], s = "aac", queries = ["query 0 2","update 1 b","query 0 2"]
 *
 *
 * Output: [true,false]
 *
 *
 * Explanation:
 *
 *
 * "query 0 2": Path 0 → 1 → 2 gives "aac", which can be rearranged to form "aca", a palindrome. Thus, answer[0] = true.
 *
 * "update 1 b": Update node 1 to 'b', now s = "abc".
 *
 * "query 0 2": Path characters are "abc", which cannot be rearranged to form a palindrome. Thus, answer[1] = false.
 *
 * Thus, answer = [true, false].
 *
 * Example 2:
 *
 * Input: n = 4, edges = [[0,1],[0,2],[0,3]], s = "abca", queries = ["query 1 2","update 0 b","query 2 3","update 3 a","query 1 3"]
 *
 *
 * Output: [false,false,true]
 *
 *
 * Explanation:
 *
 *
 * "query 1 2": Path 1 → 0 → 2 gives "bac", which cannot be rearranged to form a palindrome. Thus, answer[0] = false.
 *
 * "update 0 b": Update node 0 to 'b', now s = "bbca".
 *
 * "query 2 3": Path 2 → 0 → 3 gives "cba", which cannot be rearranged to form a palindrome. Thus, answer[1] = false.
 *
 * "update 3 a": Update node 3 to 'a', s = "bbca".
 *
 * "query 1 3": Path 1 → 0 → 3 gives "bba", which can be rearranged to form "bab", a palindrome. Thus, answer[2] = true.
 *
 * Thus, answer = [false, false, true].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == s.length &lt;= 5 * 104
 *
 * edges.length == n - 1
 *
 * edges[i] = [ui, vi]
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * s consists of lowercase English letters.
 *
 * The input is generated such that edges represents a valid tree.
 *
 * 1 &lt;= queries.length &lt;= 5 * 104​​​​​​​
 *
 *
 *
 * queries[i] = "update ui c" or
 *
 * queries[i] = "query ui vi"
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * c is a lowercase English letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use heavy light decomposition to break each path query into <code>O(log n)</code> segments.
 * Hint 2: Represent characters as a 26-bit mask and maintain segment data with XOR. A path can form a palindrome if the resulting mask has at most one bit set.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Divide and Conquer, Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/palindromic-path-queries-in-a-tree/">LeetCode #3841</a>
 */
public class PalindromicPathQueriesInATree {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Palindromic Path Queries in a Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== PalindromicPathQueriesInATree ===");
        PalindromicPathQueriesInATree sol = new PalindromicPathQueriesInATree();
        System.out.println(sol.solve(null));
    }
}
