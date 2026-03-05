package org.leetcode.easy;

/**
 * <b>#1763 - LongestNiceSubstring</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Divide and Conquer, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>A string s is nice if every letter in s appears both in uppercase and lowercase. Return the longest nice substring.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/longestnicesubstring-/">LeetCode #1763</a>
 */
public class LongestNiceSubstring {
    /**
     * Finds the longest "nice" substring where each letter appears in both cases.
     *
     * @param s input string
     * @return the longest nice substring, or empty string if none exists
     *
     * <p><b>Explanation:</b> Divide and conquer: any character that appears in only one case</p>
     *   cannot be in a valid nice substring. Split at such characters and recurse on each part.
     *   Time O(n^2) worst case, Space O(n).
     */
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!s.contains(String.valueOf(Character.toLowerCase(c))) ||
                !s.contains(String.valueOf(Character.toUpperCase(c)))) {
                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }
        return s;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== LongestNiceSubstring ===");
        LongestNiceSubstring sol = new LongestNiceSubstring();
        System.out.println(sol.longestNiceSubstring("hello"));
    }
}
