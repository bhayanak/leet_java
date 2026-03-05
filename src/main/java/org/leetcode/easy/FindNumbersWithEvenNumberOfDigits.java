package org.leetcode.easy;


/**
 * <b>#1295 - Find Numbers with Even Number of Digits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation: 
 * 12 contains 2 digits (even number of digits). 
 * 345 contains 3 digits (odd number of digits). 
 * 2 contains 1 digit (odd number of digits). 
 * 6 contains 1 digit (odd number of digits). 
 * 7896 contains 4 digits (even number of digits). 
 * Therefore only 12 and 7896 contain an even number of digits.
 *
 * Example 2:
 *
 * Input: nums = [555,901,482,1771]
 * Output: 1 
 * Explanation: 
 * Only 1771 contains an even number of digits.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 500
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to compute the number of digits of a number ?
 * Hint 2: Divide the number by 10 again and again to get the number of digits.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-numbers-with-even-number-of-digits/">LeetCode #1295</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindNumbersWithEvenNumberOfDigits {

    /**
     * Finds Find numbers.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findNumbers(int[] nums) {
        int count=0;
        for (int n : nums) if (String.valueOf(n).length()%2==0) count++;
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        FindNumbersWithEvenNumberOfDigits sol = new FindNumbersWithEvenNumberOfDigits();
                System.out.println(sol.findNumbers(new int[]{12,345,2,6,7896})); // 2
                System.out.println(sol.findNumbers(new int[]{555,901,482,1771})); // 1
    }
}
