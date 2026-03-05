package org.leetcode.easy;


/**
 * <b>#2441 - Largest Positive Integer That Exists With Its Negative</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.
 *
 *
 * Return the positive integer k. If there is no such integer, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,2,-3,3]
 * Output: 3
 * Explanation: 3 is the only valid k we can find in the array.
 *
 * Example 2:
 *
 * Input: nums = [-1,10,6,7,-7,1]
 * Output: 7
 * Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
 *
 * Example 3:
 *
 * Input: nums = [-10,8,6,7,-2,-3]
 * Output: -1
 * Explanation: There is no a single valid k, we return -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * -1000 &lt;= nums[i] &lt;= 1000
 *
 * nums[i] != 0
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What data structure can help you to determine if an element exists?
 * Hint 2: Would a hash table help?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/">LeetCode #2441</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class LargestPositiveIntegerThatExistsWithItsNegative {

    /**
     * Finds Find max k.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int findMaxK(int[] nums) {
        java.util.Set<Integer> set=new java.util.HashSet<>();
        for (int n:nums) set.add(n);
        int res=-1;
        for (int n:nums) if (n>0&&set.contains(-n)) res=Math.max(res,n);
        return res;
    }

    public static void main(String[] args) {
        LargestPositiveIntegerThatExistsWithItsNegative sol = new LargestPositiveIntegerThatExistsWithItsNegative();
                System.out.println(sol.findMaxK(new int[]{-1,2,-3,3})); // 3
                System.out.println(sol.findMaxK(new int[]{-1,10,6,7,-7,1})); // 7
                System.out.println(sol.findMaxK(new int[]{-10,8,6,7,-2,-3})); // -1
    }
}
