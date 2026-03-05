package org.leetcode.easy;


/**
 * <b>#1356 - Sort Integers by The Number of 1 Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 *
 *
 * Return the array after sorting it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [0,1,2,3,4,5,6,7,8]
 * Output: [0,1,2,4,8,3,5,6,7]
 * Explantion: [0] is the only integer with 0 bits.
 * [1,2,4,8] all have 1 bit.
 * [3,5,6] have 2 bits.
 * [7] has 3 bits.
 * The sorted array by bits is [0,1,2,4,8,3,5,6,7]
 *
 * Example 2:
 *
 * Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * Output: [1,2,4,8,16,32,64,128,256,512,1024]
 * Explantion: All integers have 1 bit in the binary representation, you should just sort them in ascending order.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 500
 *
 * 0 &lt;= arr[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the problem. Count the number of 1's in the binary representation of each integer.
 * Hint 2: Sort by the number of 1's ascending and by the value in case of tie.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/">LeetCode #1356</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class SortIntegersByTheNumberOf1Bits {

    /**
     * Sorts Sort by bits.
     * Sorts the input first to enable efficient processing.
     *
     * @param arr the arr (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int[] sortByBits(int[] arr) {
        Integer[] box = new Integer[arr.length];
        for (int i=0;i<arr.length;i++) box[i]=arr[i];
        java.util.Arrays.sort(box,(a,b)->
            Integer.bitCount(a)!=Integer.bitCount(b)
            ? Integer.bitCount(a)-Integer.bitCount(b) : a-b);
        for (int i=0;i<arr.length;i++) arr[i]=box[i];
        return arr;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        SortIntegersByTheNumberOf1Bits sol = new SortIntegersByTheNumberOf1Bits();
                System.out.println(java.util.Arrays.toString(sol.sortByBits(new int[]{0,1,2,3,4,5,6,7,8})));
                // [0,1,2,4,8,3,5,6,7]
                System.out.println(java.util.Arrays.toString(sol.sortByBits(new int[]{1024,512,256,128,64,32,16,8,4,2,1})));
                // [1,2,4,8,16,32,64,128,256,512,1024]
    }
}
