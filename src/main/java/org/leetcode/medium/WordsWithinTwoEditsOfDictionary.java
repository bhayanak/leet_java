package org.leetcode.medium;


/**
 * <b>#2452 - Words Within Two Edits of Dictionary</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two string arrays, queries and dictionary. All words in each array comprise of lowercase English letters and have the same length.
 *
 *
 * In one edit you can take a word from queries, and change any letter in it to any other letter. Find all words from queries that, after a maximum of two edits, equal some word from dictionary.
 *
 *
 * Return a list of all words from queries, that match with some word from dictionary after a maximum of two edits. Return the words in the same order they appear in queries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = ["word","note","ants","wood"], dictionary = ["wood","joke","moat"]
 * Output: ["word","note","wood"]
 * Explanation:
 * - Changing the 'r' in "word" to 'o' allows it to equal the dictionary word "wood".
 * - Changing the 'n' to 'j' and the 't' to 'k' in "note" changes it to "joke".
 * - It would take more than 2 edits for "ants" to equal a dictionary word.
 * - "wood" can remain unchanged (0 edits) and match the corresponding dictionary word.
 * Thus, we return ["word","note","wood"].
 *
 * Example 2:
 *
 * Input: queries = ["yes"], dictionary = ["not"]
 * Output: []
 * Explanation:
 * Applying any two edits to "yes" cannot make it equal to "not". Thus, we return an empty array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length, dictionary.length &lt;= 100
 *
 * n == queries[i].length == dictionary[j].length
 *
 * 1 &lt;= n &lt;= 100
 *
 * All queries[i] and dictionary[j] are composed of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try brute-forcing the problem.
 * Hint 2: For each word in queries, try comparing to each word in dictionary.
 * Hint 3: If there is a maximum of two edit differences, the word should be present in answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Trie).
 *
 * @see <a href="https://leetcode.com/problems/words-within-two-edits-of-dictionary/">LeetCode #2452</a>
 */
public class WordsWithinTwoEditsOfDictionary {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Words Within Two Edits of Dictionary");
    }

    public static void main(String[] args) {
        System.out.println("=== WordsWithinTwoEditsOfDictionary ===");
        WordsWithinTwoEditsOfDictionary sol = new WordsWithinTwoEditsOfDictionary();
        System.out.println(sol.solve(null));
    }
}
