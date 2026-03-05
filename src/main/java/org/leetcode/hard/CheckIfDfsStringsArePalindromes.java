package org.leetcode.hard;


/**
 * <b>#3327 - Check if DFS Strings Are Palindromes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Tree, Depth-First Search, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a tree rooted at node 0, consisting of n nodes numbered from 0 to n - 1. The tree is represented by an array parent of size n, where parent[i] is the parent of node i. Since node 0 is the root, parent[0] == -1.
 *
 *
 * You are also given a string s of length n, where s[i] is the character assigned to node i.
 *
 *
 * Consider an empty string dfsStr, and define a recursive function dfs(int x) that takes a node x as a parameter and performs the following steps in order:
 *
 *
 * Iterate over each child y of x in increasing order of their numbers, and call dfs(y).
 *
 * Add the character s[x] to the end of the string dfsStr.
 *
 * Note that dfsStr is shared across all recursive calls of dfs.
 *
 *
 * You need to find a boolean array answer of size n, where for each index i from 0 to n - 1, you do the following:
 *
 *
 * Empty the string dfsStr and call dfs(i).
 *
 * If the resulting string dfsStr is a palindrome, then set answer[i] to true. Otherwise, set answer[i] to false.
 *
 * Return the array answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: parent = [-1,0,0,1,1,2], s = "aababa"
 *
 *
 * Output: [true,true,false,true,true,true]
 *
 *
 * Explanation:
 *
 *
 * Calling dfs(0) results in the string dfsStr = "abaaba", which is a palindrome.
 *
 * Calling dfs(1) results in the string dfsStr = "aba", which is a palindrome.
 *
 * Calling dfs(2) results in the string dfsStr = "ab", which is not a palindrome.
 *
 * Calling dfs(3) results in the string dfsStr = "a", which is a palindrome.
 *
 * Calling dfs(4) results in the string dfsStr = "b", which is a palindrome.
 *
 * Calling dfs(5) results in the string dfsStr = "a", which is a palindrome.
 *
 * Example 2:
 *
 * Input: parent = [-1,0,0,0,0], s = "aabcb"
 *
 *
 * Output: [true,true,true,true,true]
 *
 *
 * Explanation:
 *
 *
 * Every call on dfs(x) results in a palindrome string.
 *
 *
 *
 * Constraints:
 *
 *
 * n == parent.length == s.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 0 &lt;= parent[i] &lt;= n - 1 for all i &gt;= 1.
 *
 * parent[0] == -1
 *
 * parent represents a valid tree.
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Perform the dfs described from the root of tree, and store the order in which nodes are visited into an array.
 * Hint 2: For any node in the tree, the nodes in its subtree will form a contiguous subarray within the DFS traversal array.
 * Hint 3: Use Manacher’s algorithm to compute the answer for each node in constant time.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Tree, Depth-First Search, Hash Function).
 *
 * @see <a href="https://leetcode.com/problems/check-if-dfs-strings-are-palindromes/">LeetCode #3327</a>
 */
public class CheckIfDfsStringsArePalindromes {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     * Uses Depth-First Search (DFS) traversal.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if DFS Strings Are Palindromes");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfDfsStringsArePalindromes ===");
        CheckIfDfsStringsArePalindromes sol = new CheckIfDfsStringsArePalindromes();
        System.out.println(sol.solve(null));
    }
}
