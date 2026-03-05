package org.leetcode.easy;


/**
 * <b>#859 - Buddy Strings</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
 *
 *
 * Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
 *
 *
 * For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab", goal = "ba"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
 *
 * Example 2:
 *
 * Input: s = "ab", goal = "ab"
 * Output: false
 * Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
 *
 * Example 3:
 *
 * Input: s = "aa", goal = "aa"
 * Output: true
 * Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, goal.length &lt;= 2 * 104
 *
 * s and goal consist of lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/buddy-strings/">LeetCode #859</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class BuddyStrings {

    /**
     * Solves the problem: Buddy strings.
     *
     * @param s the s (String)
     * @param goal the goal (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            // can swap identical chars
            java.util.Set<Character> seen = new java.util.HashSet<>();
            for (char c : s.toCharArray()) if (!seen.add(c)) return true;
            return false;
        }
        java.util.List<Integer> diffs = new java.util.ArrayList<>();
        for (int i = 0; i < s.length(); i++) if (s.charAt(i) != goal.charAt(i)) diffs.add(i);
        return diffs.size() == 2
            && s.charAt(diffs.get(0)) == goal.charAt(diffs.get(1))
            && s.charAt(diffs.get(1)) == goal.charAt(diffs.get(0));
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BuddyStrings.java &amp;&amp; java org.leetcode.easy.BuddyStrings</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        BuddyStrings sol = new BuddyStrings();
                System.out.println(sol.buddyStrings("ab","ba")); // true
                System.out.println(sol.buddyStrings("ab","ab")); // false
                System.out.println(sol.buddyStrings("aa","aa")); // true
                System.out.println(sol.buddyStrings("aaaaaaabc","aaaaaaacb")); // true
    }
}
