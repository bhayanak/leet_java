package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CalculatorWithMethodChaining solution. */
public class CalculatorWithMethodChaining {

    /**
     * Java equivalent of JS Calculator class with method chaining.
     * Computes: starting value, then apply add/subtract/multiply/divide/power.
     * @param init starting value
     * @param ops pairs of [opCode, operand]: 0=add,1=sub,2=mul,3=div,4=power
     * @return final result as double
     * <p><b>Explanation:</b> Simulate chained operations sequentially on an accumulator.</p>
     */
    public double solve(double init, int[][] ops) {
        double result = init;
        for (int[] op : ops) {
            switch (op[0]) {
                case 0: result += op[1]; break;
                case 1: result -= op[1]; break;
                case 2: result *= op[1]; break;
                case 3: result /= op[1]; break;
                case 4: result = Math.pow(result, op[1]); break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CalculatorWithMethodChaining sol = new CalculatorWithMethodChaining();
        // 10 + 5 - 7 = 8
        System.out.println(sol.solve(10, new int[][]{{0,5},{1,7}})); // 8.0
        // 2 * 5 ^ 2 = 50
        System.out.println(sol.solve(2, new int[][]{{2,5},{4,2}}));  // 100.0? wait 2*5=10, 10^2=100
    }

}
