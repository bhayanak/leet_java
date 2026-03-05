package org.leetcode.easy;

/** DayOfTheWeek solution. */
public class DayOfTheWeek {
    /**
     * Returns the day of the week for a given date.
     *
     * @param day   day of the month
     * @param month month number (1-12)
     * @param year  year
     * @return name of the day ("Sunday", "Monday", etc.)
     *
     * <p><b>Explanation:</b> Uses Zeller's formula (or similar) to compute the day index</p>
     *   modulo 7 from the date components. Time O(1), Space O(1).
     */
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        // Sakamoto's algorithm
        int[] t = {0,3,2,5,0,3,5,1,4,6,2,4};
        if (month < 3) year--;
        int w = (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        return days[w];
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DayOfTheWeek.java &amp;&amp; java org.leetcode.easy.DayOfTheWeek</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== DayOfTheWeek ===");
        DayOfTheWeek sol = new DayOfTheWeek();
        System.out.println(sol.dayOfTheWeek(3, 3, 3));
    }
}
