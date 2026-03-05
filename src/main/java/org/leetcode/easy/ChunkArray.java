package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/** ChunkArray solution. */
public class ChunkArray {

    /**
     * JavaScript-equivalent chunk: splits array into sub-arrays of given size.
     * Returns the sizes of each chunk as a Java int[].
     * @param arr input array
     * @param size chunk size
     * @return array of chunk sizes
     * <p><b>Explanation:</b> Compute ceil(len/size) chunks; each chunk has min(size, remaining) elements.</p>
     */
    public int[] solve(int[] arr, int size) {
        if (size <= 0 || arr.length == 0) return new int[]{};
        int numChunks = (arr.length + size - 1) / size;
        int[] result = new int[numChunks];
        for (int i = 0; i < numChunks; i++)
            result[i] = Math.min(size, arr.length - i * size);
        return result;
    }

    public static void main(String[] args) {
        ChunkArray sol = new ChunkArray();
        System.out.println(Arrays.toString(sol.solve(new int[]{1,2,3,4,5}, 2))); // [2, 2, 1]
        System.out.println(Arrays.toString(sol.solve(new int[]{1,2,3}, 5)));     // [3]
    }

}
