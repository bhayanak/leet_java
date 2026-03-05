package org.leetcode.easy;


/**
 * <b>#1450 - Number of Students Doing Homework at a Given Time</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integer arrays startTime and endTime and given an integer queryTime.
 *
 *
 * The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
 *
 *
 * Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
 * Output: 1
 * Explanation: We have 3 students where:
 * The first student started doing homework at time 1 and finished at time 3 and wasn't doing anything at time 4.
 * The second student started doing homework at time 2 and finished at time 2 and also wasn't doing anything at time 4.
 * The third student started doing homework at time 3 and finished at time 7 and was the only student doing homework at time 4.
 *
 * Example 2:
 *
 * Input: startTime = [4], endTime = [4], queryTime = 4
 * Output: 1
 * Explanation: The only student was doing their homework at the queryTime.
 *
 *
 *
 * Constraints:
 *
 *
 * startTime.length == endTime.length
 *
 * 1 &lt;= startTime.length &lt;= 100
 *
 * 1 &lt;= startTime[i] &lt;= endTime[i] &lt;= 1000
 *
 * 1 &lt;= queryTime &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Imagine that startTime[i] and endTime[i] form an interval (i.e. [startTime[i], endTime[i]]).
 * Hint 2: The answer is how many times the queryTime laid in those mentioned intervals.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/">LeetCode #1450</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    /**
     * Solves the problem: Busy student.
     *
     * @param startTime the startTime (int[])
     * @param endTime the endTime (int[])
     * @param queryTime the queryTime (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for (int i=0;i<startTime.length;i++)
            if (startTime[i]<=queryTime && queryTime<=endTime[i]) count++;
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime sol = new NumberOfStudentsDoingHomeworkAtAGivenTime();
                System.out.println(sol.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4)); // 1
                System.out.println(sol.busyStudent(new int[]{4}, new int[]{4}, 4));          // 1
    }
}
