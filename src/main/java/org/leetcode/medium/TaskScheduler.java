package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #621: Task Scheduler
 * @see <a href="https://leetcode.com/problems/task-scheduler/">Problem</a>
 */
public class TaskScheduler {

    /**
     * LeetCode #621 – Task Scheduler
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting
     *
     * You are given an array of CPU tasks, each labeled with a letter from A to
     * Z, and a number n. Each CPU interval can be idle or allow the completion of
     * one task. Tasks can be completed in any order, but there's a constraint:
     * there has to be a gap of at least n intervals between two tasks with the
     * same label.
     * 
     * 
     * Return the minimum number of CPU intervals required to complete all tasks.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: tasks = ["A","A","A","B","B","B"], n = 2
     * 
     * 
     * Output: 8
     * 
     * 
     * Explanation: A possible sequence is: A -&gt; B -&gt; idle -&gt; A -&gt; B -&gt; idle -&gt; A
     * -&gt; B.
     * 
     * 
     * After completing task A, you must wait two intervals before doing A again.
     * The same applies to task B. In the 3rd interval, neither A nor B can be
     * done, so you idle. By the 4th interval, you can do A again as 2 intervals
     * have passed.
     * 
     * Example 2:
     * 
     * Input: tasks = ["A","C","A","B","D","B"], n = 1
     * 
     * 
     * Output: 6
     * 
     * 
     * Explanation: A possible sequence is: A -&gt; B -&gt; C -&gt; D -&gt; A -&gt; B.
     * 
     * 
     * With a cooling interval of 1, you can repeat a task after just one other
     * task.
     * 
     * Example 3:
     * 
     * Input: tasks = ["A","A","A", "B","B","B"], n = 3
     * 
     * 
     * Output: 10
     * 
     * 
     * Explanation: A possible sequence is: A -&gt; B -&gt; idle -&gt; idle -&gt; A -&gt; B -&gt;
     * idle -&gt; idle -&gt; A -&gt; B.
     * 
     * 
     * There are only two types of tasks, A and B, which need to be separated by 3
     * intervals. This leads to idling twice between repetitions of these tasks.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= tasks.length &lt;= 104
     * 
     * tasks[i] is an uppercase English letter.
     * 
     * 0 &lt;= n &lt;= 100
     */
    // Most frequent task determines minimum intervals
    /**
     * Solves the problem: Least interval.
     * Sorts the input first to enable efficient processing.
     *
     * @param tasks the tasks (char[])
     * @param n the n (int)
     * @return the computed int result
     */
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks) freq[c - 'A']++;
        Arrays.sort(freq);
        int maxFreq = freq[25];
        int idleSlots = (maxFreq - 1) * n;
        for (int i = 24; i >= 0 && freq[i] > 0; i--)
            idleSlots -= Math.min(freq[i], maxFreq - 1);
        return tasks.length + Math.max(0, idleSlots);
    }

    public static void main(String[] args) {
        TaskScheduler sol = new TaskScheduler();
        System.out.println(sol.leastInterval(new char[]{'a','b'}, 0));
    }
}
