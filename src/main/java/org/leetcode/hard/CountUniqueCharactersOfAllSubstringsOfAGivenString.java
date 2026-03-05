package org.leetcode.hard;


/**
 * <b>#828 - Count Unique Characters of All Substrings of a Given String</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Let's define a function countUniqueChars(s) that returns the number of unique characters in s.
 *
 *
 * For example, calling countUniqueChars(s) if s = "LEETCODE" then "L", "T", "C", "O", "D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
 *
 * Given a string s, return the sum of countUniqueChars(t) where t is a substring of s. The test cases are generated such that the answer fits in a 32-bit integer.
 *
 *
 * Notice that some substrings can be repeated so in this case you have to count the repeated ones too.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ABC"
 * Output: 10
 * Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
 * Every substring is composed with only unique letters.
 * Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
 *
 * Example 2:
 *
 * Input: s = "ABA"
 * Output: 8
 * Explanation: The same as example 1, except countUniqueChars("ABA") = 1.
 *
 * Example 3:
 *
 * Input: s = "LEETCODE"
 * Output: 92
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of uppercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/">LeetCode #828</a>
 */
public class CountUniqueCharactersOfAllSubstringsOfAGivenString {

    /**
     * TODO: Implement "Count Unique Characters of All Substrings of a Given String".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Unique Characters of All Substrings of a Given String");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CountUniqueCharactersOfAllSubstringsOfAGivenString.java &amp;&amp; java org.leetcode.hard.CountUniqueCharactersOfAllSubstringsOfAGivenString</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CountUniqueCharactersOfAllSubstringsOfAGivenString ===");
        CountUniqueCharactersOfAllSubstringsOfAGivenString sol = new CountUniqueCharactersOfAllSubstringsOfAGivenString();
        System.out.println(sol.solve(null));
    }
}
