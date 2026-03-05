package org.leetcode.hard;


/**
 * <b>#3045 - Count Prefix and Suffix Pairs II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Trie, Rolling Hash, String Matching, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string array words.
 *
 *
 * Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:
 *
 *
 * isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise.
 *
 * For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.
 *
 *
 * Return an integer denoting the number of index pairs (i, j) such that i &lt; j, and isPrefixAndSuffix(words[i], words[j]) is true.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["a","aba","ababa","aa"]
 * Output: 4
 * Explanation: In this example, the counted index pairs are:
 * i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
 * i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
 * i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
 * i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
 * Therefore, the answer is 4.
 *
 * Example 2:
 *
 * Input: words = ["pa","papa","ma","mama"]
 * Output: 2
 * Explanation: In this example, the counted index pairs are:
 * i = 0 and j = 1 because isPrefixAndSuffix("pa", "papa") is true.
 * i = 2 and j = 3 because isPrefixAndSuffix("ma", "mama") is true.
 * Therefore, the answer is 2.  
 *
 * Example 3:
 *
 * Input: words = ["abab","ab"]
 * Output: 0
 * Explanation: In this example, the only valid index pair is i = 0 and j = 1, and isPrefixAndSuffix("abab", "ab") is false.
 * Therefore, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 105
 *
 * 1 &lt;= words[i].length &lt;= 105
 *
 * words[i] consists only of lowercase English letters.
 *
 * The sum of the lengths of all words[i] does not exceed 5 * 105.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can use a trie to solve it.
 * Hint 2: Process all <code>words[i]</code> from left to right. The trie stores the pair <code>(words[i][j], words[i][words[i].length - j - 1])</code> as a single character; we process all the words in this way.
 * Hint 3: During insertion, keep a counter in each trie node, as in a normal trie. If the current node is the end of a word (namely, the pair on that node is <code>(words[i][words[i].length - 1], words[i][0])</code>), increase the node's counter by <code>1</code>.
 * Hint 4: From left to right, insert each word into the trie, and increase our final result by each node's counter when going down the trie during insertion. This means there was at least one word that is both a prefix and a suffix of the current word before.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Trie, Rolling Hash, String Matching, Hash Function).
 *
 * @see <a href="https://leetcode.com/problems/count-prefix-and-suffix-pairs-ii/">LeetCode #3045</a>
 */
public class CountPrefixAndSuffixPairsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Prefix and Suffix Pairs II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountPrefixAndSuffixPairsIi ===");
        CountPrefixAndSuffixPairsIi sol = new CountPrefixAndSuffixPairsIi();
        System.out.println(sol.solve(null));
    }
}
