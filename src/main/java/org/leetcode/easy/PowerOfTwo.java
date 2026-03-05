package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * <b>#231 - PowerOfTwo</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Bit Manipulation, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given an integer n, return true if it is a power of two. Otherwise, return false.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/poweroftwo-/">LeetCode #231</a>
 */
public class PowerOfTwo {

    /**
     * Returns true if n is a power of two.
     * @param n integer
     * @return true if n is a power of 2
     * <p><b>Explanation:</b> A power of two has exactly one set bit: n &gt; 0 &amp;&amp; (n &amp; (n-1)) == 0.</p>
     */
    public boolean solve(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo sol = new PowerOfTwo();
        System.out.println(sol.solve(1));   // true
        System.out.println(sol.solve(16));  // true
        System.out.println(sol.solve(3));   // false
    }

}
