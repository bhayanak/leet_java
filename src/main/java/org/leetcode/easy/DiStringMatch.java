package org.leetcode.easy;


/**
 * <b>#942 - DI String Match</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:
 *
 *
 * s[i] == 'I' if perm[i] &lt; perm[i + 1], and
 *
 * s[i] == 'D' if perm[i] &gt; perm[i + 1].
 *
 * Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "IDID"
 * Output: [0,4,1,3,2]
 *
 *
 * Example 2:
 *
 * Input: s = "III"
 * Output: [0,1,2,3]
 *
 *
 * Example 3:
 *
 * Input: s = "DDI"
 * Output: [3,2,0,1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is either 'I' or 'D'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/di-string-match/">LeetCode #942</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class DiStringMatch {

    /**
     * Solves the problem: Di string match.
     *
     * @param s the s (String)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int[] diStringMatch(String s) {
        int lo = 0, hi = s.length(), n = s.length();
        int[] perm = new int[n+1];
        for (int i = 0; i < n; i++)
            perm[i] = s.charAt(i) == 'I' ? lo++ : hi--;
        perm[n] = lo;
        return perm;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DiStringMatch.java &amp;&amp; java org.leetcode.easy.DiStringMatch</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DiStringMatch sol = new DiStringMatch();
                System.out.println(java.util.Arrays.toString(sol.diStringMatch("IDID")));
                // [0,4,1,3,2]
                System.out.println(java.util.Arrays.toString(sol.diStringMatch("III")));
                // [0,1,2,3]
                System.out.println(java.util.Arrays.toString(sol.diStringMatch("DDI")));
                // [3,2,0,1]
    }
}
