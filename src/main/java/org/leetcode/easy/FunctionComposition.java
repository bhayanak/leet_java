package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** FunctionComposition solution. */
public class FunctionComposition {

    /**
     * Java equivalent of JS function composition: applies functions right-to-left.
     * Demo: compose h(x)=x+1, g(x)=2x, f(x)=x-3 → f(g(h(x))).
     * @param x input value
     * @return composed result
     * <p><b>Explanation:</b> Apply inner function first (h), then middle (g), then outer (f).</p>
     */
    public int solve(int x) {
        int h = x + 1;      // h(x)
        int g = h * 2;      // g(h(x))
        int f = g - 3;      // f(g(h(x)))
        return f;
    }

    public static void main(String[] args) {
        FunctionComposition sol = new FunctionComposition();
        System.out.println(sol.solve(5));  // (5+1)*2-3 = 9
        System.out.println(sol.solve(0));  // (0+1)*2-3 = -1
    }

}
