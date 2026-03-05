package org.leetcode.easy;


/**
 * <b>#2515 - Shortest Distance to Target String in a Circular Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed circular string array words and a string target. A circular array means that the array's end connects to the array's beginning.
 *
 *
 * Formally, the next element of words[i] is words[(i + 1) % n] and the previous element of words[i] is words[(i - 1 + n) % n], where n is the length of words.
 *
 * Starting from startIndex, you can move to either the next word or the previous word with 1 step at a time.
 *
 *
 * Return the shortest distance needed to reach the string target. If the string target does not exist in words, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["hello","i","am","leetcode","hello"], target = "hello", startIndex = 1
 * Output: 1
 * Explanation: We start from index 1 and can reach "hello" by
 * - moving 3 units to the right to reach index 4.
 * - moving 2 units to the left to reach index 4.
 * - moving 4 units to the right to reach index 0.
 * - moving 1 unit to the left to reach index 0.
 * The shortest distance to reach "hello" is 1.
 *
 * Example 2:
 *
 * Input: words = ["a","b","leetcode"], target = "leetcode", startIndex = 0
 * Output: 1
 * Explanation: We start from index 0 and can reach "leetcode" by
 * - moving 2 units to the right to reach index 2.
 * - moving 1 unit to the left to reach index 2.
 * The shortest distance to reach "leetcode" is 1.
 *
 * Example 3:
 *
 * Input: words = ["i","eat","leetcode"], target = "ate", startIndex = 0
 * Output: -1
 * Explanation: Since "ate" does not exist in words, we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * words[i] and target consist of only lowercase English letters.
 *
 * 0 &lt;= startIndex &lt; words.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You have two options, either move straight to the left or move straight to the right.
 * Hint 2: Find the first target word and record the distance.
 * Hint 3: Choose the one with the minimum distance.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array/">LeetCode #2515</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class ShortestDistanceToTargetStringInACircularArray {

    /**
     * Solves the problem: Best closing time.
     *
     * @param customers the customers (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int bestClosingTime(String customers) {
        int minPenalty=0, penalty=0, best=0, n=customers.length();
        // count total Y after pos 0
        for (char c:customers.toCharArray()) if (c=='Y') minPenalty++;
        int cur=0;
        for (int i=0;i<n;i++) {
            if (customers.charAt(i)=='Y') cur--; else cur++;
            if (cur<0) { best=i+1; cur=0; }
        }
        // re-scan to find actual best
        int pen=0, minP=0, bestI=0;
        for (char c:customers.toCharArray()) if (c=='Y') minP++;
        pen=minP;
        for (int i=0;i<n;i++) {
            pen+=(customers.charAt(i)=='Y')?-1:1;
            if (pen<minP) { minP=pen; bestI=i+1; }
        }
        return bestI;
    }

    public static void main(String[] args) {
        ShortestDistanceToTargetStringInACircularArray sol = new ShortestDistanceToTargetStringInACircularArray();
        System.out.println(sol.bestClosingTime("test"));
    }
}
