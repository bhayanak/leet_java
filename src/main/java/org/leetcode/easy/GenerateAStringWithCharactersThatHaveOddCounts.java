package org.leetcode.easy;


/**
 * <b>#1374 - Generate a String With Characters That Have Odd Counts</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.
 *
 *
 * The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: "pppz"
 * Explanation: "pppz" is a valid string since the character 'p' occurs three times and the character 'z' occurs once. Note that there are many other valid strings such as "ohhh" and "love".
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: "xy"
 * Explanation: "xy" is a valid string since the characters 'x' and 'y' occur once. Note that there are many other valid strings such as "ag" and "ur".
 *
 * Example 3:
 *
 * Input: n = 7
 * Output: "holasss"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If n is odd, return a string of size n formed only by 'a', else return string formed with n-1 'a' and 1 'b''.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/">LeetCode #1374</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class GenerateAStringWithCharactersThatHaveOddCounts {

    /**
     * Solves the problem: Generate the string.
     *
     * @param n the n (int)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String generateTheString(int n) {
        if (n%2==1) return "a".repeat(n);
        return "a".repeat(n-1) + "b";
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        GenerateAStringWithCharactersThatHaveOddCounts sol = new GenerateAStringWithCharactersThatHaveOddCounts();
                System.out.println(sol.generateTheString(4)); // e.g. "aaab"
                System.out.println(sol.generateTheString(7)); // e.g. "aaaaaaa"
                System.out.println(sol.generateTheString(2)); // e.g. "ab"
    }
}
