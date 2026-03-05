package org.leetcode.easy;


/**
 * <b>#2269 - Find the K-Beauty of a Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The k-beauty of an integer num is defined as the number of substrings of num when it is read as a string that meet the following conditions:
 *
 *
 * It has a length of k.
 *
 * It is a divisor of num.
 *
 * Given integers num and k, return the k-beauty of num.
 *
 *
 * Note:
 *
 *
 * Leading zeros are allowed.
 *
 * 0 is not a divisor of any value.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 240, k = 2
 * Output: 2
 * Explanation: The following are the substrings of num of length k:
 * - "24" from "240": 24 is a divisor of 240.
 * - "40" from "240": 40 is a divisor of 240.
 * Therefore, the k-beauty is 2.
 *
 * Example 2:
 *
 * Input: num = 430043, k = 2
 * Output: 2
 * Explanation: The following are the substrings of num of length k:
 * - "43" from "430043": 43 is a divisor of 430043.
 * - "30" from "430043": 30 is not a divisor of 430043.
 * - "00" from "430043": 0 is not a divisor of 430043.
 * - "04" from "430043": 4 is not a divisor of 430043.
 * - "43" from "430043": 43 is a divisor of 430043.
 * Therefore, the k-beauty is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 109
 *
 * 1 &lt;= k &lt;= num.length (taking num as a string)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We should check all the substrings of num with a length of k and see if it is a divisor of num.
 * Hint 2: We can more easily obtain the substrings by converting num into a string and converting back to an integer to check for divisibility.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/find-the-k-beauty-of-a-number/">LeetCode #2269</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class FindTheKBeautyOfANumber {

    /**
     * Solves the problem: Divisor substrings.
     *
     * @param num the num (int)
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num); int count=0;
        for (int i=0;i+k<=s.length();i++) {
            int v=Integer.parseInt(s.substring(i,i+k));
            if (v!=0 && num%v==0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        FindTheKBeautyOfANumber sol = new FindTheKBeautyOfANumber();
        System.out.println(sol.divisorSubstrings(240, 2));    // 2
        System.out.println(sol.divisorSubstrings(430043, 2)); // 2
    }
}
