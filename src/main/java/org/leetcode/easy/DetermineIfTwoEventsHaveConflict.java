package org.leetcode.easy;


/**
 * <b>#2446 - Determine if Two Events Have Conflict</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:
 *
 *
 * event1 = [startTime1, endTime1] and
 *
 * event2 = [startTime2, endTime2].
 *
 * Event times are valid 24 hours format in the form of HH:MM.
 *
 *
 * A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).
 *
 *
 * Return true if there is a conflict between two events. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: event1 = ["01:15","02:00"], event2 = ["02:00","03:00"]
 * Output: true
 * Explanation: The two events intersect at time 2:00.
 *
 * Example 2:
 *
 * Input: event1 = ["01:00","02:00"], event2 = ["01:20","03:00"]
 * Output: true
 * Explanation: The two events intersect starting from 01:20 to 02:00.
 *
 * Example 3:
 *
 * Input: event1 = ["10:00","11:00"], event2 = ["14:00","15:00"]
 * Output: false
 * Explanation: The two events do not intersect.
 *
 *
 *
 * Constraints:
 *
 *
 * event1.length == event2.length == 2
 *
 * event1[i].length == event2[i].length == 5
 *
 * startTime1 &lt;= endTime1
 *
 * startTime2 &lt;= endTime2
 *
 * All the event times follow the HH:MM format.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Parse time format to some integer interval first
 * Hint 2: How would you determine if two intervals overlap?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/determine-if-two-events-have-conflict/">LeetCode #2446</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class DetermineIfTwoEventsHaveConflict {

    /**
     * Solves the problem: Have conflict.
     *
     * @param event1 the event1 (String[])
     * @param event2 the event2 (String[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean haveConflict(String[] event1, String[] event2) {
        return !(event1[1].compareTo(event2[0])<0 || event2[1].compareTo(event1[0])<0);
    }

    public static void main(String[] args) {
        DetermineIfTwoEventsHaveConflict sol = new DetermineIfTwoEventsHaveConflict();
                System.out.println(sol.haveConflict(new String[]{"01:15","02:00"},new String[]{"02:00","03:00"})); // true
                System.out.println(sol.haveConflict(new String[]{"01:00","02:00"},new String[]{"01:20","03:00"})); // true
                System.out.println(sol.haveConflict(new String[]{"10:00","11:00"},new String[]{"14:00","15:00"})); // false
    }
}
