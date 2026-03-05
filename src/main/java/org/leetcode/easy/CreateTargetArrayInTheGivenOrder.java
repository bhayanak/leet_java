package org.leetcode.easy;


/**
 * <b>#1389 - Create Target Array in the Given Order</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
 *
 *
 * Initially target array is empty.
 *
 * From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
 *
 * Repeat the previous step until there are no elements to read in nums and index.
 *
 * Return the target array.
 *
 *
 * It is guaranteed that the insertion operations will be valid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 * Explanation:
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
 * Output: [0,1,2,3,4]
 * Explanation:
 * nums       index     target
 * 1            0        [1]
 * 2            1        [1,2]
 * 3            2        [1,2,3]
 * 4            3        [1,2,3,4]
 * 0            0        [0,1,2,3,4]
 *
 * Example 3:
 *
 * Input: nums = [1], index = [0]
 * Output: [1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length, index.length &lt;= 100
 *
 * nums.length == index.length
 *
 * 0 &lt;= nums[i] &lt;= 100
 *
 * 0 &lt;= index[i] &lt;= i
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process and fill corresponding numbers in the designated spots.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/create-target-array-in-the-given-order/">LeetCode #1389</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class CreateTargetArrayInTheGivenOrder {

    /**
     * Solves the problem: Create target array.
     *
     * @param nums the nums (int[])
     * @param index the index (int[])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int[] createTargetArray(int[] nums, int[] index) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i=0;i<nums.length;i++) list.add(index[i], nums[i]);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        CreateTargetArrayInTheGivenOrder sol = new CreateTargetArrayInTheGivenOrder();
                System.out.println(java.util.Arrays.toString(sol.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
                // [0,4,1,3,2]
                System.out.println(java.util.Arrays.toString(sol.createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})));
                // [0,1,2,3,4]
    }
}
