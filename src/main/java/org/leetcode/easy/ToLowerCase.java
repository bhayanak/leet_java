package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #709: To Lower Case
 * @see <a href="https://leetcode.com/problems/to-lower-case/">Problem</a>
 */
public class ToLowerCase {

    /**
     * LeetCode #709 – To Lower Case
     * Difficulty: EASY
     * Topics: String
     *
     * Given a string s, return the string after replacing every uppercase letter
     * with the same lowercase letter.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "Hello"
     * Output: "hello"
     * 
     * Example 2:
     * 
     * Input: s = "here"
     * Output: "here"
     * 
     * Example 3:
     * 
     * Input: s = "LOVELY"
     * Output: "lovely"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 100
     * 
     * s consists of printable ASCII characters.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public String toLowerCase(String s) { return s.toLowerCase(); }

    public static void main(String[] args) {
        ToLowerCase sol = new ToLowerCase();
        System.out.println(sol.toLowerCase("test"));
    }
}
