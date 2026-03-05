package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** CreateADataframeFromList solution. */
public class CreateADataframeFromList {

    /**
     * Java equivalent of creating a Pandas DataFrame from a list.
     * Returns the number of rows (students) in the dataset.
     * @param studentData 2D array of [student_id, age] rows
     * @return number of rows
     * <p><b>Explanation:</b> Length of the array equals the number of DataFrame rows.</p>
     */
    public int solve(int[][] studentData) {
        return studentData.length;
    }

    public static void main(String[] args) {
        CreateADataframeFromList sol = new CreateADataframeFromList();
        System.out.println(sol.solve(new int[][]{{1,15},{2,11},{3,11},{4,20}})); // 4
    }

}
