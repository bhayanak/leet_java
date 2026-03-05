package org.leetcode.medium;


/**
 * <b>#1641 - Count Sorted Vowel Strings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the number of strings of length n that consist only of vowels (a, e, i, o, u) and are lexicographically sorted.
 *
 *
 * A string s is lexicographically sorted if for all valid i, s[i] is the same as or comes before s[i+1] in the alphabet.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 5
 * Explanation: The 5 sorted strings that consist of vowels only are ["a","e","i","o","u"].
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 15
 * Explanation: The 15 sorted strings that consist of vowels only are
 * ["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"].
 * Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.
 *
 * Example 3:
 *
 * Input: n = 33
 * Output: 66045
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each character, its possible values will depend on the value of its previous character, because it needs to be not smaller than it.
 * Hint 2: Think backtracking. Build a recursive function count(n, last_character) that counts the number of valid strings of length n and whose first characters are not less than last_character.
 * Hint 3: In this recursive function, iterate on the possible characters for the first character, which will be all the vowels not less than last_character, and for each possible value c, increase the answer by count(n-1, c).
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Combinatorics).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-sorted-vowel-strings/">LeetCode #1641</a>
 */
public class CountSortedVowelStrings {

    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Sorted Vowel Strings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountSortedVowelStrings ===");
        CountSortedVowelStrings sol = new CountSortedVowelStrings();
        System.out.println(sol.solve(null));
    }
}
