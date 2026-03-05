package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #768: Max Chunks To Make Sorted II
 * @see <a href="https://leetcode.com/problems/max-chunks-to-make-sorted-ii/">Problem</a>
 */
public class MaxChunksToMakeSortedIi {

    /**
     * LeetCode #768 – Max Chunks To Make Sorted II
     * Difficulty: HARD
     * Topics: Array, Stack, Greedy, Sorting, Monotonic Stack
     *
     * You are given an integer array arr.
     * 
     * 
     * We split arr into some number of chunks (i.e., partitions), and
     * individually sort each chunk. After concatenating them, the result should
     * equal the sorted array.
     * 
     * 
     * Return the largest number of chunks we can make to sort the array.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: arr = [5,4,3,2,1]
     * Output: 1
     * Explanation:
     * Splitting into two or more chunks will not return the required result.
     * For example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2,
     * 3], which isn't sorted.
     * 
     * Example 2:
     * 
     * Input: arr = [2,1,3,4,4]
     * Output: 4
     * Explanation:
     * We can split into two chunks, such as [2, 1], [3, 4, 4].
     * However, splitting into [2, 1], [3], [4], [4] is the highest number of
     * chunks possible.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= arr.length &lt;= 2000
     * 
     * 0 &lt;= arr[i] &lt;= 108
     */
    // TODO: Implement solution for Max Chunks To Make Sorted II
    // Difficulty: HARD | Topics: Array, Stack, Greedy, Sorting, Monotonic Stack
    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        MaxChunksToMakeSortedIi sol = new MaxChunksToMakeSortedIi();
        System.out.println(sol.solve());
    }
}
