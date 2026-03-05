package org.leetcode.easy;


/**
 * <b>#917 - Reverse Only Letters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, reverse the string according to the following rules:
 *
 *
 * All the characters that are not English letters remain in the same position.
 *
 * All the English letters (lowercase or uppercase) should be reversed.
 *
 * Return s after reversing it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab-cd"
 * Output: "dc-ba"
 *
 *
 * Example 2:
 *
 * Input: s = "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 *
 *
 * Example 3:
 *
 * Input: s = "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists of characters with ASCII values in the range [33, 122].
 *
 * s does not contain '\"' or '\\'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: This problem is exactly like reversing a normal string except that there are certain characters that we have to simply skip. That should be easy enough to do if you know how to reverse a string using the two-pointer approach.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reverse-only-letters/">LeetCode #917</a>
  *
  * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
  */
public class ReverseOnlyLetters {

    /**
     * Solves the problem: Reverse only letters.
     * Uses a two-pointer approach for in-place linear scan.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Iterates from both ends, swapping characters/elements inward to reverse in-place in O(n).</p>
      */
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            while (l < r && !Character.isLetter(arr[l])) l++;
            while (l < r && !Character.isLetter(arr[r])) r--;
            if (l < r) { char t = arr[l]; arr[l++] = arr[r]; arr[r--] = t; }
        }
        return new String(arr);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ReverseOnlyLetters.java &amp;&amp; java org.leetcode.easy.ReverseOnlyLetters</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ReverseOnlyLetters sol = new ReverseOnlyLetters();
                System.out.println(sol.reverseOnlyLetters("ab-cd")); // "dc-ba"
                System.out.println(sol.reverseOnlyLetters("a-bC-dEf-ghIj")); // "j-Ih-gfE-dCba"
                System.out.println(sol.reverseOnlyLetters("Test1ng-Leet=code-Q!")); // "Qedo1ct-eeLg=ntse-T!"
    }
}
