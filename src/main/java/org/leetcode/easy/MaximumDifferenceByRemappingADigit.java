package org.leetcode.easy;


/**
 * <b>#2566 - Maximum Difference by Remapping a Digit</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer num. You know that Bob will sneakily remap one of the 10 possible digits (0 to 9) to another digit.
 *
 *
 * Return the difference between the maximum and minimum values Bob can make by remapping exactly one digit in num.
 *
 *
 * Notes:
 *
 *
 * When Bob remaps a digit d1 to another digit d2, Bob replaces all occurrences of d1 in num with d2.
 *
 * Bob can remap a digit to itself, in which case num does not change.
 *
 * Bob can remap different digits for obtaining minimum and maximum values respectively.
 *
 * The resulting number after remapping can contain leading zeroes.
 *
 *
 *
 * Example 1:
 *
 * Input: num = 11891
 * Output: 99009
 * Explanation: 
 * To achieve the maximum value, Bob can remap the digit 1 to the digit 9 to yield 99899.
 * To achieve the minimum value, Bob can remap the digit 1 to the digit 0, yielding 890.
 * The difference between these two numbers is 99009.
 *
 * Example 2:
 *
 * Input: num = 90
 * Output: 99
 * Explanation:
 * The maximum value that can be returned by the function is 99 (if 0 is replaced by 9) and the minimum value that can be returned by the function is 0 (if 9 is replaced by 0).
 * Thus, we return 99.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to remap the first non-nine digit to 9 to obtain the maximum number.
 * Hint 2: Try to remap the first non-zero digit to 0 to obtain the minimum number.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/">LeetCode #2566</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumDifferenceByRemappingADigit {

    /**
     * Computes the minimum Min max difference.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int minMaxDifference(int num) {
        String s=String.valueOf(num);
        char maxReplace=0;
        for (char c:s.toCharArray()) if (c!='9') { maxReplace=c; break; }
        String maxS= (maxReplace==0)?s:s.replace(maxReplace,'9');
        char minReplace=s.charAt(0);
        String minS=s.replace(minReplace,'0');
        return Integer.parseInt(maxS)-Integer.parseInt(minS);
    }

    public static void main(String[] args) {
        MaximumDifferenceByRemappingADigit sol = new MaximumDifferenceByRemappingADigit();
                System.out.println(sol.minMaxDifference(11891)); // 99009
                System.out.println(sol.minMaxDifference(90));    // 99
    }
}
