package org.leetcode.easy;


/**
 * <b>#1880 - Check if Word Equals Summation of Two Words</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The letter value of a letter is its position in the alphabet starting from 0 (i.e. 'a' -&gt; 0, 'b' -&gt; 1, 'c' -&gt; 2, etc.).
 *
 *
 * The numerical value of some string of lowercase English letters s is the concatenation of the letter values of each letter in s, which is then converted into an integer.
 *
 *
 * For example, if s = "acb", we concatenate each letter's letter value, resulting in "021". After converting it, we get 21.
 *
 * You are given three strings firstWord, secondWord, and targetWord, each consisting of lowercase English letters 'a' through 'j' inclusive.
 *
 *
 * Return true if the summation of the numerical values of firstWord and secondWord equals the numerical value of targetWord, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: firstWord = "acb", secondWord = "cba", targetWord = "cdb"
 * Output: true
 * Explanation:
 * The numerical value of firstWord is "acb" -&gt; "021" -&gt; 21.
 * The numerical value of secondWord is "cba" -&gt; "210" -&gt; 210.
 * The numerical value of targetWord is "cdb" -&gt; "231" -&gt; 231.
 * We return true because 21 + 210 == 231.
 *
 * Example 2:
 *
 * Input: firstWord = "aaa", secondWord = "a", targetWord = "aab"
 * Output: false
 * Explanation: 
 * The numerical value of firstWord is "aaa" -&gt; "000" -&gt; 0.
 * The numerical value of secondWord is "a" -&gt; "0" -&gt; 0.
 * The numerical value of targetWord is "aab" -&gt; "001" -&gt; 1.
 * We return false because 0 + 0 != 1.
 *
 * Example 3:
 *
 * Input: firstWord = "aaa", secondWord = "a", targetWord = "aaaa"
 * Output: true
 * Explanation: 
 * The numerical value of firstWord is "aaa" -&gt; "000" -&gt; 0.
 * The numerical value of secondWord is "a" -&gt; "0" -&gt; 0.
 * The numerical value of targetWord is "aaaa" -&gt; "0000" -&gt; 0.
 * We return true because 0 + 0 == 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= firstWord.length, secondWord.length, targetWord.length &lt;= 8
 *
 * firstWord, secondWord, and targetWord consist of lowercase English letters from 'a' to 'j' inclusive.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert each character of each word to its numerical value.
 * Hint 2: Check if the numerical values satisfies the condition.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/">LeetCode #1880</a>
 */
public class CheckIfWordEqualsSummationOfTwoWords {

    private int val(String w) {
        int v=0; for (char c:w.toCharArray()) v=v*10+(c-'a');
        return v;
    }
    /**
     * Returns true if Is sum equal.
     *
     * @param firstWord the firstWord (String)
     * @param secondWord the secondWord (String)
     * @param targetWord the targetWord (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return val(firstWord)+val(secondWord)==val(targetWord);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfWordEqualsSummationOfTwoWords sol = new CheckIfWordEqualsSummationOfTwoWords();
                System.out.println(sol.isSumEqual("acb","cba","cdb")); // true (021+210=231)
                System.out.println(sol.isSumEqual("aaa","a","aab")); // false
                System.out.println(sol.isSumEqual("aaa","a","aaaa")); // true
    }
}
