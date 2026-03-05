package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ImplementQueueUsingStacks solution. */
public class ImplementQueueUsingStacks {

    /**
     * Simulates a FIFO queue using two LIFO stacks.
     * Positive values in operations are pushed; negative values (-1) trigger a pop.
     * Returns the result of the last pop operation.
     * @param operations push values (positive) and pop commands (-1)
     * @return value returned by last pop
     * <p><b>Explanation:</b> Two-stack queue: push to stack1; pop lazily transfers stack1 → stack2.</p>
     */
    public int solve(int[] operations) {
        Deque<Integer> s1 = new ArrayDeque<>(), s2 = new ArrayDeque<>();
        int last = -1;
        for (int op : operations) {
            if (op > 0) { s1.push(op); }
            else {
                if (s2.isEmpty()) while (!s1.isEmpty()) s2.push(s1.pop());
                if (!s2.isEmpty()) last = s2.pop();
            }
        }
        return last;
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks sol = new ImplementQueueUsingStacks();
        System.out.println(sol.solve(new int[]{1, 2, -1})); // 1  (FIFO: first in, first out)
        System.out.println(sol.solve(new int[]{1, 2, -1, -1})); // 2
    }

}
