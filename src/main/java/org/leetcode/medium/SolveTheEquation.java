package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #640: Solve the Equation
 * @see <a href="https://leetcode.com/problems/solve-the-equation/">Problem</a>
 */
public class SolveTheEquation {

    /**
     * LeetCode #640 – Solve the Equation
     * Difficulty: MEDIUM
     * Topics: Math, String, Simulation
     *
     * Solve a given equation and return the value of 'x' in the form of a string
     * "x=#value". The equation contains only '+', '-' operation, the variable 'x'
     * and its coefficient. You should return "No solution" if there is no
     * solution for the equation, or "Infinite solutions" if there are infinite
     * solutions for the equation.
     * 
     * 
     * If there is exactly one solution for the equation, we ensure that the value
     * of 'x' is an integer.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: equation = "x+5-3+x=6+x-2"
     * Output: "x=2"
     * 
     * Example 2:
     * 
     * Input: equation = "x=x"
     * Output: "Infinite solutions"
     * 
     * Example 3:
     * 
     * Input: equation = "2x=x"
     * Output: "x=0"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 3 &lt;= equation.length &lt;= 1000
     * 
     * equation has exactly one '='.
     * 
     * equation consists of integers with an absolute value in the range [0, 100]
     * without any leading zeros, and the variable 'x'.
     * 
     * The input is generated that if there is a single solution, it will be an
     * integer.
     */
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");
        int[] left = parse(parts[0]), right = parse(parts[1]);
        // left[0]x + left[1] = right[0]x + right[1]
        int coeff = left[0] - right[0], constant = right[1] - left[1];
        if (coeff == 0) return constant == 0 ? "Infinite solutions" : "No solution";
        return "x=" + (constant / coeff);
    }
    private int[] parse(String s) {
        int x = 0, num = 0, sign = 1;
        boolean numAdded = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                if (numAdded) num += sign * 0; // flush
                sign = c == '+' ? 1 : -1; numAdded = false;
            } else if (c == 'x') {
                x += sign * (numAdded ? Integer.parseInt(s.substring(getStart(s,i), i)) : 1);
                numAdded = false; sign = 1;
            } else {
                numAdded = true;
            }
        }
        // Simple re-parse using regex
        int[] res = new int[2];
        java.util.regex.Matcher m = java.util.regex.Pattern.compile("([+-]?\\d*)x").matcher(s);
        while (m.find()) {
            String coeff = m.group(1);
            res[0] += coeff.isEmpty() || coeff.equals("+") ? 1 : coeff.equals("-") ? -1 : Integer.parseInt(coeff);
        }
        m = java.util.regex.Pattern.compile("([+-]?\\d+)(?!x)").matcher(s.replaceAll("[+-]?\\d*x", ""));
        while (m.find()) res[1] += Integer.parseInt(m.group(1));
        return res;
    }
    private int getStart(String s, int i) {
        int start = i-1;
        while (start > 0 && Character.isDigit(s.charAt(start-1))) start--;
        return start;
    }

    public static void main(String[] args) {
        SolveTheEquation sol = new SolveTheEquation();
        System.out.println(sol.solveEquation("hello"));
    }
}
