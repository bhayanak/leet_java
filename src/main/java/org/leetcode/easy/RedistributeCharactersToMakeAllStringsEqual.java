package org.leetcode.easy;


/**
 * <b>#1897 - Redistribute Characters to Make All Strings Equal</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words (0-indexed).
 *
 *
 * In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].
 *
 *
 * Return true if you can make every string in words equal using any number of operations, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abc","aabc","bc"]
 * Output: true
 * Explanation: Move the first 'a' in words[1] to the front of words[2],
 * to make words[1] = "abc" and words[2] = "abc".
 * All the strings are now equal to "abc", so return true.
 *
 * Example 2:
 *
 * Input: words = ["ab","a"]
 * Output: false
 * Explanation: It is impossible to make all the strings equal using the operation.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Characters are independent—only the frequency of characters matters.
 * Hint 2: It is possible to distribute characters if all characters can be divided equally among all strings.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/redistribute-characters-to-make-all-strings-equal/">LeetCode #1897</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class RedistributeCharactersToMakeAllStringsEqual {

    /**
     * Solves the problem: Make equal.
     *
     * @param words the words (String[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean makeEqual(String[] words) {
        int[] cnt = new int[26];
        for (String w:words) for (char c:w.toCharArray()) cnt[c-'a']++;
        int n=words.length;
        for (int v:cnt) if (v%n!=0) return false;
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        RedistributeCharactersToMakeAllStringsEqual sol = new RedistributeCharactersToMakeAllStringsEqual();
                System.out.println(sol.makeEqual(new String[]{"abc","aabc","bc"})); // true
                System.out.println(sol.makeEqual(new String[]{"ab","a"}));           // false
    }
}
