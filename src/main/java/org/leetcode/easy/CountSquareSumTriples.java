package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CountSquareSumTriples solution. */
public class CountSquareSumTriples {

    /**
     * Counts all triples (a, b, c) where 1 ≤ a, b, c ≤ n and a² + b² = c².
     * @param n upper bound for a, b, c
     * @return count of Pythagorean triples within [1..n]
     * <p><b>Explanation:</b> O(n²): precompute square set; for each (a,b) check if a²+b² is a square.</p>
     */
    public int solve(int n) {
        boolean[] isSquare = new boolean[n * n + 1];
        for (int i = 1; i <= n; i++) isSquare[i * i] = true;
        int count = 0;
        for (int a = 1; a <= n; a++)
            for (int b = 1; b <= n; b++) {
                int c2 = a * a + b * b;
                if (c2 <= n * n && isSquare[c2]) count++;
            }
        return count;
    }

    public static void main(String[] args) {
        CountSquareSumTriples sol = new CountSquareSumTriples();
        System.out.println(sol.solve(5));  // 2
        System.out.println(sol.solve(10)); // 4
    }

}
