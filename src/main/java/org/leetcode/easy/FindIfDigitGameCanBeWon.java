package org.leetcode.easy;


/**
 * <b>#3232 - Find if Digit Game Can Be Won</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums.
 *
 *
 * Alice and Bob are playing a game. In the game, Alice can choose either all single-digit numbers or all double-digit numbers from nums, and the rest of the numbers are given to Bob. Alice wins if the sum of her numbers is strictly greater than the sum of Bob's numbers.
 *
 *
 * Return true if Alice can win this game, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,10]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * Alice cannot win by choosing either single-digit or double-digit numbers.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5,14]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Alice can win by choosing single-digit numbers which have a sum equal to 15.
 *
 * Example 3:
 *
 * Input: nums = [5,5,5,25]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Alice can win by choosing double-digit numbers which have a sum equal to 25.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 99
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Alice wins if the sum of all single-digit numbers and the sum of all double-digit numbers are different.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 *
 * @see <a href="https://leetcode.com/problems/find-if-digit-game-can-be-won/">LeetCode #3232</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class FindIfDigitGameCanBeWon {

    /**
     * Returns true if the input can Can alice win.
     *
     * @param n the n (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public boolean canAliceWin(int n) {
        int a=0, b=0;
        for (int d=9;d>=0&&n>0;d--) { if (a<=b) a+=d; else b+=d; n--; }
        return a!=b;
    }

    public static void main(String[] args) {
        FindIfDigitGameCanBeWon sol = new FindIfDigitGameCanBeWon();
                System.out.println(sol.canAliceWin(1));  // false
                System.out.println(sol.canAliceWin(7));  // false
                System.out.println(sol.canAliceWin(99)); // true
    }
}
