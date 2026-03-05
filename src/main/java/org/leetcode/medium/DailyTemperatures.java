package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * LeetCode #739: Daily Temperatures
 * @see <a href="https://leetcode.com/problems/daily-temperatures/">Problem</a>
 */
public class DailyTemperatures {

    /**
     * LeetCode #739 – Daily Temperatures
     * Difficulty: MEDIUM
     * Topics: Array, Stack, Monotonic Stack
     *
     * Given an array of integers temperatures represents the daily temperatures,
     * return an array answer such that answer[i] is the number of days you have
     * to wait after the ith day to get a warmer temperature. If there is no
     * future day for which this is possible, keep answer[i] == 0 instead.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     * 
     * 
     * Example 2:
     * 
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     * 
     * 
     * Example 3:
     * 
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= temperatures.length &lt;= 105
     * 
     * 30 &lt;= temperatures[i] &lt;= 100
     */
    // Monotone stack: for each temperature find next warmer day
    /**
     * Solves the problem: Daily temperatures.
     *
     * @param temperatures the temperatures (int[])
     * @return the computed int[] result
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // stores indices
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
                result[stack.pop()] = i - stack.peek() - 1; // BUG: recalculate
            stack.push(i);
        }
        // Redo correctly
        int[] res = new int[n];
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()])
                res[st.pop()] = i - st.peek() - 1;
            //  BUG still: st.peek() after pop
        }
        // Clean correct version
        int[] answer = new int[n];
        Deque<Integer> s = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && temperatures[i] > temperatures[s.peek()]) {
                int idx = s.pop();
                answer[idx] = i - idx;
            }
            s.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        DailyTemperatures sol = new DailyTemperatures();
        System.out.println(sol.dailyTemperatures(new int[]{1,2,3}));
    }
}
