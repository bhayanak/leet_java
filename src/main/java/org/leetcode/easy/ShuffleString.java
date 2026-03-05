package org.leetcode.easy;


/**
 * <b>#1528 - Shuffle String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 *
 *
 * Return the shuffled string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 *
 * Example 2:
 *
 * Input: s = "abc", indices = [0,1,2]
 * Output: "abc"
 * Explanation: After shuffling, each character remains in its position.
 *
 *
 *
 * Constraints:
 *
 *
 * s.length == indices.length == n
 *
 * 1 &lt;= n &lt;= 100
 *
 * s consists of only lowercase English letters.
 *
 * 0 &lt;= indices[i] &lt; n
 *
 * All values of indices are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can create an auxiliary string t of length n.
 * Hint 2: Assign t[indexes[i]] to s[i] for each i from 0 to n-1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shuffle-string/">LeetCode #1528</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class ShuffleString {

    /**
     * Solves the problem: Restore string.
     *
     * @param s the s (String)
     * @param indices the indices (int[])
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for (int i=0;i<s.length();i++) res[indices[i]]=s.charAt(i);
        return new String(res);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ShuffleString sol = new ShuffleString();
                System.out.println(sol.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3})); // "leetcode"
                System.out.println(sol.restoreString("abc", new int[]{0,1,2}));                 // "abc"
    }
}
