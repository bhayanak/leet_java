package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** AllowOneFunctionCall solution. */
public class AllowOneFunctionCall {

    /**
     * Java equivalent of JS once(): wraps a function so it is called at most once.
     * Returns the result of the first call; -1 for subsequent calls.
     * @param x the argument to the wrapped function (squares it as demo)
     * @param called whether it was already called
     * @return result or -1
     * <p><b>Explanation:</b> Track a called flag; apply fn on first invocation only.</p>
     */
    public int solve(int x, boolean called) {
        if (called) return -1;
        return x * x; // demo function: squares its argument
    }

    public static void main(String[] args) {
        AllowOneFunctionCall sol = new AllowOneFunctionCall();
        System.out.println(sol.solve(5, false)); // 25  (first call)
        System.out.println(sol.solve(5, true));  // -1  (already called)
    }

}
