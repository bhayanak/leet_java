package org.leetcode.easy;


/**
 * <b>#1903 - Largest Odd Number in String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num, representing a large integer. Return the largest-valued odd integer (as a string) that is a non-empty substring of num, or an empty string "" if no odd integer exists.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "52"
 * Output: "5"
 * Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
 *
 * Example 2:
 *
 * Input: num = "4206"
 * Output: ""
 * Explanation: There are no odd numbers in "4206".
 *
 * Example 3:
 *
 * Input: num = "35427"
 * Output: "35427"
 * Explanation: "35427" is already an odd number.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 105
 *
 * num only consists of digits and does not contain any leading zeros.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In what order should you iterate through the digits?
 * Hint 2: If an odd number exists, where must the number start from?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-odd-number-in-string/">LeetCode #1903</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class LargestOddNumberInString {

    /**
     * Solves the problem: Largest odd number.
     *
     * @param num the num (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public String largestOddNumber(String num) {
        for (int i=num.length()-1;i>=0;i--)
            if ((num.charAt(i)-'0')%2==1) return num.substring(0,i+1);
        return "";
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        LargestOddNumberInString sol = new LargestOddNumberInString();
                System.out.println(sol.largestOddNumber("52"));    // "5"
                System.out.println(sol.largestOddNumber("4206"));  // ""
                System.out.println(sol.largestOddNumber("35427")); // "35427"
    }
}
