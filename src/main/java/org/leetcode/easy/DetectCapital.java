package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #520: Detect Capital
 * @see <a href="https://leetcode.com/problems/detect-capital/">Problem</a>
 */
public class DetectCapital {

    /**
     * LeetCode #520 – Detect Capital
     * Difficulty: EASY
     * Topics: String
     *
     * We define the usage of capitals in a word to be right when one of the
     * following cases holds:
     * 
     * 
     * All letters in this word are capitals, like "USA".
     * 
     * All letters in this word are not capitals, like "leetcode".
     * 
     * Only the first letter in this word is capital, like "Google".
     * 
     * Given a string word, return true if the usage of capitals in it is right.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: word = "USA"
     * Output: true
     * 
     * 
     * Example 2:
     * 
     * Input: word = "FlaG"
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= word.length &lt;= 100
     * 
     * word consists of lowercase and uppercase English letters.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean detectCapitalUse(String word) {
        if (word.length() <= 1) return true;
        if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            // All must be uppercase
            for (int i = 2; i < word.length(); i++)
                if (!Character.isUpperCase(word.charAt(i))) return false;
            return true;
        }
        // Rest must all be lowercase
        for (int i = 1; i < word.length(); i++)
            if (!Character.isLowerCase(word.charAt(i))) return false;
        return true;
    }

    public static void main(String[] args) {
        DetectCapital sol = new DetectCapital();
        System.out.println(sol.detectCapitalUse("hello"));
    }
}
