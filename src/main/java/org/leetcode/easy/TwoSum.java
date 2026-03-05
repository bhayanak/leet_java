package org.leetcode.easy;

/**
 * <b>#1 - Two Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * 
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * 
 * You can return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 2 &lt;= nums.length &lt;= 104
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * 	
 * -109 &lt;= target &lt;= 109
 * 	
 * Only one valid answer exists.
 * 
 *  
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - A really brute force way would be to search for all possible pairs of numbers but that would be too slow. Again, it's best to try out brute force solutions just for completeness. It is from these brute force solutions that you can come up with optimizations.
 * - So, if we fix one of the numbers, say <code>x</code>, we have to scan the entire array to find the next number <code>y</code> which is <code>value - x</code> where value is the input parameter. Can we change our array somehow so that this search becomes faster?
 * - The second train of thought is, without changing the array, can we use additional space somehow? Like maybe a hash map to speed up the search?
 *
 * <h2>Approach</h2>
 * Use a HashMap to store each number's index.
 * For each element x, check if (target - x) already exists in the map.
 * This gives O(n) time instead of O(n²) brute force.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">LeetCode #1</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class TwoSum {

    /**
     * Finds indices of two numbers that add up to target.
     *
     * @param nums   input array of integers
     * @param target the required sum
     * @return       int[2] with the indices of the two numbers
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public int[] twoSum(int[] nums, int target) {
        // Map: value → index, built as we scan left-to-right
        java.util.Map<Integer, Integer> seen = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{}; // guaranteed to find an answer per constraints
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public static void main(String[] args) {
                TwoSum sol = new TwoSum();
                System.out.println(java.util.Arrays.toString(sol.twoSum(new int[]{2,7,11,15}, 9)));  // [0,1]
                System.out.println(java.util.Arrays.toString(sol.twoSum(new int[]{3,2,4}, 6)));       // [1,2]
    }
}
