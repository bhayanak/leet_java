package org.leetcode.medium;


/**
 * <b>#1616 - Split Two Strings to Make Palindrome</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings a and b of the same length. Choose an index and split both strings at the same index, splitting a into two strings: aprefix and asuffix where a = aprefix + asuffix, and splitting b into two strings: bprefix and bsuffix where b = bprefix + bsuffix. Check if aprefix + bsuffix or bprefix + asuffix forms a palindrome.
 *
 *
 * When you split a string s into sprefix and ssuffix, either ssuffix or sprefix is allowed to be empty. For example, if s = "abc", then "" + "abc", "a" + "bc", "ab" + "c" , and "abc" + "" are valid splits.
 *
 *
 * Return true if it is possible to form a palindrome string, otherwise return false.
 *
 *
 * Notice that x + y denotes the concatenation of strings x and y.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = "x", b = "y"
 * Output: true
 * Explaination: If either a or b are palindromes the answer is true since you can split in the following way:
 * aprefix = "", asuffix = "x"
 * bprefix = "", bsuffix = "y"
 * Then, aprefix + bsuffix = "" + "y" = "y", which is a palindrome.
 *
 * Example 2:
 *
 * Input: a = "xbdef", b = "xecab"
 * Output: false
 *
 * Example 3:
 *
 * Input: a = "ulacfd", b = "jizalu"
 * Output: true
 * Explaination: Split them at index 3:
 * aprefix = "ula", asuffix = "cfd"
 * bprefix = "jiz", bsuffix = "alu"
 * Then, aprefix + bsuffix = "ula" + "alu" = "ulaalu", which is a palindrome.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= a.length, b.length &lt;= 105
 *
 * a.length == b.length
 *
 * a and b consist of lowercase English letters
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try finding the largest prefix from a that matches a suffix in b
 * Hint 2: Try string matching
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/split-two-strings-to-make-palindrome/">LeetCode #1616</a>
 */
public class SplitTwoStringsToMakePalindrome {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split Two Strings to Make Palindrome");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SplitTwoStringsToMakePalindrome ===");
        SplitTwoStringsToMakePalindrome sol = new SplitTwoStringsToMakePalindrome();
        System.out.println(sol.solve(null));
    }
}
