package org.leetcode.medium;


/**
 * <b>#1737 - Change Minimum Characters to Satisfy One of Three Conditions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings a and b that consist of lowercase letters. In one operation, you can change any character in a or b to any lowercase letter.
 *
 *
 * Your goal is to satisfy one of the following three conditions:
 *
 *
 * Every letter in a is strictly less than every letter in b in the alphabet.
 *
 * Every letter in b is strictly less than every letter in a in the alphabet.
 *
 * Both a and b consist of only one distinct letter.
 *
 * Return the minimum number of operations needed to achieve your goal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = "aba", b = "caa"
 * Output: 2
 * Explanation: Consider the best way to make each condition true:
 * 1) Change b to "ccc" in 2 operations, then every letter in a is less than every letter in b.
 * 2) Change a to "bbb" and b to "aaa" in 3 operations, then every letter in b is less than every letter in a.
 * 3) Change a to "aaa" and b to "aaa" in 2 operations, then a and b consist of one distinct letter.
 * The best way was done in 2 operations (either condition 1 or condition 3).
 *
 * Example 2:
 *
 * Input: a = "dabadd", b = "cda"
 * Output: 3
 * Explanation: The best way is to make condition 1 true by changing b to "eee".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= a.length, b.length &lt;= 105
 *
 * a and b consist only of lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate on each letter in the alphabet, and check the smallest number of operations needed to make it one of the following: the largest letter in a and smaller than the smallest one in b, vice versa, or let a and b consist only of this letter.
 * Hint 2: For the first 2 conditions, take care that you can only change characters to lowercase letters, so you can't make 'z' the smallest letter in one of the strings or 'a' the largest letter in one of them.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/change-minimum-characters-to-satisfy-one-of-three-conditions/">LeetCode #1737</a>
 */
public class ChangeMinimumCharactersToSatisfyOneOfThreeConditions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Change Minimum Characters to Satisfy One of Three Conditions");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ChangeMinimumCharactersToSatisfyOneOfThreeConditions ===");
        ChangeMinimumCharactersToSatisfyOneOfThreeConditions sol = new ChangeMinimumCharactersToSatisfyOneOfThreeConditions();
        System.out.println(sol.solve(null));
    }
}
