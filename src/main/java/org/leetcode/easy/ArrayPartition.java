package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * <h2>LeetCode #561 - Array Partition</h2>
 * <b>Difficulty:</b> EASY | <b>Topics:</b> Array, Greedy, Sorting, Counting Sort
 *
 * <p>Given an integer array {@code nums} of {@code 2n} integers, group these integers into
 * {@code n} pairs (a1,b1), (a2,b2), ..., (an,bn) such that the sum of min(ai,bi)
 * for all i is maximized. Return the maximized sum.</p>
 *
 * <h3>Examples</h3>
 * <pre>
 * Input:  nums = [1,4,3,2]       Output: 4
 * Input:  nums = [6,2,6,5,1,2]   Output: 9
 * </pre>
 *
 * <h3>Constraints</h3>
 * <ul>
 *   <li>1 &lt;= n &lt;= 10^4</li>
 *   <li>nums.length == 2 * n</li>
 *   <li>-10^4 &lt;= nums[i] &lt;= 10^4</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/array-partition/">LeetCode #561</a>
 */
public class ArrayPartition {

    /**
     * Maximises the sum of minimums by sorting and picking every other element.
     *
     * @param nums array of {@code 2n} integers
     * @return maximum possible sum of pair minimums
     * <p><b>Explanation:</b> Sort the array; in each adjacent pair the smaller element is always at</p>
     *              the even index. Summing even-index elements gives the optimal answer.
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) sum += nums[i];
        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition sol = new ArrayPartition();
        System.out.println(sol.arrayPairSum(new int[]{1, 4, 3, 2}));       // 4
        System.out.println(sol.arrayPairSum(new int[]{6, 2, 6, 5, 1, 2})); // 9
    }
}
