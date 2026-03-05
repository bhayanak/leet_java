package org.leetcode.hard;


/**
 * <b>#854 - K-Similar Strings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, String, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Strings s1 and s2 are k-similar (for some non-negative integer k) if we can swap the positions of two letters in s1 exactly k times so that the resulting string equals s2.
 *
 *
 * Given two anagrams s1 and s2, return the smallest k for which s1 and s2 are k-similar.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "ab", s2 = "ba"
 * Output: 1
 * Explanation: The two string are 1-similar because we can use one swap to change s1 to s2: "ab" --&gt; "ba".
 *
 * Example 2:
 *
 * Input: s1 = "abc", s2 = "bca"
 * Output: 2
 * Explanation: The two strings are 2-similar because we can use two swaps to change s1 to s2: "abc" --&gt; "bac" --&gt; "bca".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s1.length &lt;= 20
 *
 * s2.length == s1.length
 *
 * s1 and s2 contain only lowercase letters from the set {'a', 'b', 'c', 'd', 'e', 'f'}.
 *
 * s2 is an anagram of s1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/k-similar-strings/">LeetCode #854</a>
 */
public class KSimilarStrings {

    /**
     * TODO: Implement "K-Similar Strings".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: K-Similar Strings");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac KSimilarStrings.java &amp;&amp; java org.leetcode.hard.KSimilarStrings</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== KSimilarStrings ===");
        KSimilarStrings sol = new KSimilarStrings();
        System.out.println(sol.solve(null));
    }
}
