package org.leetcode.easy;


/**
 * <b>#2614 - Prime In Diagonal</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Matrix, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed two-dimensional integer array nums.
 *
 *
 * Return the largest prime number that lies on at least one of the diagonals of nums. In case, no prime is present on any of the diagonals, return 0.
 *
 *
 * Note that:
 *
 *
 * An integer is prime if it is greater than 1 and has no positive integer divisors other than 1 and itself.
 *
 * An integer val is on one of the diagonals of nums if there exists an integer i for which nums[i][i] = val or an i for which nums[i][nums.length - i - 1] = val.
 *
 * In the above diagram, one diagonal is [1,5,9] and another diagonal is [3,5,7].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [[1,2,3],[5,6,7],[9,10,11]]
 * Output: 11
 * Explanation: The numbers 1, 3, 6, 9, and 11 are the only numbers present on at least one of the diagonals. Since 11 is the largest prime, we return 11.
 *
 * Example 2:
 *
 * Input: nums = [[1,2,3],[5,17,7],[9,11,10]]
 * Output: 17
 * Explanation: The numbers 1, 3, 9, 10, and 17 are all present on at least one of the diagonals. 17 is the largest prime, so we return 17.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 300
 *
 * nums.length == numsi.length
 *
 * 1 &lt;= nums[i][j] &lt;= 4*106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate over the diagonals of the matrix and check for each element.
 * Hint 2: Check if the element is prime or not in O(sqrt(n)) time.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Matrix, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/prime-in-diagonal/">LeetCode #2614</a>
  *
  * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
  */
public class PrimeInDiagonal {

    /**
     * Solves the problem: Prime palindromes count.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
      */
    public int primePalindromesCount(int n) {
        int cnt=0;
        for (int i=2;i<=n;i++) if (isPrime(i) && isPalindrome(i)) cnt++;
        return cnt;
    }
    private boolean isPrime(int n){if(n<2)return false;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
    private boolean isPalindrome(int n){String s=String.valueOf(n);int l=0,r=s.length()-1;while(l<r)if(s.charAt(l++)!=s.charAt(r--))return false;return true;}

    public static void main(String[] args) {
        PrimeInDiagonal sol = new PrimeInDiagonal();
        System.out.println(sol.primePalindromesCount(0));
    }
}
