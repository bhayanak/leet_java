package org.leetcode.easy;


/**
 * <b>#1957 - Delete Characters to Make Fancy String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A fancy string is a string where no three consecutive characters are equal.
 *
 *
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 *
 *
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leeetcode"
 * Output: "leetcode"
 * Explanation:
 * Remove an 'e' from the first group of 'e's to create "leetcode".
 * No three consecutive characters are equal, so return "leetcode".
 *
 * Example 2:
 *
 * Input: s = "aaabaaaa"
 * Output: "aabaa"
 * Explanation:
 * Remove an 'a' from the first group of 'a's to create "aabaaaa".
 * Remove two 'a's from the second group of 'a's to create "aabaa".
 * No three consecutive characters are equal, so return "aabaa".
 *
 * Example 3:
 *
 * Input: s = "aab"
 * Output: "aab"
 * Explanation: No three consecutive characters are equal, so return "aab".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What's the optimal way to delete characters if three or more consecutive characters are equal?
 * Hint 2: If three or more consecutive characters are equal, keep two of them and delete the rest.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-characters-to-make-fancy-string/">LeetCode #1957</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class DeleteCharactersToMakeFancyString {

    /**
     * Solves the problem: Make fancy string.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int cnt=1;
        sb.append(s.charAt(0));
        for (int i=1;i<s.length();i++) {
            cnt = s.charAt(i)==s.charAt(i-1) ? cnt+1 : 1;
            if (cnt<3) sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DeleteCharactersToMakeFancyString sol = new DeleteCharactersToMakeFancyString();
                System.out.println(sol.makeFancyString("leeetcode")); // "leetcode"
                System.out.println(sol.makeFancyString("aaabaaaa")); // "aabaa"
                System.out.println(sol.makeFancyString("aab")); // "aab"
    }
}
