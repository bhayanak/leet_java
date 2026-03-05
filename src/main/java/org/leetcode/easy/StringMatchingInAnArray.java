package org.leetcode.easy;


/**
 * <b>#1408 - String Matching in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of string words, return all strings in words that are a substring of another word. You can return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["mass","as","hero","superhero"]
 * Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
 * ["hero","as"] is also a valid answer.
 *
 * Example 2:
 *
 * Input: words = ["leetcode","et","code"]
 * Output: ["et","code"]
 * Explanation: "et", "code" are substring of "leetcode".
 *
 * Example 3:
 *
 * Input: words = ["blue","green","bu"]
 * Output: []
 * Explanation: No string of words is substring of another string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 30
 *
 * words[i] contains only lowercase English letters.
 *
 * All the strings of words are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Bruteforce to find if one string is substring of another or use KMP algorithm.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, String Matching).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/string-matching-in-an-array/">LeetCode #1408</a>
 */
public class StringMatchingInAnArray {

    public java.util.List<String> stringMatching(String[] words) {
        java.util.List<String> res = new java.util.ArrayList<>();
        for (String w : words)
            for (String other : words)
                if (!w.equals(other) && other.contains(w)) { res.add(w); break; }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        StringMatchingInAnArray sol = new StringMatchingInAnArray();
        System.out.println("No method available");
    }
}
