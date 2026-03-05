package org.leetcode.easy;


/**
 * <b>#2129 - Capitalize the Title</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:
 *
 *
 * If the length of the word is 1 or 2 letters, change all letters to lowercase.
 *
 * Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
 *
 * Return the capitalized title.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: title = "capiTalIze tHe titLe"
 * Output: "Capitalize The Title"
 * Explanation:
 * Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
 *
 * Example 2:
 *
 * Input: title = "First leTTeR of EACH Word"
 * Output: "First Letter of Each Word"
 * Explanation:
 * The word "of" has length 2, so it is all lowercase.
 * The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
 *
 * Example 3:
 *
 * Input: title = "i lOve leetcode"
 * Output: "i Love Leetcode"
 * Explanation:
 * The word "i" has length 1, so it is lowercase.
 * The remaining words have a length of at least 3, so the first letter of each remaining word is uppercase, and the remaining letters are lowercase.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= title.length &lt;= 100
 *
 * title consists of words separated by a single space without any leading or trailing spaces.
 *
 * Each word consists of uppercase and lowercase English letters and is non-empty.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Firstly, try to find all the words present in the string.
 * Hint 2: On the basis of each word's lengths, simulate the process explained in Problem.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/capitalize-the-title/">LeetCode #2129</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class CapitalizeTheTitle {

    /**
     * Solves the problem: Capitalize title.
     *
     * @param title the title (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for (String w : title.split(" ")) {
            if (sb.length()>0) sb.append(' ');
            if (w.length()<=2) sb.append(w.toLowerCase());
            else sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1).toLowerCase());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CapitalizeTheTitle sol = new CapitalizeTheTitle();
                System.out.println(sol.capitalizeTitle("capiTalIze tHe titLe")); // "Capitalize The Title"
                System.out.println(sol.capitalizeTitle("First f of first")); // "First F of First"
                System.out.println(sol.capitalizeTitle("i love leetcode")); // "i Love Leetcode"
    }
}
