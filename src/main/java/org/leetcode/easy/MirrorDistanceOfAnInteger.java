package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** MirrorDistanceOfAnInteger solution. */
public class MirrorDistanceOfAnInteger {

    /**
     * Returns |n - mirror(n)| where mirror(n) is n with its digits reversed.
     * @param n positive integer
     * @return absolute difference between n and its digit-reversed version
     * <p><b>Explanation:</b> Reverse digit string, parse to int, compute absolute difference.</p>
     */
    public int solve(int n) {
        int mirror = Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString());
        return Math.abs(n - mirror);
    }

    public static void main(String[] args) {
        MirrorDistanceOfAnInteger sol = new MirrorDistanceOfAnInteger();
        System.out.println(sol.solve(26));  // |26 - 62| = 36
        System.out.println(sol.solve(10));  // |10 - 1| = 9
        System.out.println(sol.solve(11));  // 0
    }

}
