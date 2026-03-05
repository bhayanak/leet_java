package org.leetcode.easy;


/**
 * <b>#2609 - Find the Longest Balanced Substring of a Binary String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s consisting only of zeroes and ones.
 *
 *
 * A substring of s is considered balanced if all zeroes are before ones and the number of zeroes is equal to the number of ones inside the substring. Notice that the empty substring is considered a balanced substring.
 *
 *
 * Return the length of the longest balanced substring of s.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "01000111"
 * Output: 6
 * Explanation: The longest balanced substring is "000111", which has length 6.
 *
 * Example 2:
 *
 * Input: s = "00111"
 * Output: 4
 * Explanation: The longest balanced substring is "0011", which has length 4. 
 *
 * Example 3:
 *
 * Input: s = "111"
 * Output: 0
 * Explanation: There is no balanced substring except the empty substring, so the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 50
 *
 * '0' &lt;= s[i] &lt;= '1'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider iterating over each subarray and checking if it’s balanced or not.
 * Hint 2: Among all balanced subarrays, the answer is the longest one of them.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/find-the-longest-balanced-substring-of-a-binary-string/">LeetCode #2609</a>
  *
  * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
  */
public class FindTheLongestBalancedSubstringOfABinaryString {

    /**
     * Finds Find the longest balanced substring.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public int findTheLongestBalancedSubstring(String s) {
        int max=0;
        for (int i=0;i<s.length();i++) for (int j=i+2;j<=s.length();j+=2) {
            String sub=s.substring(i,j);
            int half=sub.length()/2;
            if (sub.chars().filter(c->c=='0').count()==half && sub.chars().filter(c->c=='1').count()==half
                && sub.indexOf('1')>=half) max=Math.max(max,sub.length());
        }
        return max;
    }

    public static void main(String[] args) {
        FindTheLongestBalancedSubstringOfABinaryString sol = new FindTheLongestBalancedSubstringOfABinaryString();
                System.out.println(sol.findTheLongestBalancedSubstring("01000111")); // 6
                System.out.println(sol.findTheLongestBalancedSubstring("00111"));    // 4
                System.out.println(sol.findTheLongestBalancedSubstring("111"));      // 0
    }
}
