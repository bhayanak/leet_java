package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CounterIi solution. */
public class CounterIi {

    /**
     * Java equivalent of JS Counter II: supports increment, decrement, reset.
     * @param init initial value
     * @param ops operation names: "increment", "decrement", "reset"
     * @return result after each operation
     * <p><b>Explanation:</b> Simulate each operation in sequence on a mutable counter.</p>
     */
    public int[] solve(int init, String[] ops) {
        int val = init;
        int[] results = new int[ops.length];
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]) {
                case "increment": val++; break;
                case "decrement": val--; break;
                default: val = init; break; // "reset"
            }
            results[i] = val;
        }
        return results;
    }

    public static void main(String[] args) {
        CounterIi sol = new CounterIi();
        System.out.println(Arrays.toString(
            sol.solve(5, new String[]{"increment","reset","decrement"}))); // [6, 5, 4]
    }

}
