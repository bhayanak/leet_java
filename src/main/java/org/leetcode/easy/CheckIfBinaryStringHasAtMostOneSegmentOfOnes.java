package org.leetcode.easy;


/**
 * <b>#1784 - Check if Binary String Has at Most One Segment of Ones</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1001"
 * Output: false
 * Explanation: The ones do not form a contiguous segment.
 *
 * Example 2:
 *
 * Input: s = "110"
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s[i]​​​​ is either '0' or '1'.
 *
 * s[0] is '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It's guaranteed to have at least one segment
 * Hint 2: The string size is small so you can count all segments of ones with no that have no adjacent ones.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/">LeetCode #1784</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes {

    /**
     * Checks Check ones segment.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes sol = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes();
                System.out.println(sol.checkOnesSegment("1001")); // false
                System.out.println(sol.checkOnesSegment("110")); // true
    }
}
