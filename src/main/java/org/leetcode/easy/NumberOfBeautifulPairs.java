package org.leetcode.easy;


/**
 * <b>#2748 - Number of Beautiful Pairs</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. A pair of indices i, j where 0 &lt;= i &lt; j &lt; nums.length is called beautiful if the first digit of nums[i] and the last digit of nums[j] are coprime.
 *
 *
 * Return the total number of beautiful pairs in nums.
 *
 *
 * Two integers x and y are coprime if there is no integer greater than 1 that divides both of them. In other words, x and y are coprime if gcd(x, y) == 1, where gcd(x, y) is the greatest common divisor of x and y.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,5,1,4]
 * Output: 5
 * Explanation: There are 5 beautiful pairs in nums:
 * When i = 0 and j = 1: the first digit of nums[0] is 2, and the last digit of nums[1] is 5. We can confirm that 2 and 5 are coprime, since gcd(2,5) == 1.
 * When i = 0 and j = 2: the first digit of nums[0] is 2, and the last digit of nums[2] is 1. Indeed, gcd(2,1) == 1.
 * When i = 1 and j = 2: the first digit of nums[1] is 5, and the last digit of nums[2] is 1. Indeed, gcd(5,1) == 1.
 * When i = 1 and j = 3: the first digit of nums[1] is 5, and the last digit of nums[3] is 4. Indeed, gcd(5,4) == 1.
 * When i = 2 and j = 3: the first digit of nums[2] is 1, and the last digit of nums[3] is 4. Indeed, gcd(1,4) == 1.
 * Thus, we return 5.
 *
 * Example 2:
 *
 * Input: nums = [11,21,12]
 * Output: 2
 * Explanation: There are 2 beautiful pairs:
 * When i = 0 and j = 1: the first digit of nums[0] is 1, and the last digit of nums[1] is 1. Indeed, gcd(1,1) == 1.
 * When i = 0 and j = 2: the first digit of nums[0] is 1, and the last digit of nums[2] is 2. Indeed, gcd(1,2) == 1.
 * Thus, we return 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 9999
 *
 * nums[i] % 10 != 0
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since nums.length is small, you can find all pairs of indices and check if each pair is beautiful.
 * Hint 2: Use integer to string conversion to get the first and last digit of each number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/number-of-beautiful-pairs/">LeetCode #2748</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class NumberOfBeautifulPairs {

    /**
     * Counts Count beautiful pairs.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countBeautifulPairs(int[] nums) {
        int cnt=0;
        for (int i=0;i<nums.length-1;i++) for (int j=i+1;j<nums.length;j++) {
            int first=String.valueOf(nums[i]).charAt(0)-'0';
            int last=nums[j]%10;
            if (gcd(first,last)==1) cnt++;
        }
        return cnt;
    }
    private int gcd(int a,int b){return b==0?a:gcd(b,a%b);}

    public static void main(String[] args) {
        NumberOfBeautifulPairs sol = new NumberOfBeautifulPairs();
        System.out.println(sol.countBeautifulPairs(new int[]{1,2,3}));
    }
}
