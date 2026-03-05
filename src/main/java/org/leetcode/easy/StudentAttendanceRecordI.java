package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #551: Student Attendance Record I
 * @see <a href="https://leetcode.com/problems/student-attendance-record-i/">Problem</a>
 */
public class StudentAttendanceRecordI {

    /**
     * Returns true if the attendance record is rewardable:
     * at most one 'A' (absent) and no 3+ consecutive 'L' (late).
     * @param s attendance record string (A, L, P)
     * @return true if rewardable
     * <p><b>Explanation:</b> Single scan: count As; track consecutive Ls; fail if A&gt;1 or Ls&gt;=3.</p>
     */
    public boolean solve(String s) {
        int absences = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A' && ++absences > 1) return false;
            if (s.charAt(i) == 'L' && i >= 2 && s.charAt(i-1) == 'L' && s.charAt(i-2) == 'L') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StudentAttendanceRecordI sol = new StudentAttendanceRecordI();
        System.out.println(sol.solve("PPALLP")); // true
        System.out.println(sol.solve("PPALLL")); // false
    }

}
