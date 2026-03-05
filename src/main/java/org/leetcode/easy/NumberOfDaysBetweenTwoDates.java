package org.leetcode.easy;


/**
 * <b>#1360 - Number of Days Between Two Dates</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Write a program to count the number of days between two dates.
 *
 *
 * The two dates are given as strings, their format is YYYY-MM-DD as shown in the examples.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: date1 = "2019-06-29", date2 = "2019-06-30"
 * Output: 1
 *
 *
 * Example 2:
 *
 * Input: date1 = "2020-01-15", date2 = "2019-12-31"
 * Output: 15
 *
 *
 *
 * Constraints:
 *
 *
 * The given dates are valid dates between the years 1971 and 2100.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a function f(date) that counts the number of days from 1900-01-01 to date. How can we calculate the answer ?
 * Hint 2: The answer is just |f(date1) - f(date2)|.
 * Hint 3: How to construct f(date) ?
 * Hint 4: For each year from 1900 to year - 1 sum up 365 or 366 in case of leap years. Then sum up for each month the number of days, consider the case when the current year is leap, finally sum up the days.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-days-between-two-dates/">LeetCode #1360</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class NumberOfDaysBetweenTwoDates {

    /**
     * Solves the problem: Days between dates.
     *
     * @param date1 the date1 (String)
     * @param date2 the date2 (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int daysBetweenDates(String date1, String date2) {
        return (int)Math.abs(toDay(date1) - toDay(date2));
    }
    private long toDay(String d) {
        String[] p = d.split("-");
        int y=Integer.parseInt(p[0]), m=Integer.parseInt(p[1]), day=Integer.parseInt(p[2]);
        // Zeller/Julian approach
        long days = 0;
        for (int i=1971;i<y;i++) days += isLeap(i)?366:365;
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeap(y)) months[2]=29;
        for (int i=1;i<m;i++) days+=months[i];
        return days+day;
    }
    private boolean isLeap(int y){ return y%4==0&&(y%100!=0||y%400==0); }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        NumberOfDaysBetweenTwoDates sol = new NumberOfDaysBetweenTwoDates();
                System.out.println(sol.daysBetweenDates("2019-06-29","2019-06-30")); // 1
                System.out.println(sol.daysBetweenDates("2020-01-15","2019-12-31")); // 15
    }
}
