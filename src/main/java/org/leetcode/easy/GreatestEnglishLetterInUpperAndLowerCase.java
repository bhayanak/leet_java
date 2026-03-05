package org.leetcode.easy;


/**
 * <b>#2309 - Greatest English Letter in Upper and Lower Case</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.
 *
 *
 * An English letter b is greater than another letter a if b appears after a in the English alphabet.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "lEeTcOdE"
 * Output: "E"
 * Explanation:
 * The letter 'E' is the only letter to appear in both lower and upper case.
 *
 * Example 2:
 *
 * Input: s = "arRAzFif"
 * Output: "R"
 * Explanation:
 * The letter 'R' is the greatest letter to appear in both lower and upper case.
 * Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
 *
 * Example 3:
 *
 * Input: s = "AbCdEfGhIjK"
 * Output: ""
 * Explanation:
 * There is no letter that appears in both lower and upper case.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists of lowercase and uppercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider iterating through the string and storing each unique character that occurs in a set.
 * Hint 2: From Z to A, check whether both the uppercase and lowercase version occur in the set.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/">LeetCode #2309</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class GreatestEnglishLetterInUpperAndLowerCase {

    /**
     * Finds the longest Longest subsequence.
     *
     * @param s the s (String)
     * @param t the t (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String longestSubsequence(String s, String t) {
        int j=0;
        for (int i=0;i<s.length()&&j<t.length();i++)
            if (s.charAt(i)==t.charAt(j)) j++;
        return j==t.length()?t:"";
    }

    public static void main(String[] args) {
        GreatestEnglishLetterInUpperAndLowerCase sol = new GreatestEnglishLetterInUpperAndLowerCase();
                System.out.println(sol.longestSubsequence("ace","abcde")); // "ace"
                System.out.println(sol.longestSubsequence("ace","xyz"));   // ""
    }
}
