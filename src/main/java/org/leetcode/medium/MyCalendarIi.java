package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #731: My Calendar II
 * @see <a href="https://leetcode.com/problems/my-calendar-ii/">Problem</a>
 */
public class MyCalendarIi {

    /**
     * LeetCode #731 – My Calendar II
     * Difficulty: MEDIUM
     * Topics: Array, Binary Search, Design, Segment Tree, Prefix Sum, Ordered Set
     *
     * You are implementing a program to use as your calendar. We can add a new
     * event if adding the event will not cause a triple booking.
     * 
     * 
     * A triple booking happens when three events have some non-empty intersection
     * (i.e., some moment is common to all the three events.).
     * 
     * 
     * The event can be represented as a pair of integers startTime and endTime
     * that represents a booking on the half-open interval [startTime, endTime),
     * the range of real numbers x such that startTime &lt;= x &lt; endTime.
     * 
     * 
     * Implement the MyCalendarTwo class:
     * 
     * 
     * MyCalendarTwo() Initializes the calendar object.
     * 
     * boolean book(int startTime, int endTime) Returns true if the event can be
     * added to the calendar successfully without causing a triple booking.
     * Otherwise, return false and do not add the event to the calendar.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["MyCalendarTwo", "book", "book", "book", "book", "book", "book"]
     * [[], [10, 20], [50, 60], [10, 40], [5, 15], [5, 10], [25, 55]]
     * Output
     * [null, true, true, true, false, true, true]
     * 
     * Explanation
     * MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
     * myCalendarTwo.book(10, 20); // return True, The event can be booked.
     * myCalendarTwo.book(50, 60); // return True, The event can be booked.
     * myCalendarTwo.book(10, 40); // return True, The event can be double booked.
     * myCalendarTwo.book(5, 15); // return False, The event cannot be booked,
     * because it would result in a triple booking.
     * myCalendarTwo.book(5, 10); // return True, The event can be booked, as it
     * does not use time 10 which is already double b
     */
    // TODO: Implement solution for My Calendar II
    // Difficulty: MEDIUM | Topics: Array, Binary Search, Design, Segment Tree, Prefix Sum, Ordered Set
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        MyCalendarIi sol = new MyCalendarIi();
        System.out.println(sol.solve());
    }
}
