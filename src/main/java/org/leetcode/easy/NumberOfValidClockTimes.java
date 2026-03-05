package org.leetcode.easy;


/**
 * <b>#2437 - Number of Valid Clock Times</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string of length 5 called time, representing the current time on a digital clock in the format "hh:mm". The earliest possible time is "00:00" and the latest possible time is "23:59".
 *
 *
 * In the string time, the digits represented by the ? symbol are unknown, and must be replaced with a digit from 0 to 9.
 *
 *
 * Return an integer answer, the number of valid clock times that can be created by replacing every ? with a digit from 0 to 9.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: time = "?5:00"
 * Output: 2
 * Explanation: We can replace the ? with either a 0 or 1, producing "05:00" or "15:00". Note that we cannot replace it with a 2, since the time "25:00" is invalid. In total, we have two choices.
 *
 * Example 2:
 *
 * Input: time = "0?:0?"
 * Output: 100
 * Explanation: Each ? can be replaced by any digit from 0 to 9, so we have 100 total choices.
 *
 * Example 3:
 *
 * Input: time = "??:??"
 * Output: 1440
 * Explanation: There are 24 possible choices for the hours, and 60 possible choices for the minutes. In total, we have 24 * 60 = 1440 choices.
 *
 *
 *
 * Constraints:
 *
 *
 * time is a valid string of length 5 in the format "hh:mm".
 *
 * "00" &lt;= hh &lt;= "23"
 *
 * "00" &lt;= mm &lt;= "59"
 *
 * Some of the digits might be replaced with '?' and need to be replaced with digits from 0 to 9.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute force all possible clock times.
 * Hint 2: Checking if a clock time is valid can be done with Regex.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/number-of-valid-clock-times/">LeetCode #2437</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class NumberOfValidClockTimes {

    /**
     * Counts Count time.
     *
     * @param time the time (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countTime(String time) {
        int count=1;
        if (time.charAt(0)=='?') count*=(time.charAt(1)=='?'?24:(time.charAt(1)<='3'?3:2));
        if (time.charAt(1)=='?') {
            if (time.charAt(0)=='?') count=24;
            else count*=(time.charAt(0)=='2'?4:10);
        }
        if (time.charAt(3)=='?') count*=6;
        if (time.charAt(4)=='?') count*=10;
        return count;
    }

    public static void main(String[] args) {
        NumberOfValidClockTimes sol = new NumberOfValidClockTimes();
                System.out.println(sol.countTime("?5:00")); // 2
                System.out.println(sol.countTime("0?:0?")); // 100
                System.out.println(sol.countTime("??:??")); // 1440
    }
}
