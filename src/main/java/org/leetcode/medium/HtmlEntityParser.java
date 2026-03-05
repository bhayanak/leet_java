package org.leetcode.medium;


/**
 * <b>#1410 - HTML Entity Parser</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * HTML entity parser is the parser that takes HTML code as input and replace all the entities of the special characters by the characters itself.
 *
 *
 * The special characters and their entities for HTML are:
 *
 *
 * Quotation Mark: the entity is &quot; and symbol character is ".
 *
 * Single Quote Mark: the entity is &apos; and symbol character is '.
 *
 * Ampersand: the entity is &amp; and symbol character is &amp;.
 *
 * Greater Than Sign: the entity is &gt; and symbol character is &gt;.
 *
 * Less Than Sign: the entity is &lt; and symbol character is &lt;.
 *
 * Slash: the entity is &frasl; and symbol character is /.
 *
 * Given the input text string to the HTML parser, you have to implement the entity parser.
 *
 *
 * Return the text after replacing the entities by the special characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: text = "&amp;amp; is an HTML entity but &amp;ambassador; is not."
 * Output: "&amp; is an HTML entity but &amp;ambassador; is not."
 * Explanation: The parser will replace the &amp; entity by &amp;
 *
 * Example 2:
 *
 * Input: text = "and I quote: &quot;...&quot;"
 * Output: "and I quote: \"...\""
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= text.length &lt;= 105
 *
 * The string may contain any possible characters out of all the 256 ASCII characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Search the string for all the occurrences of the character '&amp;'.
 * Hint 2: For every '&amp;' check if it matches an HTML entity by checking the ';' character and if entity found replace it in the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/html-entity-parser/">LeetCode #1410</a>
 */
public class HtmlEntityParser {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: HTML Entity Parser");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== HtmlEntityParser ===");
        HtmlEntityParser sol = new HtmlEntityParser();
        System.out.println(sol.solve(null));
    }
}
