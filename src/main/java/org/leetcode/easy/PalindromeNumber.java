package org.leetcode.easy;

/**
 * <b>#9 - Palindrome Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 * 
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 * 
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -231 &lt;= x &lt;= 231 - 1
 * 
 *  
 * Follow up: Could you solve it without converting the integer to a string?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Beware of overflow when you reverse the integer.
 *
 * <h2>Approach</h2>
 * Negative numbers and numbers ending in 0 (except 0 itself) are not palindromes.
 * Reverse only the second half of the number, then compare with the first half.
 * This avoids converting to a string and handles overflow naturally.
 *
 * <h2>Complexity</h2>
* Time: O(log x)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/palindrome-number/">LeetCode #9</a>
  *
  * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
  */
public class PalindromeNumber {

    /**
     * Determines whether an integer reads the same forwards and backwards.
     *
     * @param x integer to test
     * @return  true if x is a palindrome, false otherwise
      *
      * <p><b>Explanation:</b> Applies binary search to halve the search space each step, achieving O(log n) time.</p>
      */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversed = 0;
        // Reverse only half to avoid overflow
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        // Even digits: x == reversed; Odd digits: x == reversed/10 (middle digit ignored)
        return x == reversed || x == reversed / 10;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
                PalindromeNumber sol = new PalindromeNumber();
                System.out.println(sol.isPalindrome(121));   // true
                System.out.println(sol.isPalindrome(-121));  // false
                System.out.println(sol.isPalindrome(10));    // false
    }
}
