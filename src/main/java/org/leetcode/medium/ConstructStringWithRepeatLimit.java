package org.leetcode.medium;


/**
 * <b>#2182 - Construct String With Repeat Limit</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Greedy, Heap (Priority Queue), Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer repeatLimit. Construct a new string repeatLimitedString using the characters of s such that no letter appears more than repeatLimit times in a row. You do not have to use all characters from s.
 *
 *
 * Return the lexicographically largest repeatLimitedString possible.
 *
 *
 * A string a is lexicographically larger than a string b if in the first position where a and b differ, string a has a letter that appears later in the alphabet than the corresponding letter in b. If the first min(a.length, b.length) characters do not differ, then the longer string is the lexicographically larger one.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cczazcc", repeatLimit = 3
 * Output: "zzcccac"
 * Explanation: We use all of the characters from s to construct the repeatLimitedString "zzcccac".
 * The letter 'a' appears at most 1 time in a row.
 * The letter 'c' appears at most 3 times in a row.
 * The letter 'z' appears at most 2 times in a row.
 * Hence, no letter appears more than repeatLimit times in a row and the string is a valid repeatLimitedString.
 * The string is the lexicographically largest repeatLimitedString possible so we return "zzcccac".
 * Note that the string "zzcccca" is lexicographically larger but the letter 'c' appears more than 3 times in a row, so it is not a valid repeatLimitedString.
 *
 * Example 2:
 *
 * Input: s = "aababab", repeatLimit = 2
 * Output: "bbabaa"
 * Explanation: We use only some of the characters from s to construct the repeatLimitedString "bbabaa". 
 * The letter 'a' appears at most 2 times in a row.
 * The letter 'b' appears at most 2 times in a row.
 * Hence, no letter appears more than repeatLimit times in a row and the string is a valid repeatLimitedString.
 * The string is the lexicographically largest repeatLimitedString possible so we return "bbabaa".
 * Note that the string "bbabaaa" is lexicographically larger but the letter 'a' appears more than 2 times in a row, so it is not a valid repeatLimitedString.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= repeatLimit &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start constructing the string in descending order of characters.
 * Hint 2: When repeatLimit is reached, pick the next largest character.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy, Heap (Priority Queue), Counting).
 *
 * @see <a href="https://leetcode.com/problems/construct-string-with-repeat-limit/">LeetCode #2182</a>
 */
public class ConstructStringWithRepeatLimit {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Construct String With Repeat Limit");
    }

    public static void main(String[] args) {
        System.out.println("=== ConstructStringWithRepeatLimit ===");
        ConstructStringWithRepeatLimit sol = new ConstructStringWithRepeatLimit();
        System.out.println(sol.solve(null));
    }
}
