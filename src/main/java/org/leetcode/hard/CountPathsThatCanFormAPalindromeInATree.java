package org.leetcode.hard;


/**
 * <b>#2791 - Count Paths That Can Form a Palindrome in a Tree</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Bit Manipulation, Tree, Depth-First Search, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a tree (i.e. a connected, undirected graph that has no cycles) rooted at node 0 consisting of n nodes numbered from 0 to n - 1. The tree is represented by a 0-indexed array parent of size n, where parent[i] is the parent of node i. Since node 0 is the root, parent[0] == -1.
 *
 *
 * You are also given a string s of length n, where s[i] is the character assigned to the edge between i and parent[i]. s[0] can be ignored.
 *
 *
 * Return the number of pairs of nodes (u, v) such that u &lt; v and the characters assigned to edges on the path from u to v can be rearranged to form a palindrome.
 *
 *
 * A string is a palindrome when it reads the same backwards as forwards.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: parent = [-1,0,0,1,1,2], s = "acaabc"
 * Output: 8
 * Explanation: The valid pairs are:
 * - All the pairs (0,1), (0,2), (1,3), (1,4) and (2,5) result in one character which is always a palindrome.
 * - The pair (2,3) result in the string "aca" which is a palindrome.
 * - The pair (1,5) result in the string "cac" which is a palindrome.
 * - The pair (3,5) result in the string "acac" which can be rearranged into the palindrome "acca".
 *
 * Example 2:
 *
 * Input: parent = [-1,0,0,0,0], s = "aaaaa"
 * Output: 10
 * Explanation: Any pair of nodes (u,v) where u &lt; v is valid.
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
 * 0 &lt;= parent[i] &lt;= n - 1 for all i &gt;= 1
 *
 * parent[0] == -1
 *
 * parent represents a valid tree.
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A string is a palindrome if the number of characters with an odd frequency is either 0 or 1.
 * Hint 2: Let mask[v] be a mask of 26 bits that represent the parity of each character in the alphabet on the path from node 0 to v. How can you use this array to solve the problem?
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Bit Manipulation, Tree, Depth-First Search, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/count-paths-that-can-form-a-palindrome-in-a-tree/">LeetCode #2791</a>
 */
public class CountPathsThatCanFormAPalindromeInATree {

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
        throw new UnsupportedOperationException("Not yet implemented: Count Paths That Can Form a Palindrome in a Tree");
    }

    public static void main(String[] args) {
        System.out.println("=== CountPathsThatCanFormAPalindromeInATree ===");
        CountPathsThatCanFormAPalindromeInATree sol = new CountPathsThatCanFormAPalindromeInATree();
        System.out.println(sol.solve(null));
    }
}
