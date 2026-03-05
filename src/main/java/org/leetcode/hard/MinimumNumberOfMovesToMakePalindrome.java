package org.leetcode.hard;


/**
 * <b>#2193 - Minimum Number of Moves to Make Palindrome</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String, Greedy, Binary Indexed Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting only of lowercase English letters.
 *
 *
 * In one move, you can select any two adjacent characters of s and swap them.
 *
 *
 * Return the minimum number of moves needed to make s a palindrome.
 *
 *
 * Note that the input will be generated such that s can always be converted to a palindrome.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aabb"
 * Output: 2
 * Explanation:
 * We can obtain two palindromes from s, "abba" and "baab". 
 * - We can obtain "abba" from s in 2 moves: "aabb" -&gt; "abab" -&gt; "abba".
 * - We can obtain "baab" from s in 2 moves: "aabb" -&gt; "abab" -&gt; "baab".
 * Thus, the minimum number of moves needed to make s a palindrome is 2.
 *
 * Example 2:
 *
 * Input: s = "letelt"
 * Output: 2
 * Explanation:
 * One of the palindromes we can obtain from s in 2 moves is "lettel".
 * One of the ways we can obtain it is "letelt" -&gt; "letetl" -&gt; "lettel".
 * Other palindromes such as "tleelt" can also be obtained in 2 moves.
 * It can be shown that it is not possible to obtain a palindrome in less than 2 moves.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 2000
 *
 * s consists only of lowercase English letters.
 *
 * s can be converted to a palindrome using a finite number of moves.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider a greedy strategy.
 * Hint 2: Let’s start by making the leftmost and rightmost characters match with some number of swaps.
 * Hint 3: If we figure out how to do that using the minimum number of swaps, then we can delete the leftmost and rightmost characters and solve the problem recursively.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Greedy, Binary Indexed Tree).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-moves-to-make-palindrome/">LeetCode #2193</a>
 */
public class MinimumNumberOfMovesToMakePalindrome {

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
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Moves to Make Palindrome");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfMovesToMakePalindrome ===");
        MinimumNumberOfMovesToMakePalindrome sol = new MinimumNumberOfMovesToMakePalindrome();
        System.out.println(sol.solve(null));
    }
}
