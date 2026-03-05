package org.leetcode.easy;


/**
 * <b>#2423 - Remove Letter To Equalize Frequency</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.
 *
 *
 * Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.
 *
 *
 * Note:
 *
 *
 * The frequency of a letter x is the number of times it occurs in the string.
 *
 * You must remove exactly one letter and cannot choose to do nothing.
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcc"
 * Output: true
 * Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.
 *
 * Example 2:
 *
 * Input: word = "aazz"
 * Output: false
 * Explanation: We must delete a character, so either the frequency of "a" is 1 and the frequency of "z" is 2, or vice versa. It is impossible to make all present letters have equal frequency.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= word.length &lt;= 100
 *
 * word consists of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Brute force all letters that could be removed.
 * Hint 2: Use a frequency array of size 26.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/remove-letter-to-equalize-frequency/">LeetCode #2423</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
  */
public class RemoveLetterToEqualizeFrequency {

    /**
     * Solves the problem: Equal frequency.
     *
     * @param word the word (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public boolean equalFrequency(String word) {
        for (int i=0;i<word.length();i++) {
            int[] freq=new int[26];
            for (int j=0;j<word.length();j++) if (j!=i) freq[word.charAt(j)-'a']++;
            java.util.Set<Integer> freqs=new java.util.HashSet<>();
            for (int f:freq) if (f>0) freqs.add(f);
            if (freqs.size()==1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        RemoveLetterToEqualizeFrequency sol = new RemoveLetterToEqualizeFrequency();
                System.out.println(sol.equalFrequency("abcc")); // true
                System.out.println(sol.equalFrequency("aazz")); // false
    }
}
