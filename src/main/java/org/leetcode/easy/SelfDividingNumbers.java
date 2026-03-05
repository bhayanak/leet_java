package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #728: Self Dividing Numbers
 * @see <a href="https://leetcode.com/problems/self-dividing-numbers/">Problem</a>
 */
public class SelfDividingNumbers {

    /**
     * Returns all self-dividing numbers in [left, right].
     * A self-dividing number is divisible by each of its non-zero digits.
     * @param left  lower bound (inclusive)
     * @param right upper bound (inclusive)
     * @return list of self-dividing numbers
     * <p><b>Explanation:</b> Iterate range; for each number check each digit divides it.</p>
     */
    public List<Integer> solve(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int n = left; n <= right; n++) if (isSelfDividing(n)) result.add(n);
        return result;
    }

    private boolean isSelfDividing(int n) {
        int tmp = n;
        while (tmp > 0) {
            int d = tmp % 10;
            if (d == 0 || n % d != 0) return false;
            tmp /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers sol = new SelfDividingNumbers();
        System.out.println(sol.solve(1, 22)); // [1,2,3,4,5,6,7,8,9,11,12,15,22]
    }

}
