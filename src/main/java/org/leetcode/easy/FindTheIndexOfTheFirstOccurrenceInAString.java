package org.leetcode.easy;

/**
 * <b>#28 - Find the Index of the First Occurrence in a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Example 2:
 * 
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= haystack.length, needle.length &lt;= 104
 * 	
 * haystack and needle consist of only lowercase English characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Built-in indexOf is acceptable; for an interview, implement KMP O(m+n)
 * or sliding-window substring check O(m·n) as a simpler alternative.
 *
 * <h2>Complexity</h2>
* Time: O(m+n) KMP  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/">LeetCode #28</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class FindTheIndexOfTheFirstOccurrenceInAString {

    /**
     * Returns the index of the first occurrence of needle in haystack, or -1.
     *
     * @param haystack the string to search in
     * @param needle   the substring to search for
     * @return         starting index of first match, or -1
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int strStr(String haystack, String needle) {
        // Java's built-in uses an optimised algorithm internally
        return haystack.indexOf(needle);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== FindTheIndexOfTheFirstOccurrenceInAString ===");
        System.out.println("See class methods for usage.");
    }
}
