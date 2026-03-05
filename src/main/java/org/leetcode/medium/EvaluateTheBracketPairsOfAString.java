package org.leetcode.medium;


/**
 * <b>#1807 - Evaluate the Bracket Pairs of a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s that contains some bracket pairs, with each pair containing a non-empty key.
 *
 *
 * For example, in the string "(name)is(age)yearsold", there are two bracket pairs that contain the keys "name" and "age".
 *
 * You know the values of a wide range of keys. This is represented by a 2D string array knowledge where each knowledge[i] = [keyi, valuei] indicates that key keyi has a value of valuei.
 *
 *
 * You are tasked to evaluate all of the bracket pairs. When you evaluate a bracket pair that contains some key keyi, you will:
 *
 *
 * Replace keyi and the bracket pair with the key's corresponding valuei.
 *
 * If you do not know the value of the key, you will replace keyi and the bracket pair with a question mark "?" (without the quotation marks).
 *
 * Each key will appear at most once in your knowledge. There will not be any nested brackets in s.
 *
 *
 * Return the resulting string after evaluating all of the bracket pairs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "(name)is(age)yearsold", knowledge = [["name","bob"],["age","two"]]
 * Output: "bobistwoyearsold"
 * Explanation:
 * The key "name" has a value of "bob", so replace "(name)" with "bob".
 * The key "age" has a value of "two", so replace "(age)" with "two".
 *
 * Example 2:
 *
 * Input: s = "hi(name)", knowledge = [["a","b"]]
 * Output: "hi?"
 * Explanation: As you do not know the value of the key "name", replace "(name)" with "?".
 *
 * Example 3:
 *
 * Input: s = "(a)(a)(a)aaa", knowledge = [["a","yes"]]
 * Output: "yesyesyesaaa"
 * Explanation: The same key can appear multiple times.
 * The key "a" has a value of "yes", so replace all occurrences of "(a)" with "yes".
 * Notice that the "a"s not in a bracket pair are not evaluated.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 0 &lt;= knowledge.length &lt;= 105
 *
 * knowledge[i].length == 2
 *
 * 1 &lt;= keyi.length, valuei.length &lt;= 10
 *
 * s consists of lowercase English letters and round brackets '(' and ')'.
 *
 * Every open bracket '(' in s will have a corresponding close bracket ')'.
 *
 * The key in each bracket pair of s will be non-empty.
 *
 * There will not be any nested bracket pairs in s.
 *
 * keyi and valuei consist of lowercase English letters.
 *
 * Each keyi in knowledge is unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Process pairs from right to left to handle repeats
 * Hint 2: Keep track of the current enclosed string using another string
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/evaluate-the-bracket-pairs-of-a-string/">LeetCode #1807</a>
 */
public class EvaluateTheBracketPairsOfAString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Evaluate the Bracket Pairs of a String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== EvaluateTheBracketPairsOfAString ===");
        EvaluateTheBracketPairsOfAString sol = new EvaluateTheBracketPairsOfAString();
        System.out.println(sol.solve(null));
    }
}
