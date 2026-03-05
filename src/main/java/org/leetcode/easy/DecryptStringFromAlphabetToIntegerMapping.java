package org.leetcode.easy;


/**
 * <b>#1309 - Decrypt String from Alphabet to Integer Mapping</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
 *
 *
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 *
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 *
 * Return the string formed after mapping.
 *
 *
 * The test cases are generated so that a unique mapping will always exist.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "10#11#12"
 * Output: "jkab"
 * Explanation: "j" -&gt; "10#" , "k" -&gt; "11#" , "a" -&gt; "1" , "b" -&gt; "2".
 *
 * Example 2:
 *
 * Input: s = "1326#"
 * Output: "acz"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists of digits and the '#' letter.
 *
 * s will be a valid string such that mapping is always possible.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Scan from right to left, in each step of the scanning check whether there is a trailing "#" 2 indexes away.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/">LeetCode #1309</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class DecryptStringFromAlphabetToIntegerMapping {

    /**
     * Solves the problem: Freq alphabets.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length()-1;
        while (i >= 0) {
            if (i>=2 && s.charAt(i)=='#') {
                sb.append((char)('a' + Integer.parseInt(s.substring(i-2,i))-1));
                i -= 3;
            } else {
                sb.append((char)('a' + s.charAt(i)-'0'-1));
                i--;
            }
        }
        return sb.reverse().toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DecryptStringFromAlphabetToIntegerMapping sol = new DecryptStringFromAlphabetToIntegerMapping();
                System.out.println(sol.freqAlphabets("10#11#12"));      // "jkab"
                System.out.println(sol.freqAlphabets("1326#"));         // "acz"
                System.out.println(sol.freqAlphabets("25#"));           // "y"
    }
}
