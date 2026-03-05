package org.leetcode.easy;


/**
 * <b>#3216 - Lexicographically Smallest String After a Swap</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s containing only digits, return the lexicographically smallest string that can be obtained after swapping adjacent digits in s with the same parity at most once.
 *
 *
 * Digits have the same parity if both are odd or both are even. For example, 5 and 9, as well as 2 and 4, have the same parity, while 6 and 9 do not.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "45320"
 *
 *
 * Output: "43520"
 *
 *
 * Explanation: 
 *
 *
 * s[1] == '5' and s[2] == '3' both have the same parity, and swapping them results in the lexicographically smallest string.
 *
 * Example 2:
 *
 * Input: s = "001"
 *
 *
 * Output: "001"
 *
 *
 * Explanation:
 *
 *
 * There is no need to perform a swap because s is already the lexicographically smallest.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 100
 *
 * s consists only of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try all possible swaps satisfying the constraints and find the one that results in the lexicographically smallest string.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/">LeetCode #3216</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class LexicographicallySmallestStringAfterASwap {

    /**
     * Returns true if Is possible to split2.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isPossibleToSplit2(String s) {
        int[] cnt=new int[26];
        for (char c:s.toCharArray()) if (++cnt[c-'a']>2) return false;
        return true;
    }

    public static void main(String[] args) {
        LexicographicallySmallestStringAfterASwap sol = new LexicographicallySmallestStringAfterASwap();
        System.out.println(sol.isPossibleToSplit2("hello"));
    }
}
