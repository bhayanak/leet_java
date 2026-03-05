package org.leetcode.easy;


/**
 * <b>#821 - Shortest Distance to a Character</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
 *
 *
 * The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "loveleetcode", c = "e"
 * Output: [3,2,1,0,1,0,0,1,2,2,1,0]
 * Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
 * The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
 * The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
 * For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
 * The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
 *
 * Example 2:
 *
 * Input: s = "aaab", c = "b"
 * Output: [3,2,1,0]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 104
 *
 * s[i] and c are lowercase English letters.
 *
 * It is guaranteed that c occurs at least once in s.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-distance-to-a-character/">LeetCode #821</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class ShortestDistanceToACharacter {

    /**
     * Finds the shortest Shortest to char.
     *
     * @param s the s (String)
     * @param c the c (char)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];
        java.util.Arrays.fill(ans, n);
        // left pass
        int prev = -n;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = i - prev;
        }
        // right pass
        prev = 2*n;
        for (int i = n-1; i >= 0; i--) {
            if (s.charAt(i) == c) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestDistanceToACharacter.java &amp;&amp; java org.leetcode.easy.ShortestDistanceToACharacter</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ShortestDistanceToACharacter sol = new ShortestDistanceToACharacter();
                System.out.println(java.util.Arrays.toString(sol.shortestToChar("loveleetcode",'e')));
                // [3,2,1,0,1,0,0,1,2,2,1,0]
    }
}
