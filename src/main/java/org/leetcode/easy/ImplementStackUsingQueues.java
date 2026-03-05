package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ImplementStackUsingQueues solution. */
public class ImplementStackUsingQueues {

    /**
     * Simulates a LIFO stack using FIFO queues.
     * Positive values are pushed; -1 triggers a pop.
     * Returns the result of the last pop operation.
     * @param operations push values (positive) and pop commands (-1)
     * @return value returned by last pop
     * <p><b>Explanation:</b> One-queue approach: after each push, rotate the queue so the new element is at front.</p>
     */
    public int solve(int[] operations) {
        Deque<Integer> queue = new ArrayDeque<>();
        int last = -1;
        for (int op : operations) {
            if (op > 0) {
                queue.add(op);
                for (int i = 1; i < queue.size(); i++) queue.add(queue.poll());
            } else {
                if (!queue.isEmpty()) last = queue.poll();
            }
        }
        return last;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues sol = new ImplementStackUsingQueues();
        System.out.println(sol.solve(new int[]{1, 2, -1})); // 2  (LIFO: last in, first out)
        System.out.println(sol.solve(new int[]{1, 2, 3, -1})); // 3
    }

}
