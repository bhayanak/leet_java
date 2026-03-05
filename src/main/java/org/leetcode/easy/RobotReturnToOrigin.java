package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #657: Robot Return to Origin
 * @see <a href="https://leetcode.com/problems/robot-return-to-origin/">Problem</a>
 */
public class RobotReturnToOrigin {

    /**
     * Returns true if following the moves brings the robot back to the origin.
     * @param moves string of 'U','D','L','R' moves
     * @return true if net displacement is zero
     * <p><b>Explanation:</b> Count x and y displacements; both must be zero at the end.</p>
     */
    public boolean solve(String moves) {
        int x = 0, y = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') y++;
            else if (c == 'D') y--;
            else if (c == 'L') x--;
            else if (c == 'R') x++;
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        RobotReturnToOrigin sol = new RobotReturnToOrigin();
        System.out.println(sol.solve("UD")); // true
        System.out.println(sol.solve("LL")); // false
    }

}
