package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ToBeOrNotToBe solution. */
public class ToBeOrNotToBe {

    /**
     * Java equivalent of JS toBe/notToBe: returns 1 if val==expected (toBe), -1 if !=.
     * @param val      actual value
     * @param expected expected value
     * @return 1 if equal (toBe passes), -1 if not equal (notToBe passes)
     * <p><b>Explanation:</b> Direct comparison; mimics Jest's .toBe() assertion.</p>
     */
    public int solve(int val, int expected) {
        return val == expected ? 1 : -1;
    }

    public static void main(String[] args) {
        ToBeOrNotToBe sol = new ToBeOrNotToBe();
        System.out.println(sol.solve(5, 5));  //  1 (toBe passes)
        System.out.println(sol.solve(5, 7));  // -1 (notToBe passes)
    }

}
