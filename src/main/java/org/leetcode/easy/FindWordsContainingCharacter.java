package org.leetcode.easy;


/**
 * <b>#2942 - Find Words Containing Character</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of strings words and a character x.
 *
 *
 * Return an array of indices representing the words that contain the character x.
 *
 *
 * Note that the returned array may be in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["leet","code"], x = "e"
 * Output: [0,1]
 * Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
 *
 * Example 2:
 *
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
 * Output: [0,2]
 * Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
 *
 * Example 3:
 *
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "z"
 * Output: []
 * Explanation: "z" does not occur in any of the words. Hence, we return an empty array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 50
 *
 * 1 &lt;= words[i].length &lt;= 50
 *
 * x is a lowercase English letter.
 *
 * words[i] consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two nested loops.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/find-words-containing-character/">LeetCode #2942</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class FindWordsContainingCharacter {

    public java.util.List<Integer> findWordsContaining(String[] words, char x) {
        java.util.List<Integer> res=new java.util.ArrayList<>();
        for (int i=0;i<words.length;i++) for (char c:words[i].toCharArray()) if (c==x) { res.add(i); break; }
        return res;
    }

    public static void main(String[] args) {
        FindWordsContainingCharacter sol = new FindWordsContainingCharacter();
        System.out.println("No method available");
    }
}
