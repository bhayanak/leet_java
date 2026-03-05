package org.leetcode.easy;


/**
 * <b>#1869 - Longer Contiguous Segments of Ones than Zeros</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary string s, return true if the longest contiguous segment of 1's is strictly longer than the longest contiguous segment of 0's in s, or return false otherwise.
 *
 *
 * For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment of 0s has length 3.
 *
 * Note that if there are no 0's, then the longest continuous segment of 0's is considered to have a length 0. The same applies if there is no 1's.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1101"
 * Output: true
 * Explanation:
 * The longest contiguous segment of 1s has length 2: "1101"
 * The longest contiguous segment of 0s has length 1: "1101"
 * The segment of 1s is longer, so return true.
 *
 * Example 2:
 *
 * Input: s = "111000"
 * Output: false
 * Explanation:
 * The longest contiguous segment of 1s has length 3: "111000"
 * The longest contiguous segment of 0s has length 3: "111000"
 * The segment of 1s is not longer, so return false.
 *
 * Example 3:
 *
 * Input: s = "110100010"
 * Output: false
 * Explanation:
 * The longest contiguous segment of 1s has length 2: "110100010"
 * The longest contiguous segment of 0s has length 3: "110100010"
 * The segment of 1s is not longer, so return false.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s[i] is either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check every possible segment of 0s and 1s.
 * Hint 2: Is there a way to iterate through the string to keep track of the current character and its count?
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/">LeetCode #1869</a>
 */
public class LongerContiguousSegmentsOfOnesThanZeros {

    private int longest(String s, char c) {
        int max=0, cur=0;
        for (char ch:s.toCharArray()) { cur=ch==c?cur+1:0; max=Math.max(max,cur); }
        return max;
    }
    /**
     * Checks Check zero ones.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkZeroOnes(String s) {
        return longest(s,'1')>longest(s,'0');
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        LongerContiguousSegmentsOfOnesThanZeros sol = new LongerContiguousSegmentsOfOnesThanZeros();
                System.out.println(sol.checkZeroOnes("1101")); // true
                System.out.println(sol.checkZeroOnes("111000")); // false
                System.out.println(sol.checkZeroOnes("110100010")); // false
    }
}
