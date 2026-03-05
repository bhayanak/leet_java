package org.leetcode.easy;


/**
 * <b>#1507 - Reformat Date</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a date string in the form Day Month Year, where:
 *
 *
 * Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
 *
 * Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
 *
 * Year is in the range [1900, 2100].
 *
 * Convert the date string to the format YYYY-MM-DD, where:
 *
 *
 * YYYY denotes the 4 digit year.
 *
 * MM denotes the 2 digit month.
 *
 * DD denotes the 2 digit day.
 *
 *
 *
 * Example 1:
 *
 * Input: date = "20th Oct 2052"
 * Output: "2052-10-20"
 *
 * Example 2:
 *
 * Input: date = "6th Jun 1933"
 * Output: "1933-06-06"
 *
 * Example 3:
 *
 * Input: date = "26th May 1960"
 * Output: "1960-05-26"
 *
 *
 *
 * Constraints:
 *
 *
 * The given dates are guaranteed to be valid, so no error handling is necessary.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Handle the conversions of day, month and year separately.
 * Hint 2: Notice that days always have a two-word ending, so if you erase the last two characters of this days you'll get the number.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reformat-date/">LeetCode #1507</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class ReformatDate {

    /**
     * Solves the problem: Reformat date.
     *
     * @param date the date (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String reformatDate(String date) {
        String[] months = {"","Jan","Feb","Mar","Apr","May","Jun",
                           "Jul","Aug","Sep","Oct","Nov","Dec"};
        String[] parts = date.split(" ");
        String day = parts[0].replaceAll("[a-z]+","");
        int month = 0;
        for (int i=1;i<=12;i++) if (months[i].equals(parts[1])) { month=i; break; }
        return String.format("%s-%02d-%02d", parts[2], month, Integer.parseInt(day));
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ReformatDate sol = new ReformatDate();
                System.out.println(sol.reformatDate("20th Oct 2052")); // "2052-10-20"
                System.out.println(sol.reformatDate("6th Jun 1933"));   // "1933-06-06"
                System.out.println(sol.reformatDate("26th May 1960"));  // "1960-05-26"
    }
}
