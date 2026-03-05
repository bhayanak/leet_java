package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** LatestTimeYouCanObtainAfterReplacingCharacters solution. */
public class LatestTimeYouCanObtainAfterReplacingCharacters {

    /**
     * Replaces '?' in a 12-hour time string "hh:mm" with digits to maximise the time.
     * @param time time string with possible '?' characters
     * @return latest valid time
     * <p><b>Explanation:</b> Greedily assign the maximum valid digit to each '?' position.</p>
     */
    public String solve(String time) {
        char[] t = time.toCharArray();
        // Hour tens digit
        if (t[0] == '?') t[0] = (t[1] == '?' || t[1] <= '3') ? '1' : '0';
        // Hour units digit
        if (t[1] == '?') t[1] = (t[0] == '1') ? '2' : '9';
        // Minute tens digit
        if (t[3] == '?') t[3] = '5';
        // Minute units digit
        if (t[4] == '?') t[4] = '9';
        return new String(t);
    }

    public static void main(String[] args) {
        LatestTimeYouCanObtainAfterReplacingCharacters sol = new LatestTimeYouCanObtainAfterReplacingCharacters();
        System.out.println(sol.solve("1?:?4")); // "19:54"
        System.out.println(sol.solve("0?:5?")); // "09:59"
        System.out.println(sol.solve("??:??")); // "12:59"  wait: hour max = 12 for 12-hr?  actually 19:59 or 23:59 for 24-hr
    }

}
