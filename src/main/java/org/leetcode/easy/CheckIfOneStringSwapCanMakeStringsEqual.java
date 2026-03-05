package org.leetcode.easy;

import java.util.List;
import java.util.ArrayList;


/**
 * <b>#1790 - Check if One String Swap Can Make Strings Equal</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.
 *
 *
 * Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "bank", s2 = "kanb"
 * Output: true
 * Explanation: For example, swap the first character with the last character of s2 to make "bank".
 *
 * Example 2:
 *
 * Input: s1 = "attack", s2 = "defend"
 * Output: false
 * Explanation: It is impossible to make them equal with one string swap.
 *
 * Example 3:
 *
 * Input: s1 = "kelb", s2 = "kelb"
 * Output: true
 * Explanation: The two strings are already equal, so no string swap operation is required.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s1.length, s2.length &lt;= 100
 *
 * s1.length == s2.length
 *
 * s1 and s2 consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The answer is false if the number of nonequal positions in the strings is not equal to 0 or 2.
 * Hint 2: Check that these positions have the same set of characters.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/">LeetCode #1790</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class CheckIfOneStringSwapCanMakeStringsEqual {

    /**
     * Solves the problem: Are almost equal.
     *
     * @param s1 the s1 (String)
     * @param s2 the s2 (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean areAlmostEqual(String s1, String s2) {
        java.util.List<Integer> diff = new java.util.ArrayList<>();
        for (int i=0;i<s1.length();i++) if (s1.charAt(i)!=s2.charAt(i)) diff.add(i);
        if (diff.isEmpty()) return true;
        if (diff.size()==2) {
            int i=diff.get(0), j=diff.get(1);
            return s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i);
        }
        return false;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfOneStringSwapCanMakeStringsEqual sol = new CheckIfOneStringSwapCanMakeStringsEqual();
                System.out.println(sol.areAlmostEqual("bank","kanb")); // true
                System.out.println(sol.areAlmostEqual("attack","defend")); // false
                System.out.println(sol.areAlmostEqual("kelb","kelb")); // true
    }
}
