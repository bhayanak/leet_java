package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * LeetCode #682: Baseball Game
 * @see <a href="https://leetcode.com/problems/baseball-game/">Problem</a>
 */
public class BaseballGame {

    /**
     * LeetCode #682 – Baseball Game
     * Difficulty: EASY
     * Topics: Array, Stack, Simulation
     *
     * You are keeping the scores for a baseball game with strange rules. At the
     * beginning of the game, you start with an empty record.
     * 
     * 
     * You are given a list of strings operations, where operations[i] is the ith
     * operation you must apply to the record and is one of the following:
     * 
     * 
     * An integer x.
     * 
     * 
     * 
     * 
     * Record a new score of x.
     * 
     * 
     * 
     * '+'.
     * 
     * 
     * 
     * Record a new score that is the sum of the previous two scores.
     * 
     * 
     * 
     * 'D'.
     * 
     * 
     * 
     * Record a new score that is the double of the previous score.
     * 
     * 
     * 
     * 'C'.
     * 
     * 
     * 
     * Invalidate the previous score, removing it from the record.
     * 
     * 
     * 
     * Return the sum of all the scores on the record after applying all the
     * operations.
     * 
     * 
     * The test cases are generated such that the answer and all intermediate
     * calculations fit in a 32-bit integer and that all operations are valid.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: ops = ["5","2","C","D","+"]
     * Output: 30
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "2" - Add 2 to the record, record is now [5, 2].
     * "C" - Invalidate and remove the previous score, record is now [5].
     * "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
     * "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
     * The total sum is 5 + 10 + 15 = 30.
     * 
     * Example 2:
     * 
     * Input: ops = ["5","-2","4","C","D","9","+","+"]
     * Output: 27
     * Explanation:
     * "5" - Add 5 to the record, record is now [5].
     * "-2" - Add -2 to the record, record is now [5, -2].
     * "4" - Add 4 to the record, record is now [5, -2, 4].
     * "C" - Invalidate and remove the previous score, record is now [5, -2].
     * "D" - A
      *
      * <p><b>Explanation:</b> Uses a Stack/Deque for LIFO processing, ideal for nested structures or history tracking.</p>
      */
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String op : operations) {
            switch (op) {
                case "+": {
                    int top = stack.peek();
                    Iterator<Integer> it = stack.iterator();
                    it.next();
                    int second = it.next();
                    stack.push(top + second); break;
                }
                case "D": stack.push(2 * stack.peek()); break;
                case "C": stack.pop(); break;
                default: stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0; for (int n : stack) sum += n; return sum;
    }

    public static void main(String[] args) {
        BaseballGame sol = new BaseballGame();
        System.out.println(sol.calPoints(new String[]{"a","b"}));
    }
}
