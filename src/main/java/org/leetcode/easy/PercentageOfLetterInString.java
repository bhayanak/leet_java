package org.leetcode.easy;


/**
 * <b>#2278 - Percentage of Letter in String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "foobar", letter = "o"
 * Output: 33
 * Explanation:
 * The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.
 *
 * Example 2:
 *
 * Input: s = "jjjj", letter = "k"
 * Output: 0
 * Explanation:
 * The percentage of characters in s that equal the letter 'k' is 0%, so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists of lowercase English letters.
 *
 * letter is a lowercase English letter.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we count the number of occurrences of letter in s?
 * Hint 2: Recall that the percentage is calculated as (occurrences / total) * 100.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/percentage-of-letter-in-string/">LeetCode #2278</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class PercentageOfLetterInString {

    /**
     * Solves the problem: Percentage letter.
     *
     * @param s the s (String)
     * @param letter the letter (char)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int percentageLetter(String s, char letter) {
        int cnt=0; for (char c:s.toCharArray()) if (c==letter) cnt++;
        return cnt*100/s.length();
    }

    public static void main(String[] args) {
        PercentageOfLetterInString sol = new PercentageOfLetterInString();
                System.out.println(sol.percentageLetter("foobar",'o')); // 33
                System.out.println(sol.percentageLetter("jjjj",'k'));   // 0
    }
}
