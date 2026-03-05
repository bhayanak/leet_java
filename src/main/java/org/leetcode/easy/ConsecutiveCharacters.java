package org.leetcode.easy;


/**
 * <b>#1446 - Consecutive Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The power of the string is the maximum length of a non-empty substring that contains only one unique character.
 *
 *
 * Given a string s, return the power of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 2
 * Explanation: The substring "ee" is of length 2 with the character 'e' only.
 *
 * Example 2:
 *
 * Input: s = "abbcccddddeeeeedcba"
 * Output: 5
 * Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep an array power where power[i] is the maximum power of the i-th character.
 * Hint 2: The answer is max(power[i]).
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/consecutive-characters/">LeetCode #1446</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class ConsecutiveCharacters {

    /**
     * Computes the maximum Max power.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxPower(String s) {
        int max=1, cnt=1;
        for (int i=1;i<s.length();i++) {
            cnt = s.charAt(i)==s.charAt(i-1) ? cnt+1 : 1;
            max = Math.max(max,cnt);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ConsecutiveCharacters sol = new ConsecutiveCharacters();
                System.out.println(sol.maxPower("leetcode")); // 2
                System.out.println(sol.maxPower("abbcccddddeeeeedcba")); // 5
                System.out.println(sol.maxPower("triplepillooooow")); // 5
    }
}
