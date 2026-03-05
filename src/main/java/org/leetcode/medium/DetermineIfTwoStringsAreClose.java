package org.leetcode.medium;


/**
 * <b>#1657 - Determine if Two Strings Are Close</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Two strings are considered close if you can attain one from the other using the following operations:
 *
 *
 * Operation 1: Swap any two existing characters.
 *
 *
 *
 *
 * For example, abcde -&gt; aecdb
 *
 *
 *
 * Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
 *
 *
 *
 * For example, aacabb -&gt; bbcbaa (all a's turn into b's, and all b's turn into a's)
 *
 *
 *
 * You can use the operations on either string as many times as necessary.
 *
 *
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "bca"
 * Output: true
 * Explanation: You can attain word2 from word1 in 2 operations.
 * Apply Operation 1: "abc" -&gt; "acb"
 * Apply Operation 1: "acb" -&gt; "bca"
 *
 * Example 2:
 *
 * Input: word1 = "a", word2 = "aa"
 * Output: false
 * Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
 *
 * Example 3:
 *
 * Input: word1 = "cabbba", word2 = "abbccc"
 * Output: true
 * Explanation: You can attain word2 from word1 in 3 operations.
 * Apply Operation 1: "cabbba" -&gt; "caabbb"
 * Apply Operation 2: "caabbb" -&gt; "baaccc"
 * Apply Operation 2: "baaccc" -&gt; "abbccc"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word1.length, word2.length &lt;= 105
 *
 * word1 and word2 contain only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Operation 1 allows you to freely reorder the string.
 * Hint 2: Operation 2 allows you to freely reassign the letters' frequencies.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/determine-if-two-strings-are-close/">LeetCode #1657</a>
 */
public class DetermineIfTwoStringsAreClose {

    /**
     * Solves the problem: Close strings.
     * Sorts the input first to enable efficient processing.
     *
     * @param word1 the word1 (String)
     * @param word2 the word2 (String)
     * @return the computed boolean result
     */
    public boolean closeStrings(String word1, String word2) {
        if (word1.length()!=word2.length()) return false;
        int[] f1=new int[26], f2=new int[26];
        for (char c:word1.toCharArray()) f1[c-'a']++;
        for (char c:word2.toCharArray()) f2[c-'a']++;
        for (int i=0;i<26;i++) if ((f1[i]==0)!=(f2[i]==0)) return false;
        java.util.Arrays.sort(f1); java.util.Arrays.sort(f2);
        return java.util.Arrays.equals(f1,f2);
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        DetermineIfTwoStringsAreClose sol = new DetermineIfTwoStringsAreClose();
                System.out.println(sol.closeStrings("abc","bca"));       // true
                System.out.println(sol.closeStrings("a","aa"));          // false
                System.out.println(sol.closeStrings("cabbba","abbccc")); // true
                System.out.println(sol.closeStrings("cabbba","aabbss")); // false
    }
}
