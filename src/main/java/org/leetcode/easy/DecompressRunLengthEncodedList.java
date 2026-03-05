package org.leetcode.easy;


/**
 * <b>#1313 - Decompress Run-Length Encoded List</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 *
 *
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i &gt;= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
 *
 *
 * Return the decompressed list.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 *
 * Example 2:
 *
 * Input: nums = [1,1,2,3]
 * Output: [1,3,3]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * nums.length % 2 == 0
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Decompress the given array by repeating nums[2*i+1] a number of times equal to nums[2*i].
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/decompress-run-length-encoded-list/">LeetCode #1313</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class DecompressRunLengthEncodedList {

    /**
     * Solves the problem: Decompress r l elist.
     *
     * @param nums the nums (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int[] decompressRLElist(int[] nums) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        for (int i=0;i<nums.length;i+=2)
            for (int j=0;j<nums[i];j++) res.add(nums[i+1]);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        DecompressRunLengthEncodedList sol = new DecompressRunLengthEncodedList();
                System.out.println(java.util.Arrays.toString(sol.decompressRLElist(new int[]{1,2,3,4})));
                // [2,4,4,4]
                System.out.println(java.util.Arrays.toString(sol.decompressRLElist(new int[]{1,1,2,3})));
                // [1,3,3]
    }
}
