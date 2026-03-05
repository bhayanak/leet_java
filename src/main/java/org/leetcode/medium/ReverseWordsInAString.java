package org.leetcode.medium;

/**
 * <b>#151 - Reverse Words in a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an input string s, reverse the order of the words.
 * 
 * 
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * 
 * 
 * Return a string of the words in reverse order concatenated by a single space.
 * 
 * 
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * 
 * Example 2:
 * 
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * 
 * Example 3:
 * 
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 104
 * 	
 * s contains English letters (upper-case and lower-case), digits, and spaces ' '.
 * 	
 * There is at least one word in s.
 * 
 *  
 * 
 * Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Split on whitespace (\s+), reverse the token array, join with single space.
 * trim() handles leading/trailing spaces.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string/">LeetCode #151</a>
 */
public class ReverseWordsInAString {

    /**
     * Reverses the order of words in a string (words separated by spaces).
     * @param s input string
     * @return words in reversed order, single-space separated
     */
    public String reverseWords(String s) {
        String[] words = s.trim().split("\s+");
        int l = 0, r = words.length - 1;
        while (l < r) { String tmp = words[l]; words[l++] = words[r]; words[r--] = tmp; }
        return String.join(" ", words);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ReverseWordsInAString.java &amp;&amp; java org.leetcode.medium.ReverseWordsInAString
     *
     * @param args not used
     */
    public static void main(String[] args) {
        ReverseWordsInAString sol = new ReverseWordsInAString();
        System.out.println(sol.reverseWords("the sky is blue"));    // "blue is sky the"
        System.out.println(sol.reverseWords("  hello world  "));    // "world hello"
        System.out.println(sol.reverseWords("a good   example"));   // "example good a" 
    }
}
