package org.leetcode.easy;

/** DayOfTheYear solution. */
public class DayOfTheYear {
    /**
     * Returns the day number of the year for a given date string "YYYY-MM-DD".
     *
     * @param date date string in "YYYY-MM-DD" format
     * @return day number (1-indexed) within the year
     *
     * <p><b>Explanation:</b> Precomputes cumulative days per month and accounts for leap years</p>
     *   (divisible by 4, except centuries unless also by 400). Time O(1), Space O(1).
     */
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day   = Integer.parseInt(date.substring(8,10));
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        boolean leap = (year%4==0 && year%100!=0) || year%400==0;
        if (leap) months[1] = 29;
        int total = day;
        for (int m = 0; m < month-1; m++) total += months[m];
        return total;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DayOfTheYear.java &amp;&amp; java org.leetcode.easy.DayOfTheYear</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== DayOfTheYear ===");
        DayOfTheYear sol = new DayOfTheYear();
        System.out.println(sol.dayOfYear("hello"));
    }
}
