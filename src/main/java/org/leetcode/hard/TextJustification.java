package org.leetcode.hard;

/**
 * <b>#68 - Text Justification</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings words and a width maxWidth, format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.
 * 
 * 
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly maxWidth characters.
 * 
 * 
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line does not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.
 * 
 * 
 * For the last line of text, it should be left-justified, and no extra space is inserted between words.
 * 
 * 
 * Note:
 * 
 * 	
 * A word is defined as a character sequence consisting of non-space characters only.
 * 	
 * Each word's length is guaranteed to be greater than 0 and not exceed maxWidth.
 * 	
 * The input array words contains at least one word.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
 * Output:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * 
 * Example 2:
 * 
 * Input: words = ["What","must","be","acknowledgment","shall","be"], maxWidth = 16
 * Output:
 * [
 *   "What   must   be",
 *   "acknowledgment  ",
 *   "shall be        "
 * ]
 * Explanation: Note that the last line is "shall be    " instead of "shall     be", because the last line must be left-justified instead of fully-justified.
 * Note that the second line is also left-justified because it contains only one word.
 * 
 * Example 3:
 * 
 * Input: words = ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"], maxWidth = 20
 * Output:
 * [
 *   "Science  is  what we",
 *   "understand      well",
 *   "enough to explain to",
 *   "a  computer.  Art is",
 *   "everything  else  we",
 *   "do                  "
 * ]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= words.length &lt;= 300
 * 	
 * 1 &lt;= words[i].length &lt;= 20
 * 	
 * words[i] consists of only English letters and symbols.
 * 	
 * 1 &lt;= maxWidth &lt;= 100
 * 	
 * words[i].length &lt;= maxWidth
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/text-justification/">LeetCode #68</a>
 */
public class TextJustification {

    /**
     * TODO: Implement solution for "Text Justification".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Text Justification");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TextJustification ===");
        System.out.println("See class methods for usage.");
    }
}
