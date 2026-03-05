package org.leetcode.easy;


/**
 * <b>#1844 - Replace All Digits with Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.
 *
 *
 * You must perform an operation shift(c, x), where c is a character and x is a digit, that returns the xth character after c.
 *
 *
 * For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
 *
 * For every odd index i, you want to replace the digit s[i] with the result of the shift(s[i-1], s[i]) operation.
 *
 *
 * Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
 *
 *
 * Note that shift(c, x) is not a preloaded function, but an operation to be implemented as part of the solution.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "a1c1e1"
 * Output: "abcdef"
 * Explanation: The digits are replaced as follows:
 * - s[1] -&gt; shift('a',1) = 'b'
 * - s[3] -&gt; shift('c',1) = 'd'
 * - s[5] -&gt; shift('e',1) = 'f'
 *
 * Example 2:
 *
 * Input: s = "a1b2c3d4e"
 * Output: "abbdcfdhe"
 * Explanation: The digits are replaced as follows:
 * - s[1] -&gt; shift('a',1) = 'b'
 * - s[3] -&gt; shift('b',2) = 'd'
 * - s[5] -&gt; shift('c',3) = 'f'
 * - s[7] -&gt; shift('d',4) = 'h'
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists only of lowercase English letters and digits.
 *
 * shift(s[i-1], s[i]) &lt;= 'z' for all odd indices i.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We just need to replace every even positioned character with the character s[i] positions ahead of the character preceding it
 * Hint 2: Get the position of the preceeding character in alphabet then advance it s[i] positions and get the character at that position
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/replace-all-digits-with-characters/">LeetCode #1844</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class ReplaceAllDigitsWithCharacters {

    /**
     * Solves the problem: Replace digits.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for (int i=1;i<arr.length;i+=2)
            arr[i]=(char)(arr[i-1]+arr[i]-'0');
        return new String(arr);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ReplaceAllDigitsWithCharacters sol = new ReplaceAllDigitsWithCharacters();
                System.out.println(sol.replaceDigits("a1c1e1")); // "abcdef"
                System.out.println(sol.replaceDigits("a1b2c3d4e")); // "abbdcfdhe"
    }
}
