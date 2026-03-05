package org.leetcode.medium;


/**
 * <b>#3720 - Lexicographically Smallest Permutation Greater Than Target</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Greedy, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and target, both having length n, consisting of lowercase English letters.
 *
 *
 * Return the lexicographically smallest permutation of s that is strictly greater than target. If no permutation of s is lexicographically strictly greater than target, return an empty string.
 *
 *
 * A string a is lexicographically strictly greater than a string b (of the same length) if in the first position where a and b differ, string a has a letter that appears later in the alphabet than the corresponding letter in b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc", target = "bba"
 *
 *
 * Output: "bca"
 *
 *
 * Explanation:
 *
 *
 * The permutations of s (in lexicographical order) are "abc", "acb", "bac", "bca", "cab", and "cba".
 *
 * The lexicographically smallest permutation that is strictly greater than target is "bca".
 *
 * Example 2:
 *
 * Input: s = "leet", target = "code"
 *
 *
 * Output: "eelt"
 *
 *
 * Explanation:
 *
 *
 * The permutations of s (in lexicographical order) are "eelt", "eetl", "elet", "elte", "etel", "etle", "leet", "lete", "ltee", "teel", "tele", and "tlee".
 *
 * The lexicographically smallest permutation that is strictly greater than target is "eelt".
 *
 * Example 3:
 *
 * Input: s = "baba", target = "bbaa"
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * The permutations of s (in lexicographical order) are "aabb", "abab", "abba", "baab", "baba", and "bbaa".
 *
 * None of them is lexicographically strictly greater than target. Therefore, the answer is "".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length == target.length &lt;= 300
 *
 * s and target consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain frequency counts of <code>s</code>.
 * Hint 2: Walk left-to-right; if equal to <code>target[i]</code> is possible, take it and continue.
 * Hint 3: If not, try the smallest letter strictly greater than <code>target[i]</code>.
 * Hint 4: If neither, backtrack left to the most recent index where you matched <code>target</code> and try to bump there.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-permutation-greater-than-target/">LeetCode #3720</a>
 */
public class LexicographicallySmallestPermutationGreaterThanTarget {

    /**
     * Solves the problem: Minimum operations in binary string.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int minimumOperationsInBinaryString(String s) {
        int cnt=0;
        for (int i=0;i<s.length()-1;i++) if (s.charAt(i)=='1'&&s.charAt(i+1)=='1') cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        LexicographicallySmallestPermutationGreaterThanTarget sol = new LexicographicallySmallestPermutationGreaterThanTarget();
        System.out.println(sol.minimumOperationsInBinaryString("hello"));
    }
}
