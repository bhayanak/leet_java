package org.leetcode.easy;


/**
 * <b>#1592 - Rearrange Spaces Between Words</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string text of words that are placed among some number of spaces. Each word consists of one or more lowercase English letters and are separated by at least one space. It's guaranteed that text contains at least one word.
 *
 *
 * Rearrange the spaces so that there is an equal number of spaces between every pair of adjacent words and that number is maximized. If you cannot redistribute all the spaces equally, place the extra spaces at the end, meaning the returned string should be the same length as text.
 *
 *
 * Return the string after rearranging the spaces.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "  this   is  a sentence "
 * Output: "this   is   a   sentence"
 * Explanation: There are a total of 9 spaces and 4 words. We can evenly divide the 9 spaces between the words: 9 / (4-1) = 3 spaces.
 *
 * Example 2:
 *
 * Input: text = " practice   makes   perfect"
 * Output: "practice   makes   perfect "
 * Explanation: There are a total of 7 spaces and 3 words. 7 / (3-1) = 3 spaces plus 1 extra space. We place this extra space at the end of the string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 100
 *
 * text consists of lowercase English letters and ' '.
 *
 * text contains at least one word.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the total number of spaces and words. Then use the integer division to determine the numbers of spaces to add between each word and at the end.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rearrange-spaces-between-words/">LeetCode #1592</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class RearrangeSpacesBetweenWords {

    /**
     * Solves the problem: Reorder spaces.
     *
     * @param text the text (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int spaces=0; for (char c:text.toCharArray()) if (c==' ') spaces++;
        int gaps = words.length-1;
        if (gaps==0) return words[0] + " ".repeat(spaces);
        int each=spaces/gaps, extra=spaces%gaps;
        return String.join(" ".repeat(each), words) + " ".repeat(extra);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        RearrangeSpacesBetweenWords sol = new RearrangeSpacesBetweenWords();
                System.out.println(sol.reorderSpaces("  this   is  a sentence "));  // "this   is   a   sentence"
                System.out.println(sol.reorderSpaces(" practice   makes   perfect")); // "practice   makes   perfect "
                System.out.println(sol.reorderSpaces("hello   world")); // "hello   world"
    }
}
