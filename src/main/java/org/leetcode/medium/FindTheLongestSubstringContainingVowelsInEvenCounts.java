package org.leetcode.medium;


/**
 * <b>#1371 - Find the Longest Substring Containing Vowels in Even Counts</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the string s, return the size of the longest substring containing each vowel an even number of times. That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "eleetminicoworoep"
 * Output: 13
 * Explanation: The longest substring is "leetminicowor" which contains two each of the vowels: e, i and o and zero of the vowels: a and u.
 *
 * Example 2:
 *
 * Input: s = "leetcodeisgreat"
 * Output: 5
 * Explanation: The longest substring is "leetc" which contains two e's.
 *
 * Example 3:
 *
 * Input: s = "bcbcbc"
 * Output: 6
 * Explanation: In this case, the given string "bcbcbc" is the longest because all vowels: a, e, i, o and u appear zero times.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 5 x 10^5
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Represent the counts (odd or even) of vowels with a bitmask.
 * Hint 2: Precompute the prefix xor for the bitmask of vowels and then get the longest valid substring.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Bit Manipulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/">LeetCode #1371</a>
 */
public class FindTheLongestSubstringContainingVowelsInEvenCounts {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Longest Substring Containing Vowels in Even Counts");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheLongestSubstringContainingVowelsInEvenCounts ===");
        FindTheLongestSubstringContainingVowelsInEvenCounts sol = new FindTheLongestSubstringContainingVowelsInEvenCounts();
        System.out.println(sol.solve(null));
    }
}
