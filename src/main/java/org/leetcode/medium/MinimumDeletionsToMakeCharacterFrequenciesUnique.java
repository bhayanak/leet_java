package org.leetcode.medium;


/**
 * <b>#1647 - Minimum Deletions to Make Character Frequencies Unique</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A string s is called good if there are no two different characters in s that have the same frequency.
 *
 *
 * Given a string s, return the minimum number of characters you need to delete to make s good.
 *
 *
 * The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aab"
 * Output: 0
 * Explanation: s is already good.
 *
 * Example 2:
 *
 * Input: s = "aaabbbcc"
 * Output: 2
 * Explanation: You can delete two 'b's resulting in the good string "aaabcc".
 * Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
 *
 * Example 3:
 *
 * Input: s = "ceabaacb"
 * Output: 2
 * Explanation: You can delete both 'c's resulting in the good string "eabaab".
 * Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: As we can only delete characters, if we have multiple characters having the same frequency, we must decrease all the frequencies of them, except one.
 * Hint 2: Sort the alphabet characters by their frequencies non-increasingly.
 * Hint 3: Iterate on the alphabet characters, keep decreasing the frequency of the current character until it reaches a value that has not appeared before.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/">LeetCode #1647</a>
 */
public class MinimumDeletionsToMakeCharacterFrequenciesUnique {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Deletions to Make Character Frequencies Unique");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumDeletionsToMakeCharacterFrequenciesUnique ===");
        MinimumDeletionsToMakeCharacterFrequenciesUnique sol = new MinimumDeletionsToMakeCharacterFrequenciesUnique();
        System.out.println(sol.solve(null));
    }
}
