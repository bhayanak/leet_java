package org.leetcode.easy;


/**
 * <b>#1736 - Latest Time by Replacing Hidden Digits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string time in the form of  hh:mm, where some of the digits in the string are hidden (represented by ?).
 *
 *
 * The valid times are those inclusively between 00:00 and 23:59.
 *
 *
 * Return the latest valid time you can get from time by replacing the hidden digits.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: time = "2?:?0"
 * Output: "23:50"
 * Explanation: The latest hour beginning with the digit '2' is 23 and the latest minute ending with the digit '0' is 50.
 *
 * Example 2:
 *
 * Input: time = "0?:3?"
 * Output: "09:39"
 *
 * Example 3:
 *
 * Input: time = "1?:22"
 * Output: "19:22"
 *
 *
 *
 * Constraints:
 *
 *
 * time is in the format hh:mm.
 *
 * It is guaranteed that you can produce a valid time from the given string.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Trying out all possible solutions from biggest to smallest would fit in the time limit.
 * Hint 2: To check if the solution is okay, you need to find out if it's valid and matches every character
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/">LeetCode #1736</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class LatestTimeByReplacingHiddenDigits {

    /**
     * Solves the problem: Maximum time.
     *
     * @param time the time (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public String maximumTime(String time) {
        char[] t = time.toCharArray();
        if (t[0]=='?') t[0]=(t[1]<='3'||t[1]=='?') ? '2' : '1';
        if (t[1]=='?') t[1]=(t[0]=='2') ? '3' : '9';
        if (t[3]=='?') t[3]='5';
        if (t[4]=='?') t[4]='9';
        return new String(t);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        LatestTimeByReplacingHiddenDigits sol = new LatestTimeByReplacingHiddenDigits();
                System.out.println(sol.maximumTime("2?:?0")); // "23:50"
                System.out.println(sol.maximumTime("0?:3?")); // "09:39"
                System.out.println(sol.maximumTime("1?:22")); // "19:22"
    }
}
