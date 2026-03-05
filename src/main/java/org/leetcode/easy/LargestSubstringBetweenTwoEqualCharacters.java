package org.leetcode.easy;


/**
 * <b>#1624 - Largest Substring Between Two Equal Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aa"
 * Output: 0
 * Explanation: The optimal substring here is an empty substring between the two 'a's.
 *
 * Example 2:
 *
 * Input: s = "abca"
 * Output: 2
 * Explanation: The optimal substring here is "bc".
 *
 * Example 3:
 *
 * Input: s = "cbzxy"
 * Output: -1
 * Explanation: There are no characters that appear twice in s.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 300
 *
 * s contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try saving the first and last position of each character
 * Hint 2: Try finding every pair of indexes with equal characters
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-substring-between-two-equal-characters/">LeetCode #1624</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class LargestSubstringBetweenTwoEqualCharacters {

    /**
     * Computes the maximum Max length between equal characters.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int maxLengthBetweenEqualCharacters(String s) {
        java.util.Map<Character,Integer> first = new java.util.HashMap<>();
        int max = -1;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (first.containsKey(c)) max=Math.max(max, i-first.get(c)-1);
            else first.put(c,i);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        LargestSubstringBetweenTwoEqualCharacters sol = new LargestSubstringBetweenTwoEqualCharacters();
                System.out.println(sol.maxLengthBetweenEqualCharacters("aa"));      // 0
                System.out.println(sol.maxLengthBetweenEqualCharacters("abca"));    // 2
                System.out.println(sol.maxLengthBetweenEqualCharacters("cbzxy"));   // -1
                System.out.println(sol.maxLengthBetweenEqualCharacters("cabbac")); // 4
    }
}
