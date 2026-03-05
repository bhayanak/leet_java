package org.leetcode.easy;


/**
 * <b>#1832 - Check if the Sentence Is Pangram</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 *
 * Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 *
 * Example 2:
 *
 * Input: sentence = "leetcode"
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentence.length &lt;= 1000
 *
 * sentence consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate over the string and mark each character as found (using a boolean array, bitmask, or any other similar way).
 * Hint 2: Check if the number of found characters equals the alphabet length.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-the-sentence-is-pangram/">LeetCode #1832</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfTheSentenceIsPangram {

    /**
     * Checks Check if pangram.
     *
     * @param sentence the sentence (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for (char c:sentence.toCharArray()) seen[c-'a']=true;
        for (boolean b:seen) if (!b) return false;
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfTheSentenceIsPangram sol = new CheckIfTheSentenceIsPangram();
                System.out.println(sol.checkIfPangram("thequickbrownfoxjumpsoverthelazydog")); // true
                System.out.println(sol.checkIfPangram("leetcode")); // false
    }
}
