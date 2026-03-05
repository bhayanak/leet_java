package org.leetcode.easy;


/**
 * <b>#3083 - Existence of a Substring in a String and Its Reverse</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, find any substring of length 2 which is also present in the reverse of s.
 *
 *
 * Return true if such a substring exists, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 *
 *
 * Output: true
 *
 *
 * Explanation: Substring "ee" is of length 2 which is also present in reverse(s) == "edocteel".
 *
 * Example 2:
 *
 * Input: s = "abcba"
 *
 *
 * Output: true
 *
 *
 * Explanation: All of the substrings of length 2 "ab", "bc", "cb", "ba" are also present in reverse(s) == "abcba".
 *
 * Example 3:
 *
 * Input: s = "abcd"
 *
 *
 * Output: false
 *
 *
 * Explanation: There is no substring of length 2 in s, which is also present in the reverse of s.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Make a new string by reversing the string <code>s</code>.
 * Hint 2: For every substring of length <code>2</code> in <code>s</code>, check if there is a corresponding substring in the reverse of <code>s</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/existence-of-a-substring-in-a-string-and-its-reverse/">LeetCode #3083</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class ExistenceOfASubstringInAStringAndItsReverse {

    /**
     * Solves the problem: Exists in adjacent substring.
     * Sorts the input first to enable efficient processing.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public boolean existsInAdjacentSubstring(String s, int k) {
        for (int i=0;i+k<s.length();i++) {
            String sub1=s.substring(i,i+k), sub2=s.substring(i+1,i+k+1);
            char[] a=sub1.toCharArray(), b=sub2.toCharArray();
            java.util.Arrays.sort(a); java.util.Arrays.sort(b);
            if (new String(a).equals(new String(b))) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ExistenceOfASubstringInAStringAndItsReverse sol = new ExistenceOfASubstringInAStringAndItsReverse();
        System.out.println(sol.existsInAdjacentSubstring("test", 0));
    }
}
