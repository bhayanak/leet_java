package org.leetcode.easy;


/**
 * <b>#1684 - Count the Number of Consistent Strings</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Bit Manipulation, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.
 *
 *
 * Return the number of consistent strings in the array words.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 *
 * Example 2:
 *
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 *
 * Example 3:
 *
 * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
 * Output: 4
 * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 104
 *
 * 1 &lt;= allowed.length &lt;= 26
 *
 * 1 &lt;= words[i].length &lt;= 10
 *
 * The characters in allowed are distinct.
 *
 * words[i] and allowed contain only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A string is incorrect if it contains a character that is not allowed
 * Hint 2: Constraints are small enough for brute force
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Bit Manipulation, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-consistent-strings/">LeetCode #1684</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountTheNumberOfConsistentStrings {

    /**
     * Counts Count consistent strings.
     *
     * @param allowed the allowed (String)
     * @param words the words (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] ok = new boolean[26];
        for (char c:allowed.toCharArray()) ok[c-'a']=true;
        int count=0;
        outer: for (String w:words) {
            for (char c:w.toCharArray()) if (!ok[c-'a']) continue outer;
            count++;
        }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CountTheNumberOfConsistentStrings sol = new CountTheNumberOfConsistentStrings();
                System.out.println(sol.countConsistentStrings("ab",new String[]{"ad","bd","aaab","baa","badab"})); // 2
                System.out.println(sol.countConsistentStrings("abc",new String[]{"a","b","c","ab","ac","bc","abc"})); // 7
                System.out.println(sol.countConsistentStrings("cad",new String[]{"cc","acd","b","ba","bac","bad","ac","d"})); // 4
    }
}
