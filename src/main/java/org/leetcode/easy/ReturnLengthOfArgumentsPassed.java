package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>ReturnLengthOfArgumentsPassed</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of arguments, return the number of arguments passed (i.e., the array's length).
 * Equivalent to JavaScript's arguments.length.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Return the length of the input array.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(1)</li>
 *   <li>Space: O(1)</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Returns the array length, which equals the number of arguments passed.</p>
 */
public class ReturnLengthOfArgumentsPassed {

    /**
     * Java equivalent of JS argumentsLength: returns the count of arguments.
     * @param args the arguments array
     * @return number of arguments
     * <p><b>Explanation:</b> Length of the array equals the number of arguments passed.</p>
     */
    public int solve(int[] args) {
        return args.length;
    }

    public static void main(String[] args) {
        ReturnLengthOfArgumentsPassed sol = new ReturnLengthOfArgumentsPassed();
        System.out.println(sol.solve(new int[]{5}));          // 1
        System.out.println(sol.solve(new int[]{1,2,3,4,5})); // 5
    }

}
